package com.richardm.service;

import com.richardm.entity.customer;
import com.richardm.entity.fee;
import com.richardm.entity.guarantee;
import com.richardm.entity.guarantor;
import com.richardm.entity.user;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import com.richardm.entity.loan;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Services {  
    FileReader usersFile;
    BufferedReader usersReader;
    
    private static final Map<String, user> users = new HashMap<>();
    private static final HashMap<Integer, guarantee> garantias = new HashMap<>();
    private static final HashMap<Integer, guarantor> fiadores = new HashMap<>();
    private static final HashMap<Integer, customer> customers = new HashMap<>();
    private static final HashMap<Integer, loan> prestamos = new HashMap<>();
    private static final HashMap<Integer, fee> cuotas = new HashMap<>();
    
    public void loadUsers(){
        try{
            usersFile = new FileReader("users.txt");
            usersReader = new BufferedReader(usersFile);
            String line;
            
            while ((line = usersReader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length > 2) {
                    String username = parts[0];
                    String password = parts[1];
                    int accessLevel = Integer.parseInt(parts[2]);
                    String nameUser = parts[3];
                    String lastNameUser = parts[4];
                    String userEmail = parts[5];
                    
                    users.put(username, new user(username, password, accessLevel, nameUser, lastNameUser, userEmail));
                }
                
            }    
        } catch (IOException e) {
            System.err.println("Error al cargar usuarios: " + e.getMessage());
        }
    }
    
    public void loadGuarantees(){
        try{
            usersFile = new FileReader("guarantees.txt");
            usersReader = new BufferedReader(usersFile);
            String line;
            
            while ((line = usersReader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length > 0) {
                    int id = Integer.parseInt(parts[0]);
                    String description = parts[1];
                    
                    garantias.put(id, new guarantee(id, description));
                }
                
            }    
        } catch (IOException e) {
            System.err.println("Error al cargar garantias: " + e.getMessage());
        }
    }
    
    public void loadGuarantors(){
        try{
            usersFile = new FileReader("guarantors.txt");
            usersReader = new BufferedReader(usersFile);
            String line;
            
            while ((line = usersReader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length > 0) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String lastName = parts[2];
                    String last2Name = parts[3];
                    String address = parts[4];
                    String ced = parts[5];
                    String phone = parts[6];
                    String company = parts[7];
                    String position = parts[8];
                    double salary = Double.parseDouble(parts[9]);
                    boolean gen = Boolean.parseBoolean(parts[10]);
                    
                    fiadores.put(id, new guarantor(id, name, lastName, last2Name, 
                    address, ced, phone, company, position, salary, gen));
                }
                
            }    
        } catch (IOException e) {
            System.err.println("Error al cargar fiadores: " + e.getMessage());
        }
    }
    
    public void loadCustomers(){
        try{
            usersFile = new FileReader("customers.txt");
            usersReader = new BufferedReader(usersFile);
            String line;
            
            while ((line = usersReader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length > 0) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String lastName = parts[2];
                    String last2Name = parts[3];
                    String address = parts[4];
                    String ced = parts[5];
                    String phone = parts[6];
                    String company = parts[7];
                    String position = parts[8];
                    double salary = Double.parseDouble(parts[9]);
                    boolean gen = Boolean.parseBoolean(parts[10]);
                    int idFiador = Integer.parseInt(parts[11]);
                    
                    customers.put(id, new customer(id, name, lastName, last2Name, 
                    address, ced, phone, company, position, salary, gen, idFiador));
                }
                
            }    
        } catch (IOException e) {
            System.err.println("Error al cargar clientes: " + e.getMessage());
        }
    }
    
    public void loadFees() throws ParseException{
        try{
            usersFile = new FileReader("fees.txt");
            usersReader = new BufferedReader(usersFile);
            String line;
            
            while ((line = usersReader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length > 0) {
                    int id = Integer.parseInt(parts[0]);
                    int number = Integer.parseInt(parts[1]);
                    int idCte = Integer.parseInt(parts[2]);
                    Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(parts[3]);
                    double valor = Double.parseDouble(parts[4]);
                    double amortizacion = Double.parseDouble(parts[5]);
                    double interes = Double.parseDouble(parts[6]);
                    boolean estado = Boolean.parseBoolean(parts[7]);
                    
                    cuotas.put(id, new fee(id, number, idCte, fecha, 
                    valor, amortizacion, interes, estado));
                }
                
            }    
        } catch (IOException e) {
            System.err.println("Error al cargar cuotas: " + e.getMessage());
        }
    }
    
    public fee saveFee(fee cuota){
        try (PrintWriter writer = new PrintWriter(new FileWriter("fees.txt", true))) {
            writer.println(cuota.getIdLoan() + ";" + cuota.getNumber() + ";" + 
                cuota.getIdCustomer() + ";" + cuota.getDateToPay() + ";" + 
                cuota.getValue() + ";" + cuota.getAmortizationValue() +
                ";" + cuota.getInterest() + ";" +
                cuota.isPaid() + ";");
                
            return cuota;
                
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        return null;
    }
    
    public guarantee getGuarantee(int id) {
        loadGuarantees();
        
        guarantee garantia = garantias.get(id);
        
        return garantia;
    }
    
    public guarantor getGuarantor(int id) {
        loadGuarantors();
        
        guarantor fiador = fiadores.get(id);
        
        return fiador;
    }
    
    public user getUser(String username) {
        loadUsers();
        
        user userr = users.get(username);
        
        return userr;
    }
    
    public customer getCustomer(int ID) {
        loadCustomers();
        
        customer cust = customers.get(ID);
        
        return cust;
    }
    
    public loan getLoan(int ID) throws ParseException {
        loadLoans();
        
        loan loann = prestamos.get(ID);
        
        return loann;
    }
    
    public user saveUser(user userr){
        try (PrintWriter writer = new PrintWriter(new FileWriter("users.txt", true))) {
            writer.println(userr.getLoginUser() + ";" + userr.getPassUser() + ";" + 
                userr.getAccessLevel() + ";" + userr.getNameUser() + ";" + 
                userr.getLastNameUser() + ";" + userr.getEmailUser() + ";");
                
            return userr;
                
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        return null;
    }
    
    public user updateUser(user userr){
        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
            StringBuilder fileContent = new StringBuilder();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length > 0 && parts[0].equals(userr.getLoginUser())) {
                    parts[1] = userr.getPassUser();
                    parts[2] = String.valueOf(userr.getAccessLevel());
                    parts[3] = userr.getNameUser();
                    parts[4] = userr.getLastNameUser();
                    parts[5] = userr.getEmailUser();
                
                }
                
                fileContent.append(String.join(";", parts)).append(";\n");
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt"))) {
                writer.write(fileContent.toString());
            }
            
            return userr;
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        return null;
    }
    
    public guarantee saveGuarantee(guarantee garantia){
        try (PrintWriter writer = new PrintWriter(new FileWriter("guarantees.txt", true))) {
            writer.println(garantia.getIdGarantia() + ";" + garantia.getDescripcionGarantia() + ";");
                
            return garantia;
                
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        return null;
    }
    
    public guarantee updateGuarantee(guarantee garantia){
        try (BufferedReader reader = new BufferedReader(new FileReader("guarantees.txt"))) {
            StringBuilder fileContent = new StringBuilder();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length > 0 && parts[0].equals(Integer.toString(garantia.getIdGarantia()))) {
                    parts[1] = garantia.getDescripcionGarantia();
                }
                
                fileContent.append(String.join(";", parts)).append(";\n");
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("guarantees.txt"))) {
                writer.write(fileContent.toString());
            }
            
            return garantia;
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        return null;
    }
    
    public guarantor saveGuarantor(guarantor fiador){
        try (PrintWriter writer = new PrintWriter(new FileWriter("guarantors.txt", true))) {
            writer.println(fiador.getId() + ";" + fiador.getName() + ";"
            + fiador.getLastName() + ";" + fiador.getLast2Name() + ";" +
            fiador.getAddress() + ";" + fiador.getCed() + ";" + fiador.getPhone()
            + ";" + fiador.getCompany() + ";" + fiador.getPosition() + ";" +
            fiador.getSalary() + ";" + fiador.isGen() + ";");
                
            return fiador;
                
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        return null;
    }
    
    public customer saveCustomer(customer cliente){
        try (PrintWriter writer = new PrintWriter(new FileWriter("customers.txt", true))) {
            writer.println(cliente.getId() + ";" + cliente.getName() + ";"
            + cliente.getLast() + ";" + cliente.getLast2Name() + ";" +
            cliente.getAddress() + ";" + cliente.getCed() + ";" + cliente.getPhone()
            + ";" + cliente.getCompany() + ";" + cliente.getOcupation() + ";" +
            cliente.getSalary() + ";" + cliente.isMale() + ";" + cliente.getIdFiadorCte() + ";");
                
            return cliente;
                
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        return null;
    }
    
    public guarantor updateGuarantor(guarantor fiador){
        try (BufferedReader reader = new BufferedReader(new FileReader("guarantors.txt"))) {
            StringBuilder fileContent = new StringBuilder();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length > 0 && parts[0].equals(Integer.toString(fiador.getId()))) {
                    parts[1] = fiador.getName();
                    parts[2] = fiador.getLastName();
                    parts[3] = fiador.getLast2Name();
                    parts[4] = fiador.getAddress();
                    parts[5] = fiador.getCed();
                    parts[6] = fiador.getPhone();
                    parts[7] = fiador.getCompany();
                    parts[8] = fiador.getPosition();
                    parts[9] = Double.toString(fiador.getSalary());
                    parts[10] = Boolean.toString(fiador.isGen());
                
                }
                
                fileContent.append(String.join(";", parts)).append(";\n");
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("guarantors.txt"))) {
                writer.write(fileContent.toString());
            }
            
            return fiador;
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        return null;
    }
    
     public customer updateCustomer(customer cliente){
        try (BufferedReader reader = new BufferedReader(new FileReader("customers.txt"))) {
            StringBuilder fileContent = new StringBuilder();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length > 0 && parts[0].equals(Integer.toString(cliente.getId()))) {
                    parts[1] = cliente.getName();
                    parts[2] = cliente.getLast();
                    parts[3] = cliente.getLast2Name();
                    parts[4] = cliente.getAddress();
                    parts[5] = cliente.getCed();
                    parts[6] = cliente.getPhone();
                    parts[7] = cliente.getCompany();
                    parts[8] = cliente.getOcupation();
                    parts[9] = Double.toString(cliente.getSalary());
                    parts[10] = Boolean.toString(cliente.isMale());
                    parts[11] = Integer.toString(cliente.getIdFiadorCte());
                
                }
                
                fileContent.append(String.join(";", parts)).append(";\n");
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("customers.txt"))) {
                writer.write(fileContent.toString());
            }
            
            return cliente;
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        return null;
    }
     
     public void loadLoans() throws ParseException{
        try{
            usersFile = new FileReader("loans.txt");
            usersReader = new BufferedReader(usersFile);
            String line;
            
            while ((line = usersReader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length > 0) {
                    int id = Integer.parseInt(parts[0]);
                    int idcte = Integer.parseInt(parts[1]);
                    int idfiador = Integer.parseInt(parts[2]);
                    boolean estado = Boolean.parseBoolean(parts[3]);
                    Date fechainicio = new SimpleDateFormat("dd/MM/yyyy").parse(parts[4]);
                    int plazo = Integer.parseInt(parts[5]);
                    Date fechafinal = new SimpleDateFormat("dd/MM/yyyy").parse(parts[6]);
                    int tipo = Integer.parseInt(parts[7]);
                    double monto = Double.parseDouble(parts[8]);
                    double balance = Double.parseDouble(parts[9]);
                    double tasa = Double.parseDouble(parts[10]);
                    double cuota = Double.parseDouble(parts[11]);
                    String foto = parts[12];
                    
                    prestamos.put(id, new loan(id, idcte, idfiador, estado, 
                    fechainicio, plazo, fechafinal, tipo, monto, balance, tasa, cuota, foto));
                }
                
            }    
        } catch (IOException e) {
            System.err.println("Error al cargar prestamos: " + e.getMessage());
        }
    }
     
    public loan saveLoan(loan prestamo){
        try (PrintWriter writer = new PrintWriter(new FileWriter("loans.txt", true))) {
            writer.println(prestamo.getId() + ";" + prestamo.getIdCte() + ";" + prestamo.getIdFiador() 
            + ";" + prestamo.isEstado() + ";" + prestamo.getFechaInicio() + ";" + prestamo.getPlazo() 
            + ";" + prestamo.getFechaFinal() + ";" + prestamo.getTipoP() + ";" + prestamo.getMonto() 
            + ";" + prestamo.getBalance() + ";" + prestamo.getTasa() + ";" + prestamo.getCuotaFija() 
            + ";" + prestamo.getFotoGarantia() + ";");
                
            return prestamo;
                
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        return null;
    } 
    
    public loan updateLoan(loan prestamo){
        try (BufferedReader reader = new BufferedReader(new FileReader("loans.txt"))) {
            StringBuilder fileContent = new StringBuilder();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd"); 
            String line;
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length > 0 && parts[0].equals(Integer.toString(prestamo.getId()))) {
                    parts[1] = Integer.toString(prestamo.getIdCte());
                    parts[2] = Integer.toString(prestamo.getIdFiador());
                    parts[3] = Boolean.toString(prestamo.isEstado());
                    parts[4] = dateFormat.format(prestamo.getFechaInicio());
                    parts[5] = Integer.toString(prestamo.getPlazo());
                    parts[6] = dateFormat.format(prestamo.getFechaFinal());
                    parts[7] = Integer.toString(prestamo.getTipoP());
                    parts[8] = Double.toString(prestamo.getMonto());
                    parts[9] = Double.toString(prestamo.getBalance());
                    parts[10] = Double.toString(prestamo.getTasa());
                    parts[11] = Double.toString(prestamo.getCuotaFija());
                    parts[12] = prestamo.getFotoGarantia();
                
                }
                
                fileContent.append(String.join(";", parts)).append(";\n");
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("customers.txt"))) {
                writer.write(fileContent.toString());
            }
            
            return prestamo;
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        return null;
    }
     
    public HashMap<Integer, guarantor> getAllGuarantors(){
        loadGuarantors();
        
        return fiadores;
    }
    
    public HashMap<Integer, customer> getAllCustomers(){
        loadCustomers();
        
        return customers;
    }
    
    public HashMap<Integer, guarantee> getAllGuarantees(){
        loadGuarantees();
        
        return garantias;
    }
}
