import java.util.* ;

public class Piece {

  //******* Les Attributs **********

  boolean couleur;
  String unicode;
  Case emplacement;
  // private String tableau de déplacement;
  ArrayList <Integer> caseDeplacer = new ArrayList <Integer> ();

  //******* Les Constructeurs  **********

  public Piece(boolean pieceCouleur, String pieceUnicode, Case positionPiece, ArrayList <Integer> cases) {
    this.couleur = pieceCouleur;
    this.unicode = pieceUnicode;
    this.emplacement = positionPiece;
    this.caseDeplacer = cases;
  }

  public Piece(boolean pieceCouleur, String pieceUnicode) {
    this.couleur = pieceCouleur;
    this.unicode = pieceUnicode;
    this.caseDeplacer = new ArrayList <Integer> ();
  }

  //*********** Les Getters *************

  public boolean isCouleur() {
    return this.couleur;
  }

  public String getUnicode() {
    return this.unicode;
  }

  public ArrayList<Integer> getCaseDeplacer() {
    return this.caseDeplacer;
  }

  //*********** Les Setters *************

  public void setCouleur(boolean newColor) {
    this.couleur = newColor;
  }
  // je sais pas si on a besoin un setter pour unicode
  public void setCase(int i, int c) {
    this.caseDeplacer.set(i, c);
  }

  public void setCases(ArrayList <Integer> newCases) {
    this.caseDeplacer = newCases;
  }
  //*********** Les Méthodes *************

  public void calculDeplacementPossible(){
  }

  public boolean caseExiste(int c) {
    return this.caseDeplacer.contains(c);
  }

  public boolean addCase(int c) {
    if (! (caseExiste(c))) {
      this.caseDeplacer.add(c);
      return true;
    }
    return false;
  }

  public String toString() {
    String s = new String("Piece Unicode :" + this.unicode + "/n Couleur du piece :" + this.couleur + "/n Case à deplacer" + this.caseDeplacer);
    return s;
  }

}
