import java.util.ArrayList;
import java.util.List;

public class Question {
    private String titre;
    private List<Reponse> reponses = new ArrayList<>();

    public Question(String titre) {
        this.titre = titre;
    }

    public void ajouterReponse(Reponse reponse) {
        if (reponses.size() >= 4) {
            throw new IllegalStateException("Une question ne peut pas avoir plus de 4 réponses");
        }
        this.reponses.add(reponse);
    }

    public String getTitre() {
        return titre;
    }

    public List<Reponse> getReponses() {
        return reponses;
    }

    public Reponse getBonneReponse() {
        for (Reponse r : reponses) {
            if (r.isBonneReponse()) {
                return r;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Question : titre:" + titre + ", nbRéponses:" + reponses.size();
    }
}