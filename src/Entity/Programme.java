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
public class Programme implements MainData{
    
    private int id;
    private String destination;
    private String date;
    private int duree;
    private double prix;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
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

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    

    @Override
    public void add() {
String insert ="insert into programme values("
                +id+",'"+destination+"','"+date+"',"+duree+","+prix+")";
        boolean isAdd = db.go.RunNonQuery(insert);
        if(isAdd){
        Message("Le programme est ajouté");
        }}

    @Override
    public void update() {
        String update ="update programme set " + "destination='"+destination+"',"
        +"date='"+date+"',"+"duree="+duree+",prix="+prix+" where id="+id;
        boolean isUpdate=db.go.RunNonQuery(update);
        if(isUpdate){Message("Le programme est mise à jour");}    }

    @Override
    public void delete() {
        String delete="delete from programme where id="+id;
        boolean isdelete=db.go.RunNonQuery(delete);
        if(isdelete){Message("Le programme est supprimée");}    }

    @Override
    public String getAutoNumber() {
     return db.go.getAutoNumber("programme", "id");
    }

    @Override
    public void getAllRows(JTable table) {
        db.go.fillToJTableWithTableName("programme", table);
    }

    @Override
    public void getOneRow(JTable table) {
     String select="select * from programme where id="+id;
     db.go.fillToJTableWithStatement(select, table);
    }

    @Override
    public void getCustomRows(String Statement, JTable table) {
    db.go.fillToJTableWithStatement(Statement, table);    }

    @Override
    public String getValueByName(String Name) {
      String select ="select id from programme where destination='"+Name+"'";
      String val =(String) db.go.getTableData(select).Items[0][0];
      return val;    }

    @Override
    public String getNameByValue(String Value) {
String select ="select destination from programme where id='"
             +Value+"'" ;
      String Name =(String) db.go.getTableData(select).Items[0][0];
      return Name;    }
    
}
