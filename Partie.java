
import java.util.Scanner;
import java.io.*;
import java.nio.file.*;

public class Partie implements Serializable{

	private Echiquier jeu;
	private boolean joueur;
	private String nomPartie;

	public Partie(){
		this.jeu = new Echiquier();
		this.joueur = true;
	}


	public String help(){
		return "rien";
	}

	public void initPartie(String newNomPartie){
		
		this.jeu.initCaseEtPiece();
		this.joueur = true;
		this.nomPartie = newNomPartie;

		try{
			File sauvegarde = new File("Saves\\"+nomPartie+"_history.txt");
			sauvegarde.createNewFile();
		}
		catch(IOException e){
			System.err.println(e.getStackTrace());
		}
		
		System.out.println("Joueur blanc, c'est à vous !");
	}

	public void setNomPartie(String name){
		this.nomPartie=name;
	}

	public void setJoueur(boolean couleur){
		this.joueur=couleur;
	}

	public void saveCoup(String coup){
		File historique = new File("Saves\\"+this.nomPartie+"_history.txt");

		try{
			FileWriter fw = new FileWriter(historique, true);
			fw.append(coup);
			fw.close();
		}
		catch(IOException e){
			System.err.println(e.getStackTrace());
		}
	}

	public void loadPartie(String name){

		String path="Saves\\"+name+".txt";

		try{
			System.out.println("1");
			FileInputStream fichier = new FileInputStream(path);
			System.out.println("2");
			ObjectInputStream load = new ObjectInputStream(fichier);
			System.out.println("3");
			this.jeu = (Echiquier) load.readObject();
			System.out.println("4");
			load.close();
			System.out.println("5");

			BufferedReader br = Files.newBufferedReader(Paths.get("Saves\\"+name+"_history.txt"));
			String ligne;
			int derJoueur = 9999;
			ligne = br.readLine();
			while (ligne != null) {
				derJoueur = Integer.valueOf(ligne);
				ligne = br.readLine();
			}
			if(derJoueur<8889){
				this.joueur=false;
				System.out.println("Joueu noir, c'est à vous !");
			}	
			else{
				this.joueur=true;
				System.out.println("Joueu noir, c'est à vous !");
			}

		}
		catch (IOException e){
			System.err.println(e.getStackTrace());
		}
		catch (ClassNotFoundException ex){
			System.err.println(ex.getStackTrace());
		}

		this.nomPartie= name;

	}

	public boolean coup(int caseD, int caseA, boolean couleurJoueur){
		
		this.jeu.calculDeplacementPiece(caseD);
		if(this.jeu.coupValide(caseD, caseA, couleurJoueur)==true){
			
			this.jeu.deplacerPiece(caseD, caseA);
			this.jeu.calculDeplacementPiece(caseA);

			return true;
		}

		return false;
	}


	public void savePartie(String name){

		String path="Saves\\"+name+".txt";
		Path chemin= Paths.get(path);

		try{
			Files.deleteIfExists(chemin);

			FileOutputStream fichier = new FileOutputStream(path);
			ObjectOutputStream save = new ObjectOutputStream(fichier);
			save.writeObject(this.jeu);
			save.flush();
			save.close();
		}
		catch (IOException e){
			System.err.println(e.getStackTrace());
		}
	}

	public static void main(String args[]){

		Partie p = new Partie();
		String coup = "";
		String commande="";
		int deplacement = 0;
		String commandeCharger = "";
		String nomCharge = "";
		String commandeStop = "";

		//*********CODAGE DU COMMENCEMENT D'UNE PARTIE************//

		System.out.println("Bienvenue au jeu d'echecs de la mort !!!! (sans interface).\nPour commencer, voulez vous charger une partie ou en commencer une nouvelle ? charger/commencer:");
		boolean cBon=false;

		while (cBon == false){
			Scanner debut = new Scanner(System.in);
			String confirm = debut.nextLine();

			if(confirm.equals("charger")){
				System.out.println("Entrez le nom de la partie a charger :\n");
				Scanner verif = new Scanner (System.in);
				System.out.println("0");
				String ication = verif.nextLine();
				System.out.println("1");

				File test = new File("Saves\\"+ication+".txt");
				System.out.println("2");
				if (test.exists()){
					System.out.println("3");
					p.loadPartie(ication);
					System.out.println("4");
					cBon = true;
				}
				else{
					System.out.println("Le fichier n'existe pas.");
				}
			}
			else if(confirm.equals("commencer")){

				System.out.println("Donnez un nom a votre partie\n");
				Scanner name = new Scanner (System.in);
				if(name.hasNextLine()){
				String nom = name.nextLine();
				p.initPartie(nom);
				System.out.println(nom+" initialisee avec succes.");
				cBon = true;
				}
			}
			else {
				System.out.println("Je n'ai pas compris. Rentrez Ã  nouveau :\n");
			}
		}
		//********************CODAGE D'UN TOUR********************//

		boolean stop = false;
		

		while (stop == false ){

			// tour du joueur blanc

			if(p.joueur == true){

				System.out.println("\nVeuillez rentrer votre commande :\n");
				Scanner commandeB = new Scanner(System.in);

				if (commandeB.hasNextInt()){
					System.out.println("\n");

					deplacement = commandeB.nextInt();

					if (deplacement>=1111 && deplacement<=8888){

						int value = deplacement;
						int caseD = (int) value/100;
						int caseA = value - caseD*100;

						if (p.coup(caseD, caseA, p.joueur)==true){
							p.jeu.toStringReverse();
							System.out.println("\nJoueur Noir, c'est a vous !\n");
							coup+=Integer.toString(value);
							p.saveCoup(coup);
							p.joueur = false;
						}

						else{
							System.out.println("Erreur : Ce coup n'est pas possible.\n");
						}
					}
					else{
						System.out.println("Erreur : l'une de vos cases est hors de l'echiquier.");
					}
				}
				else{
					System.out.println("\n");
					commande = commandeB.nextLine();

						if(commande.equals("sauvegarder")){

						p.savePartie(p.nomPartie);
						System.out.println("'"+p.nomPartie+"'a ete sauvegardee dans 'Saves\\"+p.nomPartie+".txt' avec succes.");
						}

						else if (commande.equals("charger")){

					System.out.println("Voulez-vous charger une partie (pensez a sauvegarder) ? oui/non:\n");
					Scanner verifCharger = new Scanner(System.in);
					commandeCharger = verifCharger.nextLine();

					if(commandeCharger.equals("oui")){

						System.out.println("Saisissez le nom de votre partie ('stop' pour sortir) :\n");
						boolean stopCharger = false;

						while(stopCharger == false){
							Scanner nomC = new Scanner(System.in);
							nomCharge = nomC.nextLine();

							if (nomCharge.equals("stop")){
								stopCharger=true;
							}
							else{
								Path cheminCharger = Paths.get("Saves\\"+nomCharge+".txt");

								if(Files.exists(cheminCharger)==true){
									p.loadPartie(nomCharge);
									stopCharger=true;
									System.out.println("'"+p.nomPartie+"'a ete chargee depuis '"+cheminCharger.toString()+"' avec succes.");
								}

								else{
									System.out.println("Erreur : La partie n'existe pas.\n");
								}
							}
						}
					}

				}

					else if(commande.equals("aide")){
					System.out.println(p.help()); //************Ã  faire
					}

					else if(commande.equals("stop")){
					System.out.println("En Ãªtes-vous sÃ»r(e) ? oui/non:\n");
					Scanner verifStop = new Scanner(System.in);

						if (verifStop.hasNextLine()){
							commandeStop = verifStop.nextLine();

							if (commandeStop.equals("oui")){
								stop=true;
								System.out.println("La partie s'arrÃªte.");
							}
						}
					}

					else{
					System.out.println("Commande erronÃ©e");
					}

				}
			}

			// tour du joueur noir

			else{

				System.out.println("\nVeuillez rentrer votre commande :\n");
					Scanner commandeN = new Scanner(System.in);

				if (commandeN.hasNextInt()){
					System.out.println("\n");
					deplacement = commandeN.nextInt();
				
				
				if (deplacement>=1111 && deplacement<=8888){
						int value = deplacement;
						int caseD = (int) value/100;
						int caseA = value - caseD*100;

						if (p.coup(caseD, caseA, p.joueur)==true){
							p.jeu.toString();
							System.out.println("\nJoueur Blanc, c'est a vous !\n");
							coup+=Integer.toString(value);
							p.saveCoup(coup+"\n");
							p.joueur = true;
						}

						else{
							System.out.println("Erreur : Ce coup n'est pas possible.\n");
						}
					}
					else{
						System.out.println("Erreur : l'une de vos cases est hors de l'echiquier.");
					}
					
				}
				else{
					System.out.println("\n");
				commande = commandeN.nextLine();

					if(commande.equals("sauvegarder")){

					p.savePartie(p.nomPartie);
					System.out.println("'"+p.nomPartie+"'a ete sauvegardee dans 'Saves\\"+p.nomPartie+".txt' avec succes.");
					}

					else if (commande.equals("charger")){

					System.out.println("Voulez-vous charger une partie (pensez a sauvegarder) ? oui/non:\n");
					Scanner verifCharger = new Scanner(System.in);
					commandeCharger = verifCharger.nextLine();


					if(commandeCharger.equals("oui")){

						System.out.println("Saisissez le nom de votre partie ('stop' pour sortir) :\n");
						boolean stopCharger = false;

						while(stopCharger == false){
							Scanner nomC = new Scanner(System.in);
							nomCharge = nomC.nextLine();

							if (nomCharge.equals("stop")){
								stopCharger=true;
							}
							else{
								Path cheminCharger = Paths.get("Saves\\"+nomCharge+".txt");

								if(Files.exists(cheminCharger)==true){
									p.loadPartie(nomCharge);
									stopCharger=true;
									System.out.println("'"+p.nomPartie+"'a ete chargee depuis '"+cheminCharger.toString()+"' avec succes.");
								}

								else{
									System.out.println("Erreur : La partie n'existe pas.\n");
								}
							}
						}
					}

					}

					else if(commande.equals("aide")){
					System.out.println(p.help());
					}
					
				}
			}
		}
	}
}
