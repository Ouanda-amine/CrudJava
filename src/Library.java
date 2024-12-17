import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Livre> livres;


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


}