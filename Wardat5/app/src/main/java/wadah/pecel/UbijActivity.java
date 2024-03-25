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

public class UbijActivity extends AppCompatActivity implements ValueEventListener {

    TextView ubijalar_tahun1, ubijalar_tahun2, ubijalar_tahun3,ubijalar_tahun4,ubijalar_tahun5,ubijalar_tahun6,ubijalar_tahun7,ubijalar_tahun8,
            ubijalar_luaspanen1, ubijalar_luaspanen2, ubijalar_luaspanen3,ubijalar_luaspanen4,ubijalar_luaspanen5,ubijalar_luaspanen6,ubijalar_luaspanen7,ubijalar_luaspanen8,
            ubijalar_produksi1, ubijalar_produksi2, ubijalar_produksi3,ubijalar_produksi4,ubijalar_produksi5,ubijalar_produksi6,ubijalar_produksi7,ubijalar_produksi8,
            ubijalar_produktifitas1, ubijalar_produktifitas2, ubijalar_produktifitas3,ubijalar_produktifitas4,ubijalar_produktifitas5,ubijalar_produktifitas6,ubijalar_produktifitas7,ubijalar_produktifitas8;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference ubijalarData1 = databaseReference.child("Ubijalar_tahun_2019");
    private DatabaseReference ubijalarData2 = databaseReference.child("Ubijalar_luaspanen_2019");
    private DatabaseReference ubijalarData3 = databaseReference.child("Ubijalar_produksi_2019");
    private DatabaseReference ubijalarData4 = databaseReference.child("Ubijalar_produktifitas_2019");

    private DatabaseReference ubijalarData5 = databaseReference.child("Ubijalar_tahun_2018");
    private DatabaseReference ubijalarData6 = databaseReference.child("Ubijalar_luaspanen_2018");
    private DatabaseReference ubijalarData7 = databaseReference.child("Ubijalar_produksi_2018");
    private DatabaseReference ubijalarData8 = databaseReference.child("Ubijalar_produktifitas_2018");


    private DatabaseReference ubijalarData9 = databaseReference.child("Ubijalar_tahun_2020");
    private DatabaseReference ubijalarData10 = databaseReference.child("Ubijalar_luaspanen_2020");
    private DatabaseReference ubijalarData11 = databaseReference.child("Ubijalar_produksi_2020");
    private DatabaseReference ubijalarData12 = databaseReference.child("Ubijalar_produktifitas_2020");

    private DatabaseReference ubijalarData13 = databaseReference.child("Ubijalar_tahun_2021");
    private DatabaseReference ubijalarData14 = databaseReference.child("Ubijalar_luaspanen_2021");
    private DatabaseReference ubijalarData15 = databaseReference.child("Ubijalar_produksi_2021");
    private DatabaseReference ubijalarData16 = databaseReference.child("Ubijalar_produktifitas_2021");

    private DatabaseReference ubijalarData17 = databaseReference.child("Ubijalar_tahun_2022");
    private DatabaseReference ubijalarData18 = databaseReference.child("Ubijalar_luaspanen_2022");
    private DatabaseReference ubijalarData19 = databaseReference.child("Ubijalar_produksi_2022");
    private DatabaseReference ubijalarData20 = databaseReference.child("Ubijalar_produktifitas_2022");

    private DatabaseReference ubijalarData21 = databaseReference.child("Ubijalar_tahun_2023");
    private DatabaseReference ubijalarData22 = databaseReference.child("Ubijalar_luaspanen_2023");
    private DatabaseReference ubijalarData23 = databaseReference.child("Ubijalar_produksi_2023");
    private DatabaseReference ubijalarData24 = databaseReference.child("Ubijalar_produktifitas_2023");

    private DatabaseReference ubijalarData25 = databaseReference.child("Ubijalar_tahun_2024");
    private DatabaseReference ubijalarData26 = databaseReference.child("Ubijalar_luaspanen_2024");
    private DatabaseReference ubijalarData27 = databaseReference.child("Ubijalar_produksi_2024");
    private DatabaseReference ubijalarData28 = databaseReference.child("Ubijalar_produktifitas_2024");

    private DatabaseReference ubijalarData29 = databaseReference.child("Ubijalar_tahun_2025");
    private DatabaseReference ubijalarData30 = databaseReference.child("Ubijalar_luaspanen_2025");
    private DatabaseReference ubijalarData31 = databaseReference.child("Ubijalar_produksi_2025");
    private DatabaseReference ubijalarData32 = databaseReference.child("Ubijalar_produktifitas_2025");

    
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubij);

        ubijalar_tahun1 = (TextView)findViewById(R.id.ubijalar_tahun1);
        ubijalar_luaspanen1 = (TextView)findViewById(R.id.ubijalar_luaspanen1);
        ubijalar_produksi1 = (TextView)findViewById(R.id.ubijalar_produksi1);
        ubijalar_produktifitas1 = (TextView)findViewById(R.id.ubijalar_produktifitas1);

        ubijalar_tahun2 = (TextView)findViewById(R.id.ubijalar_tahun2);
        ubijalar_luaspanen2 = (TextView)findViewById(R.id.ubijalar_luaspanen2);
        ubijalar_produksi2 = (TextView)findViewById(R.id.ubijalar_produksi2);
        ubijalar_produktifitas2 = (TextView)findViewById(R.id.ubijalar_produktifitas2);


        ubijalar_tahun3 = (TextView)findViewById(R.id.ubijalar_tahunNew1);
        ubijalar_luaspanen3 = (TextView)findViewById(R.id.ubijalar_luaspanenNew1);
        ubijalar_produksi3 = (TextView)findViewById(R.id.ubijalar_produksiNew1);
        ubijalar_produktifitas3 = (TextView)findViewById(R.id.ubijalar_produktifitasNew1);

        ubijalar_tahun4 = (TextView)findViewById(R.id.ubijalar_tahunNew2);
        ubijalar_luaspanen4 = (TextView)findViewById(R.id.ubijalar_luaspanenNew2);
        ubijalar_produksi4 = (TextView)findViewById(R.id.ubijalar_produksiNew2);
        ubijalar_produktifitas4 = (TextView)findViewById(R.id.ubijalar_produktifitasNew2);

        ubijalar_tahun5 = (TextView)findViewById(R.id.ubijalar_tahunNew3);
        ubijalar_luaspanen5 = (TextView)findViewById(R.id.ubijalar_luaspanenNew3);
        ubijalar_produksi5 = (TextView)findViewById(R.id.ubijalar_produksiNew3);
        ubijalar_produktifitas5 = (TextView)findViewById(R.id.ubijalar_produktifitasNew3);

        ubijalar_tahun6 = (TextView)findViewById(R.id.ubijalar_tahunNew4);
        ubijalar_luaspanen6 = (TextView)findViewById(R.id.ubijalar_luaspanenNew4);
        ubijalar_produksi6 = (TextView)findViewById(R.id.ubijalar_produksiNew4);
        ubijalar_produktifitas6 = (TextView)findViewById(R.id.ubijalar_produktifitasNew4);

        ubijalar_tahun7 = (TextView)findViewById(R.id.ubijalar_tahunNew5);
        ubijalar_luaspanen7 = (TextView)findViewById(R.id.ubijalar_luaspanenNew5);
        ubijalar_produksi7 = (TextView)findViewById(R.id.ubijalar_produksiNew5);
        ubijalar_produktifitas7 = (TextView)findViewById(R.id.ubijalar_produktifitasNew5);

        ubijalar_tahun8 = (TextView)findViewById(R.id.ubijalar_tahunNew6);
        ubijalar_luaspanen8 = (TextView)findViewById(R.id.ubijalar_luaspanenNew6);
        ubijalar_produksi8 = (TextView)findViewById(R.id.ubijalar_produksiNew6);
        ubijalar_produktifitas8 = (TextView)findViewById(R.id.ubijalar_produktifitasNew6);
        

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.ubij);
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
        Intent intent = new Intent(UbijActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(UbijActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(UbijActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }


    public void back(View view) {
        Intent intent = new Intent(UbijActivity.this, PertanianActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("Ubijalar_tahun_2019")) {

                String ubijalar1 = snapshot.getValue(String.class);
                ubijalar_tahun1.setText(ubijalar1);
            }

            if (key.equals("Ubijalar_luaspanen_2019")) {

                String ubijalar2 = snapshot.getValue(String.class);
                ubijalar_luaspanen1.setText(ubijalar2);
            }

            if (key.equals("Ubijalar_produksi_2019")) {

                String ubijalar3 = snapshot.getValue(String.class);
                ubijalar_produksi1.setText(ubijalar3);
            }

            if (key.equals("Ubijalar_produktifitas_2019")) {

                String ubijalar4 = snapshot.getValue(String.class);
                ubijalar_produktifitas1.setText(ubijalar4);
            }


            if (key.equals("Ubijalar_tahun_2018")) {

                String ubijalar5 = snapshot.getValue(String.class);
                ubijalar_tahun2.setText(ubijalar5);
            }

            if (key.equals("Ubijalar_luaspanen_2018")) {

                String ubijalar6 = snapshot.getValue(String.class);
                ubijalar_luaspanen2.setText(ubijalar6);
            }

            if (key.equals("Ubijalar_produksi_2018")) {

                String ubijalar7 = snapshot.getValue(String.class);
                ubijalar_produksi2.setText(ubijalar7);
            }

            if (key.equals("Ubijalar_produktifitas_2018")) {

                String ubijalar8 = snapshot.getValue(String.class);
                ubijalar_produktifitas2.setText(ubijalar8);
            }








            if (key.equals("Ubijalar_tahun_2020")) {

                String ubijalar9 = snapshot.getValue(String.class);
                ubijalar_tahun3.setText(ubijalar9);
            }

            if (key.equals("Ubijalar_luaspanen_2020")) {

                String ubijalar10 = snapshot.getValue(String.class);
                ubijalar_luaspanen3.setText(ubijalar10);
            }

            if (key.equals("Ubijalar_produksi_2020")) {

                String ubijalar11 = snapshot.getValue(String.class);
                ubijalar_produksi3.setText(ubijalar11);
            }

            if (key.equals("Ubijalar_produktifitas_2020")) {

                String ubijalar12 = snapshot.getValue(String.class);
                ubijalar_produktifitas3.setText(ubijalar12);
            }



            if (key.equals("Ubijalar_tahun_2021")) {

                String ubijalar13 = snapshot.getValue(String.class);
                ubijalar_tahun4.setText(ubijalar13);
            }

            if (key.equals("Ubijalar_luaspanen_2021")) {

                String ubijalar14 = snapshot.getValue(String.class);
                ubijalar_luaspanen4.setText(ubijalar14);
            }

            if (key.equals("Ubijalar_produksi_2021")) {

                String ubijalar15 = snapshot.getValue(String.class);
                ubijalar_produksi4.setText(ubijalar15);
            }

            if (key.equals("Ubijalar_produktifitas_2021")) {

                String ubijalar16 = snapshot.getValue(String.class);
                ubijalar_produktifitas4.setText(ubijalar16);
            }



            if (key.equals("Ubijalar_tahun_2022")) {

                String ubijalar17 = snapshot.getValue(String.class);
                ubijalar_tahun5.setText(ubijalar17);
            }

            if (key.equals("Ubijalar_luaspanen_2022")) {

                String ubijalar18 = snapshot.getValue(String.class);
                ubijalar_luaspanen5.setText(ubijalar18);
            }

            if (key.equals("Ubijalar_produksi_2022")) {

                String ubijalar19 = snapshot.getValue(String.class);
                ubijalar_produksi5.setText(ubijalar19);
            }

            if (key.equals("Ubijalar_produktifitas_2022")) {

                String ubijalar20 = snapshot.getValue(String.class);
                ubijalar_produktifitas5.setText(ubijalar20);
            }



            if (key.equals("Ubijalar_tahun_2023")) {

                String ubijalar21 = snapshot.getValue(String.class);
                ubijalar_tahun6.setText(ubijalar21);
            }

            if (key.equals("Ubijalar_luaspanen_2023")) {

                String ubijalar22 = snapshot.getValue(String.class);
                ubijalar_luaspanen6.setText(ubijalar22);
            }

            if (key.equals("Ubijalar_produksi_2023")) {

                String ubijalar23 = snapshot.getValue(String.class);
                ubijalar_produksi6.setText(ubijalar23);
            }

            if (key.equals("Ubijalar_produktifitas_2023")) {

                String ubijalar24 = snapshot.getValue(String.class);
                ubijalar_produktifitas6.setText(ubijalar24);
            }



            if (key.equals("Ubijalar_tahun_2024")) {

                String ubijalar25 = snapshot.getValue(String.class);
                ubijalar_tahun7.setText(ubijalar25);
            }

            if (key.equals("Ubijalar_luaspanen_2024")) {

                String ubijalar26 = snapshot.getValue(String.class);
                ubijalar_luaspanen7.setText(ubijalar26);
            }

            if (key.equals("Ubijalar_produksi_2024")) {

                String ubijalar27 = snapshot.getValue(String.class);
                ubijalar_produksi7.setText(ubijalar27);
            }

            if (key.equals("Ubijalar_produktifitas_2024")) {

                String ubijalar28 = snapshot.getValue(String.class);
                ubijalar_produktifitas7.setText(ubijalar28);
            }



            if (key.equals("Ubijalar_tahun_2025")) {

                String ubijalar29 = snapshot.getValue(String.class);
                ubijalar_tahun8.setText(ubijalar29);
            }

            if (key.equals("Ubijalar_luaspanen_2025")) {

                String ubijalar30 = snapshot.getValue(String.class);
                ubijalar_luaspanen8.setText(ubijalar30);
            }

            if (key.equals("Ubijalar_produksi_2025")) {

                String ubijalar31 = snapshot.getValue(String.class);
                ubijalar_produksi8.setText(ubijalar31);
            }

            if (key.equals("Ubijalar_produktifitas_2025")) {

                String ubijalar32 = snapshot.getValue(String.class);
                ubijalar_produktifitas8.setText(ubijalar32);
            }
        }
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        ubijalarData1.addValueEventListener(this);
        ubijalarData2.addValueEventListener(this);
        ubijalarData3.addValueEventListener(this);
        ubijalarData4.addValueEventListener(this);

        ubijalarData5.addValueEventListener(this);
        ubijalarData6.addValueEventListener(this);
        ubijalarData7.addValueEventListener(this);
        ubijalarData8.addValueEventListener(this);

        ubijalarData9.addValueEventListener(this);
        ubijalarData10.addValueEventListener(this);
        ubijalarData11.addValueEventListener(this);
        ubijalarData12.addValueEventListener(this);

        ubijalarData13.addValueEventListener(this);
        ubijalarData14.addValueEventListener(this);
        ubijalarData15.addValueEventListener(this);
        ubijalarData16.addValueEventListener(this);

        ubijalarData17.addValueEventListener(this);
        ubijalarData18.addValueEventListener(this);
        ubijalarData19.addValueEventListener(this);
        ubijalarData20.addValueEventListener(this);

        ubijalarData21.addValueEventListener(this);
        ubijalarData22.addValueEventListener(this);
        ubijalarData23.addValueEventListener(this);
        ubijalarData24.addValueEventListener(this);

        ubijalarData25.addValueEventListener(this);
        ubijalarData26.addValueEventListener(this);
        ubijalarData27.addValueEventListener(this);
        ubijalarData28.addValueEventListener(this);

        ubijalarData29.addValueEventListener(this);
        ubijalarData30.addValueEventListener(this);
        ubijalarData31.addValueEventListener(this);
        ubijalarData32.addValueEventListener(this);
    }
}