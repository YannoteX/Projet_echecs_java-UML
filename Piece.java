import java.util.* ;

public class Piece { //penser à mettre en abstract

  //******* Les Attributs **********

  boolean couleur;
  String unicode;
  Case emplacement;
  // private String tableau de déplacement;
  int [] caseDeplacer;

  //******* Les Constructeurs  **********

  public Piece(boolean pieceCouleur, String pieceUnicode, Case positionPiece, int[] cases) {
    this.couleur = pieceCouleur;
    this.unicode = pieceUnicode;
    this.emplacement = positionPiece;
    this.caseDeplacer = cases;
  }

  public Piece(boolean pieceCouleur, String pieceUnicode, Case positionPiece) {
    this.couleur = pieceCouleur;
    this.unicode = pieceUnicode;
    this.emplacement = positionPiece;
    this.caseDeplacer = new int[] {}; // pas de paranthèses je pense
  }

  //*********** Les Getters *************

  public boolean isCouleur() {
    return this.couleur;
  }

  public String getUnicode() {
    return this.unicode;
  }

  public int[] getCaseDeplacer() {
    return this.caseDeplacer;
  }

  //*********** Les Setters *************

  public void setCouleur(boolean newColor) {
    this.couleur = newColor;
  }
  // je sais pas si on a besoin un setter pour unicode

  public void setCases(int[] newCases) {
    this.caseDeplacer = newCases;
  }
  //*********** Les Méthodes *************

  public void calculDeplacementPossible(){
  }

  public boolean caseExiste(int c) {
    int i =0;
    while(i<caseDeplacer.length){
      if(c==caseDeplacer[i]){
        return true;
      }
    }
    return false;
  }

  public void addCase(int c) {
    if (! (caseExiste(c))) {
      int[] temp = new int[this.caseDeplacer.length+1];
      temp[temp.length]=c;
      this.caseDeplacer = temp;
    }
  }

  public String toString() {
    String s = new String("Piece Unicode :" + this.unicode + "/n Couleur du piece :" + this.couleur + "/n Case à deplacer" + this.caseDeplacer);
    return s;
  }

}
