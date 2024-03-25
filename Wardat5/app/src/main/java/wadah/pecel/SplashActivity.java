package wadah.pecel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    TextView teks, teks2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        teks = (TextView) findViewById(R.id.warung);
        teks2 = (TextView) findViewById(R.id.menu);


        Typeface customfont = Typeface.createFromAsset(getAssets(), "font/Cameliya.otf");
        teks.setTypeface(customfont);
        Typeface customfont2 = Typeface.createFromAsset(getAssets(), "font/FireBrathers-PersonalUse.otf");
        teks2.setTypeface(customfont2);


        Thread thread=new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}