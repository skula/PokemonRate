package com.skula.pokemonrate.activities.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import com.skula.pokemonrate.models.Stat;

public class StatistiqueBarView extends View {
	private Paint paint;
	private Stat statistique;

	public StatistiqueBarView(Context context, AttributeSet attrs, Stat stat) {
		super(context, attrs);
		this.statistique = stat;
		this.paint = new Paint();
	}

	private void drawGrid(Canvas c) {
		paint.setColor(Color.GRAY);
	}

	private void drawFigures(Canvas c) {
		paint.setColor(Color.GRAY);
	}

	private void drawBar(Canvas c) {
		paint.setColor(Color.BLUE);
		c.drawRect(new Rect(0, 0, 200, 200), paint);
	}

	@Override
	public void draw(Canvas c) {
		drawGrid(c);
		drawFigures(c);
		drawBar(c);
	}
}