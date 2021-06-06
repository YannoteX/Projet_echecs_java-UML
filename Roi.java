
public class Roi extends Piece {
   
    public Roi(boolean roiCouleur, String roiUnicode){
      super(roiCouleur, roiUnicode);
    }

    public Roi(boolean pieceCouleur, String pieceUnicode, Case positionPiece, int[] cases){
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
