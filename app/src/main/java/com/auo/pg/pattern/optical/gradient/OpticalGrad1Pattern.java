package com.auo.pg.pattern.optical.gradient;

import android.content.Context;
import android.widget.ImageView;
import com.auo.pg.R;
import com.auo.pg.pattern.optical.OpticalPattern;

/**
 * Created by joshc on 7/12/2017.
 */

public class OpticalGrad1Pattern extends OpticalPattern {

    @Override
    public void setPattern(Context context, ImageView v) {
        v.setImageResource(R.drawable.grad1);
    }

    @Override
    public void destroy() {
        // do nothing
    }

}
