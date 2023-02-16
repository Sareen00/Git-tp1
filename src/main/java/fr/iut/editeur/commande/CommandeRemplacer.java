package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Cree la commande qui pourra etre utilise pour remplacer du texte dans le document
 * @author milhauj
 */
public class CommandeRemplacer extends CommandeDocument{

    /**
     * constructeur de la commande
     * @param document le document sur lequel on effectu la commande
     * @param parameters les différents parametres encessaire a la commande
     */
    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * execute la commande
     */
    @Override
    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;depart;fin;chaine");
            return;
        }
        int depart = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        String texte = parameters[3];
        this.document.remplacer(depart,fin,texte);
        super.executer();
    }


}
