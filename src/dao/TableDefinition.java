package dao;

import java.util.Vector;

public abstract class TableDefinition {

	/*Classe abstraite permettant l'acc�s � la m�thode 
	* genererBase().
	* C'est ici que toutes les tables doivent �tre d�finit.
	*/
	/**
	 * Fonction g�n�rant la base de donn�es dans sa totalit�.
	 * @return Vector<Table>: Les tables charg�es.
	 */
	public static Vector<Table> genererBase(){
		  Vector<Table> tables = new Vector<Table>();
		  Vector<Fields> f;
		  
		  //Table 1
		  //G�n�ration de la table MARKET
		  f = new Vector<Fields>();
		  f.add(new Fields("id","integer"));
		  f.add(new Fields("login","text"));
		  f.add(new Fields("mdp","text"));
		  Table toAdd = new Table("user",f);
		  tables.add(toAdd);
		  
		  /*
		  //Table 2
		  //G�n�ration de la table PRODUCT
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
