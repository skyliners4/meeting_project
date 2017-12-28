package dao;

import java.util.Vector;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHandler extends SQLiteOpenHelper {
  public static Vector<Table> tables = new Vector<Table>();
	
	  public DatabaseHandler(Context context, String name, CursorFactory factory, int version) {
	    super(context, name, factory, version);
	  }
	  
	  /**
	   * Permet de récupérer une instance Table à partir de son nom
	   * @param name
	   * @return table: la table chargée
	   */
	  public static Table getTable(String name){
		  Table res = null;
		  for(Table t : tables){
			  if(t.getName().equals(name))
				  res = t;
		  }
		  return res;
	  }
	  
	  /**
	   * Génère les tables dans l'application
	   */
	  public static void loadTable(){
		  tables = TableDefinition.genererBase();
	  }
	
	  @Override
	  public void onCreate(SQLiteDatabase db) {
		//Génération de toutes les tables ICI
		loadTable();
	    for(Table unT : tables)
	    	db.execSQL(unT.getTableCreate());
	  }

	  @Override
	  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		//Supprimer toutes les tables
		loadTable();
		for(Table unT : tables)
		   	db.execSQL(unT.getTableDrop());
		Log.d("TABLE_DELETED", "Tables has been deleted.");
	    onCreate(db);
	    Log.d("TABLE_CREATED", "Tables has been created.");
	  }
}
