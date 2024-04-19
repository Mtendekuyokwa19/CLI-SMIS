package student;

import ManageGrades.Module;
import sysAdmin.Fees;

import java.util.ArrayList;

public  class DiplomaStudent extends Student{

    public DiplomaStudent(String firstName, String surName, ArrayList<Module> modules, Fees fees, boolean accomodation, char sex, int phoneNumber) {
        super(firstName, surName, modules, fees, accomodation, sex, phoneNumber);
        setYears(3);
    }

    @Override
    public void setYears(int years) {
        super.setYears(3);
    }

   


}
