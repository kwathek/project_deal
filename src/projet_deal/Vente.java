/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_deal;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author wathe
 */
public class Vente {
    
    private String date ;
    private Client c ;
    private int quntite ;
  

    public Vente(String date, Client c, int quntite) {
        this.date = date;
        this.c = c;
        this.quntite = quntite;
       
    }

    public Vente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("donne la date  de vente");
        this.date=sc.nextLine();
         System.out.println("donne le  client");
        this.c= new Client();
         System.out.println("donne le Quntite ");
        this.quntite =sc.nextInt();
        
    }

   

    public String getDate() {
        return date;
    }

    public Client getC() {
        return c;
    }

    public int getQuntite() {
        return quntite;
    }

    @Override
    public String toString() {
        return "vente{" + "date=" + date + ", c=" + c + ", quntite=" + quntite + '}';
    }
}
