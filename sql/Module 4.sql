#########################  Module 4 Problems  ##################

# List the customer number, the name, the phone number, and the city of customers.

select custno,custname,phone,city from customer;

# List the customer number, the name, the phone number, and the city of customers who reside in Colorado (State is CO).

select custno,custname,phone,city from customer where city = "colorado";

# List all columns of the EventRequest table for events costing more than $4000.  Order the result by the event date (DateHeld).

select * from eventrequest where estcost > 4000 order by dateheld;

# List the event number, the event date (DateHeld), and the estimated audience number with approved status and audience greater than 9000 or with pending status and audience greater than 7000.

select eventno,dateheld,estaudience from eventrequest where (status = "approved" and estaudience > 9000) or (status = "pending" and estaudience > 7000);

# List the event number, event date (DateHeld), customer number and customer name of events placed in January 2018 by customers from Boulder.

select eventno, dateheld, customer.custno, custname
from eventrequest, customer
where city = "Boulder" and eventrequest.custno = customer.custno and dateheld between '2018-01-01' and '2018-01-31';

# List the average number of resources used (NumberFld) by plan number. Include only location number L100.

select avg(numberfld) as average_resources from eventplanline where locno = "L100" group by planno;


# List the city, state, and zip codes in the customer table.  Your result should not have duplicates. (Hint: The DISTINCT keyword eliminates duplicates.)
select distinct city,state,zip from customer;

#List the name, department, phone number, and email address of employees with a phone number beginning with “3-”.
select empname,phone,email from employee where phone like '3-%';

#List all columns of the resource table with a rate between $10 and $20. Sort the result by rate.
select * from resourcetbl where rate between 10 and 20 order by rate; 

#List the event requests with a status of “Approved” or “Denied” and an authorized date in July 2018. Include the event number, authorization date, and status in the output. (Hint: see the examples in Module 4 for date constants in Oracle and MySQL.)
select eventno, dateauth, status from eventreq
where (status = "Approved" and dateauth between"2018-07-01" and "2018-07-31") or (status = "Denied" and dateauth between "2018-07-01" and "2018-07-31");

#List the location number and name of locations that are part of the “Basketball arena”.  Your WHERE clause should not have a condition involving the facility number compared to a constant (“F101”). Instead, you should use a condition on the FacName column for the value of “Basketball arena”.
SELECT location.locno, location.facno, facility.facname
FROM location JOIN facility ON location.facno = facility.facno
WHERE facility.facname = "Basketball arena";


#For each event plan, list the plan number, count of the event plan lines, and sum of the number of resources assigned.  For example, plan number “P100” has 4 lines and 7 resources assigned.  You only need to consider event plans that have at least one line.

select planno, count(planno) as count_of_plan_lines, sum(numberfld) as sum_of_number_of_resources
from eventplanline
group by planno;