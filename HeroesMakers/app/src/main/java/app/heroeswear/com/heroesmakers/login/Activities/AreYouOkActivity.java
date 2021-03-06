package app.heroeswear.com.heroesmakers.login.Activities;

import android.content.ContentResolver;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import app.heroeswear.com.heroesfb.Logger;
import app.heroeswear.com.heroesmakers.R;
import common.BaseActivity;

public class AreYouOkActivity extends BaseActivity {

    private Button btn_notOk;
    private Button btn_Ok;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_are_you_ok);

        btn_notOk = (Button) findViewById(R.id.btn_not_ok);
        btn_notOk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                launchActivity();
            }
        });

        btn_Ok = (Button) findViewById(R.id.btn_ok);
        btn_Ok.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                moveTaskToBack(true);
            }
        });

    }

    private void launchActivity() {
        Intent intent = new Intent(AreYouOkActivity.this, HomePageActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAttachedToWindow() {
        //this.getWindow().setType(WindowManager.LayoutParams.TYPE_KEYGUARD_DIALOG);
        this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN
                | WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON
                | WindowManager.LayoutParams.FLAG_ALLOW_LOCK_WHILE_SCREEN_ON
                | WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD
                | WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED
                | WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);
        super.onAttachedToWindow();
    }
}
