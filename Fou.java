


public class Fou extends Piece {
   
    public Fou(boolean fouCouleur, String fouUnicode){
      super(fouCouleur, fouUnicode);
    }

    public Fou(boolean pieceCouleur, String pieceUnicode, Case positionPiece, int[] cases){
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
