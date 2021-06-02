public class Case {

  //********** Les Attributs **********
  private boolean couleur;  //noir -> false  ;  blanc -> true
  public int id;  //notation (ex:31) : Colonne | Ligne
  private boolean caseOccupee;
  private Piece piece;

  //********** Les Constructeurs **********
  public Case(boolean caseCouleur, int caseId, Piece piece, boolean caseOccup) {
    this.couleur = caseCouleur;
    this.id = caseId;
    this.caseOccupee = caseOccup;
    this.piece = piece;
  }

  public Case(boolean caseCouleur, int caseId, boolean caseOccup, boolean pieceCouleur, String pieceUnicode) {
    this.couleur = caseCouleur;
    this.id = caseId;
    this.caseOccupee = caseOccup;
    this.piece = new Piece(pieceCouleur, pieceUnicode);
  }

  public Case(boolean caseCouleur, int caseId, boolean caseOccup) {
    this.couleur = caseCouleur;
    this.id = caseId;
    this.caseOccupee = caseOccup;
    this.piece = null;
  }

  public Case(boolean caseCouleur, int caseId, boolean caseOccup, Piece pieceExistante) {
    this.couleur = caseCouleur;
    this.id = caseId;
    this.caseOccupee = caseOccup;
    this.piece = pieceExistante;
  }

  //********** Les Getters **********
  public boolean isCouleur() {
    return this.couleur;
  }

  public int getCaseId() {
    return this.id;
  }

  public boolean getCaseOccupee() {
    return this.caseOccupee;
  }

  public Piece getPiece() {
    return this.piece;
  }

  //********** Les Setters **********
  public void setCouleur(boolean newColor) {
    this.couleur = newColor;
  }

  public void setCaseId(int newId) {
    this.id = newId;
  }

  public void setCaseOccupee(boolean occupation) {
    this.caseOccupee = occupation;
  }

  public void setPiece(Piece newPiece) {
    this.piece = newPiece;
  }

  //********** Les Méthodes **********
  public Piece pieceExistante(Case c) {
    if (c.caseOccupee()==true) {
      return c.getPiece();
    }
    return null;
  }

  public boolean isCaseOccupee(Case c) {
    if (c.getPiece()!=null){
      c.setCaseOccupee(true);
      return true;
    }
    return false;
  }

  //à voir plus tard
  public void placementPiece(Piece pieceCalculee) {}

  public void supprimerPiece(Case c) {
    if (c.caseOccupee()!=true){
      c.setPiece(null);
    }
  }

}
