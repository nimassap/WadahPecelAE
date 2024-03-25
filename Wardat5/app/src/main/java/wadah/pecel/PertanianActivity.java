package wadah.pecel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PertanianActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertanian);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.pertanian);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.search:
                        startActivity(new Intent(getApplicationContext(),SearchActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(),ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

    }

    public void Home(View view) {
        Intent intent = new Intent(PertanianActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(PertanianActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(PertanianActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }


    public void back(View view) {
        Intent intent = new Intent(PertanianActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void padi(View view) {
        Intent intent = new Intent(PertanianActivity.this, PadiActivity.class);
        startActivity(intent);
    }

    public void jagung(View view) {
        Intent intent = new Intent(PertanianActivity.this, JagungActivity.class);
        startActivity(intent);
    }

    public void beras(View view) {
        Intent intent = new Intent(PertanianActivity.this, BerasActivity.class);
        startActivity(intent);
    }

    public void kedelai(View view) {
        Intent intent = new Intent(PertanianActivity.this, KedelaiActivity.class);
        startActivity(intent);
    }

    public void kacangt(View view) {
        Intent intent = new Intent(PertanianActivity.this, KacangtActivity.class);
        startActivity(intent);
    }

    public void ubik(View view) {
        Intent intent = new Intent(PertanianActivity.this, UbikActivity.class);
        startActivity(intent);
    }

    public void ubij(View view) {
        Intent intent = new Intent(PertanianActivity.this, UbijActivity.class);
        startActivity(intent);
    }
}