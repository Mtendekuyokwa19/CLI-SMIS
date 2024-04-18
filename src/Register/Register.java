package Register;

import student.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Register {
    ArrayList <Student> students=new ArrayList<>();
    public void studentRegister(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter students firstName");
        String firstName=scanner.nextLine();
        System.out.println("Enter students LastName");
        String surName= scanner.nextLine();
        System.out.println("Enter students modules");

    }
    public void enterModules(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter students firstName");
        String moduleName=scanner.nextLine();
        System.out.println("Enter students LastName");
        String Lectrurer= scanner.nextLine();
        System.out.println("Enter students modules");
    }
}
