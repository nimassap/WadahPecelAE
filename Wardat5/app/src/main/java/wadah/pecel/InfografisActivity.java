package wadah.pecel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class InfografisActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    CarouselView carouselView;
    int[] sampleImages = {R.drawable.hasil_sp2020, R.drawable.padi, R.drawable.sp2020, R.drawable.luas_panen, R.drawable.ketenagakerjaan, R.drawable.ipm2, R.drawable.kemiskinan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infografis);

        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.ekonomi);
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

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

    public void Home(View view) {
        Intent intent = new Intent(InfografisActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(InfografisActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(InfografisActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }

    public void infotani(View view) {
        Intent intent = new Intent(InfografisActivity.this, InfotaniActivity.class);
        startActivity(intent);
    }

    public void infoak(View view) {
        Intent intent = new Intent(InfografisActivity.this, InfoakActivity.class);
        startActivity(intent);
    }

    public void infoipm(View view) {
        Intent intent = new Intent(InfografisActivity.this, InfoipmActivity.class);
        startActivity(intent);
    }

    public void infomiskin(View view) {
        Intent intent = new Intent(InfografisActivity.this, InfomiskinActivity.class);
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(InfografisActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void infosp2020(View view) {
        Intent intent = new Intent(InfografisActivity.this, Infosp2020Activity.class);
        startActivity(intent);
    }

    public void infopadi(View view) {
        Intent intent = new Intent(InfografisActivity.this, InfopadiActivity.class);
        startActivity(intent);
    }

    public void infohasilsp(View view) {
        Intent intent = new Intent(InfografisActivity.this, InfohasilspActivity.class);
        startActivity(intent);
    }
}