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

public class UbikActivity extends AppCompatActivity implements ValueEventListener {

    TextView ubikayu_tahun1, ubikayu_tahun2, ubikayu_tahun3,ubikayu_tahun4,ubikayu_tahun5,ubikayu_tahun6,ubikayu_tahun7,ubikayu_tahun8,
            ubikayu_luaspanen1, ubikayu_luaspanen2, ubikayu_luaspanen3,ubikayu_luaspanen4,ubikayu_luaspanen5,ubikayu_luaspanen6,ubikayu_luaspanen7,ubikayu_luaspanen8,
            ubikayu_produksi1, ubikayu_produksi2, ubikayu_produksi3,ubikayu_produksi4,ubikayu_produksi5,ubikayu_produksi6,ubikayu_produksi7,ubikayu_produksi8,
            ubikayu_produktifitas1, ubikayu_produktifitas2, ubikayu_produktifitas3,ubikayu_produktifitas4,ubikayu_produktifitas5,ubikayu_produktifitas6,ubikayu_produktifitas7,ubikayu_produktifitas8;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference ubikayuData1 = databaseReference.child("Ubikayu_tahun_2020");
    private DatabaseReference ubikayuData2 = databaseReference.child("Ubikayu_luaspanen_2020");
    private DatabaseReference ubikayuData3 = databaseReference.child("Ubikayu_produksi_2020");
    private DatabaseReference ubikayuData4 = databaseReference.child("Ubikayu_produktifitas_2020");

    private DatabaseReference ubikayuData5 = databaseReference.child("Ubikayu_tahun_2019");
    private DatabaseReference ubikayuData6 = databaseReference.child("Ubikayu_luaspanen_2019");
    private DatabaseReference ubikayuData7 = databaseReference.child("Ubikayu_produksi_2019");
    private DatabaseReference ubikayuData8 = databaseReference.child("Ubikayu_produktifitas_2019");

    private DatabaseReference ubikayuData9 = databaseReference.child("Ubikayu_tahun_2018");
    private DatabaseReference ubikayuData10 = databaseReference.child("Ubikayu_luaspanen_2018");
    private DatabaseReference ubikayuData11 = databaseReference.child("Ubikayu_produksi_2018");
    private DatabaseReference ubikayuData12 = databaseReference.child("Ubikayu_produktifitas_2018");


    private DatabaseReference ubikayuData13 = databaseReference.child("Ubikayu_tahun_2021");
    private DatabaseReference ubikayuData14 = databaseReference.child("Ubikayu_luaspanen_2021");
    private DatabaseReference ubikayuData15 = databaseReference.child("Ubikayu_produksi_2021");
    private DatabaseReference ubikayuData16 = databaseReference.child("Ubikayu_produktifitas_2021");

    private DatabaseReference ubikayuData17 = databaseReference.child("Ubikayu_tahun_2022");
    private DatabaseReference ubikayuData18 = databaseReference.child("Ubikayu_luaspanen_2022");
    private DatabaseReference ubikayuData19 = databaseReference.child("Ubikayu_produksi_2022");
    private DatabaseReference ubikayuData20 = databaseReference.child("Ubikayu_produktifitas_2022");

    private DatabaseReference ubikayuData21 = databaseReference.child("Ubikayu_tahun_2023");
    private DatabaseReference ubikayuData22 = databaseReference.child("Ubikayu_luaspanen_2023");
    private DatabaseReference ubikayuData23 = databaseReference.child("Ubikayu_produksi_2023");
    private DatabaseReference ubikayuData24 = databaseReference.child("Ubikayu_produktifitas_2023");

    private DatabaseReference ubikayuData25 = databaseReference.child("Ubikayu_tahun_2024");
    private DatabaseReference ubikayuData26 = databaseReference.child("Ubikayu_luaspanen_2024");
    private DatabaseReference ubikayuData27 = databaseReference.child("Ubikayu_produksi_2024");
    private DatabaseReference ubikayuData28 = databaseReference.child("Ubikayu_produktifitas_2024");

    private DatabaseReference ubikayuData29 = databaseReference.child("Ubikayu_tahun_2025");
    private DatabaseReference ubikayuData30 = databaseReference.child("Ubikayu_luaspanen_2025");
    private DatabaseReference ubikayuData31 = databaseReference.child("Ubikayu_produksi_2025");
    private DatabaseReference ubikayuData32 = databaseReference.child("Ubikayu_produktifitas_2025");
    
    


    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubik);

        ubikayu_tahun1 = (TextView)findViewById(R.id.ubikayu_tahun1);
        ubikayu_luaspanen1 = (TextView)findViewById(R.id.ubikayu_luaspanen1);
        ubikayu_produksi1 = (TextView)findViewById(R.id.ubikayu_produksi1);
        ubikayu_produktifitas1 = (TextView)findViewById(R.id.ubikayu_produktifitas1);

        ubikayu_tahun2 = (TextView)findViewById(R.id.ubikayu_tahun2);
        ubikayu_luaspanen2 = (TextView)findViewById(R.id.ubikayu_luaspanen2);
        ubikayu_produksi2 = (TextView)findViewById(R.id.ubikayu_produksi2);
        ubikayu_produktifitas2 = (TextView)findViewById(R.id.ubikayu_produktifitas2);

        ubikayu_tahun3 = (TextView)findViewById(R.id.ubikayu_tahun3);
        ubikayu_luaspanen3 = (TextView)findViewById(R.id.ubikayu_luaspanen3);
        ubikayu_produksi3 = (TextView)findViewById(R.id.ubikayu_produksi3);
        ubikayu_produktifitas3 = (TextView)findViewById(R.id.ubikayu_produktifitas3);


        ubikayu_tahun4 = (TextView)findViewById(R.id.ubikayu_tahunNew1);
        ubikayu_luaspanen4 = (TextView)findViewById(R.id.ubikayu_luaspanenNew1);
        ubikayu_produksi4 = (TextView)findViewById(R.id.ubikayu_produksiNew1);
        ubikayu_produktifitas4 = (TextView)findViewById(R.id.ubikayu_produktifitasNew1);

        ubikayu_tahun5 = (TextView)findViewById(R.id.ubikayu_tahunNew2);
        ubikayu_luaspanen5 = (TextView)findViewById(R.id.ubikayu_luaspanenNew2);
        ubikayu_produksi5 = (TextView)findViewById(R.id.ubikayu_produksiNew2);
        ubikayu_produktifitas5 = (TextView)findViewById(R.id.ubikayu_produktifitasNew2);

        ubikayu_tahun6 = (TextView)findViewById(R.id.ubikayu_tahunNew3);
        ubikayu_luaspanen6 = (TextView)findViewById(R.id.ubikayu_luaspanenNew3);
        ubikayu_produksi6 = (TextView)findViewById(R.id.ubikayu_produksiNew3);
        ubikayu_produktifitas6 = (TextView)findViewById(R.id.ubikayu_produktifitasNew3);

        ubikayu_tahun7 = (TextView)findViewById(R.id.ubikayu_tahunNew4);
        ubikayu_luaspanen7 = (TextView)findViewById(R.id.ubikayu_luaspanenNew4);
        ubikayu_produksi7 = (TextView)findViewById(R.id.ubikayu_produksiNew4);
        ubikayu_produktifitas7 = (TextView)findViewById(R.id.ubikayu_produktifitasNew4);

        ubikayu_tahun8 = (TextView)findViewById(R.id.ubikayu_tahunNew5);
        ubikayu_luaspanen8 = (TextView)findViewById(R.id.ubikayu_luaspanenNew5);
        ubikayu_produksi8 = (TextView)findViewById(R.id.ubikayu_produksiNew5);
        ubikayu_produktifitas8 = (TextView)findViewById(R.id.ubikayu_produktifitasNew5);



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.ubik);
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
        Intent intent = new Intent(UbikActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(UbikActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(UbikActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }


    public void back(View view) {
        Intent intent = new Intent(UbikActivity.this, PertanianActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("Ubikayu_tahun_2020")) {

                String ubikayu1 = snapshot.getValue(String.class);
                ubikayu_tahun1.setText(ubikayu1);
            }

            if (key.equals("Ubikayu_luaspanen_2020")) {

                String ubikayu2 = snapshot.getValue(String.class);
                ubikayu_luaspanen1.setText(ubikayu2);
            }

            if (key.equals("Ubikayu_produksi_2020")) {

                String ubikayu3 = snapshot.getValue(String.class);
                ubikayu_produksi1.setText(ubikayu3);
            }

            if (key.equals("Ubikayu_produktifitas_2020")) {

                String ubikayu4 = snapshot.getValue(String.class);
                ubikayu_produktifitas1.setText(ubikayu4);
            }




            if (key.equals("Ubikayu_tahun_2019")) {

                String ubikayu5 = snapshot.getValue(String.class);
                ubikayu_tahun2.setText(ubikayu5);
            }

            if (key.equals("Ubikayu_luaspanen_2019")) {

                String ubikayu6 = snapshot.getValue(String.class);
                ubikayu_luaspanen2.setText(ubikayu6);
            }

            if (key.equals("Ubikayu_produksi_2019")) {

                String ubikayu7 = snapshot.getValue(String.class);
                ubikayu_produksi2.setText(ubikayu7);
            }

            if (key.equals("Ubikayu_produktifitas_2019")) {

                String ubikayu8 = snapshot.getValue(String.class);
                ubikayu_produktifitas2.setText(ubikayu8);
            }




            if (key.equals("Ubikayu_tahun_2018")) {

                String ubikayu9 = snapshot.getValue(String.class);
                ubikayu_tahun3.setText(ubikayu9);
            }

            if (key.equals("Ubikayu_luaspanen_2018")) {

                String ubikayu10 = snapshot.getValue(String.class);
                ubikayu_luaspanen3.setText(ubikayu10);
            }

            if (key.equals("Ubikayu_produksi_2018")) {

                String ubikayu11 = snapshot.getValue(String.class);
                ubikayu_produksi3.setText(ubikayu11);
            }

            if (key.equals("Ubikayu_produktifitas_2018")) {

                String ubikayu12 = snapshot.getValue(String.class);
                ubikayu_produktifitas3.setText(ubikayu12);
            }








            if (key.equals("Ubikayu_tahun_2021")) {

                String ubikayu13 = snapshot.getValue(String.class);
                ubikayu_tahun4.setText(ubikayu13);
            }

            if (key.equals("Ubikayu_luaspanen_2021")) {

                String ubikayu14 = snapshot.getValue(String.class);
                ubikayu_luaspanen4.setText(ubikayu14);
            }

            if (key.equals("Ubikayu_produksi_2021")) {

                String ubikayu15 = snapshot.getValue(String.class);
                ubikayu_produksi4.setText(ubikayu15);
            }

            if (key.equals("Ubikayu_produktifitas_2021")) {

                String ubikayu16 = snapshot.getValue(String.class);
                ubikayu_produktifitas4.setText(ubikayu16);
            }



            if (key.equals("Ubikayu_tahun_2022")) {

                String ubikayu17 = snapshot.getValue(String.class);
                ubikayu_tahun5.setText(ubikayu17);
            }

            if (key.equals("Ubikayu_luaspanen_2022")) {

                String ubikayu18 = snapshot.getValue(String.class);
                ubikayu_luaspanen5.setText(ubikayu18);
            }

            if (key.equals("Ubikayu_produksi_2022")) {

                String ubikayu19 = snapshot.getValue(String.class);
                ubikayu_produksi5.setText(ubikayu19);
            }

            if (key.equals("Ubikayu_produktifitas_2022")) {

                String ubikayu20 = snapshot.getValue(String.class);
                ubikayu_produktifitas5.setText(ubikayu20);
            }



            if (key.equals("Ubikayu_tahun_2023")) {

                String ubikayu21 = snapshot.getValue(String.class);
                ubikayu_tahun6.setText(ubikayu21);
            }

            if (key.equals("Ubikayu_luaspanen_2023")) {

                String ubikayu22 = snapshot.getValue(String.class);
                ubikayu_luaspanen6.setText(ubikayu22);
            }

            if (key.equals("Ubikayu_produksi_2023")) {

                String ubikayu23 = snapshot.getValue(String.class);
                ubikayu_produksi6.setText(ubikayu23);
            }

            if (key.equals("Ubikayu_produktifitas_2023")) {

                String ubikayu24 = snapshot.getValue(String.class);
                ubikayu_produktifitas6.setText(ubikayu24);
            }



            if (key.equals("Ubikayu_tahun_2024")) {

                String ubikayu25 = snapshot.getValue(String.class);
                ubikayu_tahun7.setText(ubikayu25);
            }

            if (key.equals("Ubikayu_luaspanen_2024")) {

                String ubikayu26 = snapshot.getValue(String.class);
                ubikayu_luaspanen7.setText(ubikayu26);
            }

            if (key.equals("Ubikayu_produksi_2024")) {

                String ubikayu27 = snapshot.getValue(String.class);
                ubikayu_produksi7.setText(ubikayu27);
            }

            if (key.equals("Ubikayu_produktifitas_2024")) {

                String ubikayu28 = snapshot.getValue(String.class);
                ubikayu_produktifitas7.setText(ubikayu28);
            }



            if (key.equals("Ubikayu_tahun_2025")) {

                String ubikayu29 = snapshot.getValue(String.class);
                ubikayu_tahun8.setText(ubikayu29);
            }

            if (key.equals("Ubikayu_luaspanen_2025")) {

                String ubikayu30 = snapshot.getValue(String.class);
                ubikayu_luaspanen8.setText(ubikayu30);
            }

            if (key.equals("Ubikayu_produksi_2025")) {

                String ubikayu31 = snapshot.getValue(String.class);
                ubikayu_produksi8.setText(ubikayu31);
            }

            if (key.equals("Ubikayu_produktifitas_2025")) {

                String ubikayu32 = snapshot.getValue(String.class);
                ubikayu_produktifitas8.setText(ubikayu32);
            }
        }
        
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        ubikayuData1.addValueEventListener(this);
        ubikayuData2.addValueEventListener(this);
        ubikayuData3.addValueEventListener(this);
        ubikayuData4.addValueEventListener(this);

        ubikayuData5.addValueEventListener(this);
        ubikayuData6.addValueEventListener(this);
        ubikayuData7.addValueEventListener(this);
        ubikayuData8.addValueEventListener(this);

        ubikayuData9.addValueEventListener(this);
        ubikayuData10.addValueEventListener(this);
        ubikayuData11.addValueEventListener(this);
        ubikayuData12.addValueEventListener(this);


        ubikayuData13.addValueEventListener(this);
        ubikayuData14.addValueEventListener(this);
        ubikayuData15.addValueEventListener(this);
        ubikayuData16.addValueEventListener(this);

        ubikayuData17.addValueEventListener(this);
        ubikayuData18.addValueEventListener(this);
        ubikayuData19.addValueEventListener(this);
        ubikayuData20.addValueEventListener(this);

        ubikayuData21.addValueEventListener(this);
        ubikayuData22.addValueEventListener(this);
        ubikayuData23.addValueEventListener(this);
        ubikayuData24.addValueEventListener(this);

        ubikayuData25.addValueEventListener(this);
        ubikayuData26.addValueEventListener(this);
        ubikayuData27.addValueEventListener(this);
        ubikayuData28.addValueEventListener(this);

        ubikayuData29.addValueEventListener(this);
        ubikayuData30.addValueEventListener(this);
        ubikayuData31.addValueEventListener(this);
        ubikayuData32.addValueEventListener(this);
    }
    
}