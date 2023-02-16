package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Cree la commande qui pourra etre utilise pour mettre en majsucule une partie du texte dans le document
 * @author milhauj
 */
public class CommandeMajuscules extends CommandeDocument{
    /**
     * constructeur de la commande
     * @param document
     * @param parameters
     */
    public CommandeMajuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Execute la commande de majuscule
     */
    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : majuscules;depart;fin");
            return;
        }
        int depart = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.majuscules(depart,fin);
        super.executer();
    }

}
