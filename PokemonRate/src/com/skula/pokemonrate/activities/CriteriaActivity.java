package com.skula.pokemonrate.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.skula.pokemonrate.R;
import com.skula.pokemonrate.models.Pok;
import com.skula.pokemonrate.models.Stat;
import com.skula.pokemonrate.services.Calculator;

public class CriteriaActivity extends Activity {
	private AutoCompleteTextView pokemonName;
	private EditText trainerLevel;
	private EditText pokemonCP;
	private EditText pokemonHP;
	private Button btnRate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.criteria_layout);

		this.pokemonName = (AutoCompleteTextView) findViewById(R.id.criteria_pokemon_name);
		ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.liste_pokemon_item, Pok.getPokemonsNames());
		pokemonName.setAdapter(adapter);

		this.trainerLevel = (EditText) findViewById(R.id.criteria_trainer_level);
		this.pokemonCP = (EditText) findViewById(R.id.criteria_pokemon_cp);
		this.pokemonHP = (EditText) findViewById(R.id.criteria_pokemon_hp);

		this.btnRate = (Button) findViewById(R.id.criteria_btn_rate);
		this.btnRate.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String tmpName = pokemonName.getText().toString();
				String tmpTrainerLevel = trainerLevel.getText().toString();
				String tmpCP = pokemonCP.getText().toString();
				String tmpHP = pokemonHP.getText().toString();
				
				if(!tmpTrainerLevel.isEmpty() && !tmpName.isEmpty() && !tmpCP.isEmpty() && !tmpHP.isEmpty()){
					try{
					Stat s = Calculator.Calc(tmpName, Integer.parseInt(tmpTrainerLevel), Integer.parseInt(tmpCP), Integer.parseInt(tmpHP));
					s.getAttackDefenceIV();
					TextView stat_pokemon_level = (TextView)findViewById(R.id.stat_pokemon_level);
					stat_pokemon_level.setText("Niveau " + s.getLevel()+"");
					TextView stat_pokemon_attackDefenseIV = (TextView)findViewById(R.id.stat_pokemon_attackDefenseIV);
					stat_pokemon_attackDefenseIV.setText(s.getAttackDefenceIV()+" / 30");
					TextView stat_pokemon_staminaIV = (TextView)findViewById(R.id.stat_pokemon_staminaIV);
					stat_pokemon_staminaIV.setText(s.getStaminaIV()+" / 15");
					TextView stat_pokemon_rating_cp = (TextView)findViewById(R.id.stat_pokemon_rating_cp);
					stat_pokemon_rating_cp.setText(s.getRating_cp()+"%");
					TextView stat_pokemon_per_diff_cp = (TextView)findViewById(R.id.stat_pokemon_per_diff_cp);
					stat_pokemon_per_diff_cp.setText(s.getPer_diff_cp()+"%");
					TextView stat_pokemon_rating_sta = (TextView)findViewById(R.id.stat_pokemon_rating_sta);
					stat_pokemon_rating_sta.setText(s.getRating_sta()+"%");
					TextView stat_pokemon_per_diff_sta = (TextView)findViewById(R.id.stat_pokemon_per_diff_sta);
					stat_pokemon_per_diff_sta.setText(s.getPer_diff_sta()+"%");
					TextView stat_pokemon_rating_br = (TextView)findViewById(R.id.stat_pokemon_rating_br);
					stat_pokemon_rating_br.setText(s.getRating_br()+"%");
					TextView stat_pokemon_per_diff_br = (TextView)findViewById(R.id.stat_pokemon_per_diff_br);
					stat_pokemon_per_diff_br.setText(s.getPer_diff_br()+"%");
					}catch(Exception e){
						e.getMessage();
					}
				}
				
				//
			}
		});
	}

	@Override
	public void onBackPressed() {

	}
}