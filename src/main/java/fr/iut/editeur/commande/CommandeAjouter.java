package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Cree la commande qui pourra etre utilise pour ajouter du texte une partie du texte dans le document
 * @author milhauj
 */
public class CommandeAjouter extends CommandeDocument {


    /**
     * constructeur de la commande
     * @param document
     * @param parameters
     */
    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters);
    }


    /**
     * Execute la commande pour ajouter le texte
     */
    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        super.executer();
    }

}
