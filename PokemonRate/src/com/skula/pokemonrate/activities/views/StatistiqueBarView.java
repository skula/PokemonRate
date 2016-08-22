package com.skula.pokemonrate.activities.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.skula.pokemonrate.R;
import com.skula.pokemonrate.models.Stat;

public class StatistiqueBarView extends View {
	private static final int Y0 = 0;
	private Paint circlePaint;
	private Paint circleStrokePaint;
	private RectF circleArc;

	private Stat stat;
	private int t = 50;
	
	// Attrs
	private int circleRadius;
	private int circleFillColor;
	private int circleStrokeColor;
	private int circleStartAngle;
	private int circleEndAngle;
	private int w;

	public StatistiqueBarView(Context context, AttributeSet attrs) {

		super(context, attrs);
		init(attrs); // Read all attributes

		circlePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		circlePaint.setStyle(Paint.Style.FILL);
		circleStrokePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		circleStrokePaint.setStyle(Paint.Style.STROKE);
		circleStrokePaint.setStrokeWidth(2);
		circleStrokePaint.setColor(circleStrokeColor);
	}

	public void init(AttributeSet attrs) {
		// Go through all custom attrs.
		TypedArray attrsArray = getContext().obtainStyledAttributes(attrs, R.styleable.circleview);
		circleRadius = attrsArray.getInteger(R.styleable.circleview_cRadius, 0);
		circleFillColor = attrsArray.getColor(R.styleable.circleview_cFillColor, 16777215);
		circleStrokeColor = attrsArray.getColor(R.styleable.circleview_cStrokeColor, -1);
		circleStartAngle = attrsArray.getInteger(R.styleable.circleview_cAngleStart, 0);
		circleEndAngle = attrsArray.getInteger(R.styleable.circleview_cAngleEnd, 360);
		// Google tells us to call recycle.
		attrsArray.recycle();
	}
	
	public void setStatistique(Stat stat){
		this.stat = stat;
		t = 800;
		invalidate();
	}

	@SuppressLint("DrawAllocation")
	@Override
	protected void onDraw(Canvas canvas) {
		// Move canvas down and right 1 pixel.
		// Otherwise the stroke gets cut off.
		/*canvas.translate(1, 1);
		circlePaint.setColor(circleFillColor);
		canvas.drawArc(circleArc, circleStartAngle, circleEndAngle, true, circlePaint);
		canvas.drawArc(circleArc, circleStartAngle, circleEndAngle, true, circleStrokePaint);*/
		Paint p = new Paint();
		p.setColor(Color.LTGRAY);
		canvas.drawRect(new Rect(0,Y0+23,w,Y0+28), p);

		canvas.drawRect(new Rect(0,Y0,4,Y0 +50), p);
		canvas.drawRect(new Rect(w-4,Y0,w,Y0 +50), p);
		if(stat!=null){
			p.setColor(Color.DKGRAY);
			int a = ((stat.getCp() - stat.getCpMin())*w)/(stat.getCpMax() - stat.getCpMin());
			canvas.drawRect(new Rect(a-2,Y0,a+2,Y0 +50), p);
			int m = (int) ((stat.getCpMax() - stat.getCpMin()) / (stat.getPer_diff_cp()/100));
			canvas.drawRect(new Rect(m-2,Y0,m+2,Y0 +50), p);
		}
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		//super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		this.w = measureWidth(widthMeasureSpec);
		int measuredWidth = measureWidth(widthMeasureSpec);
		if (circleRadius == 0) // No radius specified.
		{ // Lets see what we can make.
			// Check width size. Make radius half of available.
			circleRadius = measuredWidth / 2;
			int tempRadiusHeight = measureHeight(heightMeasureSpec) / 2;
			if (tempRadiusHeight < circleRadius)
				// Check height, if height is smaller than
				// width, then go half height as radius.
				circleRadius = tempRadiusHeight;
		}
		// Remove 2 pixels for the stroke.
		int circleDiameter = circleRadius * 2 - 2;
		// RectF(float left, float top, float right, float bottom)
		circleArc = new RectF(0, 0, circleDiameter, circleDiameter);
		int measuredHeight = measureHeight(heightMeasureSpec);
		setMeasuredDimension(measuredWidth, 80);
		Log.d("onMeasure() ::",
				"measuredHeight =>" + String.valueOf(measuredHeight) + "px measuredWidth => "
						+ String.valueOf(measuredWidth) + "px");
	}

	private int measureHeight(int measureSpec) {
		int specMode = MeasureSpec.getMode(measureSpec);
		int specSize = MeasureSpec.getSize(measureSpec);
		int result = 0;
		if (specMode == MeasureSpec.AT_MOST) {
			result = circleRadius * 2;
		} else if (specMode == MeasureSpec.EXACTLY) {
			result = specSize;
		}
		return result;
	}

	private int measureWidth(int measureSpec) {
		int specMode = MeasureSpec.getMode(measureSpec);
		int specSize = MeasureSpec.getSize(measureSpec);
		int result = 0;
		if (specMode == MeasureSpec.AT_MOST) {
			result = specSize;
		} else if (specMode == MeasureSpec.EXACTLY) {
			result = specSize;
		}
		return result;
	}
}