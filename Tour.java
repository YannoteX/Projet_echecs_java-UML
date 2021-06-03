
public class Tour extends Piece {
   
    public Tour(boolean pionCouleur, String pionUnicode, Case positionPiece){
      super(pionCouleur, pionUnicode,positionPiece);
    }

    public Tour(boolean pieceCouleur, String pieceUnicode, Case positionPiece, int[] cases){
      super (pieceCouleur, pieceUnicode, positionPiece, cases);
    }

    public void calculDeplacementPossible() {
    }

}
