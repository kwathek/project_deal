/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_deal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author wathe
 */
public abstract class Deal {
    
    
    protected String description;
    protected double prix_i;
    protected double prix_deal;
    protected Date date_debut;
    protected Date date_fin;
    protected Localisation nom;
    protected String date;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix_i() {
        return prix_i;
    }

    public void setPrix_i(double prix_i) {
        this.prix_i = prix_i;
    }

    public double getPrix_deal() {
        return prix_deal;
    }

    public void setPrix_deal(double prix_deal) {
        this.prix_deal = prix_deal;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public Localisation getNom() {
        return nom;
    }

    public void setNom(Localisation nom) {
        this.nom = nom;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public Deal(String description, double prix_i, double prix_deal, Date date_debut, Date date_fin) {
        this.description = description;
        this.prix_i = prix_i;
        this.prix_deal = prix_deal;
        this.date_debut = new Date();
        this.date_fin = new Date();
    }
    
    public Deal (){
        Scanner sc=new Scanner (System.in);
        System.out.println("Donner la description de deal");
        this.description=sc.nextLine();
         System.out.println("Donner le prix initial de deal");
        this.prix_i=sc.nextDouble();
         System.out.println("Donner le prix de deal");
        this.prix_deal=sc.nextDouble();
         System.out.println("Donner la date debut de deal");
        this.date=sc.nextLine();
        this.date=sc.nextLine();
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
         dateFormat.setLenient(false);
          date_debut = null;
                 try {
    date_debut = dateFormat.parse(date);
    //System.out.println("Date parsée : "+date_debut);
} catch (Exception e) {
    System.err.println("Format de date invalide. Usage : dd/MM/YYYY");
    System.err.println(e.getMessage());
}
        System.out.println("Donner la date fin de deal");
        this.date =sc.nextLine();
        date_fin = null;
                 try {
        date_fin= dateFormat.parse(date);
    //System.out.println("Date parsée : "+date_debut);
}     catch (Exception e) {
       System.err.println("Format de date invalide. Usage : dd/MM/YYYY");
       System.err.println(e.getMessage());
}
        System.out.println("Donner la localisation  de deal");
        this.nom = new Localisation();
        
    }

    @Override
    public String toString() {
        return "deal{" + "description=" + description + ", prix_i=" + prix_i + ", prix_deal=" + prix_deal + ", date_debut=" + date_debut + ", date_fin=" + date_fin + '}';
    }
    
    
}
