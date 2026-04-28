import java.util.ArrayList;
import java.util.List;

public class Redacteur {
    private String nom;
    private String prenom;
    private List<Quiz> quiz = new ArrayList<>();

    public Redacteur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void ajouterQuiz(Quiz quiz) {
        this.quiz.add(quiz);
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public List<Quiz> getQuiz() {
        return quiz;
    }

    @Override
    public String toString() {
        return "Rédacteur : nom:" + nom + ", prénom:" + prenom;
    }
}