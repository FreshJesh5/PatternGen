package com.auo.pg.pattern.optical.gradient;

import android.content.Context;
import android.widget.ImageView;
import com.auo.pg.R;
import com.auo.pg.pattern.optical.OpticalPattern;

/**
 * Created by joshc on 7/12/2017.
 */

public class OpticalGrad1Pattern extends OpticalPattern {

//    ShapeDrawable.ShaderFactory sf = new ShapeDrawable.ShaderFactory() {
//        @Override
//        public Shader resize(int width, int height) {
//            LinearGradient lg = new LinearGradient(0, 0, width, height,
//                    new int[]{Color.GREEN, Color.GREEN, Color.WHITE, Color.WHITE},
//                    new float[]{0,0.5f,.55f,1}, Shader.TileMode.REPEAT);
//            return lg;
//        }
//    };
//
//    PaintDrawable p =new PaintDrawable();
//    p.setShape(new RectShape());
//    p.setShaderFactory(sf);

    @Override
    public void setPattern(Context context, ImageView v) {
        v.setImageResource(R.drawable.grad1);
    }

    @Override
    public void destroy() {
        // do nothing
    }

}
