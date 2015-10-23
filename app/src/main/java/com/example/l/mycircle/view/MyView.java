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

        // ���û����ı�����ɫ
        canvas.drawColor(Color.WHITE);
        /**
         * �������Ϊ����
         */
        // ���廭��1
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        // �������
        paint.setAntiAlias(true);
        // ���û��ʵ���ɫ
        paint.setColor(Color.RED);
        // ����paint�������
        paint.setStrokeWidth(2);

        //����������
        Path path=new Path();
        path.moveTo(10, 230);
        path.lineTo(70,230);
        path.lineTo(40,270);
        path.close();
        canvas.drawPath(path, paint);
    }

}
