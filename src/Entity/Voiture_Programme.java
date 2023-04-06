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
public class Voiture_Programme implements MainData{
    private String idVoiture;
    private int idProgramme;

    public String getIdVoiture() {
        return idVoiture;
    }

    public void setIdVoiture(String idVoiture) {
        this.idVoiture = idVoiture;
    }

    

    public int getIdProgramme() {
        return idProgramme;
    }

    public void setIdProgramme(int idProgramme) {
        this.idProgramme = idProgramme;
    }
    


    @Override
    public void add() {
          String insert="insert into voiture_programme values('"  +idVoiture+"',"+idProgramme+")";
          boolean isAdd = db.go.RunNonQuery(insert);
        if(isAdd){
        Message("La location est ajoutée");}
    }

    @Override
    public void update() {
Message("Update don't working in Work_On");    }

    @Override
    public void delete() {
String delete="delete from voiture_programme where idVoiture='"+idVoiture+"' and idProgramme="+idProgramme;
        boolean isdelete=db.go.RunNonQuery(delete);
        if(isdelete){Message("La location est supprimée");}       }

    @Override
    public String getAutoNumber() {
      Message("getAutoNumber don't working in Work_On"); return "";
    }

    @Override
    public void getAllRows(JTable table) {
     db.go.fillToJTableWithTableName("voiture_programme", table);
    }

    @Override
    public void getOneRow(JTable table) {
    String select = "select * from voiture_programme where idVoiture='"+idVoiture+"' and idProgramme="+idProgramme;
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
    
    
    
}
