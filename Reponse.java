public class Reponse {
    private String texte;
    private boolean bonneReponse;
    private Position position;

    public Reponse(String texte, boolean bonneReponse, Position position) {
        this.texte = texte;
        this.bonneReponse = bonneReponse;
        this.position = position;
    }

    public String getTexte() {
        return texte;
    }

    public boolean isBonneReponse() {
        return bonneReponse;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Réponse : position:" + position + ", texte:" + texte + ", bonne:" + bonneReponse;
    }
}