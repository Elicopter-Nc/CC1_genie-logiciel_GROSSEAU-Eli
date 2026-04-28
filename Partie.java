public class Partie {
    private int score;
    private Quiz quiz;
    private Joueur joueur;

    public Partie(Quiz quiz, Joueur joueur, int score) {
        this.quiz = quiz;
        this.joueur = joueur;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    @Override
    public String toString() {
        return "Partie : score:" + score + ", quiz:" + quiz.getNom() + 
            ", joueur:" + joueur.getPrenom() + " " + joueur.getNom();
    }
}