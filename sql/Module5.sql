# Module 5

# List the event number, date held, customer number, customer name, facility number, and facility name of 2018 events placed by Boulder customers.
select * from customer;
select eventno,dateheld,customer.custno,custname,facility.facname from eventrequest,customer,facility 
where customer.city = "Boulder" and  eventrequest.DATEHELD > "2018-01-01" and eventrequest.DATEHELD < "2018-12-31";


# List the customer number, customer name, event number, date held, facility number, facility name, and estimated audience cost per person (EstCost / EstAudience) for events held on 2018, in which the estimated cost per person is less than $0.2

select customer.custno,custname,EVENTNO,DATEHELD,facility.facname,(estcost/estAudience) as astimated_audience from eventrequest,customer,facility where (estcost/estAudience)< 0.2;

#List the customer number, customer name, and total estimated costs for Approved events. The total amount of events is the sum of the estimated cost for each event. Group the results by customer number and customer name.

SELECT Customer.CustNo, CustName, SUM(EstCost) AS TotEstCost
  FROM EventRequest INNER JOIN Customer 
       ON EventRequest.CustNo = Customer.CustNo
  WHERE Status = 'Approved'
  GROUP BY Customer.CustNo, CustName;

#Insert yourself as a new row in the Customer table.
Insert into CUSTOMER (CUSTNO,CUSTNAME,ADDRESS,INTERNAL,CONTACT,PHONE,CITY,STATE,ZIP) values ('C007','Nitish','Hno 4029 Bgh','Y','ondscf','941616','Hell','CO','42546');

#Increase the rate by 10 percent of nurse resource in the resource table.

select * from resourcetbl;
SET SQL_SAFE_UPDATES = 0;
UPDATE Resourcetbl 
  SET Rate = Rate * 1.1 
  WHERE ResName = 'nurse';
SET SQL_SAFE_UPDATES = 1;
#Delete the new row added to the Customer table.
DELETE FROM customer WHERE custno="C007";
select * from customer;

#For event requests, list the event number, event date (eventrequest.dateheld), and count of the event plans.  Only include event requests in the result if the event request has more than one related event plan with a work date in December 2018.

SELECT EventRequest.EventNo, DateHeld, COUNT(EventPlan.PlanNo) AS NUM_EVENT_PLANS
FROM EventRequest, EventPlan
WHERE (EventRequest.EventNo = EventPlan.EventNo)
    AND (DateHeld BETWEEN '2018-01-01' AND '2018-12-31')
GROUP BY EventRequest.EventNo, DateHeld
HAVING COUNT(EventPlan.PlanNo) > 1;

#List the plan number, event number, work date, and activity of event plans meeting the following two conditions: (1) the work date is in December 2018 and (2) the event is held in the “Basketball arena”.  Your query must not use the facility number (“F101”) of the basketball arena in the WHERE clause. Instead, you should use a condition on the FacName column for the value of “Basketball arena”.

SELECT PlanNo, EventPlan.EventNo, WorkDate, Activity
FROM EventPlan, EventRequest, Facility
WHERE (EventPlan.EventNo = EventRequest.EventNo)
    AND (EventRequest.FacNo = Facility.FacNo)
    AND (WorkDate BETWEEN '2018-01-01' AND '2018-12-31')
    AND (FacName = 'Basketball arena');
    
# List the event number, event date, status, and estimated cost of events where there is an event plan managed by Mary Manager and the event is held in the basketball arena in the period October 1 to December 31, 2018. 

SELECT EventPlan.EventNo, DateHeld, Status, EstCost
FROM EventRequest, EventPlan, Employee, Facility
WHERE (EventPlan.EventNo = EventRequest.EventNo)
    AND (EventPlan.EmpNo = Employee.EmpNo)
    AND (EventRequest.FacNo = Facility.FacNo)
    AND (DateHeld BETWEEN '2018-10-1' AND '2018-11-31')
    AND (FacName = 'Basketball arena')
    AND (EmpName = 'Mary Manager');
    
#List the plan number, line number, resource name, number of resources (eventplanline.number), location name, time start, and time end where the event is held at the basketball arena, the event plan has activity of activity of “Operation”, and the event plan has a work date in the period October 1 to December 31, 2018.

SELECT EventPlanLine.PlanNo, LineNo, ResName, NumberFld, LocName, TimeStart, TimeEnd
FROM EventPlanLine, ResourceTbl, Location, Facility, EventPlan
WHERE (EventPlanLine.ResNo = ResourceTbl.ResNo)
    AND (EventPlanLine.LocNo = Location.LocNo)
    AND (EventPlanLine.PlanNo = EventPlan.PlanNo)
    AND (Location.FacNo = Facility.FacNo)
    AND (FacName = 'Basketball arena')
    AND (Activity = 'Operation')
    AND (WorkDate BETWEEN '2018-10-01' AND '2018-12-31');
    
#1.	Insert a new row into the Facility table with facility name “Swimming Pool”.

INSERT INTO Facility
    (FacNo, FacName)
VALUES ('F104', 'Swimming Pool');
SELECT *
FROM Facility;
#2.	Insert a new row in the Location table related to the Facility row in modification problem 1. The new row should have “Door” for the location name.

INSERT INTO Location
    (LocNo, FacNo, LocName)
VALUES ('L107', 'F104', 'Door');

SELECT *
FROM Location;
#3.	Insert a new row in the Location table related to the Facility row in modification problem 1. The new row should have “Locker Room” for the location name.

INSERT INTO Location
    (LocNo, FacNo, LocName)
VALUES ('L108', 'F104', 'Locker Room');

SELECT *
FROM Location;
#4.	Change the location name of “Door” to “Gate” for the row inserted in modification problem 2. In MySQL, you need to place the UPDATE statement between two SET statements.
UPDATE Location
SET LocName = 'Gate'
WHERE LocNo = 'L107'
    AND FacNo = 'F104';

SELECT *
FROM Location;

