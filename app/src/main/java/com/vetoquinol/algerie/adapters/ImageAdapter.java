package com.vetoquinol.algerie.adapters;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.PagerAdapter;
import com.vetoquinol.algerie.R;


public class ImageAdapter extends PagerAdapter {
    private Context mContext;
    //Slide Content :
    private int[] mImageIds = new int[]{R.drawable.home_slide1, R.drawable.home_slide2, R.drawable.home_slide3,
                                        R.drawable.home_slide4, R.drawable.home_slide5, R.drawable.home_slide6,
                                        R.drawable.home_slide7, R.drawable.home_slide8,R.drawable.home_slide9,
                                        R.drawable.home_slide10, R.drawable.home_slide11,R.drawable.home_slide12,

    };

    public ImageAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView) object);
    }

}