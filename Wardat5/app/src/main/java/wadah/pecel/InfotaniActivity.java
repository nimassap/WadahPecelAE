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

public class InfotaniActivity extends AppCompatActivity implements ValueEventListener {

    TextView textInfotani1, textInfotani2, textInfotani3, textInfotani4, textInfotani5, textInfotani6, textInfotani7;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference InfotaniData1 = databaseReference.child("Infografis_InfoTani_Paragraf1");
    private DatabaseReference InfotaniData2 = databaseReference.child("Infografis_InfoTani_Paragraf2");
    private DatabaseReference InfotaniData3 = databaseReference.child("Infografis_InfoTani_Paragraf3");
    private DatabaseReference InfotaniData4 = databaseReference.child("Infografis_InfoTani_Paragraf4");
    private DatabaseReference InfotaniData5 = databaseReference.child("Infografis_InfoTani_Paragraf5");
    private DatabaseReference InfotaniData6 = databaseReference.child("Infografis_InfoTani_Paragraf6");
    private DatabaseReference InfotaniData7 = databaseReference.child("Infografis_InfoTani_Paragraf7");
    
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infotani);

        textInfotani1 = (TextView)findViewById(R.id.text_infotani1);
        textInfotani2 = (TextView)findViewById(R.id.text_infotani2);
        textInfotani3 = (TextView)findViewById(R.id.text_infotani3);
        textInfotani4 = (TextView)findViewById(R.id.text_infotani4);
        textInfotani5 = (TextView)findViewById(R.id.text_infotani5);
        textInfotani6 = (TextView)findViewById(R.id.text_infotani6);
        textInfotani7 = (TextView)findViewById(R.id.text_infotani7);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.infotani);
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
        Intent intent = new Intent(InfotaniActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(InfotaniActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(InfotaniActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }

    public void luas_panen(View view) {
        Intent intent = new Intent(InfotaniActivity.this, InfotaniGambar.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {
        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("Infografis_InfoTani_Paragraf1")) {

                String Infotani1 = snapshot.getValue(String.class);
                textInfotani1.setText(Infotani1);
            }

            if (key.equals("Infografis_InfoTani_Paragraf2")) {

                String Infotani2 = snapshot.getValue(String.class);
                textInfotani2.setText(Infotani2);
            }

            if (key.equals("Infografis_InfoTani_Paragraf3")) {

                String Infotani3 = snapshot.getValue(String.class);
                textInfotani3.setText(Infotani3);
            }

            if (key.equals("Infografis_InfoTani_Paragraf4")) {

                String Infotani4 = snapshot.getValue(String.class);
                textInfotani4.setText(Infotani4);
            }

            if (key.equals("Infografis_InfoTani_Paragraf5")) {

                String Infotani5 = snapshot.getValue(String.class);
                textInfotani5.setText(Infotani5);
            }

            if (key.equals("Infografis_InfoTani_Paragraf6")) {

                String Infotani6 = snapshot.getValue(String.class);
                textInfotani6.setText(Infotani6);
            }

            if (key.equals("Infografis_InfoTani_Paragraf7")) {

                String Infotani7 = snapshot.getValue(String.class);
                textInfotani7.setText(Infotani7);
            }
        }
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        InfotaniData1.addValueEventListener(this);
        InfotaniData2.addValueEventListener(this);
        InfotaniData3.addValueEventListener(this);
        InfotaniData4.addValueEventListener(this);
        InfotaniData5.addValueEventListener(this);
        InfotaniData6.addValueEventListener(this);
        InfotaniData7.addValueEventListener(this);
    }
}