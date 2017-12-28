package dao;

//Classe atomique pour génération simplifié de tables
//Exemple: ID NUMBER

/**
 * Table de gestion des champs. Classe atomique pour gérer les "TABLES"
 * @author Valentin
 *
 */
public class Fields {
	private String champ;
	private String type;
	public Fields(String champ, String type) {
		this.champ = champ;
		this.type = type;
	}
	public String getFields(){
		return champ + " " + type;
	}
}
