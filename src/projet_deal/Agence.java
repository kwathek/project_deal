/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_deal;

import java.util.Date;
import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author wathe
 */
public class Agence {
    
    public  Vector <Deal> list_d = new Vector();
   public  Vector <Client> list_c = new Vector();
   public  Vector <Vente> list_v = new Vector();
    public  Vector <Localisation> list_f = new Vector();
    boolean test_cli ;
    int  cin_cli;
    boolean test_for ;
    int  cin_for;
   String nom_deal ;
   int ch ;
 Scanner sc = new Scanner(System.in);
    public Agence() {
    }
  
      public boolean test_cin(int cin_cli){
       test_cli=true;
       
      /* System.out.println("donne la cin de client");
       cin_cli = sc.nextInt();*/
     
       
       
       for( int j=0;j<list_c.size();j++)
                {
                    if((list_c.get(j).getCIN())==cin_cli){
                      test_cli= false; 
                      break;
                    }
                    
               }
        return test_cli;
                  
       
   }
   /*  public void ajout_client(){
         if (test_cin()==true){
             
         
        list_c.add(new Client(cin_cli));
        }
         else {
             System.out.println("cette client exicte deja ");
         }
    } */
       public void ajout_client(String name_1,String prenom_1,int ciin,int num ){
           list_c.add(new Client(name_1,prenom_1,ciin,num));
           System.out.println("Ajout terminer avec succes");
       }
       public void affiche_client(){
           for( int j=0;j<list_c.size();j++)
                {
                    System.out.println(list_c.get(j).toString());
                    
               }
       }
     public boolean test_localisation(String nom_deal){
       test_for=true;
       
      /*System.out.println("donne le nom de fornusseur");
       nom_deal = sc.nextLine();  */          
     
       
       
       for( int j=0;j<list_f.size();j++)
                {
                    if(list_f.get(j).getNom().equals(nom_deal)){
                      test_for= false; 
                      break;
                    }
                    
               }
        return test_for;
                  
       
   }
   /*  public void ajout_fornissure(){
         if (test_localisation()==true){
             
         
        list_f.add(new Localisation(nom_deal));
        }
         else {
             System.out.println("cette fournisseure  exicte deja ");
         }
    }*/
     public void ajout_localisation(String nom, String adresse, int tele, String mail, String h_travail){
           list_f.add(new Localisation( nom,  adresse,  tele, mail,  h_travail));
           System.out.println("Ajout terminer avec succes");
       }
      public void affiche_localisation(){
           for( int j=0;j<list_f.size();j++)
                {
                    System.out.println(list_f.get(j).toString());
                    
               }
       }
      
     public void ajout_deal(){
         System.out.println("taper 1 pour ajout un deal de type hotel");
         System.out.println("taper 2 pour ajout un deal de type resto");
         System.out.println("taper 6 pour ajout un deal de type spa");
         int ch= sc.nextInt();
         switch (ch){
             case 1 : {
                 System.out.println("Donner le nom du fournisseur");
                  nom_deal=sc.nextLine();
                  nom_deal=sc.nextLine();
               
                 for( int j=0;j<list_f.size();j++)
                 {
                     if (nom_deal.equals(list_f.get(j).getNom())){
                         list_d.add(new Hotel());
                         break;
                     }
                 }
                 
             }break;
             case 2 : list_d.add(new Restauration());break;
             case 3 : list_d.add(new Spa());break;
             
         }
     }
     public void ajout_hotel(String description, double prix_i, double prix_deal, Date date_debut,Date date_fin,String nomf , Date date_ajout){
         list_d.add(new Hotel(description, prix_i, prix_deal, date_debut, date_fin, nomf, date_ajout));
         System.out.println("Ajout terminer avec succes");
     }
     public void affichage_hotel(){
         for( int j=0;j<list_d.size();j++)
                {
                    System.out.println(list_d.get(j).toString());
                    
               }
     }
    
}
