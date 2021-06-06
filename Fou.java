import java.util.*;

public class Fou extends Piece{
	public Fou(boolean pieceCouleur, String pieceUnicode, Case positionPiece, VerificationPiece newArbitre){
    	super (pieceCouleur, pieceUnicode, positionPiece, newArbitre);
    }

    public void calculDeplacementPossible() {

    	int position = this.emplacement.id;
    	int colonneD = (int) position/10;
    	int ligneD = position - colonneD*10;

    	int ligne = ligneD;
    	int colonne = colonneD;

    	// Calcul de la diagonale haut-gauche

    	while(ligne<8 && colonne>1){
    		ligne++;
    		colonne--;

    		if(this.arbitre.verification(colonne*10+ligne, this.couleur)==3){
    			this.addCase(colonne*10+ligne);
    		}
    		else if(this.arbitre.verification(colonne*10+ligne, this.couleur)==2){
    			this.addCase(colonne*10+ligne);
    			break;
    		}
    		else{
    			break;
    		}
    	}

    	ligne=ligneD;
    	colonne=colonneD;


    	// Calcul de la diagonale haut-droite

    	while(ligne<8 && colonne<1){
    		ligne++;
    		colonne++;

    		if(this.arbitre.verification(colonne*10+ligne, this.couleur)==3){
    			this.addCase(colonne*10+ligne);
    		}
    		else if(this.arbitre.verification(colonne*10+ligne, this.couleur)==2){
    			this.addCase(colonne*10+ligne);
    			break;
    		}
    		else{
    			break;
    		}
    	}

    	ligne=ligneD;
    	colonne=colonneD;

    	// Calcul de la diagonale bas-gauche

    	while(ligne<8 && colonne>1){
    		ligne--;
    		colonne--;

    		if(this.arbitre.verification(colonne*10+ligne, this.couleur)==3){
    			this.addCase(colonne*10+ligne);
    		}
    		else if(this.arbitre.verification(colonne*10+ligne, this.couleur)==2){
    			this.addCase(colonne*10+ligne);
    			break;
    		}
    		else{
    			break;
    		}
    	}

    	ligne=ligneD;
    	colonne=colonneD;

    	// Calcul de la diagonale bas-droite

    	while(ligne<8 && colonne>1){
    		ligne++;
    		colonne--;

    		if(this.arbitre.verification(colonne*10+ligne, this.couleur)==3){
    			this.addCase(colonne*10+ligne);
    		}
    		else if(this.arbitre.verification(colonne*10+ligne, this.couleur)==2){
    			this.addCase(colonne*10+ligne);
    			break;
    		}
    		else{
    			break;
    		}
    	}

    }


}