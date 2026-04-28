public enum Categorie {
    Culture_General("Culture Général"),
    Cinema("Cinéma"),
    Jeux_videos("Jeux Vidéos"),
    Histoire("Histoire"),
    Geographie("Géographie");

    private final String nom_c;

    Categorie(String nom_c) {
        this.nom_c = nom_c;
    }

    public String getLibelle() {
        return nom_c;
    }
}