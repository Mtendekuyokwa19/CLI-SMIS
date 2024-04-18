package student;

import ManageGrades.Module;
import sysAdmin.Fees;

import java.util.ArrayList;

public abstract class MastersStudents extends Student{
    public MastersStudents(String firstName, String surName, ArrayList<Module> modules, Fees fees, boolean accomodation, char sex, int phoneNumber, String password, String userName) {
        super(firstName, surName, modules, fees, accomodation,  sex, phoneNumber, password, userName);
    }
    public void setYears(int years){
        super.setYears(2);
    }
}
