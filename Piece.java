import com.modeliosoft.modelio.javadesigner.annotations.objid;
import java.util.* ;

public abstract class Piece {

  //******* Les Attributs **********

  private boolean couleur;
  private String unicode;
  private Case position;
  // private String tableau de déplacement;
  private ArrayList < Case > caseDeplacer = new ArrayList < Case > ();

  //******* Les Constructeurs  **********

  public Piece(boolean pieceCouleur, String pieceUnicode, Case positionPiece, ArrayList < Case > cases) {
    this.couleur = pieceCouleur;
    this.unicode = pieceUnicode;
    this.position = positionPiece;
    this.caseDeplacer = cases;
  }

  public Piece(boolean pieceCouleur, String pieceUnicode) {
    this.couleur = pieceCouleur;
    this.unicode = pieceUnicode;
    this.caseDeplacer = new ArrayList < Case > ();
  }

  //*********** Les Getters *************

  public boolean isCouleur() {
    return this.couleur;
  }

  public String getUnicode() {
    return this.unicode;
  }

  public ArrayList < Case > getCaseDeplacer() {
    return this.caseDeplacer;
  }

  //*********** Les Setters *************

  public void setCouleur(boolean newColor) {
    this.couleur = newColor;
  }
  // je sais pas si on a besoin un setter pour unicode
  public void setCase(int i, Case c) {
    this.caseDeplacer.set(i, c);
  }

  public void setCases(ArrayList < Case > newCases) {
    this.caseDeplacer = newCases;
  }
  //*********** Les Méthodes *************

  public abstract void calculDeplacementPossible();

  public boolean caseExiste(Case c) {
    return this.caseDeplacer.contains(c);
  }

  public boolean addCase(Case c) {
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
