import java.util.ArrayList;
import java.util.List;

public class Library {
     static List<Livre> livres = new ArrayList<>();




    public Library() {
    }

    public  void AjouteLivre(Livre newlivre){

        boolean dejaexiste = livres.stream().anyMatch(livre1 -> livre1.getIsbn()==newlivre.getIsbn());

        if (dejaexiste){
            System.out.println("isbn deja existe");
        }else{
            livres.add(newlivre);
            System.out.println("livre ajouté");
        }


    }
    public void afficherLivre(){
       livres.stream()
               .forEach(System.out::println);
    }
    public void RechercherLivre(String val){
        livres.stream().filter(livre -> val.equals(livre.titre) || val.equals(livre.isbn) || val.equals(livre.auteur))
                .forEach(System.out::println);

    }
    public void modifierLivre(String snmod , String nwval,int choicemod){
       livres.stream().filter(livre -> snmod.equals(livre.isbn))
               .findFirst()
               .ifPresentOrElse(livre -> {
                   if(choicemod==1){
                       livre.setTitre(nwval);
                   }else if(choicemod==2){
                       livre.setAuteur(nwval);
                   }
               },()-> System.out.println("livre non trouvé"));

    }
    public void modifierLivre(String snmod , boolean nwbool,int choicemod){
        livres.stream().filter(livre -> snmod.equals(livre.isbn))
                .findFirst()
                .ifPresentOrElse(livre -> {
                    if (choicemod == 3) {
                        livre.setDisponible(nwbool);
                    }
                },()-> System.out.println("livre non trouvé"));

    }



    public void SupprimerLivre(String snsup){
        livres.removeIf(livre -> snsup.equals(livre.isbn));

    }

}