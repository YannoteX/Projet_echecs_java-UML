
public class Dame extends Piece {
   
    public Dame(boolean dameCouleur, String dameUnicode){
      super(dameCouleur, dameUnicode);
    }

    public Dame(boolean pieceCouleur, String pieceUnicode, Case positionPiece, int[] cases){
      super (pieceCouleur, pieceUnicode, positionPiece, cases);
    }

    public void calculDeplacementPossible() {
    }
    
    public void mangerUnePiece(){

    }

    public String toString(){
      String s = " ";
      s = this.getUnicode();
      return s;
    }
}
