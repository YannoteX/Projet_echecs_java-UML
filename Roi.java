import java.util.* ;

public class Roi extends Piece {

  public Roi(boolean pieceCouleur, String pieceUnicode, Case positionPiece, VerificationPiece newArbitre){
    super (pieceCouleur, pieceUnicode, positionPiece, newArbitre);
  }

    public void calculDeplacementPossible() {

    int position = this.emplacement.id;
    int colonneD = (int) position/10;
    int ligneD = position - colonneD*10;
    }
      

}