package student;

import ManageGrades.Module;
import sysAdmin.Fees;

import java.util.ArrayList;

public abstract class DiplomaStudent extends Student{
    public DiplomaStudent(String firstName, String surName, ArrayList<Module> modules, Fees fees, boolean accomodation, int years, char sex, int phoneNumber, String password, String userName) {
        super(firstName, surName, modules, fees, accomodation, sex, phoneNumber, password, userName);
        setYears(3);
    }

    @Override
    public void setYears(int years) {
        super.setYears(3);
    }


}
