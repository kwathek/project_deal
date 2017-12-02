/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_deal;

import java.util.Date;
/**
 *
 * @author wathe
 */
public class Hotel extends Deal{

    public String getNomf() {
        return nomf;
    }

    public void setNomf(String nomf) {
        this.nomf = nomf;
    }

    public Date getDate_ajout() {
        return date_ajout;
    }

    public void setDate_ajout(Date date_ajout) {
        this.date_ajout = date_ajout;
    }
    String nomf ;
     Date date_ajout ;
    public Hotel(String description, double prix_i, double prix_deal, Date date_debut,Date date_fin,String nomf , Date date_ajout) {
        super(description, prix_i, prix_deal, date_debut, date_fin);
        this.nomf =nomf ;
        this.date_ajout=date_ajout;
        
    }

    public Hotel() {super();
    }

    @Override
    public String toString() {
        return "hotel{" + nomf +date_ajout +'}';
    }

    void ajout_deal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
