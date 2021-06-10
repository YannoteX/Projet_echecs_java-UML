public class Roi extends Piece {

  public Roi(boolean pieceCouleur, String pieceUnicode, Case positionPiece, VerificationPiece newArbitre){
    super (pieceCouleur, pieceUnicode, positionPiece, newArbitre);
  }

    public void calculDeplacementPossible() {

    int position = this.emplacement.id;
    int colonneD = (int) position/10;
    int ligneD = position - colonneD*10;
    
    //haut
    if(this.arbitre.verification(colonneD*10+ligneD+1, this.couleur)==3){
    	if(this.arbitre.canRoiDeplacer(colonneD*10+ligneD+1, this.couleur)) {
            this.addCase(colonneD*10+ligneD+1);
    	}

      }
    else if(this.arbitre.verification(colonneD*10+ligneD+1, this.couleur)==2){  
        this.addCase(colonneD*10+ligneD+1);
      }

    //bas
    if(this.arbitre.verification(colonneD*10+ligneD-1, this.couleur)==3){  
    	if(this.arbitre.canRoiDeplacer(colonneD*10+ligneD-1, this.couleur)) {
            this.addCase(colonneD*10+ligneD-1);
    	}
      }
    else if(this.arbitre.verification(colonneD*10+ligneD-1, this.couleur)==2){  
        this.addCase(colonneD*10+ligneD-1);
      }
    //gauche
    if(this.arbitre.verification((colonneD-1)*10+ligneD, this.couleur)==3){  
    	if(this.arbitre.canRoiDeplacer((colonneD-1)*10+ligneD, this.couleur)) {
            this.addCase((colonneD-1)*10+ligneD);
    	}
    	
      }
    else if(this.arbitre.verification((colonneD-1)*10+ligneD, this.couleur)==2){  
        this.addCase((colonneD-1)*10+ligneD);
      }
    //droite
    if(this.arbitre.verification((colonneD+1)*10+ligneD, this.couleur)==3){  
    	if(this.arbitre.canRoiDeplacer((colonneD+1)*10+ligneD, this.couleur)) {
            this.addCase((colonneD+1)*10+ligneD+1);
    	}
    	
      }
    else if(this.arbitre.verification((colonneD+1)*10+ligneD, this.couleur)==2){  
        this.addCase((colonneD+1)*10+ligneD);
      }
    //diagonale haut-gauche
    if(this.arbitre.verification((colonneD-1)*10+ligneD+1, this.couleur)==3){  
    	if(this.arbitre.canRoiDeplacer((colonneD-1)*10+ligneD+1, this.couleur)) {
            this.addCase((colonneD-1)*10+ligneD+1);
    	}
      }
    else if(this.arbitre.verification((colonneD-1)*10+ligneD+1, this.couleur)==2){  
        this.addCase((colonneD-1)*10+ligneD+1);
      }
    //diagonale haut-droite
    if(this.arbitre.verification((colonneD+1)*10+ligneD+1, this.couleur)==3){  
    	if(this.arbitre.canRoiDeplacer((colonneD+1)*10+ligneD+1, this.couleur)) {
            this.addCase((colonneD+1)*10+ligneD+1);
    	}
      }
    else if(this.arbitre.verification((colonneD+1)*10+ligneD+1, this.couleur)==2){  
        this.addCase((colonneD+1)*10+ligneD+1);
      }
    
    //diagonale bas-gauche
    if(this.arbitre.verification((colonneD-1)*10+ligneD-1, this.couleur)==3){  
    	if(this.arbitre.canRoiDeplacer((colonneD-1)*10+ligneD-1, this.couleur)) {
            this.addCase((colonneD-1)*10+ligneD-1);
    	}
      }
    else if(this.arbitre.verification((colonneD-1)*10+ligneD-1, this.couleur)==2){  
        this.addCase((colonneD-1)*10+ligneD+1);
      }
    //diagonale bas-droite
    if(this.arbitre.verification((colonneD+1)*10+ligneD-1, this.couleur)==3){  
    	if(this.arbitre.canRoiDeplacer((colonneD+1)*10+ligneD-1, this.couleur)) {
            this.addCase((colonneD+1)*10+ligneD-1);
    	}
      }
    else if(this.arbitre.verification((colonneD+1)*10+ligneD-1, this.couleur)==2){  
        this.addCase((colonneD+1)*10+ligneD-1);
      }
    }
      

}
