
public class Tour extends Piece {
   
    public Tour(boolean tourCouleur, String tourUnicode){
      super(tourCouleur, tourUnicode);
    }

    public Tour(boolean pieceCouleur, String pieceUnicode, Case positionPiece, int[] cases){
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
