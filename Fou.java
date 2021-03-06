

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
    	int verif=3;

    	while(ligne<8 && colonne>1 && verif==3){
    		ligne++;
    		colonne--;
    		
    		verif=this.arbitre.verification(colonne*10+ligne, this.couleur);

    		if(verif==3){
    			this.addCase(colonne*10+ligne);
    		}
    		else if(verif==2){
    			this.addCase(colonne*10+ligne);
    		}
    	}

    	ligne=ligneD;
    	colonne=colonneD;


    	// Calcul de la diagonale haut-droite

    	verif=3;
    	while(ligne<8 && colonne<8 && verif==3){
    		ligne++;
    		colonne++;
    		verif=this.arbitre.verification(colonne*10+ligne, this.couleur);

    		if(verif==3){
    			this.addCase(colonne*10+ligne);
    		}
    		else if(verif==2){
    			this.addCase(colonne*10+ligne);
    		}
    	}

    	ligne=ligneD;
    	colonne=colonneD;

    	// Calcul de la diagonale bas-gauche
    	verif=3;

    	while(ligne>1 && colonne>1 && verif==3){
    		ligne--;
    		colonne--;
    		verif=this.arbitre.verification(colonne*10+ligne, this.couleur);
    		if(verif==3){
    			this.addCase(colonne*10+ligne);
    		}
    		else if(verif==2){
    			this.addCase(colonne*10+ligne);
    		}
    	}

    	ligne=ligneD;
    	colonne=colonneD;

    	// Calcul de la diagonale bas-droite
    	verif=3;
    	while(ligne>1 && colonne<8 && verif==3){
    		ligne--;
    		colonne++;
    		verif=this.arbitre.verification(colonne*10+ligne, this.couleur);

    		if(verif==3){
    			this.addCase(colonne*10+ligne);
    		}
    		else if(verif==2){
    			this.addCase(colonne*10+ligne);
    		}
    	}

    }


}
