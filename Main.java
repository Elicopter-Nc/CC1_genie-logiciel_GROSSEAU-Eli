public class Main {
    public static void main(String[] args) {
        
        //rédacteur de ce quiz
        Redacteur redacteur = new Redacteur("Katjawan", "Lucas");
        System.out.println("Rédacteur: " + redacteur);

        //thème du quiz
        Quiz quiz = new Quiz("Quiz Cinéma", Categorie.Cinema, redacteur);

        //question et réponses possibles
        Question q1 = new Question("Quel film a gagné l'Oscar 2020 ?");


        q1.ajouterReponse(new Reponse("Parasite", true, Position.A));
        q1.ajouterReponse(new Reponse("1917", false, Position.B));
        q1.ajouterReponse(new Reponse("Joker", false, Position.C));
        q1.ajouterReponse(new Reponse("Titeuf", false, Position.D));

        quiz.ajouterQuestion(q1);
        System.out.println("Quiz: " + quiz);

        System.out.println("Question: " + q1);
        for (Reponse r : q1.getReponses()) {
            System.out.println(" - " + r);
        }
        
        // 2 joueurs
        Joueur joueur1 = new Joueur("GROSSEAU", "ELi");
        Joueur joueur2 = new Joueur("Philipe", "Jean");
        System.out.println("Joueurs: " + joueur1 + ", " + joueur2);

        // 2 parties avec score
        Partie partie1 = new Partie(quiz, joueur1, 3);
        Partie partie2 = new Partie(quiz, joueur2, 2);
        System.out.println("Partie 1: " + partie1);
        System.out.println("Partie 2: " + partie2);
    }
}
