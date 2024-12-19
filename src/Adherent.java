import java.util.ArrayList;
import java.util.List;

public class Adherent {
    String nom;
    List<Livre>  livresEmpruntes;



    public Adherent() {
        this.livresEmpruntes = new ArrayList<>();
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public Livre emprunter (String titree ){
        for(Livre livre : Library.livres ){
            if(livre.getTitre().equals(titree) && livre.isDisponible() ){

                System.out.println("l'adherent " + nom +  "a emprunté le livre  " + titree);
                livre.setDisponible(false);
                livresEmpruntes.add(livre);


            }else if(livre.getTitre().equals(titree) && !livre.isDisponible()){


                System.out.println(" livre  indisponible !" );


            }

        }return null;

    }


}
