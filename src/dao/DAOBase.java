package dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import be.henallux.promeeting.MainActivity;
import be.henallux.promeeting.R;

public abstract class DAOBase {
  // Augmenter la version pour relancer la création
  protected final static int VERSION = MainActivity.VERSION_DB;
  
  // Le nom du fichier qui représente la base
  protected final static String NOM = MainActivity.getStr(R.string.db_name);    
  protected SQLiteDatabase mDb = null;
  protected DatabaseHandler mHandler = null;

  public DAOBase(Context pContext) {
    this.mHandler = new DatabaseHandler(pContext, NOM, null, VERSION);
  }
}
