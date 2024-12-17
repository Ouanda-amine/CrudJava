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


}