package wadah.pecel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class InfopadiActivity extends AppCompatActivity implements ValueEventListener {

    ImageView imageView;
    TextView textInfopadi1, textInfopadi2, textInfopadi3, textInfopadi4, textInfopadi5, textInfopadi6, textInfopadi7;

    InfoSearch infoSearch;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference InfopadiData1 = databaseReference.child("Infografis_InfoPadi_Paragraf1");
    private DatabaseReference InfopadiData2 = databaseReference.child("Infografis_InfoPadi_Paragraf2");
    private DatabaseReference InfopadiData3 = databaseReference.child("Infografis_InfoPadi_Paragraf3");
    private DatabaseReference InfopadiData4 = databaseReference.child("Infografis_InfoPadi_Paragraf4");
    private DatabaseReference InfopadiData5 = databaseReference.child("Infografis_InfoPadi_Paragraf5");
    private DatabaseReference InfopadiData6 = databaseReference.child("Infografis_InfoPadi_Paragraf6");
    private DatabaseReference InfopadiData7 = databaseReference.child("Infografis_InfoPadi_Paragraf7");
    
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infopadi);

        imageView = findViewById(R.id.img_infopadi);

        textInfopadi1 = (TextView)findViewById(R.id.text_infopadi1);
        textInfopadi2 = (TextView)findViewById(R.id.text_infopadi2);
        textInfopadi3 = (TextView)findViewById(R.id.text_infopadi3);
        textInfopadi4 = (TextView)findViewById(R.id.text_infopadi4);
        textInfopadi5 = (TextView)findViewById(R.id.text_infopadi5);
        textInfopadi6 = (TextView)findViewById(R.id.text_infopadi6);
        textInfopadi7 = (TextView)findViewById(R.id.text_infopadi7);


        Intent intent = getIntent();
        if (intent.getExtras() != null){
            infoSearch = (InfoSearch) intent.getSerializableExtra("Tercatat terdapat kenaikan produksi padi tahun 2020 sebanyak 6,38 persen dibandingkan tahun 2019. Sedangkan luas panen padi meningkat 7,33 persen. Hal ini membuktikan jika sektor pertanian yg merupakan salah satu sektor yg kuat menghadapi pandemi covid-19.");
            imageView.setImageResource(infoSearch.getImage());
            textInfopadi1.setText(infoSearch.getDesc());
            textInfopadi2.setText(infoSearch.getDesc());
            textInfopadi3.setText(infoSearch.getDesc());
            textInfopadi4.setText(infoSearch.getDesc());
            textInfopadi5.setText(infoSearch.getDesc());
            textInfopadi6.setText(infoSearch.getDesc());
            textInfopadi7.setText(infoSearch.getDesc());

        }


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.infopadi);
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
        Intent intent = new Intent(InfopadiActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(InfopadiActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(InfopadiActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }

    public void padi(View view) {
        Intent intent = new Intent(InfopadiActivity.this, InfopadiGambar.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {
        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("Infografis_InfoPadi_Paragraf1")) {

                String Infopadi1 = snapshot.getValue(String.class);
                textInfopadi1.setText(Infopadi1);
            }

            if (key.equals("Infografis_InfoPadi_Paragraf2")) {

                String Infopadi2 = snapshot.getValue(String.class);
                textInfopadi2.setText(Infopadi2);
            }

            if (key.equals("Infografis_InfoPadi_Paragraf3")) {

                String Infopadi3 = snapshot.getValue(String.class);
                textInfopadi3.setText(Infopadi3);
            }

            if (key.equals("Infografis_InfoPadi_Paragraf4")) {

                String Infopadi4 = snapshot.getValue(String.class);
                textInfopadi4.setText(Infopadi4);
            }

            if (key.equals("Infografis_InfoPadi_Paragraf5")) {

                String Infopadi5 = snapshot.getValue(String.class);
                textInfopadi5.setText(Infopadi5);
            }

            if (key.equals("Infografis_InfoPadi_Paragraf6")) {

                String Infopadi6 = snapshot.getValue(String.class);
                textInfopadi6.setText(Infopadi6);
            }

            if (key.equals("Infografis_InfoPadi_Paragraf7")) {

                String Infopadi7 = snapshot.getValue(String.class);
                textInfopadi7.setText(Infopadi7);
            }
        }
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {


    }

    @Override
    protected void onStart() {
        super.onStart();
        InfopadiData1.addValueEventListener(this);
        InfopadiData2.addValueEventListener(this);
        InfopadiData3.addValueEventListener(this);
        InfopadiData4.addValueEventListener(this);
        InfopadiData5.addValueEventListener(this);
        InfopadiData6.addValueEventListener(this);
        InfopadiData7.addValueEventListener(this);
    }
}