package dao;

import java.util.Vector;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

//Metier DAO g�re toutes les tables � g�n�rer.
//Ces derni�res sont d�finit dans la classe DatabaseHandler.
public class MetierDAO extends DAOBase {
	
  public MetierDAO(Context pContext,SQLiteDatabase base) {
		super(pContext);
		mDb = base;
		// TODO Stub du constructeur g�n�r� automatiquement
	}
  
  /**
   * @param id l'identifiant du m�tier � supprimer
   * @table_name nom de la table
   */ 
  public void supprimer(String table_name, long id) {
	  mDb.delete(table_name, "id = ?", new String[] {String.valueOf(id)});
  }
}
