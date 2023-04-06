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
public class Location implements MainData{
    private int idClient;
    private String idVoiture;
    private String date;
    private int duree;
    private double total;

    

    @Override
    public void add() {
          String insert="insert into location values("  +idClient+",'"+idVoiture+"','"+date+"',"+duree+","+total+")";
          boolean isAdd = db.go.RunNonQuery(insert);
        if(isAdd){
        Message("La location est ajoutée");}
    }

    @Override
    public void update() {
Message("Update don't working in Work_On");    }

    @Override
    public void delete() {
String delete="delete from location where idClient="+idClient+" and idVoiture="+idVoiture;
        boolean isdelete=db.go.RunNonQuery(delete);
        if(isdelete){Message("La location est supprimée");}       }

    @Override
    public String getAutoNumber() {
      Message("getAutoNumber don't working in Work_On"); return "";
    }

    @Override
    public void getAllRows(JTable table) {
     db.go.fillToJTableWithTableName("location", table);
    }

    @Override
    public void getOneRow(JTable table) {
    String select = "select * from location where idClient="+idClient+" and idVoiture='"+idVoiture+"'";
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

    public String getIdVoiture() {
        return idVoiture;
    }

    public void setIdVoiture(String idVoiture) {
        this.idVoiture = idVoiture;
    }

    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
