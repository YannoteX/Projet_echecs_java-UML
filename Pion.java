import java.util.* ;

public class Pion  {

  public Pion(boolean pieceCouleur, String pieceUnicode, Case positionPiece, int[] cases){
    super (pieceCouleur, pieceUnicode, positionPiece, cases);
  }

  public void calculDeplacementPossible() {
      // pour chaque premier deplacement de pion il peut sauter jusqu'à 2 case
      //ensuite il ne pourra faire qu'un deplacement
      // si joueur souhaite manger une piece il peut déplacer en diagonale

    int position = this.emplacement.id; // 58
    int colonne = (int) position/10;
    int ligne = position - colonne*10;
    boolean fini = false;

    if(this.couleur == true){   // Si la couleur du pion est blanche

      if(ligne==2){
        for (int i=0; i<2;i++){                         //le pion peut s'avancer de deux cases
          ligne+=1;
          this.addCase(colonne+ligne);     //devant lui au démarrage
        }
      }
      else if(ligne+1<8){
        ligne++;
        this.addCase(colonne+ligne);       //autrement il ne peut s'avancer que d'une case
      }

    }



  }
}
