package fr.iut.editeur.document;

/**
 * La classe modélise un document.
 * Elle sert pour effectue différentes actions sur le document
 *
 * @author milhauj
 */
public class Document {

    /**
     * Le texte contenue dans document
     */
    private String texte;

    /**
     * Constructeur du document initialise le texte
     */
    public Document() {
        this.texte = "";
    }


    /**
     * Renvoie le texte present dans le document
     * @return Une chaine de caracteres
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Affecte une chaine de caracteres au texte du document
     * @param texte
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Ajoute au texte du document la chaine de caractères passé en parametre
     * @param texte
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }


    /**
     * Remplace une partie du texte entre les index renseigne par le texte passe en parametre
     * @param start
     * @param end
     * @param remplacement
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = this.texte.substring(0, start);
        String rightPart = this.texte.substring(end);
        this.texte = leftPart + remplacement + rightPart;
    }


    /**
     * Remplace une partie du texte par des majuscules
     * @param start
     * @param end
     */
    public void majuscules(int start, int end) {
        String partieMajuscule = this.texte.substring(start, end);
        partieMajuscule = partieMajuscule.toUpperCase();

        remplacer(start,end,partieMajuscule);
    }


    /**
     * Efface une partie du texte entre les indexes
     * @param start indexe de depart
     * @param end indexe defin
     */
    public void effacer(int start, int end) {
        String remplacement ="";
        remplacer(start,end,remplacement);
    }

    /**
     * Supprime tout le texte du document
     */
    public void clear() {
        this.texte="";
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
