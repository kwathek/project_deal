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
public class Client {
   
    private String nom ;
    private String prenom ;
    private int CIN;
    private int num_tel ;
    

    public Client(String nom, String prenom, int CIN, int num_tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.CIN = CIN;
        this.num_tel = num_tel;
    }

    public Client() {
        Scanner sc = new Scanner(System.in);
        System.out.println("donne le nom de client");
        this.nom=sc.nextLine();
         System.out.println("donne le prenom de client");
        this.prenom=sc.nextLine();
         System.out.println("donne le CIN de client");
        this.CIN=sc.nextInt();
        System.out.println("donne le num de telephon de client");
        this.num_tel=sc.nextInt();
    }
     public Client(int CIN) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donne le nom de client");
        this.nom=sc.nextLine();
         System.out.println("donne le prenom de client");
        this.prenom=sc.nextLine(); 
        this.CIN=CIN;
        System.out.println("donne le num de telephon de client");
        this.num_tel=sc.nextInt();
    }
   

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getCIN() {
        return CIN;
    }

    public int getNum_tel() {
        return num_tel;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCIN(int CIN) {
        this.CIN = CIN;
    }

    public void setNum_tel(int num_tel) {
        this.num_tel = num_tel;
    }

    @Override
    public String toString() {
        return "client{" + "nom=" + nom + ", prenom=" + prenom + ", CIN=" + CIN + ", num_tel=" + num_tel + '}';
    }
    
}
