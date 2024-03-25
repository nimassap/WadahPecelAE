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

public class KacangtActivity extends AppCompatActivity implements ValueEventListener {

    TextView kacangtanah_tahun1, kacangtanah_tahun2, kacangtanah_tahun3,kacangtanah_tahun4,kacangtanah_tahun5,kacangtanah_tahun6,kacangtanah_tahun7,kacangtanah_tahun8,
            kacangtanah_luaspanen1, kacangtanah_luaspanen2, kacangtanah_luaspanen3,kacangtanah_luaspanen4,kacangtanah_luaspanen5,kacangtanah_luaspanen6,kacangtanah_luaspanen7,kacangtanah_luaspanen8,
            kacangtanah_produksi1, kacangtanah_produksi2, kacangtanah_produksi3,kacangtanah_produksi4,kacangtanah_produksi5,kacangtanah_produksi6,kacangtanah_produksi7,kacangtanah_produksi8,
            kacangtanah_produktifitas1, kacangtanah_produktifitas2, kacangtanah_produktifitas3,kacangtanah_produktifitas4,kacangtanah_produktifitas5,kacangtanah_produktifitas6,kacangtanah_produktifitas7,kacangtanah_produktifitas8;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference kacangtanahData1 = databaseReference.child("Kacangtanah_tahun_2020");
    private DatabaseReference kacangtanahData2 = databaseReference.child("Kacangtanah_luaspanen_2020");
    private DatabaseReference kacangtanahData3 = databaseReference.child("Kacangtanah_produksi_2020");
    private DatabaseReference kacangtanahData4 = databaseReference.child("Kacangtanah_produktifitas_2020");

    private DatabaseReference kacangtanahData5 = databaseReference.child("Kacangtanah_tahun_2019");
    private DatabaseReference kacangtanahData6 = databaseReference.child("Kacangtanah_luaspanen_2019");
    private DatabaseReference kacangtanahData7 = databaseReference.child("Kacangtanah_produksi_2019");
    private DatabaseReference kacangtanahData8 = databaseReference.child("Kacangtanah_produktifitas_2019");

    private DatabaseReference kacangtanahData9 = databaseReference.child("Kacangtanah_tahun_2018");
    private DatabaseReference kacangtanahData10 = databaseReference.child("Kacangtanah_luaspanen_2018");
    private DatabaseReference kacangtanahData11 = databaseReference.child("Kacangtanah_produksi_2018");
    private DatabaseReference kacangtanahData12 = databaseReference.child("Kacangtanah_produktifitas_2018");


    private DatabaseReference kacangtanahData13 = databaseReference.child("Kacangtanah_tahun_2021");
    private DatabaseReference kacangtanahData14 = databaseReference.child("Kacangtanah_luaspanen_2021");
    private DatabaseReference kacangtanahData15 = databaseReference.child("Kacangtanah_produksi_2021");
    private DatabaseReference kacangtanahData16 = databaseReference.child("Kacangtanah_produktifitas_2021");

    private DatabaseReference kacangtanahData17 = databaseReference.child("Kacangtanah_tahun_2022");
    private DatabaseReference kacangtanahData18 = databaseReference.child("Kacangtanah_luaspanen_2022");
    private DatabaseReference kacangtanahData19 = databaseReference.child("Kacangtanah_produksi_2022");
    private DatabaseReference kacangtanahData20 = databaseReference.child("Kacangtanah_produktifitas_2022");

    private DatabaseReference kacangtanahData21 = databaseReference.child("Kacangtanah_tahun_2023");
    private DatabaseReference kacangtanahData22 = databaseReference.child("Kacangtanah_luaspanen_2023");
    private DatabaseReference kacangtanahData23 = databaseReference.child("Kacangtanah_produksi_2023");
    private DatabaseReference kacangtanahData24 = databaseReference.child("Kacangtanah_produktifitas_2023");

    private DatabaseReference kacangtanahData25 = databaseReference.child("Kacangtanah_tahun_2024");
    private DatabaseReference kacangtanahData26 = databaseReference.child("Kacangtanah_luaspanen_2024");
    private DatabaseReference kacangtanahData27 = databaseReference.child("Kacangtanah_produksi_2024");
    private DatabaseReference kacangtanahData28 = databaseReference.child("Kacangtanah_produktifitas_2024");

    private DatabaseReference kacangtanahData29 = databaseReference.child("Kacangtanah_tahun_2025");
    private DatabaseReference kacangtanahData30 = databaseReference.child("Kacangtanah_luaspanen_2025");
    private DatabaseReference kacangtanahData31 = databaseReference.child("Kacangtanah_produksi_2025");
    private DatabaseReference kacangtanahData32 = databaseReference.child("Kacangtanah_produktifitas_2025");


    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kacangt);

        kacangtanah_tahun1 = (TextView)findViewById(R.id.kacangtanah_tahun1);
        kacangtanah_luaspanen1 = (TextView)findViewById(R.id.kacangtanah_luaspanen1);
        kacangtanah_produksi1 = (TextView)findViewById(R.id.kacangtanah_produksi1);
        kacangtanah_produktifitas1 = (TextView)findViewById(R.id.kacangtanah_produktifitas1);

        kacangtanah_tahun2 = (TextView)findViewById(R.id.kacangtanah_tahun2);
        kacangtanah_luaspanen2 = (TextView)findViewById(R.id.kacangtanah_luaspanen2);
        kacangtanah_produksi2 = (TextView)findViewById(R.id.kacangtanah_produksi2);
        kacangtanah_produktifitas2 = (TextView)findViewById(R.id.kacangtanah_produktifitas2);

        kacangtanah_tahun3 = (TextView)findViewById(R.id.kacangtanah_tahun3);
        kacangtanah_luaspanen3 = (TextView)findViewById(R.id.kacangtanah_luaspanen3);
        kacangtanah_produksi3 = (TextView)findViewById(R.id.kacangtanah_produksi3);
        kacangtanah_produktifitas3 = (TextView)findViewById(R.id.kacangtanah_produktifitas3);


        kacangtanah_tahun4 = (TextView)findViewById(R.id.kacangtanah_tahunNew1);
        kacangtanah_luaspanen4 = (TextView)findViewById(R.id.kacangtanah_luaspanenNew1);
        kacangtanah_produksi4 = (TextView)findViewById(R.id.kacangtanah_produksiNew1);
        kacangtanah_produktifitas4 = (TextView)findViewById(R.id.kacangtanah_produktifitasNew1);

        kacangtanah_tahun5 = (TextView)findViewById(R.id.kacangtanah_tahunNew2);
        kacangtanah_luaspanen5 = (TextView)findViewById(R.id.kacangtanah_luaspanenNew2);
        kacangtanah_produksi5 = (TextView)findViewById(R.id.kacangtanah_produksiNew2);
        kacangtanah_produktifitas5 = (TextView)findViewById(R.id.kacangtanah_produktifitasNew2);

        kacangtanah_tahun6 = (TextView)findViewById(R.id.kacangtanah_tahunNew3);
        kacangtanah_luaspanen6 = (TextView)findViewById(R.id.kacangtanah_luaspanenNew3);
        kacangtanah_produksi6 = (TextView)findViewById(R.id.kacangtanah_produksiNew3);
        kacangtanah_produktifitas6 = (TextView)findViewById(R.id.kacangtanah_produktifitasNew3);

        kacangtanah_tahun7 = (TextView)findViewById(R.id.kacangtanah_tahunNew4);
        kacangtanah_luaspanen7 = (TextView)findViewById(R.id.kacangtanah_luaspanenNew4);
        kacangtanah_produksi7 = (TextView)findViewById(R.id.kacangtanah_produksiNew4);
        kacangtanah_produktifitas7 = (TextView)findViewById(R.id.kacangtanah_produktifitasNew4);

        kacangtanah_tahun8 = (TextView)findViewById(R.id.kacangtanah_tahunNew5);
        kacangtanah_luaspanen8 = (TextView)findViewById(R.id.kacangtanah_luaspanenNew5);
        kacangtanah_produksi8 = (TextView)findViewById(R.id.kacangtanah_produksiNew5);
        kacangtanah_produktifitas8 = (TextView)findViewById(R.id.kacangtanah_produktifitasNew5);



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.kacang);
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
        Intent intent = new Intent(KacangtActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(KacangtActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(KacangtActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }


    public void back(View view) {
        Intent intent = new Intent(KacangtActivity.this, PertanianActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("Kacangtanah_tahun_2020")) {

                String kacangtanah1 = snapshot.getValue(String.class);
                kacangtanah_tahun1.setText(kacangtanah1);
            }

            if (key.equals("Kacangtanah_luaspanen_2020")) {

                String kacangtanah2 = snapshot.getValue(String.class);
                kacangtanah_luaspanen1.setText(kacangtanah2);
            }

            if (key.equals("Kacangtanah_produksi_2020")) {

                String kacangtanah3 = snapshot.getValue(String.class);
                kacangtanah_produksi1.setText(kacangtanah3);
            }

            if (key.equals("Kacangtanah_produktifitas_2020")) {

                String kacangtanah4 = snapshot.getValue(String.class);
                kacangtanah_produktifitas1.setText(kacangtanah4);
            }




            if (key.equals("Kacangtanah_tahun_2019")) {

                String kacangtanah5 = snapshot.getValue(String.class);
                kacangtanah_tahun2.setText(kacangtanah5);
            }

            if (key.equals("Kacangtanah_luaspanen_2019")) {

                String kacangtanah6 = snapshot.getValue(String.class);
                kacangtanah_luaspanen2.setText(kacangtanah6);
            }

            if (key.equals("Kacangtanah_produksi_2019")) {

                String kacangtanah7 = snapshot.getValue(String.class);
                kacangtanah_produksi2.setText(kacangtanah7);
            }

            if (key.equals("Kacangtanah_produktifitas_2019")) {

                String kacangtanah8 = snapshot.getValue(String.class);
                kacangtanah_produktifitas2.setText(kacangtanah8);
            }




            if (key.equals("Kacangtanah_tahun_2018")) {

                String kacangtanah9 = snapshot.getValue(String.class);
                kacangtanah_tahun3.setText(kacangtanah9);
            }

            if (key.equals("Kacangtanah_luaspanen_2018")) {

                String kacangtanah10 = snapshot.getValue(String.class);
                kacangtanah_luaspanen3.setText(kacangtanah10);
            }

            if (key.equals("Kacangtanah_produksi_2018")) {

                String kacangtanah11 = snapshot.getValue(String.class);
                kacangtanah_produksi3.setText(kacangtanah11);
            }

            if (key.equals("Kacangtanah_produktifitas_2018")) {

                String kacangtanah12 = snapshot.getValue(String.class);
                kacangtanah_produktifitas3.setText(kacangtanah12);
            }









            if (key.equals("Kacangtanah_tahun_2021")) {

                String kacangtanah13 = snapshot.getValue(String.class);
                kacangtanah_tahun4.setText(kacangtanah13);
            }

            if (key.equals("Kacangtanah_luaspanen_2021")) {

                String kacangtanah14 = snapshot.getValue(String.class);
                kacangtanah_luaspanen4.setText(kacangtanah14);
            }

            if (key.equals("Kacangtanah_produksi_2021")) {

                String kacangtanah15 = snapshot.getValue(String.class);
                kacangtanah_produksi4.setText(kacangtanah15);
            }

            if (key.equals("Kacangtanah_produktifitas_2021")) {

                String kacangtanah16 = snapshot.getValue(String.class);
                kacangtanah_produktifitas4.setText(kacangtanah16);
            }



            if (key.equals("Kacangtanah_tahun_2022")) {

                String kacangtanah17 = snapshot.getValue(String.class);
                kacangtanah_tahun5.setText(kacangtanah17);
            }

            if (key.equals("Kacangtanah_luaspanen_2022")) {

                String kacangtanah18 = snapshot.getValue(String.class);
                kacangtanah_luaspanen5.setText(kacangtanah18);
            }

            if (key.equals("Kacangtanah_produksi_2022")) {

                String kacangtanah19 = snapshot.getValue(String.class);
                kacangtanah_produksi5.setText(kacangtanah19);
            }

            if (key.equals("Kacangtanah_produktifitas_2022")) {

                String kacangtanah20 = snapshot.getValue(String.class);
                kacangtanah_produktifitas5.setText(kacangtanah20);
            }



            if (key.equals("Kacangtanah_tahun_2023")) {

                String kacangtanah21 = snapshot.getValue(String.class);
                kacangtanah_tahun6.setText(kacangtanah21);
            }

            if (key.equals("Kacangtanah_luaspanen_2023")) {

                String kacangtanah22 = snapshot.getValue(String.class);
                kacangtanah_luaspanen6.setText(kacangtanah22);
            }

            if (key.equals("Kacangtanah_produksi_2023")) {

                String kacangtanah23 = snapshot.getValue(String.class);
                kacangtanah_produksi6.setText(kacangtanah23);
            }

            if (key.equals("Kacangtanah_produktifitas_2023")) {

                String kacangtanah24 = snapshot.getValue(String.class);
                kacangtanah_produktifitas6.setText(kacangtanah24);
            }



            if (key.equals("Kacangtanah_tahun_2024")) {

                String kacangtanah25 = snapshot.getValue(String.class);
                kacangtanah_tahun7.setText(kacangtanah25);
            }

            if (key.equals("Kacangtanah_luaspanen_2024")) {

                String kacangtanah26 = snapshot.getValue(String.class);
                kacangtanah_luaspanen7.setText(kacangtanah26);
            }

            if (key.equals("Kacangtanah_produksi_2024")) {

                String kacangtanah27 = snapshot.getValue(String.class);
                kacangtanah_produksi7.setText(kacangtanah27);
            }

            if (key.equals("Kacangtanah_produktifitas_2024")) {

                String kacangtanah28 = snapshot.getValue(String.class);
                kacangtanah_produktifitas7.setText(kacangtanah28);
            }



            if (key.equals("Kacangtanah_tahun_2025")) {

                String kacangtanah29 = snapshot.getValue(String.class);
                kacangtanah_tahun8.setText(kacangtanah29);
            }

            if (key.equals("Kacangtanah_luaspanen_2025")) {

                String kacangtanah30 = snapshot.getValue(String.class);
                kacangtanah_luaspanen8.setText(kacangtanah30);
            }

            if (key.equals("Kacangtanah_produksi_2025")) {

                String kacangtanah31 = snapshot.getValue(String.class);
                kacangtanah_produksi8.setText(kacangtanah31);
            }

            if (key.equals("Kacangtanah_produktifitas_2025")) {

                String kacangtanah32 = snapshot.getValue(String.class);
                kacangtanah_produktifitas8.setText(kacangtanah32);
            }
        }
        
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        kacangtanahData1.addValueEventListener(this);
        kacangtanahData2.addValueEventListener(this);
        kacangtanahData3.addValueEventListener(this);
        kacangtanahData4.addValueEventListener(this);

        kacangtanahData5.addValueEventListener(this);
        kacangtanahData6.addValueEventListener(this);
        kacangtanahData7.addValueEventListener(this);
        kacangtanahData8.addValueEventListener(this);

        kacangtanahData9.addValueEventListener(this);
        kacangtanahData10.addValueEventListener(this);
        kacangtanahData11.addValueEventListener(this);
        kacangtanahData12.addValueEventListener(this);


        kacangtanahData13.addValueEventListener(this);
        kacangtanahData14.addValueEventListener(this);
        kacangtanahData15.addValueEventListener(this);
        kacangtanahData16.addValueEventListener(this);

        kacangtanahData17.addValueEventListener(this);
        kacangtanahData18.addValueEventListener(this);
        kacangtanahData19.addValueEventListener(this);
        kacangtanahData20.addValueEventListener(this);

        kacangtanahData21.addValueEventListener(this);
        kacangtanahData22.addValueEventListener(this);
        kacangtanahData23.addValueEventListener(this);
        kacangtanahData24.addValueEventListener(this);

        kacangtanahData25.addValueEventListener(this);
        kacangtanahData26.addValueEventListener(this);
        kacangtanahData27.addValueEventListener(this);
        kacangtanahData28.addValueEventListener(this);

        kacangtanahData29.addValueEventListener(this);
        kacangtanahData30.addValueEventListener(this);
        kacangtanahData31.addValueEventListener(this);
        kacangtanahData32.addValueEventListener(this);
    }
    
}