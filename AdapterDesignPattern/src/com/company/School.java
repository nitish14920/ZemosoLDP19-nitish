package com.company;

public class School {

    public static void main(String[] args) {

        Pen p = new AdapterPen();
        Assignment assignment = new Assignment();

        assignment.setP(p);
        assignment.writeAssignment("Assignment ");
    }
}
