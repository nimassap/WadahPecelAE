package wadah.pecel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Infosp2020Activity extends AppCompatActivity implements ValueEventListener {

    TextView textInfoSP2020_1, textInfoSP2020_2, textInfoSP2020_3, textInfoSP2020_4, textInfoSP2020_5, textInfoSP2020_6, textInfoSP2020_7;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference InfoSP2020Data1 = databaseReference.child("Infografis_InfoSP2020_Paragraf1");
    private DatabaseReference InfoSP2020Data2 = databaseReference.child("Infografis_InfoSP2020_Paragraf2");
    private DatabaseReference InfoSP2020Data3 = databaseReference.child("Infografis_InfoSP2020_Paragraf3");
    private DatabaseReference InfoSP2020Data4 = databaseReference.child("Infografis_InfoSP2020_Paragraf4");
    private DatabaseReference InfoSP2020Data5 = databaseReference.child("Infografis_InfoSP2020_Paragraf5");
    private DatabaseReference InfoSP2020Data6 = databaseReference.child("Infografis_InfoSP2020_Paragraf6");
    private DatabaseReference InfoSP2020Data7 = databaseReference.child("Infografis_InfoSP2020_Paragraf7");

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infosp2020);

        textInfoSP2020_1 = (TextView)findViewById(R.id.text_infosp1);
        textInfoSP2020_2 = (TextView)findViewById(R.id.text_infosp2);
        textInfoSP2020_3 = (TextView)findViewById(R.id.text_infosp3);
        textInfoSP2020_4 = (TextView)findViewById(R.id.text_infosp4);
        textInfoSP2020_5 = (TextView)findViewById(R.id.text_infosp5);
        textInfoSP2020_6 = (TextView)findViewById(R.id.text_infosp6);
        textInfoSP2020_7 = (TextView)findViewById(R.id.text_infosp7);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.infosp2020);
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
        Intent intent = new Intent(Infosp2020Activity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(Infosp2020Activity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(Infosp2020Activity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }

    public void sp2020(View view) {
        Intent intent = new Intent(Infosp2020Activity.this, Infosp2020Gambar.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {
        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("Infografis_InfoSP2020_Paragraf1")) {

                String InfoSP1 = snapshot.getValue(String.class);
                textInfoSP2020_1.setText(InfoSP1);
            }

            if (key.equals("Infografis_InfoSP2020_Paragraf2")) {

                String InfoSP2 = snapshot.getValue(String.class);
                textInfoSP2020_2.setText(InfoSP2);
            }

            if (key.equals("Infografis_InfoSP2020_Paragraf3")) {

                String InfoSP3 = snapshot.getValue(String.class);
                textInfoSP2020_3.setText(InfoSP3);
            }

            if (key.equals("Infografis_InfoSP2020_Paragraf4")) {

                String InfoSP4 = snapshot.getValue(String.class);
                textInfoSP2020_4.setText(InfoSP4);
            }

            if (key.equals("Infografis_InfoSP2020_Paragraf5")) {

                String InfoSP5 = snapshot.getValue(String.class);
                textInfoSP2020_5.setText(InfoSP5);
            }

            if (key.equals("Infografis_InfoSP2020_Paragraf6")) {

                String InfoSP6 = snapshot.getValue(String.class);
                textInfoSP2020_6.setText(InfoSP6);
            }

            if (key.equals("Infografis_InfoSP2020_Paragraf7")) {

                String InfoSP7 = snapshot.getValue(String.class);
                textInfoSP2020_7.setText(InfoSP7);
            }
        }
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        InfoSP2020Data1.addValueEventListener(this);
        InfoSP2020Data2.addValueEventListener(this);
        InfoSP2020Data3.addValueEventListener(this);
        InfoSP2020Data4.addValueEventListener(this);
        InfoSP2020Data5.addValueEventListener(this);
        InfoSP2020Data6.addValueEventListener(this);
        InfoSP2020Data7.addValueEventListener(this);
    }
}