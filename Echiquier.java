
//import java.util.ArrayList;


public class Echiquier {

    public Case[] echiquier;

    public Echiquier() {
        echiquier = new Case[64];
    }

    public void initCaseEtPiece() {
      boolean couleurCase=false;
      int ligneCase=0;
      boolean cBon = false;
      int i = 0;

      while(cBon==false){
        int putain = 0;
        while (putain<8){
          ligneCase++;
          int merde = 0;
          int colonneCase=1;
          while (merde<8){
            this.echiquier[i]= new Case(couleurCase, colonneCase*10+ligneCase, null, false);
            colonneCase++;
            i++;
            merde++;
          }   
          putain++;
          }
          cBon = true;
        }

        if (couleurCase==true){
          couleurCase=false;
        }
        else {
          couleurCase=true;
        }


        
     // idcase à enlever et new verification piece pose problème
       //on initailise les cases du partie blanche
      echiquier[0].setPiece(new Tour(true,"\u265C", echiquier[0], new VerificationPiece(this)));
      echiquier[1].setPiece(new Cavalier(true,"\u265E", echiquier[1], new VerificationPiece(this)));
      echiquier[2].setPiece(new Fou(true,"\u265D", echiquier[2], new VerificationPiece(this)));
      echiquier[3].setPiece(new Reine(true,"\u265B", echiquier[3], new VerificationPiece(this)));
      echiquier[4].setPiece(new Roi(true,"\u265A", echiquier[4], new VerificationPiece(this)));
      echiquier[5].setPiece(new Fou(true,"\u265D", echiquier[5], new VerificationPiece(this)));
      echiquier[6].setPiece(new Cavalier(true,"\u265E", echiquier[6], new VerificationPiece(this)));
      echiquier[7].setPiece(new Tour(true,"\u265C", echiquier[7], new VerificationPiece(this)));
      echiquier[8].setPiece(new Pion(true,"\u265F", echiquier[8], new VerificationPiece(this)));
      echiquier[9].setPiece(new Pion(true,"\u265F", echiquier[9], new VerificationPiece(this)));
      echiquier[10].setPiece(new Pion(true,"\u265F", echiquier[10], new VerificationPiece(this)));
      echiquier[11].setPiece(new Pion(true,"\u265F", echiquier[11], new VerificationPiece(this)));
      echiquier[12].setPiece(new Pion(true,"\u265F", echiquier[12], new VerificationPiece(this)));
      echiquier[13].setPiece(new Pion(true,"\u265F", echiquier[13], new VerificationPiece(this)));
      echiquier[14].setPiece(new Pion(true,"\u265F", echiquier[14], new VerificationPiece(this)));
      echiquier[15].setPiece(new Pion(true,"\u265F", echiquier[15], new VerificationPiece(this)));

      //initialise les cases du partie noire

      echiquier[48].setPiece(new Pion(false,"\u2659", echiquier[48], new VerificationPiece(this)));
      echiquier[49].setPiece(new Pion(false,"\u2659", echiquier[49], new VerificationPiece(this)));
      echiquier[50].setPiece(new Pion(false,"\u2659", echiquier[50], new VerificationPiece(this)));
      echiquier[51].setPiece(new Pion(false,"\u2659", echiquier[51], new VerificationPiece(this)));
      echiquier[52].setPiece(new Pion(false,"\u2659", echiquier[52], new VerificationPiece(this)));
      echiquier[53].setPiece(new Pion(false,"\u2659", echiquier[53], new VerificationPiece(this)));
      echiquier[54].setPiece(new Pion(false,"\u2659", echiquier[54], new VerificationPiece(this)));
      echiquier[55].setPiece(new Pion(false,"\u2659", echiquier[55], new VerificationPiece(this)));
      echiquier[56].setPiece(new Tour(false,"\u2656", echiquier[56], new VerificationPiece(this)));
      echiquier[57].setPiece(new Cavalier(false,"\u2658", echiquier[57], new VerificationPiece(this)));
      echiquier[58].setPiece(new Fou(false,"\u2657", echiquier[58], new VerificationPiece(this)));
      echiquier[59].setPiece(new Reine(false,"\u2655", echiquier[59], new VerificationPiece(this)));
      echiquier[60].setPiece(new Roi(false,"\u2654", echiquier[60], new VerificationPiece(this)));
      echiquier[61].setPiece(new Fou(false,"\u2657", echiquier[61], new VerificationPiece(this)));
      echiquier[62].setPiece(new Cavalier(false,"\u2658", echiquier[62], new VerificationPiece(this)));
      echiquier[63].setPiece(new Tour(false,"\u2656", echiquier[63], new VerificationPiece(this)));
      
      System.out.println(this.toString());
    }

    public String toString(){
        int ligne = 8;
        int m = 63;
        String retour="";

        retour+="    |  a    b    c    d    e    f    g    h   \n";

        for(int i = 1; i < 9; i++){

            retour+="\n";
            retour+="---------------------------------------------\n";
            retour+="  "+Integer.toString(ligne)+" ";

            for(int j = 8; j > 0; j--){

                if(echiquier[i] != null) {
                    String unicode = echiquier[m].afficherPieceDelaCase();
                    retour+="|  "+unicode+" ";
                }
                else {
                    retour+="| "+"    ";
                }
            
             m--;
            }
            retour+="|";
            ligne--;
         }
        retour+="\n";
        retour+="---------------------------------------------\n";

        return retour;


    }

    public String toStringReverse(){
        int ligne = 1;
        String retour="";

        retour+="    |  h    g    f    e    d    c    b    a   \n";
        int i = 0;

        while(ligne<9){

            retour+="\n";
            retour+="---------------------------------------------\n";
            retour+="  "+Integer.toString(ligne)+" ";

            for(int j = 0; j < 8; j++){

                if(echiquier[i] != null) {
                    String unicode = echiquier[i].afficherPieceDelaCase();
                    retour+="| "+unicode+"  ";
                }
                else {
                    retour+="| "+"    ";
                }
                i++;
            }
            retour+="|";
            ligne++;
         }
        retour+="\n";
        retour+="---------------------------------------------\n";
        return retour;


    }
    
    public void deplacerPiece(int caseD, int caseA){
      Case depart = getUneCase(caseD);
      Case arrivee = getUneCase(caseA);
      Piece copie = depart.getPiece();

      depart.setPiece(null);
      depart.setCaseOccupee(false);
      arrivee.setPiece(copie);
    }

    public void calculDeplacementPiece(int casepiece){
      this.getUneCase(casepiece).getPiece().calculDeplacementPossible();
    }


    public boolean coupValide(int caseD, int caseA, boolean couleurJoueur){

      Case c = getUneCase(caseD);
      if(c!= null){ //regarde si la case départ match avec CaseD pui si Cla couleur de la piece à l'intérieur est la même que CouleurJoueur

        if(c.getPiece() != null && c.getPiece().isCouleur() == couleurJoueur){

          if(c.getPiece().getUneCaseDeplacer(caseA) != -1){ //rearde si CaseA et dans le tableau de déplacement de la piece
            return true;
          }
        }
      }
      return false;
    }


    public Case getUneCase(int indice) {
      for(int i = 0; i < this.echiquier.length; i++) {
        if(indice == this.echiquier[i].getCaseId()){
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



    public void echecDuRoi() {
    }


    public void echecEtMat() {
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
