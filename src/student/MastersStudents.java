package student;

import ManageGrades.Module;
import sysAdmin.Fees;

import java.util.ArrayList;

public class MastersStudents extends Student{
    public MastersStudents(String firstName, String surName, ArrayList<Module> modules, Fees fees, boolean accomodation, char sex, int phoneNumber) {
        super(firstName, surName, modules, fees, accomodation, sex, phoneNumber);
        setYears();
    }

    public void setYears(){
        super.setYears(2);
    }
}
