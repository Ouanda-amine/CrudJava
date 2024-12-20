import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    public void emprunter (String titree ){
      Library.livres.stream()
              .filter(livre -> titree.equals(livre.titre))
              .findFirst()
                      .ifPresentOrElse(livre -> {
                          livresEmpruntes.add(livre);
                          livre.setDisponible(false);
                                  System.out.println("livre emprinté par " +nom);
                      },()-> System.out.println("livre non trouvé")
                      );
    }

    public void retourner (String titre  ){
        livresEmpruntes.stream().filter(livre -> titre.equals(livre.titre))
                .findFirst()
                .ifPresentOrElse(livre -> {
                    livresEmpruntes.remove(livre);
                    livre.setDisponible(true);
                            System.out.println("livre emprunte par ");
                },()-> System.out.println("livre non trouvé !")
                );
    }


    public  void AfficherLivresEmpruntes(){
        for(Livre livre : livresEmpruntes){
            System.out.println(livre);
        }
    }


}
