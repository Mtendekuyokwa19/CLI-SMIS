package sysAdmin.Register;

import ManageGrades.Module;
import student.DegreeStudent;
import student.DiplomaStudent;
import student.MastersStudents;
import student.Student;
import sysAdmin.Fees;

import java.util.ArrayList;
import java.util.Scanner;

public class Register {
    ArrayList <Student> students=new ArrayList<>();
    private void studentRegister(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter students firstName");
        String firstName=scanner.nextLine();
        System.out.println("Enter students LastName");
        String surName= scanner.nextLine();
        System.out.println("Enter students modules");

        ArrayList<Module> modules=new ArrayList<>();

        System.out.println("Enter the number of modules");
        int numberOfModules= scanner.nextInt();

        for (int i = 0; i < numberOfModules; i++) {
            modules.add(enterModules());
        }

        System.out.println("Enter studentBankCode");
        int backAccount= scanner.nextInt();
        Fees fees=new Fees(backAccount);

        System.out.println(firstName+" stays in campus true/false");
        boolean accomdation= scanner.nextBoolean();
        System.out.println("Enter gender of"+firstName+" f/m");
        String sex=scanner.next();
        System.out.println("Enter "+firstName+"number with country code no characters");
        int phoneNumber=scanner.nextInt();

        System.out.println("Enter typeOfStudents?");
        System.out.println("1. Masters student");
        System.out.println("2. Undergraduate degree");
        System.out.println("3. Diploma");
        int selection=scanner.nextInt();

        switch (selection){
            case 1:
students.add(new MastersStudents(firstName, surName, modules, fees, accomdation, sex.toCharArray()[0],phoneNumber));
                    break;
            case 2:
                students.add(new DegreeStudent(firstName, surName, modules, fees, accomdation, sex.toCharArray()[0],phoneNumber));
                break;
            case 3:
                students.add(new DiplomaStudent(firstName, surName, modules, fees, accomdation, sex.toCharArray()[0],phoneNumber));
                break;

            default:
                System.out.println("err");
        }





    }
    private Module enterModules(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter modulename");
        String moduleName=scanner.nextLine();
        System.out.println("Enter lecturere");
        String Lectrurer= scanner.nextLine();
//        System.out.println("Enter students modules");

        return new Module(moduleName,Lectrurer);
    }

    public void runRegistration(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of students you want to register");
        int numberOfStudents=scanner.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            studentRegister();

        }
    }
}
