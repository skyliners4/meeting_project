package adapter;

import java.util.Vector;

import com.example.andscapebase.R;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class MarketAdapter extends BaseAdapter{

	// Variable d'instance, priv�es.
	private final Context mContext;
	private final Vector<Object> objetcs;
	
	/**
	 * Constructeur de l'adapter d�di� � la gestion de la liste des markets
	 * @param context
	 * @param markets
	 */
	public MarketAdapter(Context context, Vector<Object> objetcs) {
		this.mContext = context;
		this.objetcs = objetcs;
	}
	 
	/**
	 * M�thode de super classe
	 * @return nombre d'�l�ments dans la liste
	 */
	@Override
	public int getCount() {
		return objetcs.size();
	}

	/**
	 * @param position: Position de l'objet souahit�
	 * @return Market - Retourne l'objet d'index "position"
	 */
	@Override
	public Object getItem(int position) {
		return objetcs.get(position);
	}

	/**
	 * Retour l'identifiant de l'objet Market � la place "Position"
	 * @param position - Position de l'�l�ment
	 * @return ID de l'item � la position souhait�
	 */
	@Override
	public long getItemId(int position) {
		//return objetcs.get(position).getID();
		return 0;
	}

	/**
	 * Construction de la VIEW qui sera affich� dans la [Liste/Gried]View
	 * @param position - Position de la vue � afficher
	 * @param convertView - Vue vierge
	 * @param parent - Vue du parent
	 * @return converView: vue pr�par� pour l'affichage
	 */
	@SuppressLint("InflateParams")
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		//R�cup�ration du magasion courant
		Object obj = objetcs.get(position);
		
		if (convertView == null){
		    final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
		    convertView = layoutInflater.inflate(R.layout.base_adapter, null);
		}
		
		//R�cup�ration des champts d'�criture
		//final ImageView urlView = (ImageView)convertView.findViewById(R.id.marketUrl);
		
		//Modification
		/*Picasso.with(Liens.parent)
			.load(market.getUrl())
			.resize(255, 255)
			.into(urlView);*/
		//nameView.setText(market.getName());
		
	    return convertView;
	}
}
