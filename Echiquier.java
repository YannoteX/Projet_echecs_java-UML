//import java.util.ArrayList;
import java.util.*;


public class Echiquier {

    public Case[] echiquier;

    public Echiquier() {
        echiquier = new Case[64];
    }

    public void initCaseEtPiece() {
      boolean couleurCase=true;
      int colonneCase=0;
      int ligneCase=0;

      for (int i=0;i<this.echiquier.length;i++){

        if (couleurCase==true){
          couleurCase=false;
        }
        else {
          couleurCase=true;
        }

        colonneCase++;
        ligneCase++;

        if(colonneCase>8){
          colonneCase=1;
        }

        if(ligneCase>8){
          ligneCase=1;
        }


        echiquier[i]= new Case(couleurCase, colonneCase*10+ligneCase, null, false);


      }
        
     // idcase à enlever et new verification piece pose problème
       //on initailise les cases du partie blanche
      echiquier[0].setPiece(new Tour(true,"\u265C ", echiquier[0], new VerificationPiece(this)));
      echiquier[0].getPiece().calculDeplacementPossible();
      echiquier[1].setPiece(new Cavalier(true,"\u265E ", echiquier[1], new VerificationPiece(this)));
      echiquier[1].getPiece().calculDeplacementPossible();
      echiquier[2].setPiece(new Fou(true,"\u265D ", echiquier[2], new VerificationPiece(this)));
      echiquier[2].getPiece().calculDeplacementPossible();
      echiquier[3].setPiece(new Reine(true,"\u265B ", echiquier[3], new VerificationPiece(this)));
      echiquier[3].getPiece().calculDeplacementPossible();
      echiquier[4].setPiece(new Roi(true,"\u265A ", echiquier[4], new VerificationPiece(this)));
      echiquier[4].getPiece().calculDeplacementPossible();
      echiquier[5].setPiece(new Fou(true,"\u265D ", echiquier[5], new VerificationPiece(this)));
      echiquier[5].getPiece().calculDeplacementPossible();
      echiquier[6].setPiece(new Cavalier(true,"\u265E ", echiquier[6], new VerificationPiece(this)));
      echiquier[6].getPiece().calculDeplacementPossible();
      echiquier[7].setPiece(new Tour(true,"\u265C ", echiquier[7], new VerificationPiece(this)));
      echiquier[7].getPiece().calculDeplacementPossible();

      echiquier[8].setPiece(new Pion(true,"\u265F ", echiquier[8], new VerificationPiece(this)));
      echiquier[8].getPiece().calculDeplacementPossible();
      echiquier[9].setPiece(new Pion(true,"\u265F ", echiquier[9], new VerificationPiece(this)));
      echiquier[9].getPiece().calculDeplacementPossible();
      echiquier[10].setPiece(new Pion(true,"\u265F ", echiquier[10], new VerificationPiece(this)));
      echiquier[10].getPiece().calculDeplacementPossible();
      echiquier[11].setPiece(new Pion(true,"\u265F ", echiquier[11], new VerificationPiece(this)));
      echiquier[11].getPiece().calculDeplacementPossible();
      echiquier[12].setPiece(new Pion(true,"\u265F ", echiquier[12], new VerificationPiece(this)));
      echiquier[12].getPiece().calculDeplacementPossible();
      echiquier[13].setPiece(new Pion(true,"\u265F ", echiquier[13], new VerificationPiece(this)));
      echiquier[13].getPiece().calculDeplacementPossible();
      echiquier[14].setPiece(new Pion(true,"\u265F ", echiquier[14], new VerificationPiece(this)));
      echiquier[14].getPiece().calculDeplacementPossible();
      echiquier[15].setPiece(new Pion(true,"\u265F ", echiquier[15], new VerificationPiece(this)));
      echiquier[15].getPiece().calculDeplacementPossible();

      //initialise les cases du partie blanche

      echiquier[48].setPiece(new Pion(false,"\u2659 ", echiquier[48], new VerificationPiece(this)));
      echiquier[48].getPiece().calculDeplacementPossible();
      echiquier[49].setPiece(new Pion(false,"\u2659 ", echiquier[49], new VerificationPiece(this)));
      echiquier[49].getPiece().calculDeplacementPossible();
      echiquier[50].setPiece(new Pion(false,"\u2659 ", echiquier[50], new VerificationPiece(this)));
      echiquier[50].getPiece().calculDeplacementPossible();
      echiquier[51].setPiece(new Pion(false,"\u2659 ", echiquier[51], new VerificationPiece(this)));
      echiquier[51].getPiece().calculDeplacementPossible();
      echiquier[52].setPiece(new Pion(false,"\u2659 ", echiquier[52], new VerificationPiece(this)));
      echiquier[52].getPiece().calculDeplacementPossible();
      echiquier[53].setPiece(new Pion(false,"\u2659 ", echiquier[53], new VerificationPiece(this)));
      echiquier[53].getPiece().calculDeplacementPossible();
      echiquier[54].setPiece(new Pion(false,"\u2659 ", echiquier[54], new VerificationPiece(this)));
      echiquier[54].getPiece().calculDeplacementPossible();
      echiquier[55].setPiece(new Pion(false,"\u2659 ", echiquier[55], new VerificationPiece(this)));
      echiquier[55].getPiece().calculDeplacementPossible();

      echiquier[56].setPiece(new Tour(false,"\u2656 ", echiquier[56], new VerificationPiece(this)));
      echiquier[56].getPiece().calculDeplacementPossible();
      echiquier[57].setPiece(new Cavalier(false,"\u2658 ", echiquier[57], new VerificationPiece(this)));
      echiquier[57].getPiece().calculDeplacementPossible();
      echiquier[58].setPiece(new Fou(false,"\u2657 ", echiquier[58], new VerificationPiece(this)));
      echiquier[58].getPiece().calculDeplacementPossible();
      echiquier[59].setPiece(new Reine(false,"\u2655 ", echiquier[59], new VerificationPiece(this)));
      echiquier[59].getPiece().calculDeplacementPossible();
      echiquier[60].setPiece(new Roi(false,"\u2654 ", echiquier[60], new VerificationPiece(this)));
      echiquier[60].getPiece().calculDeplacementPossible();
      echiquier[61].setPiece(new Fou(false,"\u2657 ", echiquier[61], new VerificationPiece(this)));
      echiquier[61].getPiece().calculDeplacementPossible();
      echiquier[62].setPiece(new Cavalier(false,"\u2658 ", echiquier[62], new VerificationPiece(this)));
      echiquier[62].getPiece().calculDeplacementPossible();
      echiquier[63].setPiece(new Tour(false,"\u2656 ", echiquier[63], new VerificationPiece(this)));
      echiquier[63].getPiece().calculDeplacementPossible();

    
    }

    public String toString(){
       this.initCaseEtPiece(); //optionnel
        int ligne = 8;
        int m = 0;
        String retour="";

        retour+="    |  a    b    c    d    e    f    g    h   \n";

        for(int i = 1; i < 9; i++){

            retour+="\n";
            retour+="---------------------------------------------\n";
            retour+="  "+Integer.toString(ligne)+" ";

            for(int j = 8; j > 0; j--){

                if(echiquier[i] != null) {
                    String unicode = echiquier[m].afficherPieceDelaCase();
                    retour+="| "+unicode+" ";
                }
                else {
                    retour+="| "+"   ";
                }
            
             m++;
            }
            retour+="|";
            ligne--;
         }
        retour+="\n";
        retour+="---------------------------------------------\n";

        return retour;


    }


    public synchronized void coupValide(int caseAVerifier) {
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


    public void deplacer() {
    }


    public boolean caseValide(int idCase) {
      if(idCase < 0 || idCase > 64){
        return false;
      }
      return true;
    }


    public void roicloue(Case[] tableauDeJeu, int coup, boolean couleurRoi) {
    }

}