package com.skula.pokemonrate.services;

import java.util.List;

import com.skula.pokemonrate.models.Pok;
import com.skula.pokemonrate.models.Stat;

public class Calculator {
	private static List<Pok> poks = Pok.POKS;
	private static double[] CpM = new double[] { 0.0940000, 0.1351374,
			0.1663979, 0.1926509, 0.2157325, 0.2365727, 0.2557201, 0.2735304,
			0.2902499, 0.3060574, 0.3210876, 0.3354450, 0.3492127, 0.3624578,
			0.3752356, 0.3875924, 0.3995673, 0.4111936, 0.4225000, 0.4335117,
			0.4431076, 0.4530600, 0.4627984, 0.4723361, 0.4816850, 0.4908558,
			0.4998584, 0.5087018, 0.5173940, 0.5259425, 0.5343543, 0.5426358,
			0.5507927, 0.5588306, 0.5667545, 0.5745692, 0.5822789, 0.5898879,
			0.5974000, 0.6048188, 0.6121573, 0.6194041, 0.6265671, 0.6336492,
			0.6406530, 0.6475810, 0.6544356, 0.6612193, 0.6679340, 0.6745819,
			0.6811649, 0.6876849, 0.6941437, 0.7005429, 0.7068842, 0.7131691,
			0.7193991, 0.7255756, 0.7317000, 0.7347410, 0.7377695, 0.7407856,
			0.7437894, 0.7467812, 0.7497610, 0.7527291, 0.7556855, 0.7586304,
			0.7615638, 0.7644861, 0.7673972, 0.7702973, 0.7731865, 0.7760650,
			0.7789328, 0.7817901, 0.7846370, 0.7874736, 0.7903000, 0.7931164 };
	private static int[] exp_req = new int[] { 0, 1000, 3000, 6000, 10000,
			15000, 21000, 28000, 36000, 45000, 55000, 65000, 75000, 85000,
			100000, 120000, 140000, 160000, 185000, 210000, 260000, 335000,
			435000, 560000, 710000, 900000, 1100000, 1350000, 1650000, 2000000,
			2500000, 3000000, 3750000, 4750000, 6000000, 7500000, 9500000,
			12000000, 15000000, 20000000 };
	private static int[] candy = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2,
			2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 6, 6, 8,
			8, 10, 10, 12, 12, 15, 15 };
	private static int[] stardust = new int[] { 200, 200, 400, 400, 600, 600,
			800, 800, 1000, 1000, 1300, 1300, 1600, 1600, 1900, 1900, 2200,
			2200, 2500, 2500, 3000, 3000, 3500, 3500, 4000, 4000, 4500, 4500,
			5000, 5000, 6000, 6000, 7000, 7000, 8000, 8000, 9000, 9000, 10000,
			10000 };
	
	public static Stat Calc(String pokName, int trainerLevel, int userCP, int userHP) {
		Pok p = getPok(pokName);
		double pokLevel = 1;
		int min_cp = 0;
		int max_cp = 0;
		int min_hp = 0;
		int max_hp = 0;
		double min_est_total_stamina = 0.0;
		double est_total_stamina = 0.0;
		double max_est_total_stamina = 0.0;
		double min_br_cp = 0.0;
		double max_br_cp = 0.0;
		double rating_cp = 0.0;
		double rating_sta = 0.0;
		double rating_br = 0.0;
		double per_diff_cp = 0.0;
		double per_diff_sta = 0.0;
		double per_diff_br = 0.0;
		
		double tmpMaxlevel = trainerLevel + 1.5 >40? 40:trainerLevel + 1.5;
		boolean found = false;
		
		for(pokLevel=1.0; pokLevel <= tmpMaxlevel; pokLevel+=0.5){
			//min_cp = Math.max(Math.floor(pokemon[pk_id].BaseAttack * Math.sqrt(pokemon[pk_id].BaseDefense) * Math.sqrt(pokemon[pk_id].BaseStamina) * Math.pow(CpM[pokemon_level*2-2], 2) / 10), 10);
			min_cp = Math.max((int)(p.getBaseAttack() * Math.sqrt(p.getBaseDefense()) * Math.sqrt(p.getBaseStamina()) * Math.pow(CpM[(int) (pokLevel*2-2)],  2)/10), 10);
			//max_cp = Math.max(Math.floor((pokemon[pk_id].BaseAttack+15) * Math.sqrt(pokemon[pk_id].BaseDefense+15) * Math.sqrt(pokemon[pk_id].BaseStamina+15) * Math.pow(CpM[pokemon_level*2-2], 2) / 10), 10);
			max_cp = Math.max((int)((p.getBaseAttack() + 15) * Math.sqrt(p.getBaseDefense() + 15) * Math.sqrt(p.getBaseStamina() + 15) * Math.pow(CpM[(int) (pokLevel*2-2)],  2)/10), 10);
			//min_hp = Math.max(Math.floor((pokemon[pk_id].BaseStamina) * CpM[pokemon_level*2-2]), 10);
			min_hp = Math.max((int)(p.getBaseStamina() * CpM[(int) (pokLevel*2-2)]), 10);
			//max_hp = Math.max(Math.floor((pokemon[pk_id].BaseStamina+15) * CpM[pokemon_level*2-2]), 10);
			max_hp = Math.max((int)((p.getBaseStamina()+15) * CpM[(int) (pokLevel*2-2)]), 10);
			
			if(userHP>=min_hp && userHP<=max_hp && userCP>=min_cp && userCP<=max_cp){
				found = true;
				break;
			}
		}
		
		if(!found){
			return null;
		}
		
		// min_est_total_stamina = (user_hp) / CpM[pokemon_level*2-2];
		min_est_total_stamina = (userHP / CpM[(int)(pokLevel*2-2)]);
		// est_total_stamina = (user_hp + 0.5) / CpM[pokemon_level*2-2];
		est_total_stamina = (userHP + 0.5) / CpM[(int)(pokLevel*2-2)];
		// max_est_total_stamina = (user_hp + 1) / CpM[pokemon_level*2-2];
		max_est_total_stamina = (userHP+1.0) / CpM[(int)(pokLevel*2-2)];
		//min_br_cp = Math.max(Math.max(Math.floor(pokemon[pk_id].BaseAttack * Math.sqrt(pokemon[pk_id].BaseDefense) * Math.sqrt(min_est_total_stamina) * Math.pow(CpM[pokemon_level*2-2], 2) / 10), 10), min_cp);
		min_br_cp = Math.max(Math.max((int)(p.getBaseAttack() * Math.sqrt(p.getBaseDefense()) * Math.sqrt(min_est_total_stamina) * Math.pow(CpM[(int)(pokLevel*2-2)], 2) / 10), 10), min_cp);
		//max_br_cp = Math.min(Math.max(Math.floor((pokemon[pk_id].BaseAttack + 15) * Math.sqrt(pokemon[pk_id].BaseDefense + 15) * Math.sqrt(max_est_total_stamina) * Math.pow(CpM[pokemon_level*2-2], 2) / 10), 10), max_cp);
		max_br_cp = Math.min(Math.max((int)((p.getBaseAttack()+15) * Math.sqrt(p.getBaseDefense() +15 ) * Math.sqrt(max_est_total_stamina) * Math.pow(CpM[(int)(pokLevel*2-2)], 2) / 10), 10), max_cp);
		
		//per_diff_cp = (-1 + (user_cp+0.5) / ((pokemon[pk_id].BaseAttack + 7.5) * Math.sqrt(pokemon[pk_id].BaseDefense + 7.5) * Math.sqrt(pokemon[pk_id].BaseStamina + 7.5) * Math.pow(CpM[pokemon_level*2-2], 2) / 10)) * 100;
		per_diff_cp = (-1 + (userCP+0.5) / ((p.getBaseAttack() + 7.5) * Math.sqrt(p.getBaseDefense() + 7.5) * Math.sqrt(p.getBaseStamina() + 7.5) * Math.pow(CpM[(int)(pokLevel*2-2)], 2) / 10)) * 100; // ok 8.29
		//per_diff_sta = (-1 + (user_hp+0.5) / ((pokemon[pk_id].BaseStamina + 7.5) * CpM[pokemon_level*2-2])) * 100;
		per_diff_sta = (-1 + (userHP+0.5) / ((p.getBaseStamina() + 7.5) * CpM[(int)(pokLevel*2-2)])) * 100; // ok -1.14
		//per_diff_br = (-1 + (user_cp+0.5) / ((pokemon[pk_id].BaseAttack + 7.5) * Math.sqrt(pokemon[pk_id].BaseDefense + 7.5) * Math.sqrt(est_total_stamina) * Math.pow(CpM[pokemon_level*2-2], 2) / 10)) * 100;
		per_diff_br = (-1 + (userCP+0.5) / ((p.getBaseAttack() + 7.5) * Math.sqrt(p.getBaseDefense() + 7.5) * Math.sqrt(est_total_stamina) * Math.pow(CpM[(int)(pokLevel*2-2)], 2) / 10)) * 100; //ok 8.92
		  
		//rating_cp = (user_cp - min_cp) / (max_cp - min_cp) * 100;
		rating_cp = (userCP*1.0 - min_cp) / ((max_cp*1.0 - min_cp)) * 100; // ok 82.9
		//rating_sta = (user_hp - min_hp) / (max_hp - min_hp) * 100;
		rating_sta = (userHP*1.0 - min_hp) / ((max_hp*1.0 - min_hp)) * 100; // ok 40.0
		//rating_br = (user_cp - min_br_cp) / (max_br_cp - min_br_cp) * 100;
		rating_br = (userCP - min_br_cp) / ((max_br_cp - min_br_cp)) * 100; // ok 96.3

		int attackDefenseIV = (int)Math.round((rating_br/100)*30);
		int staminaIV = (int)Math.round((rating_sta/100)*15);
		
		return new Stat(pokLevel, p.getDrawableId(), round(rating_cp), round(rating_sta), round(rating_br), 
						round(per_diff_cp), round(per_diff_sta), round(per_diff_br), 
						attackDefenseIV, staminaIV, 
						userCP, min_cp, max_cp);		
	}

	private static double round(double value) {
	    long factor = (long) Math.pow(10, 2);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
	
	private static Pok getPok(int id){
		for(Pok p: poks){
			if(p.getId() == id){
				return p;
			}
		}
		return null;
	}
	
	private static Pok getPok(String name){
		for(Pok p: poks){
			if(p.getName().equals(name)){
				return p;
			}
		}
		return null;
	}
}
