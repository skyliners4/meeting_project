package be.henallux.promeeting;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import be.henallux.promeeting.R;
import dao.DatabaseHandler;
import dao.MetierDAO;

public class MainActivity extends Activity {
	//Variables de classe
	public static int VERSION_DB = 1;
	public static MetierDAO local = null;
	public static DatabaseHandler localDB = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Association à la table de linkage
		Liens.parent = this;
		
		//Démarrage de la BDD
		try{
			localDB = new dao.DatabaseHandler(getBaseContext(),MainActivity.getStr(R.string.db_name),null,VERSION_DB);
			local = new dao.MetierDAO(getBaseContext(),localDB.getWritableDatabase());
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
	}
	
	//Toaster de base
	public void message(String txt){
		try{
			Toast.makeText(this,txt, Toast.LENGTH_LONG).show();
		}catch(Exception e){}
	}
	
	//Récupération de la chaine associé à un ID
	public static String getStr(int id){
		return Liens.parent.getString(id);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
