package com.richardm.entity;

public class guarantor {
    public int Id;
    public String name;
    public String lastName;
    public String last2Name;
    public String address;
    public String ced;
    public String phone;
    public String company;
    public String position;
    public double salary;
    public boolean gen;
    
    public guarantor(){
        
    }
    
    public guarantor(int id, String name, String lastName, String last2Name, String address, String ced,
    String phone, String company, String position, double salary, boolean gen){
        this.Id = id;
        this.name = name;
        this.lastName = lastName;
        this.last2Name = last2Name;
        this.address = address;
        this.ced = ced;
        this.phone = phone;
        this.company = company;
        this.position = position;
        this.salary = salary;
        this.gen = gen;
    }
    
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLast2Name() {
        return last2Name;
    }

    public void setLast2Name(String last2Name) {
        this.last2Name = last2Name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isGen() {
        return gen;
    }

    public void setGen(boolean gen) {
        this.gen = gen;
    }
}
