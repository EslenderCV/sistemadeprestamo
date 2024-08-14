package com.richardm.entity;

public class user {
    public String loginUser;
    public String passUser;
    public int accessLevel;
    public String nameUser;
    public String lastNameUser;
    public String emailUser;
    
    public user(){
    }
    
    public user(String loginUser, String passUser, int accessLevel, String nameUser, String lastNameUser, String emailUser){
        this.loginUser = loginUser;
        this.passUser = passUser;
        this.accessLevel = accessLevel;
        this.nameUser = nameUser;
        this.lastNameUser = lastNameUser;
        this.emailUser = emailUser;
    }
    
    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getPassUser() {
        return passUser;
    }

    public void setPassUser(String passUser) {
        this.passUser = passUser;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLastNameUser() {
        return lastNameUser;
    }

    public void setLastNameUser(String lastNameUser) {
        this.lastNameUser = lastNameUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }
    
}
