

public class Cavalier extends Piece {

  public Cavalier(boolean pieceCouleur, String pieceUnicode, Case positionPiece, VerificationPiece newArbitre){
    super (pieceCouleur, pieceUnicode, positionPiece, newArbitre);
  }

  public void calculDeplacementPossible() {

    int position = this.emplacement.id;
    int colonneD = (int) position/10;
    int ligneD = position - colonneD*10;


    //vers le bas-gauche


    //cas bas-bas-gauche
    if(ligneD>2 && colonneD>1){
      if(this.arbitre.verification((colonneD-1)*10+ligneD-2, this.couleur)==3 || this.arbitre.verification((colonneD-1)*10+ligneD-2, this.couleur)==2){   //devant lui au démarrage
            this.addCase((colonneD-1)*10+ligneD-2);
          }
    }

    //cas gauche-gauche-bas
    if(ligneD>1 && colonneD>2){
      if(this.arbitre.verification((colonneD-2)*10+ligneD-1, this.couleur)==3 || this.arbitre.verification((colonneD-2)*10+ligneD-1, this.couleur)==2){   //devant lui au démarrage
            this.addCase((colonneD-2)*10+ligneD-1);
          }
    }


    // vers le bas-droit


    //cas bas-bas-droite
    if(ligneD>2 && colonneD<8){
      if(this.arbitre.verification((colonneD+1)*10+ligneD-2, this.couleur)==3 || this.arbitre.verification((colonneD+1)*10+ligneD-2, this.couleur)==2){   //devant lui au démarrage
            this.addCase((colonneD+1)*10+ligneD-2);
          }
    }

    //cas droite-droite-bas
    if(ligneD>1 && colonneD<7){
      if(this.arbitre.verification((colonneD+2)*10+ligneD-1, this.couleur)==3 || this.arbitre.verification((colonneD+2)*10+ligneD-1, this.couleur)==2){   //devant lui au démarrage
            this.addCase((colonneD+2)*10+ligneD-1);
          }
    }


    //vers le haut-gauche


    //cas haut-haut-gauche
    if(ligneD<7 && colonneD>1){
      if(this.arbitre.verification((colonneD-1)*10+ligneD+2, this.couleur)==3 || this.arbitre.verification((colonneD-1)*10+ligneD+2, this.couleur)==2){   //devant lui au démarrage
            this.addCase((colonneD-1)*10+ligneD+2);
          }
    }


    //cas gauche-gauche-haut 
    if(ligneD<8 && colonneD>2){
      if(this.arbitre.verification((colonneD-2)*10+ligneD+1, this.couleur)==3 || this.arbitre.verification((colonneD-2)*10+ligneD+1, this.couleur)==2){   //devant lui au démarrage
            this.addCase((colonneD-2)*10+ligneD+1);
          }
    }


    //vers le haut-droit


    //cas haut-haut-droite
    if(ligneD<7 && colonneD<8){
      if(this.arbitre.verification((colonneD+1)*10+ligneD+2, this.couleur)==3 || this.arbitre.verification((colonneD+1)*10+ligneD+2, this.couleur)==2){   //devant lui au démarrage
            this.addCase((colonneD+1)*10+ligneD+2);
          }
    }


    //cas droite-droite-haut
    if(ligneD<8 && colonneD<7){
      if(this.arbitre.verification((colonneD+2)*10+ligneD+1, this.couleur)==3 || this.arbitre.verification((colonneD+2)*10+ligneD+1, this.couleur)==2){   //devant lui au démarrage
            this.addCase((colonneD+2)*10+ligneD+1);
          }
    }
    
  }
}
