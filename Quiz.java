import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private String nom;
    private Categorie categorie;
    private Redacteur redacteur;
    private List<Question> questions = new ArrayList<>();

    public Quiz(String nom, Categorie categorie, Redacteur redacteur) {
        this.nom = nom;
        this.categorie = categorie;
        this.redacteur = redacteur;
    }

    public void ajouterQuestion(Question question) {
        this.questions.add(question);
    }

    public String getNom() {
        return nom;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public Redacteur getRedacteur() {
        return redacteur;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    @Override
    public String toString() {
        return "Quiz : nom:" + nom + ", catégorie:" + categorie.getLibelle() + 
            ", rédacteur:" + redacteur.getPrenom() + " " + redacteur.getNom() + 
            ", nbQuestions:" + questions.size();
    }
}