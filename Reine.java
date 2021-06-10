package echec2;

public class Reine extends Piece{
	public Reine(boolean pieceCouleur, String pieceUnicode, Case positionPiece, VerificationPiece newArbitre){
    	super (pieceCouleur, pieceUnicode, positionPiece, newArbitre);
    }

    public void calculDeplacementPossible() {

    	int position = this.emplacement.id;
    	int colonneD = (int) position/10;
    	int ligneD = position - colonneD*10;



        //partie tour




    	int ligne = ligneD;

        // Calcul vers le bas
    	int verif= 3;
        while(ligne>1 && verif == 3){
            ligne--;
            
            verif = this.arbitre.verification(colonneD*10+ligne, this.couleur);
            if(verif==3){
                this.addCase(colonneD*10+ligne);
            }
            else if(verif==2){
                this.addCase(colonneD*10+ligne);
            }
        }

        ligne = ligneD;

        // Calcul vers le haut
        verif= 3;

        while(ligne<8 && verif==3){
            ligne++;
            
            verif= this.arbitre.verification(colonneD*10+ligne, this.couleur);
            if(verif==3){
                this.addCase(colonneD*10+ligne);
            }
            else if(verif==2){
                this.addCase(colonneD*10+ligne);
            }
        }

        int colonne = colonneD;

        // Calcul vers la droite
        verif= 3;

        while(colonne<8 && verif==3){
            colonne++;
            verif= this.arbitre.verification(colonneD*10+ligne, this.couleur);
            
            if(verif==3){
                this.addCase(colonne*10+ligneD);
            }
            else if(verif==2){
                this.addCase(colonne*10+ligneD);
            }
        }

        colonne = colonneD;

        // Calcul vers la gauche
        verif= 3;
        while(colonne>1 && verif==3){
            colonne--;
            verif= this.arbitre.verification(colonneD*10+ligne, this.couleur);
            
            if(verif==3){
                this.addCase(colonne*10+ligneD);
            }
            else if(verif==2){
                this.addCase(colonne*10+ligneD);
            }
        }




        // partie fou



        ligne = ligneD;
        colonne = colonneD;

    	// Calcul de la diagonale haut-gauche
        verif=3;

    	while(ligne<8 && colonne>1 && verif==3){
    		ligne++;
    		colonne--;
    		
    		verif=this.arbitre.verification(colonne*10+ligne, this.couleur);

    		if(verif==3){
    			this.addCase(colonne*10+ligne);
    		}
    		else if(verif==2){
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
    			break;
    		}
    		else{
    			break;
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
    			break;
    		}
    		else{
    			break;
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
    			break;
    		}
    		else{
    			break;
    		}
    	}
    }
}