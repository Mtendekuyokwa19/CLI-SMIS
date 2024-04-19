package sysAdmin;

import sysAdmin.Register.Register;

public class SysAdmin {
    private String name;
    Register register=new Register();

    public SysAdmin(String name) {
        this.name = name;
    }

    public void startRegister(){
        register.runRegistration();
    }

}
