package dao;

import java.util.Vector;

import android.util.Log;

public class Table {
	
	private Vector<Fields> rows; 
	private String name;
	
	public Table(String nameT,Vector<Fields> rowsp) {
		super();
		this.rows = rowsp;
		this.name = nameT;
	}

	public String getTableCreate(){
		String query = "CREATE TABLE " + name + " (";
		int i = 0;
		for(Fields unF : rows){
			if (i > 0)
				query = query + "," + unF.getFields();
			else
				query = query + unF.getFields() + " PRIMARY KEY AUTOINCREMENT";
			i++;
		}
		query = query + ");";
		Log.d("TABLE_CREATION", query);
		return query;
	}
	
	public String getTableDrop(){
		String query = "DROP TABLE IF EXISTS " + name + ";"; 
		Log.d("TABLE_DELETE", query);
		return query;
	}

	public Vector<Fields> getRows() {
		return rows;
	}

	public String getName() {
		return name;
	}
}
