import com.modeliosoft.modelio.javadesigner.annotations.objid;
import java.util.*;

public abstract class Piece {

    //******* Les Attributs **********

    private boolean couleur;
    private  String unicode;
    // private String tableau de déplacement;
    private ArrayList<Case> caseDeplacer = new ArrayList<Case> ();


     //******* Les Constructeurs  **********

  public Piece (boolean pieceCouleur, String pieceUnicode,  ArrayList<Case> cases) {
     	this.couleur = pieceCouleur;
     	this.unicode = pieceUnicode;
     	this.caseDeplacer = cases;
  }

   /*
   	public Piece (boolean pieceCouleur, String pieceUnicode) {
     	this.couleur = pieceCouleur;
     	this.unicode = pieceUnicode;
     	this.caseDeplacer = new ArrayList<Case> ();
    }
    à utiliser si l'autre constructeur engendre le problème */

    //*********** Les Getters *************

  public boolean isCouleur() {
        return this.couleur;
  }

	public String getUnicode() {
		return this.unicode;
	}

	public ArrayList<Case> getCaseDeplacer() {
		return this.caseDeplacer;
	}

	 //*********** Les Setters *************


  public void setCouleur(boolean newColor) {
        this.couleur = newColor;
  }
    			// je sais pas si on a besoin un setter pour unicode
  public void setCase( int i, Case c) {
    	this.caseDeplacer.set(i,c);
  }

	public void setCases( ArrayList<Case> newCases) {
		this.caseDeplacer = newCases;
	}
	//*********** Les Méthodes *************

  public abstract void calculDeplacementPossible() ;

}
