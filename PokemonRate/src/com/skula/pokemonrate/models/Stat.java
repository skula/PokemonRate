package com.skula.pokemonrate.models;
public class Stat {
	private double level;
	private double rating_cp;
	private double rating_sta;
	private double rating_br;
	private double per_diff_cp;
	private double per_diff_sta;
	private double per_diff_br;
	private int attackDefenceIV;
	private int staminaIV;
	private int cp;
	private int cpMin;
	private int cpMax;
	
	public static void main(double[] args) {
	}

	public Stat(double level, double rating_cp, double rating_sta, double rating_br,
			double per_diff_cp, double per_diff_sta, double per_diff_br, int attackDefenceIV, int staminaIV, int cp, int cpMin, int cpMax) {
		this.level = level;
		this.rating_cp = rating_cp;
		this.rating_sta = rating_sta;
		this.rating_br = rating_br;
		this.per_diff_cp = per_diff_cp;
		this.per_diff_sta = per_diff_sta;
		this.per_diff_br = per_diff_br;
		this.attackDefenceIV = attackDefenceIV;
		this.staminaIV = staminaIV;
		this.cp = cp;
		this.cpMin = cpMin;
		this.cpMax = cpMax;		
	}

	public double getLevel() {
		return level;
	}

	public void setLevel(double level) {
		this.level = level;
	}

	public double getRating_cp() {
		return rating_cp;
	}

	public void setRating_cp(double rating_cp) {
		this.rating_cp = rating_cp;
	}

	public double getRating_sta() {
		return rating_sta;
	}

	public void setRating_sta(double rating_sta) {
		this.rating_sta = rating_sta;
	}

	public double getRating_br() {
		return rating_br;
	}

	public void setRating_br(double rating_br) {
		this.rating_br = rating_br;
	}

	public double getPer_diff_cp() {
		return per_diff_cp;
	}

	public void setPer_diff_cp(double per_diff_cp) {
		this.per_diff_cp = per_diff_cp;
	}

	public double getPer_diff_sta() {
		return per_diff_sta;
	}

	public void setPer_diff_sta(double per_diff_sta) {
		this.per_diff_sta = per_diff_sta;
	}

	public double getPer_diff_br() {
		return per_diff_br;
	}

	public void setPer_diff_br(double per_diff_br) {
		this.per_diff_br = per_diff_br;
	}

	public int getAttackDefenceIV() {
		return attackDefenceIV;
	}

	public void setAttackDefenceIV(int attackDefenceIV) {
		this.attackDefenceIV = attackDefenceIV;
	}

	public int getStaminaIV() {
		return staminaIV;
	}

	public void setStaminaIV(int staminaIV) {
		this.staminaIV = staminaIV;
	}

	@Override
	public String toString() {
		return "level: " + level +
				", rating_cp: " + rating_cp + "%" + 
				", rating_sta: " + rating_sta + "%" +
				", rating_br: " + rating_br + "%" +
				", per_diff_cp: " + per_diff_cp + "%" +
				", per_diff_sta: " + per_diff_sta + "%" +
				", per_diff_br: " + per_diff_br + "%" +
				", attackDefenceIV: " + attackDefenceIV +
				", staminaIV: " + staminaIV;
	}
	
	
}
