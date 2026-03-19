package application;

import java.util.Locale;
import java.util.Scanner;

import model.Student;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        student.name = sc.nextLine();
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + String.format("%.2f", student.result()));
        if (student.result() > 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING " + (60 - student.result()) + " POINTS");
        }

        sc.close();
    }
}
