package com.richardm.entity;

public class customer {
    public int Id;
    public String name;
    public String last;
    public String last2Name;
    public String ced;
    public String address;
    public String phoneNumber;
    public String company;
    public String ocupation;
    public double salary;
    public boolean gen;
    public int idFiadorCte;
    
    public customer(){
        
    }
    
    public customer(int id, String name, String last, String last2Name, String ced, String address, String phone
    , String company, String ocupation, double salary, boolean gen, int idFiador){
        this.Id = id;
        this.name = name;
        this.last = last;
        this.last2Name = last2Name;
        this.ced = ced;
        this.address = address;
        this.phoneNumber = phone;
        this.company = company;
        this.ocupation = ocupation;
        this.salary = salary;
        this.gen = gen;
        this.idFiadorCte = idFiador;
    }
    
    public int getId(){
        return this.Id;
    }

    public String getName(){
        return this.name;
    }
    
    public String getLast(){
        return this.last;
    }
    
    public String getLast2Name(){
        return this.last2Name;
    }
    
    public String getCed(){
        return this.ced;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public String getPhone(){
        return this.phoneNumber;
    }
    
    public String getCompany(){
        return this.company;
    }
    
    public String getOcupation(){
        return this.ocupation;
    }
    
    public double getSalary(){
        return this.salary;
    }
    
    public boolean isMale(){
        return this.gen;
    }
    
    public int getIdFiadorCte(){
        return this.idFiadorCte;
    }
}
