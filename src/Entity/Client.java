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
public class Client implements MainData{
    private int id;
    private String nom;
    private String prenom;
    private String BDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getBDate() {
        return BDate;
    }

    public void setBDate(String BDate) {
        this.BDate = BDate;
    }

    

    @Override
    public void add() {
        String insert ="insert into client values("
                +id+",'"+nom+"','"+prenom+"','"+BDate+"')";
        boolean isAdd = db.go.RunNonQuery(insert);
        if(isAdd){
        Message("Le client est ajoutée");
    }}
    

    @Override
    public void update() {
       String update ="update client set " + "nom='"+nom+"',"
        +"prenom='"+prenom+"',bDate='"+BDate+"' where id="+id;
        boolean isUpdate=db.go.RunNonQuery(update);
        if(isUpdate){Message("Le client est mise à jour");}
     
    }
    

    @Override
    public void delete() {
       String delete="delete from client where id="+id;
        boolean isdelete=db.go.RunNonQuery(delete);
        if(isdelete){Message("Le client est supprimée");}}

    @Override
    public String getAutoNumber() {
        String auto = db.go.getAutoNumber("client", "id");
        return auto;    }

    @Override
    public void getAllRows(JTable table) {
     db.go.fillToJTableWithTableName("client", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String select="select * from client where id="+id;
       db.go.fillToJTableWithStatement(select, table);
    }

    @Override
    public void getCustomRows(String Statement, JTable table) {
        db.go.fillToJTableWithStatement(Statement, table);
    }

    @Override
    public String getValueByName(String Name) {
     String select ="select id from client where nom='"
             +Name+"'" ;
      String val =(String) db.go.getTableData(select).Items[0][0];
      return val;    }

    @Override
    public String getNameByValue(String Value) {
String select ="select nom from client where id='"
             +Value+"'" ;
      String Name =(String) db.go.getTableData(select).Items[0][0];
      return Name;    }
    
}
