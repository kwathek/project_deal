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
public class Restauration extends Deal{

 public Restauration(String description, double prix_i, double prix_deal, Date date_debut, Date date_fin) {
        super(description, prix_i, prix_deal, date_debut, date_fin);
    }

    public Restauration() {super();
    }

    @Override
    public String toString() {
        return "restauration{" + '}';
    }
    
}
