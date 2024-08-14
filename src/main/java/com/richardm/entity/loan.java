package com.richardm.entity;

import java.util.Date;

public class loan {
    public int Id;
    public int IdCte;
    public int IdFiador;
    public boolean Estado;
    public Date FechaInicio;
    public int Plazo;
    public Date FechaFinal;
    public int TipoP;
    public double Monto;
    public double Balance;
    public double Tasa;
    public double CuotaFija;
    public String FotoGarantia;
    
    public loan(){
        
    }
    
    public loan(int id, int idcte, int idfiador, boolean estado, Date fechaInicio, int plazo, Date fechaFinal, 
    int tipo, double monto, double balance, double tasa, double cuota, String foto){
        this.Id = id;
        this.IdCte = idcte;
        this.IdFiador = idfiador;
        this.Estado = estado;
        this.FechaInicio = fechaInicio;
        this.Plazo = plazo;
        this.FechaFinal = fechaFinal;
        this.TipoP = tipo;
        this.Monto = monto;
        this.Balance = balance;
        this.Tasa = tasa;
        this.CuotaFija = cuota;
        this.FotoGarantia = foto;
    }
    
    
    public int getId() {
        return Id;
    }

    public int getIdCte() {
        return IdCte;
    }

    public int getIdFiador() {
        return IdFiador;
    }

    public boolean isEstado() {
        return Estado;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public int getPlazo() {
        return Plazo;
    }

    public Date getFechaFinal() {
        return FechaFinal;
    }

    public int getTipoP() {
        return TipoP;
    }

    public double getMonto() {
        return Monto;
    }

    public double getBalance() {
        return Balance;
    }

    public double getTasa() {
        return Tasa;
    }

    public double getCuotaFija() {
        return CuotaFija;
    }

    public String getFotoGarantia() {
        return FotoGarantia;
    }
}
