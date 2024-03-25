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

public class InfohasilspActivity extends AppCompatActivity implements ValueEventListener{

    //untuk connect ke firebase
    //tidak perlu diubah
    //apabila ingin mengubah data bisa langsung ke firebase

    TextView textInfohasilsp1, textInfohasilsp2, textInfohasilsp3,textInfohasilsp4,textInfohasilsp5,textInfohasilsp6,textInfohasilsp7;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference infohasilspData1 = databaseReference.child("Infografis_HasilSensusPenduduk_Paragraf1");
    private DatabaseReference infohasilspData2 = databaseReference.child("Infografis_HasilSensusPenduduk_Paragraf2");
    private DatabaseReference infohasilspData3 = databaseReference.child("Infografis_HasilSensusPenduduk_Paragraf3");
    private DatabaseReference infohasilspData4 = databaseReference.child("Infografis_HasilSensusPenduduk_Paragraf4");
    private DatabaseReference infohasilspData5 = databaseReference.child("Infografis_HasilSensusPenduduk_Paragraf5");
    private DatabaseReference infohasilspData6 = databaseReference.child("Infografis_HasilSensusPenduduk_Paragraf6");
    private DatabaseReference infohasilspData7 = databaseReference.child("Infografis_HasilSensusPenduduk_Paragraf7");


    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infohasilsp);

        textInfohasilsp1 = (TextView)findViewById(R.id.text_infohasilsp1);
        textInfohasilsp2 = (TextView)findViewById(R.id.text_infohasilsp2);
        textInfohasilsp3 = (TextView)findViewById(R.id.text_infohasilsp3);
        textInfohasilsp4 = (TextView)findViewById(R.id.text_infohasilsp4);
        textInfohasilsp5 = (TextView)findViewById(R.id.text_infohasilsp5);
        textInfohasilsp6 = (TextView)findViewById(R.id.text_infohasilsp6);
        textInfohasilsp7 = (TextView)findViewById(R.id.text_infohasilsp7);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.infohasilsp);
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
        Intent intent = new Intent(InfohasilspActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(InfohasilspActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(InfohasilspActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }

    public void hasil_sp2020(View view) {
        Intent intent = new Intent(InfohasilspActivity.this, InfohasilspGambar.class);
        startActivity(intent);
    }


    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null){

            String key = snapshot.getKey();
            if (key.equals("Infografis_HasilSensusPenduduk_Paragraf1")){

                String infohasilsp1 = snapshot.getValue(String.class);
                textInfohasilsp1.setText(infohasilsp1);
            }

            if (key.equals("Infografis_HasilSensusPenduduk_Paragraf2")){

                String infohasilsp2 = snapshot.getValue(String.class);
                textInfohasilsp2.setText(infohasilsp2);
            }

            if (key.equals("Infografis_HasilSensusPenduduk_Paragraf3")){

                String infohasilsp3 = snapshot.getValue(String.class);
                textInfohasilsp3.setText(infohasilsp3);
            }

            if (key.equals("Infografis_HasilSensusPenduduk_Paragraf4")){

                String infohasilsp4 = snapshot.getValue(String.class);
                textInfohasilsp4.setText(infohasilsp4);
            }

            if (key.equals("Infografis_HasilSensusPenduduk_Paragraf5")){

                String infohasilsp5 = snapshot.getValue(String.class);
                textInfohasilsp5.setText(infohasilsp5);
            }

            if (key.equals("Infografis_HasilSensusPenduduk_Paragraf6")){

                String infohasilsp6 = snapshot.getValue(String.class);
                textInfohasilsp6.setText(infohasilsp6);
            }

            if (key.equals("Infografis_HasilSensusPenduduk_Paragraf7")){

                String infohasilsp7 = snapshot.getValue(String.class);
                textInfohasilsp7.setText(infohasilsp7);
            }
        }

    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart(){
        super.onStart();
        infohasilspData1.addValueEventListener((ValueEventListener) this);
        infohasilspData2.addValueEventListener((ValueEventListener) this);
        infohasilspData3.addValueEventListener((ValueEventListener) this);
        infohasilspData4.addValueEventListener((ValueEventListener) this);
        infohasilspData5.addValueEventListener((ValueEventListener) this);
        infohasilspData6.addValueEventListener((ValueEventListener) this);
        infohasilspData7.addValueEventListener((ValueEventListener) this);
    }


}