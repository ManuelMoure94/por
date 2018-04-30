package com.manuelmoure.portfolio.ui.login.mvp;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.manuelmoure.portfolio.R;
import com.manuelmoure.portfolio.ui.base.BaseActivity;
import com.manuelmoure.portfolio.ui.login.di.LoginModule;
import com.manuelmoure.portfolio.ui.root.di.ApplicationComponent;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements LoginContract.View {

    Animation rightToLeft, leftToRight, downToUp, upToDown;

    @Inject
    public LoginPresenter presenter;

    @BindView(R.id.text_user_layout)
    TextInputLayout userLayout;
    @BindView(R.id.text_pass_layout)
    TextInputLayout passLayout;

    @BindView(R.id.text_user_input)
    TextInputEditText userText;
    @BindView(R.id.text_pass_input)
    TextInputEditText passText;

    @BindView(R.id.button_login)
    Button btnLogin;

    @BindView(R.id.image_login)
    ImageView imageLogin;

    @Override
    protected void injectDependencies(ApplicationComponent applicationComponent) {
        applicationComponent.plus(new LoginModule(this)).inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        rightToLeft = AnimationUtils.loadAnimation(this, R.anim.right_to_left);
        leftToRight = AnimationUtils.loadAnimation(this, R.anim.left_to_right);
        downToUp = AnimationUtils.loadAnimation(this, R.anim.down_to_up);
        upToDown = AnimationUtils.loadAnimation(this, R.anim.up_to_down);

        btnLogin.setAnimation(downToUp);
        imageLogin.setAnimation(upToDown);
        userLayout.setAnimation(rightToLeft);
        passLayout.setAnimation(leftToRight);

//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
