package dao;

import java.util.Vector;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

//Metier DAO gère toutes les tables à générer.
//Ces dernières sont définit dans la classe DatabaseHandler.
public class MetierDAO extends DAOBase {
	
  public MetierDAO(Context pContext,SQLiteDatabase base) {
		super(pContext);
		mDb = base;
		// TODO Stub du constructeur généré automatiquement
	}
  
  /**
   * @param id l'identifiant du métier à supprimer
   * @table_name nom de la table
   */ 
  public void supprimer(String table_name, long id) {
	  mDb.delete(table_name, "id = ?", new String[] {String.valueOf(id)});
  }
}
