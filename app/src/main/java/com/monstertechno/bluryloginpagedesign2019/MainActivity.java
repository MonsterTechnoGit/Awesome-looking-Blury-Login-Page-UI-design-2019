package com.monstertechno.bluryloginpagedesign2019;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.eightbitlab.supportrenderscriptblur.SupportRenderScriptBlur;

import butterknife.BindView;
import butterknife.ButterKnife;
import eightbitlab.com.blurview.BlurView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.root)
    ViewGroup root;
    @BindView(R.id.blur_email)
    BlurView blur_email;
    @BindView(R.id.blur_password)
    BlurView blur_password;
    @BindView(R.id.blur_facebook)
    BlurView blur_facebook;
    @BindView(R.id.blur_google)
    BlurView blur_google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        final float radius = 25f;
        final Drawable windowBackground = getWindow().getDecorView().getBackground();

        blur_email.setupWith(root)
                .setFrameClearDrawable(windowBackground)
                .setBlurAlgorithm(new SupportRenderScriptBlur(this))
                .setBlurRadius(radius)
                .setHasFixedTransformationMatrix(true);
        blur_password.setupWith(root)
                .setFrameClearDrawable(windowBackground)
                .setBlurAlgorithm(new SupportRenderScriptBlur(this))
                .setBlurRadius(radius)
                .setHasFixedTransformationMatrix(true);
        blur_facebook.setupWith(root)
                .setFrameClearDrawable(windowBackground)
                .setBlurAlgorithm(new SupportRenderScriptBlur(this))
                .setBlurRadius(radius)
                .setHasFixedTransformationMatrix(true);
        blur_google.setupWith(root)
                .setFrameClearDrawable(windowBackground)
                .setBlurAlgorithm(new SupportRenderScriptBlur(this))
                .setBlurRadius(radius)
                .setHasFixedTransformationMatrix(true);
    }
}
