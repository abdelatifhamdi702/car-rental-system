/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import static Tools.Tools.Message;
import javax.swing.JTable;

/**
 *
 * @author Abdelatif Hamdi
 */
public class Reservation implements MainData{
    private int idClient;
    private int idProgramme;
    private String date;
    private int nbrPersonne;
    private double total;

    

    @Override
    public void add() {
          String insert="insert into reservation values("  +idClient+","+idProgramme+",'"+date+"',"+nbrPersonne+","+total+")";
          boolean isAdd = db.go.RunNonQuery(insert);
        if(isAdd){
        Message("La reservation est ajoutée");}
    }

    @Override
    public void update() {
Message("Update don't working in Work_On");    }

    @Override
    public void delete() {
String delete="delete from reservation where idClient="+idClient+" and idProgramme="+idProgramme;
        boolean isdelete=db.go.RunNonQuery(delete);
        if(isdelete){Message("La reservation est supprimée");}       }

    @Override
    public String getAutoNumber() {
      Message("getAutoNumber don't working in Work_On"); return "";
    }

    @Override
    public void getAllRows(JTable table) {
     db.go.fillToJTableWithTableName("reservation", table);
    }

    @Override
    public void getOneRow(JTable table) {
    String select = "select * from reservation where idClient="+idClient+" and idProgramme="+idProgramme;
    db.go.fillToJTableWithStatement(select, table);
    }

    @Override
    public void getCustomRows(String Statement, JTable table) {
     db.go.fillToJTableWithStatement(Statement, table);
    }

    @Override
    public String getValueByName(String Name) {
Message("getValueByName don't working in Work_On"); return "";    }

    @Override
    public String getNameByValue(String Value) {
Message("getNameByValue don't working in Work_On"); return "";    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdProgramme() {
        return idProgramme;
    }

    public void setIdProgramme(int idProgramme) {
        this.idProgramme = idProgramme;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNbrPersonne() {
        return nbrPersonne;
    }

    public void setNbrPersonne(int nbrPersonne) {
        this.nbrPersonne = nbrPersonne;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
