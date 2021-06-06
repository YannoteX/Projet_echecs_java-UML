
public class Cavalier extends Piece {
   
    public Cavalier(boolean cavalierCouleur, String cavalierUnicode){
      super(cavalierCouleur, cavalierUnicode);
    }

    public Cavalier(boolean pieceCouleur, String pieceUnicode, Case positionPiece, int[] cases){
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
