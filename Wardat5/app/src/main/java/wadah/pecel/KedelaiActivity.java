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

public class KedelaiActivity extends AppCompatActivity implements ValueEventListener {

    TextView kedelai_tahun1, kedelai_tahun2, kedelai_tahun3,kedelai_tahun4,kedelai_tahun5,kedelai_tahun6,kedelai_tahun7,kedelai_tahun8,
            kedelai_luaspanen1, kedelai_luaspanen2, kedelai_luaspanen3,kedelai_luaspanen4,kedelai_luaspanen5,kedelai_luaspanen6,kedelai_luaspanen7,kedelai_luaspanen8,
            kedelai_produksi1, kedelai_produksi2, kedelai_produksi3,kedelai_produksi4,kedelai_produksi5,kedelai_produksi6,kedelai_produksi7,kedelai_produksi8,
            kedelai_produktifitas1, kedelai_produktifitas2, kedelai_produktifitas3,kedelai_produktifitas4,kedelai_produktifitas5,kedelai_produktifitas6,kedelai_produktifitas7,kedelai_produktifitas8;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference kedelaiData1 = databaseReference.child("Kedelai_tahun_2020");
    private DatabaseReference kedelaiData2 = databaseReference.child("Kedelai_luaspanen_2020");
    private DatabaseReference kedelaiData3 = databaseReference.child("Kedelai_produksi_2020");
    private DatabaseReference kedelaiData4 = databaseReference.child("Kedelai_produktifitas_2020");

    private DatabaseReference kedelaiData5 = databaseReference.child("Kedelai_tahun_2019");
    private DatabaseReference kedelaiData6 = databaseReference.child("Kedelai_luaspanen_2019");
    private DatabaseReference kedelaiData7 = databaseReference.child("Kedelai_produksi_2019");
    private DatabaseReference kedelaiData8 = databaseReference.child("Kedelai_produktifitas_2019");

    private DatabaseReference kedelaiData9 = databaseReference.child("Kedelai_tahun_2018");
    private DatabaseReference kedelaiData10 = databaseReference.child("Kedelai_luaspanen_2018");
    private DatabaseReference kedelaiData11 = databaseReference.child("Kedelai_produksi_2018");
    private DatabaseReference kedelaiData12 = databaseReference.child("Kedelai_produktifitas_2018");


    private DatabaseReference kedelaiData13 = databaseReference.child("Kedelai_tahun_2021");
    private DatabaseReference kedelaiData14 = databaseReference.child("Kedelai_luaspanen_2021");
    private DatabaseReference kedelaiData15 = databaseReference.child("Kedelai_produksi_2021");
    private DatabaseReference kedelaiData16 = databaseReference.child("Kedelai_produktifitas_2021");

    private DatabaseReference kedelaiData17 = databaseReference.child("Kedelai_tahun_2022");
    private DatabaseReference kedelaiData18 = databaseReference.child("Kedelai_luaspanen_2022");
    private DatabaseReference kedelaiData19 = databaseReference.child("Kedelai_produksi_2022");
    private DatabaseReference kedelaiData20 = databaseReference.child("Kedelai_produktifitas_2022");

    private DatabaseReference kedelaiData21 = databaseReference.child("Kedelai_tahun_2023");
    private DatabaseReference kedelaiData22 = databaseReference.child("Kedelai_luaspanen_2023");
    private DatabaseReference kedelaiData23 = databaseReference.child("Kedelai_produksi_2023");
    private DatabaseReference kedelaiData24 = databaseReference.child("Kedelai_produktifitas_2023");

    private DatabaseReference kedelaiData25 = databaseReference.child("Kedelai_tahun_2024");
    private DatabaseReference kedelaiData26 = databaseReference.child("Kedelai_luaspanen_2024");
    private DatabaseReference kedelaiData27 = databaseReference.child("Kedelai_produksi_2024");
    private DatabaseReference kedelaiData28 = databaseReference.child("Kedelai_produktifitas_2024");

    private DatabaseReference kedelaiData29 = databaseReference.child("Kedelai_tahun_2025");
    private DatabaseReference kedelaiData30 = databaseReference.child("Kedelai_luaspanen_2025");
    private DatabaseReference kedelaiData31 = databaseReference.child("Kedelai_produksi_2025");
    private DatabaseReference kedelaiData32 = databaseReference.child("Kedelai_produktifitas_2025");
    

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedelai);

        kedelai_tahun1 = (TextView)findViewById(R.id.kedelai_tahun1);
        kedelai_luaspanen1 = (TextView)findViewById(R.id.kedelai_luaspanen1);
        kedelai_produksi1 = (TextView)findViewById(R.id.kedelai_produksi1);
        kedelai_produktifitas1 = (TextView)findViewById(R.id.kedelai_produktifitas1);

        kedelai_tahun2 = (TextView)findViewById(R.id.kedelai_tahun2);
        kedelai_luaspanen2 = (TextView)findViewById(R.id.kedelai_luaspanen2);
        kedelai_produksi2 = (TextView)findViewById(R.id.kedelai_produksi2);
        kedelai_produktifitas2 = (TextView)findViewById(R.id.kedelai_produktifitas2);

        kedelai_tahun3 = (TextView)findViewById(R.id.kedelai_tahun3);
        kedelai_luaspanen3 = (TextView)findViewById(R.id.kedelai_luaspanen3);
        kedelai_produksi3 = (TextView)findViewById(R.id.kedelai_produksi3);
        kedelai_produktifitas3 = (TextView)findViewById(R.id.kedelai_produktifitas3);


        kedelai_tahun4 = (TextView)findViewById(R.id.kedelai_tahunNew1);
        kedelai_luaspanen4 = (TextView)findViewById(R.id.kedelai_luaspanenNew1);
        kedelai_produksi4 = (TextView)findViewById(R.id.kedelai_produksiNew1);
        kedelai_produktifitas4 = (TextView)findViewById(R.id.kedelai_produktifitasNew1);

        kedelai_tahun5 = (TextView)findViewById(R.id.kedelai_tahunNew2);
        kedelai_luaspanen5 = (TextView)findViewById(R.id.kedelai_luaspanenNew2);
        kedelai_produksi5 = (TextView)findViewById(R.id.kedelai_produksiNew2);
        kedelai_produktifitas5 = (TextView)findViewById(R.id.kedelai_produktifitasNew2);

        kedelai_tahun6 = (TextView)findViewById(R.id.kedelai_tahunNew3);
        kedelai_luaspanen6 = (TextView)findViewById(R.id.kedelai_luaspanenNew3);
        kedelai_produksi6 = (TextView)findViewById(R.id.kedelai_produksiNew3);
        kedelai_produktifitas6 = (TextView)findViewById(R.id.kedelai_produktifitasNew3);

        kedelai_tahun7 = (TextView)findViewById(R.id.kedelai_tahunNew4);
        kedelai_luaspanen7 = (TextView)findViewById(R.id.kedelai_luaspanenNew4);
        kedelai_produksi7 = (TextView)findViewById(R.id.kedelai_produksiNew4);
        kedelai_produktifitas7 = (TextView)findViewById(R.id.kedelai_produktifitasNew4);

        kedelai_tahun8 = (TextView)findViewById(R.id.kedelai_tahunNew5);
        kedelai_luaspanen8 = (TextView)findViewById(R.id.kedelai_luaspanenNew5);
        kedelai_produksi8 = (TextView)findViewById(R.id.kedelai_produksiNew5);
        kedelai_produktifitas8 = (TextView)findViewById(R.id.kedelai_produktifitasNew5);




        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.kedelai);
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
        Intent intent = new Intent(KedelaiActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(KedelaiActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(KedelaiActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }


    public void back(View view) {
        Intent intent = new Intent(KedelaiActivity.this, PertanianActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("Kedelai_tahun_2020")) {

                String kedelai1 = snapshot.getValue(String.class);
                kedelai_tahun1.setText(kedelai1);
            }

            if (key.equals("Kedelai_luaspanen_2020")) {

                String kedelai2 = snapshot.getValue(String.class);
                kedelai_luaspanen1.setText(kedelai2);
            }

            if (key.equals("Kedelai_produksi_2020")) {

                String kedelai3 = snapshot.getValue(String.class);
                kedelai_produksi1.setText(kedelai3);
            }

            if (key.equals("Kedelai_produktifitas_2020")) {

                String kedelai4 = snapshot.getValue(String.class);
                kedelai_produktifitas1.setText(kedelai4);
            }




            if (key.equals("Kedelai_tahun_2019")) {

                String kedelai5 = snapshot.getValue(String.class);
                kedelai_tahun2.setText(kedelai5);
            }

            if (key.equals("Kedelai_luaspanen_2019")) {

                String kedelai6 = snapshot.getValue(String.class);
                kedelai_luaspanen2.setText(kedelai6);
            }

            if (key.equals("Kedelai_produksi_2019")) {

                String kedelai7 = snapshot.getValue(String.class);
                kedelai_produksi2.setText(kedelai7);
            }

            if (key.equals("Kedelai_produktifitas_2019")) {

                String kedelai8 = snapshot.getValue(String.class);
                kedelai_produktifitas2.setText(kedelai8);
            }




            if (key.equals("Kedelai_tahun_2018")) {

                String kedelai9 = snapshot.getValue(String.class);
                kedelai_tahun3.setText(kedelai9);
            }

            if (key.equals("Kedelai_luaspanen_2018")) {

                String kedelai10 = snapshot.getValue(String.class);
                kedelai_luaspanen3.setText(kedelai10);
            }

            if (key.equals("Kedelai_produksi_2018")) {

                String kedelai11 = snapshot.getValue(String.class);
                kedelai_produksi3.setText(kedelai11);
            }

            if (key.equals("Kedelai_produktifitas_2018")) {

                String kedelai12 = snapshot.getValue(String.class);
                kedelai_produktifitas3.setText(kedelai12);
            }








            if (key.equals("Kedelai_tahun_2021")) {

                String kedelai13 = snapshot.getValue(String.class);
                kedelai_tahun4.setText(kedelai13);
            }

            if (key.equals("Kedelai_luaspanen_2021")) {

                String kedelai14 = snapshot.getValue(String.class);
                kedelai_luaspanen4.setText(kedelai14);
            }

            if (key.equals("Kedelai_produksi_2021")) {

                String kedelai15 = snapshot.getValue(String.class);
                kedelai_produksi4.setText(kedelai15);
            }

            if (key.equals("Kedelai_produktifitas_2021")) {

                String kedelai16 = snapshot.getValue(String.class);
                kedelai_produktifitas4.setText(kedelai16);
            }



            if (key.equals("Kedelai_tahun_2022")) {

                String kedelai17 = snapshot.getValue(String.class);
                kedelai_tahun5.setText(kedelai17);
            }

            if (key.equals("Kedelai_luaspanen_2022")) {

                String kedelai18 = snapshot.getValue(String.class);
                kedelai_luaspanen5.setText(kedelai18);
            }

            if (key.equals("Kedelai_produksi_2022")) {

                String kedelai19 = snapshot.getValue(String.class);
                kedelai_produksi5.setText(kedelai19);
            }

            if (key.equals("Kedelai_produktifitas_2022")) {

                String kedelai20 = snapshot.getValue(String.class);
                kedelai_produktifitas5.setText(kedelai20);
            }



            if (key.equals("Kedelai_tahun_2023")) {

                String kedelai21 = snapshot.getValue(String.class);
                kedelai_tahun6.setText(kedelai21);
            }

            if (key.equals("Kedelai_luaspanen_2023")) {

                String kedelai22 = snapshot.getValue(String.class);
                kedelai_luaspanen6.setText(kedelai22);
            }

            if (key.equals("Kedelai_produksi_2023")) {

                String kedelai23 = snapshot.getValue(String.class);
                kedelai_produksi6.setText(kedelai23);
            }

            if (key.equals("Kedelai_produktifitas_2023")) {

                String kedelai24 = snapshot.getValue(String.class);
                kedelai_produktifitas6.setText(kedelai24);
            }



            if (key.equals("Kedelai_tahun_2024")) {

                String kedelai25 = snapshot.getValue(String.class);
                kedelai_tahun7.setText(kedelai25);
            }

            if (key.equals("Kedelai_luaspanen_2024")) {

                String kedelai26 = snapshot.getValue(String.class);
                kedelai_luaspanen7.setText(kedelai26);
            }

            if (key.equals("Kedelai_produksi_2024")) {

                String kedelai27 = snapshot.getValue(String.class);
                kedelai_produksi7.setText(kedelai27);
            }

            if (key.equals("Kedelai_produktifitas_2024")) {

                String kedelai28 = snapshot.getValue(String.class);
                kedelai_produktifitas7.setText(kedelai28);
            }



            if (key.equals("Kedelai_tahun_2025")) {

                String kedelai29 = snapshot.getValue(String.class);
                kedelai_tahun8.setText(kedelai29);
            }

            if (key.equals("Kedelai_luaspanen_2025")) {

                String kedelai30 = snapshot.getValue(String.class);
                kedelai_luaspanen8.setText(kedelai30);
            }

            if (key.equals("Kedelai_produksi_2025")) {

                String kedelai31 = snapshot.getValue(String.class);
                kedelai_produksi8.setText(kedelai31);
            }

            if (key.equals("Kedelai_produktifitas_2025")) {

                String kedelai32 = snapshot.getValue(String.class);
                kedelai_produktifitas8.setText(kedelai32);
            }
        }
        
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        kedelaiData1.addValueEventListener(this);
        kedelaiData2.addValueEventListener(this);
        kedelaiData3.addValueEventListener(this);
        kedelaiData4.addValueEventListener(this);

        kedelaiData5.addValueEventListener(this);
        kedelaiData6.addValueEventListener(this);
        kedelaiData7.addValueEventListener(this);
        kedelaiData8.addValueEventListener(this);

        kedelaiData9.addValueEventListener(this);
        kedelaiData10.addValueEventListener(this);
        kedelaiData11.addValueEventListener(this);
        kedelaiData12.addValueEventListener(this);


        kedelaiData13.addValueEventListener(this);
        kedelaiData14.addValueEventListener(this);
        kedelaiData15.addValueEventListener(this);
        kedelaiData16.addValueEventListener(this);

        kedelaiData17.addValueEventListener(this);
        kedelaiData18.addValueEventListener(this);
        kedelaiData19.addValueEventListener(this);
        kedelaiData20.addValueEventListener(this);

        kedelaiData21.addValueEventListener(this);
        kedelaiData22.addValueEventListener(this);
        kedelaiData23.addValueEventListener(this);
        kedelaiData24.addValueEventListener(this);

        kedelaiData25.addValueEventListener(this);
        kedelaiData26.addValueEventListener(this);
        kedelaiData27.addValueEventListener(this);
        kedelaiData28.addValueEventListener(this);

        kedelaiData29.addValueEventListener(this);
        kedelaiData30.addValueEventListener(this);
        kedelaiData31.addValueEventListener(this);
        kedelaiData32.addValueEventListener(this);
    }
    
}