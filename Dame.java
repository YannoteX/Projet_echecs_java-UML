
public class Dame extends Piece {
   
    public Dame(boolean pionCouleur, String pionUnicode, Case positionPiece){
      super(pionCouleur, pionUnicode,positionPiece);
    }

    public Dame(boolean pieceCouleur, String pieceUnicode, Case positionPiece, int[] cases){
      super (pieceCouleur, pieceUnicode, positionPiece, cases);
    }

    public void calculDeplacementPossible() {
    }

}
