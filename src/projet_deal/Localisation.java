/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_deal;
import java.util.Scanner;
/**
 *
 * @author wathe
 */
public class Localisation {
    
      private String nom;
    private String adresse;
    private int tele;
    private String mail;
    private String h_travail;

    

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getTele() {
        return tele;
    }

    public String getMail() {
        return mail;
    }

    public String getH_travail() {
        return h_travail;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTele(int tele) {
        this.tele = tele;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setH_travail(String h_travail) {
        this.h_travail = h_travail;
    }

    public Localisation(String nom, String adresse, int tele, String mail, String h_travail) {
        this.nom = nom;
        this.adresse = adresse;
        this.tele = tele;
        this.mail = mail;
        this.h_travail = h_travail;
    }

    public Localisation() {
        Scanner sc=new Scanner (System.in);
        System.out.println("Donner le nom du fournisseur");
        this.nom=sc.nextLine();
               
        System.out.println("Donner l'adresse du fournisseur");
        this.adresse=sc.nextLine();
     System.out.println("Donner le telephone du fournisseur");
        this.tele=sc.nextInt();
        System.out.println("Donner l'adresse mail de contact du fournisseur");
        this.mail=sc.nextLine();
         this.mail=sc.nextLine();
          System.out.println("Donner l'horaire de travail du fournisseur");
        this.h_travail=sc.nextLine();
        
    }
     public Localisation(String nom) {
        Scanner sc=new Scanner (System.in);
        
        this.nom=nom;
               
        System.out.println("Donner l'adresse du fournisseur");
        this.adresse=sc.nextLine();
     System.out.println("Donner le telephone du fournisseur");
        this.tele=sc.nextInt();
        System.out.println("Donner l'adresse mail de contact du fournisseur");
        this.mail=sc.nextLine();
        this.mail=sc.nextLine();
          System.out.println("Donner l'horaire de travail du fournisseur");
        this.h_travail=sc.nextLine();
        
    }

    @Override
    public String toString() {
        return "localisation{" + "nom=" + nom + ", adresse=" + adresse + ", tele=" + tele + ", mail=" + mail + ", h_travail=" + h_travail + '}';
    }
    
}
