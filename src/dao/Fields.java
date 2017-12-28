package dao;

//Classe atomique pour g�n�ration simplifi� de tables
//Exemple: ID NUMBER

/**
 * Table de gestion des champs. Classe atomique pour g�rer les "TABLES"
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
