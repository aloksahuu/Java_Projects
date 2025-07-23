package com.aurionpro.methodoverloading.Test;

import java.util.Scanner;
import com.aurionpro.methodoverloading.model.Attendance;

public class AttendanceTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Attendance attendance = new Attendance();

        // 1. General attendance
        attendance.markAttendance();

        // 2. Attendance for one student
        System.out.print("Enter name of one student: ");
        String singleStudent = scanner.nextLine();
        attendance.markAttendance(singleStudent);

        // 3. Attendance for multiple students
        String[] names = new String[5];
        System.out.println("Enter names of 5 students:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        attendance.markAttendance(names);

        scanner.close();
    }
}
