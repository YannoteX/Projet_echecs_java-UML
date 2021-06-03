


public class Fou extends Piece {
   
    public Fou(boolean pionCouleur, String pionUnicode, Case positionPiece){
      super(pionCouleur, pionUnicode,positionPiece);
    }

    public Fou(boolean pieceCouleur, String pieceUnicode, Case positionPiece, int[] cases){
      super (pieceCouleur, pieceUnicode, positionPiece, cases);
    }

    public void calculDeplacementPossible() {
    }

}
