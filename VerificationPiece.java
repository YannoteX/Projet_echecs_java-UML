public class VerificationPiece{


	private Echiquier tableauDeJeuCourant;

	public VerificationPiece(Echiquier plateauDeJeu){
		this.tableauDeJeuCourant=plateauDeJeu;
	}

	public int verification(int iDCase, boolean couleurPieceCourante){
		int i = 0;
		while(i<this.tableauDeJeuCourant.echiquier.length){


			if (this.tableauDeJeuCourant.echiquier[i].id == iDCase){
				if(this.tableauDeJeuCourant.echiquier[i].getCaseOccupee()== true){
					if(this.tableauDeJeuCourant.echiquier[i].getPiece().isCouleur()==couleurPieceCourante){
						return 1; //La piece ne peut pas aller sur cette case et au-delÃ 
					}
					return 2;     //La piece peut aller sur cette case mais pas au-delÃ 
				}
				return 3;
			}
			i++;
		}
		return 3;
	}
	
	public boolean canRoiDeplacer(int iDCase, boolean couleurPieceCourante) {
		int i = 0;
		while (i<this.tableauDeJeuCourant.echiquier.length) {
			
			if(this.tableauDeJeuCourant.echiquier[i].getPiece() != null) {
				Piece temp=this.tableauDeJeuCourant.echiquier[i].getPiece();
				
				if (temp.isCouleur() != couleurPieceCourante) {
					for (int j = 0; j<temp.caseDeplacer.length;j++) {
						if (temp.caseDeplacer[j]==iDCase) {
							return false;
						}
					}
				}
			}
			
			i++;
		}
		return true;
	}
}
