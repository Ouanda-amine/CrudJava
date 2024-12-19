import java.util.ArrayList;
import java.util.List;

public class Library {
     static List<Livre> livres;




    public Library() {
        this.livres = new ArrayList<>();


    }


    public  void AjouteLivre(Livre livre){
        livres.add(livre);
        System.out.println("livre ajouté");

    }
    public void afficherLivre(){
        for (Livre livre : livres){
            System.out.println(livre);
        }
    }
    public Livre RechercherLivre(String val){
        for (Livre livre: livres){
            if(livre.getIsbn().equals(val)|| livre.getAuteur().equals(val)||livre.getTitre().equals(val)){
                System.out.println(livre);
            }

        }

        return null;
    }
    public void modifierLivre(String snmod , String nwval,int choicemod){
        for(Livre livre : livres){
            if(livre.getIsbn().equals(snmod)){
                switch (choicemod){
                    case 1 -> livre.setTitre(nwval);
                    case 2 -> livre.setAuteur(nwval);



                }
            }
        }

    }
    public void modifierLivre(String snmod , boolean nwbool,int choicemod){
        for(Livre livre : livres){
            if(livre.getIsbn().equals(snmod)){
                switch (choicemod){
                    case 3 -> livre.setDisponible(nwbool);



                }
            }
        }

    }

    public Livre retourner (String titre , String nmaaadr , int iid ){
        for(Livre livre : livres){
            if(livre.getTitre().equals(titre) && !livre.isDisponible() ){

                System.out.println("l'adherent " + nmaaadr + "avec l'id : " + iid + "a emprunté le livre  " + titre);
                livre.setDisponible(true);


            }else if(livre.getTitre().equals(titre) && livre.isDisponible()){


                System.out.println(" livre  deja existe  !" );


            }

        }return null;

    }

    public void SupprimerLivre(String snsup){
        for (Livre livre : livres) {
            livres.remove(livre);
        }


    }

}