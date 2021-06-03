
public class Cavalier extends Piece {
   
    public Cavalier(boolean pionCouleur, String pionUnicode, Case positionPiece){
      super(pionCouleur, pionUnicode,positionPiece);
    }

    public Cavalier(boolean pieceCouleur, String pieceUnicode, Case positionPiece, int[] cases){
      super (pieceCouleur, pieceUnicode, positionPiece, cases);
    }

    public void calculDeplacementPossible() {
    }

}
