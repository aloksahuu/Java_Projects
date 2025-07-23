package com.aurionpro.methodoverloading.model;

public class Attendance {

    public void markAttendance() {
        System.out.println("Your attendance is marked.");
    }

    public void markAttendance(String name) {
        System.out.println("Attendance marked for student: " + name);
    }

    public void markAttendance(String[] names) {
        for (String name : names) {
            System.out.println("Attendance marked for student: " + name);
        }
    }
}
