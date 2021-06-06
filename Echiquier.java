//import java.util.ArrayList;
import java.util.List;


public class Echiquier {

    public Case[] echiquier;

    public Echiquier() {
        echiquier = new Case[64];
    }

    public void initCaseEtPiece() {
      this.echiquier();
        
     // idcase à enlever et new verification piece pose problème
       //on initailise les cases du partie blanche
      echiquier[0] = new Case(true,18,new Tour(false,"\u265C ",new VerificationPiece(this)),true);
      echiquier[1] = new Case(false,28,new Cavalier(false,"\u265E ",new VerificationPiece(this)),true);
      echiquier[2] = new Case(true,38,new Fou(false,"\u265D ",new VerificationPiece(this)),true);
      echiquier[3] = new Case(false,48, new Reine(false,"\u265B ",new VerificationPiece(this)),true);
      echiquier[4] = new Case(true,58,new Roi(false,"\u265A ",new VerificationPiece(this)),true);
      echiquier[5] = new Case(false,68,new Fou(false,"\u265D ",new VerificationPiece(this)),true);
      echiquier[6] = new Case(true,78,new Cavalier(false,"\u265E ",new VerificationPiece(this)),true);
      echiquier[7] = new Case(false,88,new Tour(false,"\u265C ",new VerificationPiece(this)),true);

      echiquier[8] = new Case(false,17,new Pion(false,"\u265F ",new VerificationPiece(this)),true);
      echiquier[9] = new Case(true,27,new Pion(false,"\u265F ",new VerificationPiece(this)),true);
      echiquier[10] = new Case(false,37,new Pion(false,"\u265F ",new VerificationPiece(this)),true);
      echiquier[11] = new Case(true,47,new Pion(false,"\u265F ",new VerificationPiece(this)),true);
      echiquier[12] = new Case(false,57,new Pion(false,"\u265F ",new VerificationPiece(this)),true);
      echiquier[13] = new Case(true,67,new Pion(false,"\u265F ",new VerificationPiece(this)),true);
      echiquier[14] = new Case(false,77,new Pion(false,"\u265F ",new VerificationPiece(this)),true);
      echiquier[15] = new Case(true,87,new Pion(false,"\u265F ",new VerificationPiece(this)),true);

      //initialise les cases du partie blanche

      echiquier[48] = new Case(true,12,new Pion(true,"\u2659 ",new VerificationPiece(this)),true);
      echiquier[49] = new Case(false,22,new Pion(true,"\u2659 ",new VerificationPiece(this)),true);
      echiquier[50] = new Case(true,32,new Pion(true,"\u2659 ",new VerificationPiece(this)),true);
      echiquier[51] = new Case(false,42,new Pion(true,"\u2659 ",new VerificationPiece(this)),true);
      echiquier[52] = new Case(true,52,new Pion(true,"\u2659 ",new VerificationPiece(this)),true);
      echiquier[53] = new Case(false,62,new Pion(true,"\u2659 ",new VerificationPiece(this)),true);
      echiquier[54] = new Case(true,72,new Pion(true,"\u2659 ",new VerificationPiece(this)),true);
      echiquier[55] = new Case(false,82,new Pion(true,"\u2659 ",new VerificationPiece(this)),true);

      echiquier[56] = new Case(false,11,new Tour(true,"\u2656 ",new VerificationPiece(this)),true);
      echiquier[57] = new Case(true,21,new Cavalier(true,"\u2658 ",new VerificationPiece(this)),true);
      echiquier[58] = new Case(false,31,new Fou(true,"\u2657 ",new VerificationPiece(this)),true);
      echiquier[59] = new Case(true,41,new Reine(true,"\u2655 ",new VerificationPiece(this)),true);
      echiquier[60] = new Case(false,51,new Roi(true,"\u2654 ",new VerificationPiece(this)),true);
      echiquier[61] = new Case(true,61,new Fou(true,"\u2657 ",new VerificationPiece(this)),true);
      echiquier[62] = new Case(false,71,new Cavalier(true,"\u2658 ",new VerificationPiece(this)),true);
      echiquier[63] = new Case(true,81,new Tour(true,"\u2656 ",new VerificationPiece(this)),true);

    
    }

    public void afficheEchiquier() throws UnsupportedEncodingException{
       this.initCaseEtPiece(); //optionnel
        int ligne = 8;
        int m = 0;
        System.out.print("    |  a    b    c    d    e    f    g    h   ");

        for(int i = 1; i < 9; i++){

            System.out.println("");
            System.out.println("---------------------------------------------");
            System.out.print("  "+ligne+" ");

            for(int j = 8; j > 0; j--){
                PrintStream out = new PrintStream (System.out, true , "UTF8" );
                if(echiquier[i] != null) {
                    String unicode = echiquier[m].afficherPiece() );
                    out.print("| "+unicode+" ");
                }
                else {
                    out.print("| "+"   ");
                }
            
             m++;
            }
            System.out.print("|");
            ligne--;
         }
        System.out.println("");
        System.out.println("---------------------------------------------");

    }


    public synchronized boolean coupValide(int case) {
    }


    public Case getUneCase(int indice) {
      for(int i = 0; i < this.echiquier.length; i++) {
        if(indice == i){
          return echiquier[i];
        }
      }
      return null;
    }


    public void setUneCase(int indice, Case newCase) {
      for(int i = 0; i < this.echiquier.length; i++){
        if(indice == i) {
          echiquier[i] = newCase;
        }
       }
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


    public boolean caseValide(int idCase) {
      if(idCase < 0 || idCase > 64){
        return false;
      }
      return true;
    }


    public boolean roicloue(Case tableau de jeu, int coup, boolean couleurRoi) {
    }

}
