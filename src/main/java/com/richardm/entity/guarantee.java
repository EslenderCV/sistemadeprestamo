package com.richardm.entity;

public class guarantee {
    public int idGarantia;
    public String descripcionGarantia;
    
    public guarantee(){
        
    }
    
    public guarantee(int idgarantia, String descripciongarantia){
        this.idGarantia = idgarantia;
        this.descripcionGarantia = descripciongarantia;
    }
    
    public int getIdGarantia(){
        return idGarantia;
    }
    
    public String getDescripcionGarantia(){
        return descripcionGarantia;
    }
    
    public void setIdGarantia(int id){
        this.idGarantia = id;
    }
    
    public void setDescripcionGarantia(String des){
        this.descripcionGarantia = des;
    }
}
