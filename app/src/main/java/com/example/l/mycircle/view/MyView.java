package com.example.l.mycircle.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by l on 2015/8/10.
 */
public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);

        // 设置画布的背景颜色
        canvas.drawColor(Color.WHITE);
        /**
         * 定义矩形为空心
         */
        // 定义画笔1
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        // 消除锯齿
        paint.setAntiAlias(true);
        // 设置画笔的颜色
        paint.setColor(Color.RED);
        // 设置paint的外框宽度
        paint.setStrokeWidth(2);

        //绘制三角形
        Path path=new Path();
        path.moveTo(10, 230);
        path.lineTo(70,230);
        path.lineTo(40,270);
        path.close();
        canvas.drawPath(path, paint);
    }

}
