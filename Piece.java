

public class Piece {

  //******* Les Attributs **********

  boolean couleur;
  String unicode;
  Case emplacement;
  // private String tableau de déplacement;
  int [] caseDeplacer;
  VerificationPiece arbitre;

  //******* Les Constructeurs  **********

  public Piece(boolean pieceCouleur, String pieceUnicode, Case positionPiece, int[] cases, VerificationPiece newArbitre) {
    this.couleur = pieceCouleur;
    this.unicode = pieceUnicode;
    this.emplacement = positionPiece;
    this.caseDeplacer = cases;
    this.arbitre=newArbitre;
  }

  public Piece(boolean pieceCouleur, String pieceUnicode, Case positionPiece, VerificationPiece newArbitre) {
    this.couleur = pieceCouleur;
    this.unicode = pieceUnicode;
    this.emplacement=positionPiece;
    this.caseDeplacer = new int[] {};
    this.arbitre=newArbitre;
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
  
  public int getUneCaseDeplacer(int indice) {
    for(int i = 0; i < this.caseDeplacer.length; i++){
      if(indice == this.caseDeplacer[i]){
        return caseDeplacer[i];
      }
    }
    return -1;
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
	  
    for (int i = 0 ; i <this.caseDeplacer.length ; i++) {
      if(c==this.caseDeplacer[i]){
        return true;
      }
    }
    return false;
  }

  public void addCase(int c) {
    if (this.caseExiste(c)==false) {
      int[] temp = new int[this.caseDeplacer.length+1];
      int i = 0; 
      while(i<this.caseDeplacer.length) {
    	  temp[i] = caseDeplacer[i];
    	  i++;
      }
      temp[temp.length-1]=c;
      this.caseDeplacer = temp;
    }
  }

  public String toString() {
    String s = new String("Piece Unicode :" + this.unicode + "/n Couleur du piece :" + this.couleur + "/n Case à deplacer" + this.caseDeplacer);
    return s;
  }

}
