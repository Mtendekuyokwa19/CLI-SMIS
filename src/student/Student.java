package student;

import ManageGrades.Module;
import sysAdmin.Fees;

import java.util.ArrayList;

public  class Student implements IStudent {
    private String firstName;
    private String surName;
    private ArrayList<Module> modules=new ArrayList<>();
    private Fees fees;
    private boolean accomodation;
    private int years;
    private char sex;
    private int phoneNumber;
    private String password;
    private String userName;


    public Student(String firstName, String surName, ArrayList<Module> modules, Fees fees, boolean accomodation,  char sex, int phoneNumber) {
        this.firstName = firstName;
        this.surName = surName;
        this.modules = modules;
        this.fees = fees;
        this.accomodation = accomodation;

        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.password = "1234";
        this.userName = surName+"@poly.ac.mw";
    }

    @Override
    public boolean accomodation() {
    return accomodation;
    }

    @Override
    public void checkGrades() {
        System.out.println("----Module Name----- Module Grade");
   for (Module module:modules){
       System.out.println("----"+module.getModuleName()+"----"+module.getGrade()+"%");
   }
    }

    @Override
    public void payFees(float amount) {
    fees.payFees(amount);
    }




    @Override
    public void updatePhoneNumber(int contact) {
        phoneNumber=contact;
    }

    public float checkBalance(){
        return fees.getBalance();
    }

    protected String getPassword() {
        return password;
    }

    protected void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    protected void setUserName(String userName) {
        this.userName = userName;
    }

    public void setYears(int years){

        this.years=years;
    };
    public int getYears(){return years;};

//    public abstract void add(Module module);
}
