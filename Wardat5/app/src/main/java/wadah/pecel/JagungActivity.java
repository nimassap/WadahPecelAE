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

public class JagungActivity extends AppCompatActivity implements ValueEventListener {

    TextView jagung_tahun1, jagung_tahun2, jagung_tahun3,jagung_tahun4,jagung_tahun5,jagung_tahun6,jagung_tahun7,jagung_tahun8,
            jagung_luaspanen1, jagung_luaspanen2, jagung_luaspanen3,jagung_luaspanen4,jagung_luaspanen5,jagung_luaspanen6,jagung_luaspanen7,jagung_luaspanen8,
            jagung_produksi1, jagung_produksi2, jagung_produksi3,jagung_produksi4,jagung_produksi5,jagung_produksi6,jagung_produksi7,jagung_produksi8,
            jagung_produktifitas1, jagung_produktifitas2, jagung_produktifitas3,jagung_produktifitas4,jagung_produktifitas5,jagung_produktifitas6,jagung_produktifitas7,jagung_produktifitas8;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference jagungData1 = databaseReference.child("Jagung_tahun_2020");
    private DatabaseReference jagungData2 = databaseReference.child("Jagung_luaspanen_2020");
    private DatabaseReference jagungData3 = databaseReference.child("Jagung_produksi_2020");
    private DatabaseReference jagungData4 = databaseReference.child("Jagung_produktifitas_2020");

    private DatabaseReference jagungData5 = databaseReference.child("Jagung_tahun_2019");
    private DatabaseReference jagungData6 = databaseReference.child("Jagung_luaspanen_2019");
    private DatabaseReference jagungData7 = databaseReference.child("Jagung_produksi_2019");
    private DatabaseReference jagungData8 = databaseReference.child("Jagung_produktifitas_2019");

    private DatabaseReference jagungData9 = databaseReference.child("Jagung_tahun_2018");
    private DatabaseReference jagungData10 = databaseReference.child("Jagung_luaspanen_2018");
    private DatabaseReference jagungData11 = databaseReference.child("Jagung_produksi_2018");
    private DatabaseReference jagungData12 = databaseReference.child("Jagung_produktifitas_2018");


    private DatabaseReference jagungData13 = databaseReference.child("Jagung_tahun_2021");
    private DatabaseReference jagungData14 = databaseReference.child("Jagung_luaspanen_2021");
    private DatabaseReference jagungData15 = databaseReference.child("Jagung_produksi_2021");
    private DatabaseReference jagungData16 = databaseReference.child("Jagung_produktifitas_2021");

    private DatabaseReference jagungData17 = databaseReference.child("Jagung_tahun_2022");
    private DatabaseReference jagungData18 = databaseReference.child("Jagung_luaspanen_2022");
    private DatabaseReference jagungData19 = databaseReference.child("Jagung_produksi_2022");
    private DatabaseReference jagungData20 = databaseReference.child("Jagung_produktifitas_2022");

    private DatabaseReference jagungData21 = databaseReference.child("Jagung_tahun_2023");
    private DatabaseReference jagungData22 = databaseReference.child("Jagung_luaspanen_2023");
    private DatabaseReference jagungData23 = databaseReference.child("Jagung_produksi_2023");
    private DatabaseReference jagungData24 = databaseReference.child("Jagung_produktifitas_2023");

    private DatabaseReference jagungData25 = databaseReference.child("Jagung_tahun_2024");
    private DatabaseReference jagungData26 = databaseReference.child("Jagung_luaspanen_2024");
    private DatabaseReference jagungData27 = databaseReference.child("Jagung_produksi_2024");
    private DatabaseReference jagungData28 = databaseReference.child("Jagung_produktifitas_2024");

    private DatabaseReference jagungData29 = databaseReference.child("Jagung_tahun_2025");
    private DatabaseReference jagungData30 = databaseReference.child("Jagung_luaspanen_2025");
    private DatabaseReference jagungData31 = databaseReference.child("Jagung_produksi_2025");
    private DatabaseReference jagungData32 = databaseReference.child("Jagung_produktifitas_2025");



    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jagung);

        jagung_tahun1 = (TextView)findViewById(R.id.jagung_tahun1);
        jagung_luaspanen1 = (TextView)findViewById(R.id.jagung_luaspanen1);
        jagung_produksi1 = (TextView)findViewById(R.id.jagung_produksi1);
        jagung_produktifitas1 = (TextView)findViewById(R.id.jagung_produktifitas1);

        jagung_tahun2 = (TextView)findViewById(R.id.jagung_tahun2);
        jagung_luaspanen2 = (TextView)findViewById(R.id.jagung_luaspanen2);
        jagung_produksi2 = (TextView)findViewById(R.id.jagung_produksi2);
        jagung_produktifitas2 = (TextView)findViewById(R.id.jagung_produktifitas2);

        jagung_tahun3 = (TextView)findViewById(R.id.jagung_tahun3);
        jagung_luaspanen3 = (TextView)findViewById(R.id.jagung_luaspanen3);
        jagung_produksi3 = (TextView)findViewById(R.id.jagung_produksi3);
        jagung_produktifitas3 = (TextView)findViewById(R.id.jagung_produktifitas3);


        jagung_tahun4 = (TextView)findViewById(R.id.jagung_tahunNew1);
        jagung_luaspanen4 = (TextView)findViewById(R.id.jagung_luaspanenNew1);
        jagung_produksi4 = (TextView)findViewById(R.id.jagung_produksiNew1);
        jagung_produktifitas4 = (TextView)findViewById(R.id.jagung_produktifitasNew1);

        jagung_tahun5 = (TextView)findViewById(R.id.jagung_tahunNew2);
        jagung_luaspanen5 = (TextView)findViewById(R.id.jagung_luaspanenNew2);
        jagung_produksi5 = (TextView)findViewById(R.id.jagung_produksiNew2);
        jagung_produktifitas5 = (TextView)findViewById(R.id.jagung_produktifitasNew2);

        jagung_tahun6 = (TextView)findViewById(R.id.jagung_tahunNew3);
        jagung_luaspanen6 = (TextView)findViewById(R.id.jagung_luaspanenNew3);
        jagung_produksi6 = (TextView)findViewById(R.id.jagung_produksiNew3);
        jagung_produktifitas6 = (TextView)findViewById(R.id.jagung_produktifitasNew3);

        jagung_tahun7 = (TextView)findViewById(R.id.jagung_tahunNew4);
        jagung_luaspanen7 = (TextView)findViewById(R.id.jagung_luaspanenNew4);
        jagung_produksi7 = (TextView)findViewById(R.id.jagung_produksiNew4);
        jagung_produktifitas7 = (TextView)findViewById(R.id.jagung_produktifitasNew4);

        jagung_tahun8 = (TextView)findViewById(R.id.jagung_tahunNew5);
        jagung_luaspanen8 = (TextView)findViewById(R.id.jagung_luaspanenNew5);
        jagung_produksi8 = (TextView)findViewById(R.id.jagung_produksiNew5);
        jagung_produktifitas8 = (TextView)findViewById(R.id.jagung_produktifitasNew5);



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.jagung);
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
        Intent intent = new Intent(JagungActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(JagungActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(JagungActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }


    public void back(View view) {
        Intent intent = new Intent(JagungActivity.this, PertanianActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("Jagung_tahun_2020")) {

                String jagung1 = snapshot.getValue(String.class);
                jagung_tahun1.setText(jagung1);
            }

            if (key.equals("Jagung_luaspanen_2020")) {

                String jagung2 = snapshot.getValue(String.class);
                jagung_luaspanen1.setText(jagung2);
            }

            if (key.equals("Jagung_produksi_2020")) {

                String jagung3 = snapshot.getValue(String.class);
                jagung_produksi1.setText(jagung3);
            }

            if (key.equals("Jagung_produktifitas_2020")) {

                String jagung4 = snapshot.getValue(String.class);
                jagung_produktifitas1.setText(jagung4);
            }


            
            
            if (key.equals("Jagung_tahun_2019")) {

                String jagung5 = snapshot.getValue(String.class);
                jagung_tahun2.setText(jagung5);
            }

            if (key.equals("Jagung_luaspanen_2019")) {

                String jagung6 = snapshot.getValue(String.class);
                jagung_luaspanen2.setText(jagung6);
            }

            if (key.equals("Jagung_produksi_2019")) {

                String jagung7 = snapshot.getValue(String.class);
                jagung_produksi2.setText(jagung7);
            }

            if (key.equals("Jagung_produktifitas_2019")) {

                String jagung8 = snapshot.getValue(String.class);
                jagung_produktifitas2.setText(jagung8);
            }
            
            


            if (key.equals("Jagung_tahun_2018")) {

                String jagung9 = snapshot.getValue(String.class);
                jagung_tahun3.setText(jagung9);
            }

            if (key.equals("Jagung_luaspanen_2018")) {

                String jagung10 = snapshot.getValue(String.class);
                jagung_luaspanen3.setText(jagung10);
            }

            if (key.equals("Jagung_produksi_2018")) {

                String jagung11 = snapshot.getValue(String.class);
                jagung_produksi3.setText(jagung11);
            }

            if (key.equals("Jagung_produktifitas_2018")) {

                String jagung12 = snapshot.getValue(String.class);
                jagung_produktifitas3.setText(jagung12);
            }








            if (key.equals("Jagung_tahun_2021")) {

                String jagung13 = snapshot.getValue(String.class);
                jagung_tahun4.setText(jagung13);
            }

            if (key.equals("Jagung_luaspanen_2021")) {

                String jagung14 = snapshot.getValue(String.class);
                jagung_luaspanen4.setText(jagung14);
            }

            if (key.equals("Jagung_produksi_2021")) {

                String jagung15 = snapshot.getValue(String.class);
                jagung_produksi4.setText(jagung15);
            }

            if (key.equals("Jagung_produktifitas_2021")) {

                String jagung16 = snapshot.getValue(String.class);
                jagung_produktifitas4.setText(jagung16);
            }



            if (key.equals("Jagung_tahun_2022")) {

                String jagung17 = snapshot.getValue(String.class);
                jagung_tahun5.setText(jagung17);
            }

            if (key.equals("Jagung_luaspanen_2022")) {

                String jagung18 = snapshot.getValue(String.class);
                jagung_luaspanen5.setText(jagung18);
            }

            if (key.equals("Jagung_produksi_2022")) {

                String jagung19 = snapshot.getValue(String.class);
                jagung_produksi5.setText(jagung19);
            }

            if (key.equals("Jagung_produktifitas_2022")) {

                String jagung20 = snapshot.getValue(String.class);
                jagung_produktifitas5.setText(jagung20);
            }



            if (key.equals("Jagung_tahun_2023")) {

                String jagung21 = snapshot.getValue(String.class);
                jagung_tahun6.setText(jagung21);
            }

            if (key.equals("Jagung_luaspanen_2023")) {

                String jagung22 = snapshot.getValue(String.class);
                jagung_luaspanen6.setText(jagung22);
            }

            if (key.equals("Jagung_produksi_2023")) {

                String jagung23 = snapshot.getValue(String.class);
                jagung_produksi6.setText(jagung23);
            }

            if (key.equals("Jagung_produktifitas_2023")) {

                String jagung24 = snapshot.getValue(String.class);
                jagung_produktifitas6.setText(jagung24);
            }



            if (key.equals("Jagung_tahun_2024")) {

                String jagung25 = snapshot.getValue(String.class);
                jagung_tahun7.setText(jagung25);
            }

            if (key.equals("Jagung_luaspanen_2024")) {

                String jagung26 = snapshot.getValue(String.class);
                jagung_luaspanen7.setText(jagung26);
            }

            if (key.equals("Jagung_produksi_2024")) {

                String jagung27 = snapshot.getValue(String.class);
                jagung_produksi7.setText(jagung27);
            }

            if (key.equals("Jagung_produktifitas_2024")) {

                String jagung28 = snapshot.getValue(String.class);
                jagung_produktifitas7.setText(jagung28);
            }



            if (key.equals("Jagung_tahun_2025")) {

                String jagung29 = snapshot.getValue(String.class);
                jagung_tahun8.setText(jagung29);
            }

            if (key.equals("Jagung_luaspanen_2025")) {

                String jagung30 = snapshot.getValue(String.class);
                jagung_luaspanen8.setText(jagung30);
            }

            if (key.equals("Jagung_produksi_2025")) {

                String jagung31 = snapshot.getValue(String.class);
                jagung_produksi8.setText(jagung31);
            }

            if (key.equals("Jagung_produktifitas_2025")) {

                String jagung32 = snapshot.getValue(String.class);
                jagung_produktifitas8.setText(jagung32);
            }
        }
        
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        jagungData1.addValueEventListener(this);
        jagungData2.addValueEventListener(this);
        jagungData3.addValueEventListener(this);
        jagungData4.addValueEventListener(this);

        jagungData5.addValueEventListener(this);
        jagungData6.addValueEventListener(this);
        jagungData7.addValueEventListener(this);
        jagungData8.addValueEventListener(this);

        jagungData9.addValueEventListener(this);
        jagungData10.addValueEventListener(this);
        jagungData11.addValueEventListener(this);
        jagungData12.addValueEventListener(this);

        jagungData13.addValueEventListener(this);
        jagungData14.addValueEventListener(this);
        jagungData15.addValueEventListener(this);
        jagungData16.addValueEventListener(this);

        jagungData17.addValueEventListener(this);
        jagungData18.addValueEventListener(this);
        jagungData19.addValueEventListener(this);
        jagungData20.addValueEventListener(this);

        jagungData21.addValueEventListener(this);
        jagungData22.addValueEventListener(this);
        jagungData23.addValueEventListener(this);
        jagungData24.addValueEventListener(this);

        jagungData25.addValueEventListener(this);
        jagungData26.addValueEventListener(this);
        jagungData27.addValueEventListener(this);
        jagungData28.addValueEventListener(this);

        jagungData29.addValueEventListener(this);
        jagungData30.addValueEventListener(this);
        jagungData31.addValueEventListener(this);
        jagungData32.addValueEventListener(this);
    }
    
}