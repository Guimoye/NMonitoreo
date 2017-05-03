package com.example.javier.navegomonitoreo.InicioActivity;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class ViewPagerAdapter extends PagerAdapter {

    private Context mContext;
    private int[] mResources;


    public ViewPagerAdapter(Context context, int[] mResources){
        this.mContext = context;
        this.mResources = mResources;
    }

    @Override
    public int getCount() {
        return mResources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        int resId = mResources[position];
        View itemView = LayoutInflater.from(mContext).inflate(resId, container, false);
        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout) object);
    }
}
