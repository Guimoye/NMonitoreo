package com.example.javier.navegomonitoreo.InicioActivity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.javier.navegomonitoreo.LoginActivity;
import com.example.javier.navegomonitoreo.R;
import com.example.javier.navegomonitoreo.InicioActivity.ViewPagerAdapter;

import java.util.Timer;
import java.util.TimerTask;

public class InitialActivity extends Activity implements ViewPager.OnPageChangeListener {

    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private LinearLayout dotsIndicator;
    private Button btnLogin;
    private ImageView[] dots;

    private int dotsCount;
    private int currentPage = 0;
    private int[] mLayoutResources = {
            R.layout.layout_initial_slider,
            R.layout.layout_first_slider,
            R.layout.layout_second_slider,
            R.layout.layout_thrid_slider
    };

    private Activity activity;
    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);

        setUpElements();
        setUiPageViewController();
        setUpTimer();
        setUpActions();
    }

    @Override
    protected void onDestroy() {
        timer.cancel();
        super.onDestroy();
    }

    private void setUpElements(){
        activity = this;

        viewPager = (ViewPager) findViewById(R.id.view_pager_initial);
        dotsIndicator = (LinearLayout) findViewById(R.id.viewPagerCountDots);
        btnLogin = (Button) findViewById(R.id.btn_signin);

        viewPagerAdapter = new ViewPagerAdapter(activity, mLayoutResources);
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.addOnPageChangeListener(this);
        viewPager.setCurrentItem(currentPage);
    }

    private void setUiPageViewController(){
        dotsCount = viewPagerAdapter.getCount();
        dots = new ImageView[dotsCount];

        for (int i = 0; i < dotsCount; i++) {
            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(getResources().getDrawable(R.drawable.nonselecteditemfirst_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );

            params.setMargins(4, 0, 4, 0);

            dotsIndicator.addView(dots[i], params);
        }

        dots[0].setImageDrawable(getResources().getDrawable(R.drawable.selecteditemfirst_dot));
    }

    private void setUpTimer(){
        timer = new Timer();
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == dotsCount - 1) { timer.cancel(); }
                else { currentPage++; }
                viewPager.setCurrentItem(currentPage, true);
            }
        };

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3000, 3000);
    }

    private void setUpActions(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLogin();
            }
        });
    }

    private void goLogin(){
        Intent login = new Intent().setClass(activity, LoginActivity.class);
        startActivity(login);
        finish();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onPageSelected(int position) {

        for (int i = 0; i < dotsCount; i++) {
            if(position == 0) {
                dots[i].setImageDrawable(getResources().getDrawable(R.drawable.nonselecteditemfirst_dot));
            } else {
                dots[i].setImageDrawable(getResources().getDrawable(R.drawable.nonselecteditem_dot));
            }
        }

        if(position == 0){
            dots[position].setImageDrawable(getResources().getDrawable(R.drawable.selecteditemfirst_dot));
        } else {
            dots[position].setImageDrawable(getResources().getDrawable(R.drawable.selecteditem_dot));
        }

        if(position != 0){
            btnLogin.setTextColor(getResources().getColor(R.color.rojo_login));
            btnLogin.setBackground(getResources().getDrawable(R.drawable.btn_login_white));
        } else {
            btnLogin.setTextColor(getResources().getColor(R.color.blanco));
            btnLogin.setBackground(getResources().getDrawable(R.drawable.btn_login));
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}

