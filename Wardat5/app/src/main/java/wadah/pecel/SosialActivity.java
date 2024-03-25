package wadah.pecel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

public class SosialActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sosial);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.sosial);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.search:
                        startActivity(new Intent(getApplicationContext(), SearchActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });

    }

    public void Home(View view) {
        Intent intent = new Intent(SosialActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(SosialActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(SosialActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }


    public void Kemiskinan(View view) {
        Intent intent = new Intent(SosialActivity.this, KemiskinanActivity.class);
        startActivity(intent);
    }

    public void Ketenagakerjaan(View view) {
        Intent intent = new Intent(SosialActivity.this, KetenagakerjaanActivity.class);
        startActivity(intent);
    }

    public void Penduduk(View view) {
        Intent intent = new Intent(SosialActivity.this, PendudukActivity.class);
        startActivity(intent);
    }

    public void Pddklapus(View view) {
        Intent intent = new Intent(SosialActivity.this, PddklapusActivity.class);
        startActivity(intent);
    }

    public void aps(View view) {
        Intent intent = new Intent(SosialActivity.this, ApsActivity.class);
        startActivity(intent);
    }

    public void apk(View view) {
        Intent intent = new Intent(SosialActivity.this, ApkActivity.class);
        startActivity(intent);
    }

    public void apm(View view) {
        Intent intent = new Intent(SosialActivity.this, ApmActivity.class);
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(SosialActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void sp2020(View view) {
        Intent intent = new Intent(SosialActivity.this, Sp2020Activity.class);
        startActivity(intent);
    }

    public void gini(View view) {
        Intent intent = new Intent(SosialActivity.this, GiniActivity.class);
        startActivity(intent);
    }



}
