//import java.util.ArrayList;
import java.util.List;


public class Echiquier {

    public Case[] echiquier;

    public Echiquier() {
        echiquier = new Case[64];
    }

    public void initCaseEtPiece() {
      this.echiquier();
        
        // initialisé pion noir
      Piece pionN1 = new Pion(false,"\u265F ",17,new VerificationPiece(this));
      Piece pionN2 = new Pion(false,"\u265F ",27,new VerificationPiece(this));
      Piece pionN3 = new Pion(false,"\u265F ",37,new VerificationPiece(this));
      Piece pionN4 = new Pion(false,"\u265F ",47,new VerificationPiece(this));
      Piece pionN5 = new Pion(false,"\u265F ",57,new VerificationPiece(this));
      Piece pionN6 = new Pion(false,"\u265F ",67,new VerificationPiece(this));
      Piece pionN7 = new Pion(false,"\u265F ",77,new VerificationPiece(this));
      Piece pionN8 = new Pion(false,"\u265F ",87,new VerificationPiece(this));

        // initialisé pion blanche
      Piece pionBl = new Pion(true,"\u2659 ",12,new VerificationPiece(this));
      Piece pionB2 = new Pion(true,"\u2659 ",22,new VerificationPiece(this));
      Piece pionB3 = new Pion(true,"\u2659 ",32,new VerificationPiece(this));
      Piece pionB4 = new Pion(true,"\u2659 ",42,new VerificationPiece(this));
      Piece pionB5 = new Pion(true,"\u2659 ",52,new VerificationPiece(this));
      Piece pionB6 = new Pion(true,"\u2659 ",62,new VerificationPiece(this));
      Piece pionB7 = new Pion(true,"\u2659 ",72,new VerificationPiece(this));
      Piece pionB8 = new Pion(true,"\u2659 ",82,new VerificationPiece(this));
    
        // initialise les autres pieces blanche
      Piece tourB1     = new Tour(true,"\u2656 ",18,new VerificationPiece(this));
      Piece cavalierB1 = new Cavalier(true,"\u2658 ",28,new VerificationPiece(this));
      Piece fouB1      = new Fou(true,"\u2657 ",38,new VerificationPiece(this));
      Piece dameB1    = new Dame(true,"\u2655 ",48,new VerificationPiece(this));
      Piece roiB1      = new Roi(true,"\u2654 ",58,new VerificationPiece(this));
      Piece fouB2      = new Fou(true,"\u2657 ",68,new VerificationPiece(this));
      Piece cavalierB2 = new Cavalier(true,"\u2658 ",78,new VerificationPiece(this));
      Piece tourB2     = new Tour(true,"\u2656 ",88,new VerificationPiece(this));

        // initialise les autres pieces noir
      Piece tourN1     = new Tour(true,"\u265C ",11,new VerificationPiece(this));
      Piece cavalierN1 = new Cavalier(true,"\u265E ",21,new VerificationPiece(this));
      Piece fouN1      = new Fou(true,"\u265D ",31,new VerificationPiece(this));
      Piece dameN1    = new Dame(true,"\u265B ",41,new VerificationPiece(this));
      Piece roiN1      = new Roi(true,"\u265A ",51,new VerificationPiece(this));
      Piece fouN2      = new Fou(true,"\u265D ",61,new VerificationPiece(this));
      Piece cavalierN2 = new Cavalier(true,"\u265E ",71,new VerificationPiece(this));
      Piece tourN2     = new Tour(true,"\u265C ",81,new VerificationPiece(this));

      echiquier[0] = new Case(true,18,tourN1,true);
      echiquier[1] = new Case(false,28,cavalierN1,true);
      echiquier[2] = new Case(true,38,fouN1,true);
      echiquier[3] = new Case(false,48,dameN1,true);
      echiquier[4] = new Case(true,58,roiN1,true);
      echiquier[5] = new Case(false,68,fouN2,true);
      echiquier[6] = new Case(true,78,cavalierN2,true);
      echiquier[7] = new Case(false,88,tourN1,true);

      echiquier[8] = new Case(false,17,pionN1,true);
      echiquier[9] = new Case(true,27,pionN2,true);
      echiquier[10] = new Case(false,37,pionN3,true);
      echiquier[11] = new Case(true,47,pionN4,true);
      echiquier[12] = new Case(false,57,pionN5,true);
      echiquier[13] = new Case(true,67,pionN6,true);
      echiquier[14] = new Case(false,77,pionN7,true);
      echiquier[15] = new Case(true,87,pionN8,true);

      echiquier[48] = new Case(true,12,pionB1,true);
      echiquier[49] = new Case(false,22,pionB2,true);
      echiquier[50] = new Case(true,32,pionB3,true);
      echiquier[51] = new Case(false,42,pionB4,true);
      echiquier[52] = new Case(true,52,pionB5,true);
      echiquier[53] = new Case(false,62,pionB6,true);
      echiquier[54] = new Case(true,72,pionB7,true);
      echiquier[55] = new Case(false,82,pionB8,true);

      echiquier[56] = new Case(false,11,tourB1,true);
      echiquier[57] = new Case(true,21,cavalierB1,true);
      echiquier[58] = new Case(false,31,fouB1,true);
      echiquier[59] = new Case(true,41,dameB1,true);
      echiquier[60] = new Case(false,51,roiB1,true);
      echiquier[61] = new Case(true,61,fouB2,true);
      echiquier[62] = new Case(false,71,cavalierB2,true);
      echiquier[63] = new Case(true,81,tourB2,true);
    }

    public void afficheEchiquier() throws UnsupportedEncodingException{
      int ligne = 8;

      System.out.print("    |  a    b    c    d    e    f    g    h   ");

      for(int i = 1; i < 9; i++){

        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.print("  "+ligne+" ");

        for(int j = 8; j > 0; j--){
          PrintStream out = new PrintStream (System.out, true , "UTF8" );
          out.print("| "+"\u2659 "+" ");

        }
        System.out.print("|");
        ligne--;
      }
      System.out.println("");
      System.out.println("---------------------------------------------");

    }


    public synchronized boolean coupValide(int case) {
    }


    public Case getTableau game() {

    }


    public void setTableau game(int indice, Case newCase) {

    }


    public void afficher() {
    }


    public void echecDuRoi() {
    }


    public void echecEtMat() {
    }


    public void calculeDeplacementPossible(Case tableau de cases) {
    }

    public void deplacer() {
    }


    public boolean caseExiste(int idCase) {

    }

    public boolean roicloue(Case tableau de jeu, int coup, boolean couleurRoi) {
    }

}
