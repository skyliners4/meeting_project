package dao;

import java.util.Vector;

public abstract class TableDefinition {

	/*Classe abstraite permettant l'accès à la méthode 
	* genererBase().
	* C'est ici que toutes les tables doivent être définit.
	*/
	/**
	 * Fonction générant la base de données dans sa totalité.
	 * @return Vector<Table>: Les tables chargées.
	 */
	public static Vector<Table> genererBase(){
		  Vector<Table> tables = new Vector<Table>();
		  Vector<Fields> f;
		  
		  //Table 1
		  //Génération de la table MARKET
		  f = new Vector<Fields>();
		  f.add(new Fields("id","integer"));
		  f.add(new Fields("login","text"));
		  f.add(new Fields("mdp","text"));
		  Table toAdd = new Table("user",f);
		  tables.add(toAdd);
		  
		  /*
		  //Table 2
		  //Génération de la table PRODUCT
		  f = new Vector<Fields>();
		  f.add(new Fields("id","integer"));
		  f.add(new Fields("idMarket","integer"));
		  f.add(new Fields("name","text"));
		  f.add(new Fields("url","text"));
		  f.add(new Fields("validate","integer"));
		  f.add(new Fields("quantite","integer"));
		  toAdd = new Table("product",f);
		  tables.add(toAdd);
		  
		  //Etc...*/
		  return tables;
	  }
}
