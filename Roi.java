import java.util.* ;

public class Roi extends Piece {

  public Roi(boolean pieceCouleur, String pieceUnicode, Case positionPiece, VerificationPiece newArbitre){
    super (pieceCouleur, pieceUnicode, positionPiece, newArbitre);
  }

    public void calculDeplacementPossible() {

    int position = this.emplacement.id;
    int colonneD = (int) position/10;
    int ligneD = position - colonneD*10;


    int ligne = ligneD;

    // Calcul vers le haut

    while(ligne<8){
        ligne++;

        if(this.arbitre.verification(colonneD*10+ligne, this.couleur)==3 || this.arbitre.verification(colonneD*10+ligne, this.couleur)==2){
            this.addCase(colonneD*10+ligne+1);
        }
        /*else if (this.arbitre.verification(colonneD*10+ligne, this.couleur)==2){
            this.addCase(colonneD*10+ligne+1);
            break;
        }*/

        else{
          break;
        }
      }

    // calcul vers le bas
      while(ligne>1){
          ligne--;

          if(this.arbitre.verification(colonneD*10+ligne, this.couleur)==3 || this.arbitre.verification(colonneD*10+ligne, this.couleur)==2 ){
              this.addCase(colonneD*10+ligne-1);
          }
          /*else if(this.arbitre.verification(colonneD*10+ligne, this.couleur)==2){
              this.addCase(colonneD*10+ligne-1);
              break;
          }*/
          else{
              break;
          }
      }

      int colonne = colonneD;

      // Calcul vers la droite

      while(colonne<8){
          colonne++;

          if(this.arbitre.verification(colonne*10+ligneD, this.couleur)==3 || this.arbitre.verification(colonne*10+ligneD, this.couleur)==2){
              this.addCase(colonne+1*10+ligneD);
          }
          /*else if(this.arbitre.verification(colonne*10+ligneD, this.couleur)==2){
              this.addCase(colonne+1*10+ligneD);
              break;
          }*/
          else{
              break;
          }
      }

      // Calcul vers le gauche

      colonne = colonneD;

      while(colonne>1){
          colonne--;

          if(this.arbitre.verification(colonne*10+ligneD, this.couleur)==3 || this.arbitre.verification(colonne*10+ligneD, this.couleur)==2 ){
              this.addCase(colonne-1*10+ligneD);
          }
          /*else if(this.arbitre.verification(colonne*10+ligneD, this.couleur)==2){
              this.addCase(colonne-1*10+ligneD);
              break;
          }*/
          else{
              break;
          }
      }

      // Calcul de la diagonale haut-droite
      ligne=ligneD;
      colonne=colonneD;

      while(ligne<8 && colonne<8){
          ligne++;
          colonne++;

          if(this.arbitre.verification(colonne*10+ligne, this.couleur)==3 || this.arbitre.verification(colonne*10+ligne, this.couleur)==2 ){
              this.addCase(colonne+1*10+ligne+1);
          }
        /*  else if(this.arbitre.verification(colonne*10+ligne, this.couleur)==2){
              this.addCase(colonne+1*10+ligne+1);
              break;
          }*/
          else{
              break;
          }
      }

      ligne = ligneD;
      colonne = colonneD;

      // Calcul de la diagonale haut-gauche

      while(ligne<8 && colonne>1){
          ligne++;
          colonne--;

          if(this.arbitre.verification(colonne*10+ligne, this.couleur)==3 || this.arbitre.verification(colonne*10+ligne, this.couleur)==2){
              this.addCase(colonne-1*10+ligne+1);
          }
          /*else if(this.arbitre.verification(colonne*10+ligne, this.couleur)==2){
              this.addCase(colonne-1*10+ligne+1);
              break;
          }*/
          else{
              break;
          }
      }
      ligne=ligneD;
      colonne=colonneD;

      // Calcul de la diagonale bas-droite

      while(ligne>1 && colonne<8){
          ligne--;
          colonne++;

          if(this.arbitre.verification(colonne*10+ligne, this.couleur)==3 || this.arbitre.verification(colonne*10+ligne, this.couleur)==2){
              this.addCase(colonne+1*10+ligne-1);
          }
        /*  else if(this.arbitre.verification(colonne*10+ligne, this.couleur)==2){
              this.addCase(colonne+1*10+ligne-1);
              break;
          }*/
          else{
              break;
          }
      }

      ligne=ligneD;
      colonne=colonneD;

      // Calcul de la diagonale bas-gauche

      while(ligne>1 && colonne>1){
          ligne--;
          colonne--;

          if(this.arbitre.verification(colonne*10+ligne, this.couleur)==3 || this.arbitre.verification(colonne*10+ligne, this.couleur)==2){
              this.addCase(colonne-1*10+ligne-1);
          }
          /*else if(this.arbitre.verification(colonne*10+ligne, this.couleur)==2){
              this.addCase(colonne-1*10+ligne-1);
              break;
          }*/
          else{
              break;
          }
      }
    }
      

}
