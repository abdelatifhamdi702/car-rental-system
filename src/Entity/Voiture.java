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
public class Voiture implements MainData{
    private String matricule;
    private String marque;
    private String modele;
    private String couleur;
    private double prix;
    private String disponible;
    private String propriete;

    
    @Override
    public void add() {
        String insert ="insert into voiture values('"
                +matricule+"','"+marque+"','"+modele+"','"+couleur+"',"+prix+",'"+disponible+"','"+propriete+"')";
        boolean isAdd = db.go.RunNonQuery(insert);
        if(isAdd){
        Message("La voiture est ajoutée");
        }}

    @Override
    public void update() {
        String update ="update voiture set " + "marque='"+marque+"',"
        +"modele='"+modele+"',"
        +"couleur='"+couleur+"',"
        +"prix="+prix+","
        +"disponible='"+disponible+"',"
        +"propriete='"+propriete+"'"
        +" where matricule='"+matricule+"'";
        boolean isUpdate=db.go.RunNonQuery(update);
        if(isUpdate){Message("La voiture est mise à jour");}
     
    }
    
    public void location(String mat) {
        String update ="update voiture set "
        +"disponible="+"'Non'"
        +" where matricule='"+mat+"'";
        boolean isUpdate=db.go.RunNonQuery(update);
        if(isUpdate){Message("Voiture louée avec succès");}
     
    }
    
    public void retour(String mat) {
        String update ="update voiture set "
        +"disponible="+"'Oui'"
        +" where matricule='"+mat+"'";
        boolean isUpdate=db.go.RunNonQuery(update);
        if(isUpdate){Message("Voiture retournée avec succès");}
     
    }

    @Override
    public void delete() {
        String delete="delete from voiture where matricule='"+matricule+"'";
        boolean isdelete=db.go.RunNonQuery(delete);
        if(isdelete){Message("La voiture est supprimée");}

    }

    @Override
    public String getAutoNumber() {
        //String auto = db.go.getAutoNumber("dept", "deptNo");
        return "";

    }

    @Override
    public void getAllRows(JTable table) {
       db.go.fillToJTableWithTableName("voiture", table);
    }

    @Override
    public void getOneRow(JTable table) {
       String select="select * from voiture where matricule='"+matricule+"'";
       db.go.fillToJTableWithStatement(select, table);
    }

    @Override
    public void getCustomRows(String Statement, JTable table) {
        db.go.fillToJTableWithStatement(Statement, table);

    }

    @Override
    public String getValueByName(String Name) {
     /* String select ="select deptNo from dept where deptName='"
             +Name+"'" ;
      String val =(String) db.go.getTableData(select).Items[0][0];*/
      return "";
    }

    @Override
    public String getNameByValue(String Value) {
       /* String select ="select deptName from dept where deptNo='"
             +Value+"'" ;
      String Name =(String) db.go.getTableData(select).Items[0][0];*/
      return "";

    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    public String getPropriete() {
        return propriete;
    }

    public void setPropriete(String propriete) {
        this.propriete = propriete;
    }

    

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    
    
    
}
