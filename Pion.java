package echec2;

public class Pion extends Piece {

  public Pion(boolean pieceCouleur, String pieceUnicode, Case positionPiece, VerificationPiece newArbitre){
    super (pieceCouleur, pieceUnicode, positionPiece, newArbitre);
  }

  public void calculDeplacementPossible() {
      // pour chaque premier deplacement de pion il peut sauter jusqu'à 2 case
      //ensuite il ne pourra faire qu'un deplacement
      // si joueur souhaite manger une piece il peut déplacer en diagonale

    int position = this.emplacement.id;
    int colonneD = (int) position/10;
    int ligneD = position - colonneD*10;

    if(this.couleur == true){   // Si la couleur du pion est blanche

      if(ligneD==2){
        int ligne=ligneD;
        for (int i=0; i<2;i++){                                                //le pion peut s'avancer de deux cases
          ligne+=1;
          if(this.arbitre.verification(colonneD*10+ligne, this.couleur)==3){   //devant lui au démarrage
            this.addCase(colonneD*10+ligne);
          }
        }
      }
      else if(ligneD+1<=8){
        if(this.arbitre.verification(colonneD*10+ligneD+1, this.couleur)==3){
          this.addCase(colonneD*10+ligneD+1);                                   //autrement il ne peut s'avancer que d'une case
        }

        if(colonneD+1<=8){
          if(this.arbitre.verification((colonneD+1)*10+ligneD+1,this.couleur)==2){  //et peut manger les cases se situant dans sa diagonale
            this.addCase((colonneD+1)*10+ligneD+1);
          }
        }

        if(colonneD-1<=8){
          if(this.arbitre.verification((colonneD-1)*10+ligneD+1,this.couleur)==2){
            this.addCase((colonneD-1)*10+ligneD+1);
          }

      }

    }

  }

  else{                   // La couleur du pion est noire

      if(ligneD==7){
        int ligne=ligneD;
        for (int i=0; i<2;i++){                                                //le pion peut s'avancer de deux cases
          ligne-=1;
          if(this.arbitre.verification(colonneD*10+ligne, this.couleur)==3){   //devant lui au démarrage
            this.addCase(colonneD*10+ligne);
          }
        }
      }
      else if(ligneD-1>=1){
        if(this.arbitre.verification(colonneD*10+ligneD-1, this.couleur)==3){
          this.addCase(colonneD*10+ligneD-1);                                   //autrement il ne peut s'avancer que d'une case
        }

        if(colonneD+1<=8){
          if(this.arbitre.verification((colonneD+1)*10+ligneD-1,this.couleur)==2){  //et peut manger les cases se situant dans sa diagonale
            this.addCase((colonneD+1)*10+ligneD-1);
          }
        }

        if(colonneD-1<=8){
          if(this.arbitre.verification((colonneD-1)*10+ligneD-1,this.couleur)==2){
            this.addCase((colonneD-1)*10+ligneD-1);
          }

      }

      }
    }
  }
}