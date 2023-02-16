package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = this.texte.substring(0, start);
        String rightPart = this.texte.substring(end);
        this.texte = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        String partieMajuscule = this.texte.substring(start, end);
        partieMajuscule = partieMajuscule.toUpperCase();

        remplacer(start,end,partieMajuscule);
    }


    public void effacer(int start, int end) {
        String remplacement ="";
        remplacer(start,end,remplacement);
    }

    public void clear() {
        this.texte="";
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
