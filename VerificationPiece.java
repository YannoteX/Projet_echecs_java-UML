

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
						return 1; //La piece ne peut pas aller sur cette case et au-delà
					}
					return 2;     //La piece peut aller sur cette case mais pas au-delà
				}
				return 3;
			}
			i++;
		}
		return 3;
	}
}
