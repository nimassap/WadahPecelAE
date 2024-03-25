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

import java.util.HashMap;
import java.util.Map;

public class KetenagakerjaanActivity extends AppCompatActivity implements ValueEventListener{

    TextView ktn_tahun1, ktn_tahun2, ktn_tahun3, ktn_tahun4, ktn_tahun5, ktn_tahun6,ktn_tahun7,ktn_tahun8,
            ktn_jumlahAK1, ktn_jumlahAK2, ktn_jumlahAK3, ktn_jumlahAK4, ktn_jumlahAK5, ktn_jumlahAK6,ktn_jumlahAK7,ktn_jumlahAK8,
            ktn_TPAK1, ktn_TPAK2, ktn_TPAK3, ktn_TPAK4, ktn_TPAK5, ktn_TPAK6,ktn_TPAK7,ktn_TPAK8,
            ktn_pengangguran1, ktn_pengangguran2, ktn_pengangguran3, ktn_pengangguran4, ktn_pengangguran5, ktn_pengangguran6,ktn_pengangguran7,ktn_pengangguran8,
            ktn_TPT1, ktn_TPT2, ktn_TPT3, ktn_TPT4, ktn_TPT5, ktn_TPT6,ktn_TPT7,ktn_TPT8,
            ktn_TKK1, ktn_TKK2, ktn_TKK3, ktn_TKK4, ktn_TKK5, ktn_TKK6,ktn_TKK7,ktn_TKK8;


    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference ketenagakerjaanData1 = databaseReference.child("Ketenagakerjaan_Tahun_2020");
    private DatabaseReference ketenagakerjaanData2 = databaseReference.child("Ketenagakerjaan_JumlahAK_2020");
    private DatabaseReference ketenagakerjaanData3 = databaseReference.child("Ketenagakerjaan_TPAK_2020");
    private DatabaseReference ketenagakerjaanData4 = databaseReference.child("Ketenagakerjaan_Pengangguran_2020");
    private DatabaseReference ketenagakerjaanData5 = databaseReference.child("Ketenagakerjaan_TPT_2020");
    private DatabaseReference ketenagakerjaanData6 = databaseReference.child("Ketenagakerjaan_TKK_2020");

    private DatabaseReference ketenagakerjaanData7 = databaseReference.child("Ketenagakerjaan_Tahun_2019");
    private DatabaseReference ketenagakerjaanData8 = databaseReference.child("Ketenagakerjaan_JumlahAK_2019");
    private DatabaseReference ketenagakerjaanData9 = databaseReference.child("Ketenagakerjaan_TPAK_2019");
    private DatabaseReference ketenagakerjaanData10 = databaseReference.child("Ketenagakerjaan_Pengangguran_2019");
    private DatabaseReference ketenagakerjaanData11 = databaseReference.child("Ketenagakerjaan_TPT_2019");
    private DatabaseReference ketenagakerjaanData12 = databaseReference.child("Ketenagakerjaan_TKK_2019");

    private DatabaseReference ketenagakerjaanData13 = databaseReference.child("Ketenagakerjaan_Tahun_2018");
    private DatabaseReference ketenagakerjaanData14 = databaseReference.child("Ketenagakerjaan_JumlahAK_2018");
    private DatabaseReference ketenagakerjaanData15 = databaseReference.child("Ketenagakerjaan_TPAK_2018");
    private DatabaseReference ketenagakerjaanData16 = databaseReference.child("Ketenagakerjaan_Pengangguran_2018");
    private DatabaseReference ketenagakerjaanData17 = databaseReference.child("Ketenagakerjaan_TPT_2018");
    private DatabaseReference ketenagakerjaanData18 = databaseReference.child("Ketenagakerjaan_TKK_2018");

    private DatabaseReference ketenagakerjaanData19 = databaseReference.child("Ketenagakerjaan_Tahun_2021");
    private DatabaseReference ketenagakerjaanData20 = databaseReference.child("Ketenagakerjaan_JumlahAK_2021");
    private DatabaseReference ketenagakerjaanData21 = databaseReference.child("Ketenagakerjaan_TPAK_2021");
    private DatabaseReference ketenagakerjaanData22 = databaseReference.child("Ketenagakerjaan_Pengangguran_2021");
    private DatabaseReference ketenagakerjaanData23 = databaseReference.child("Ketenagakerjaan_TPT_2021");
    private DatabaseReference ketenagakerjaanData24 = databaseReference.child("Ketenagakerjaan_TKK_2021");

    private DatabaseReference ketenagakerjaanData25 = databaseReference.child("Ketenagakerjaan_Tahun_2022");
    private DatabaseReference ketenagakerjaanData26 = databaseReference.child("Ketenagakerjaan_JumlahAK_2022");
    private DatabaseReference ketenagakerjaanData27 = databaseReference.child("Ketenagakerjaan_TPAK_2022");
    private DatabaseReference ketenagakerjaanData28 = databaseReference.child("Ketenagakerjaan_Pengangguran_2022");
    private DatabaseReference ketenagakerjaanData29 = databaseReference.child("Ketenagakerjaan_TPT_2022");
    private DatabaseReference ketenagakerjaanData30 = databaseReference.child("Ketenagakerjaan_TKK_2022");

    private DatabaseReference ketenagakerjaanData31 = databaseReference.child("Ketenagakerjaan_Tahun_2023");
    private DatabaseReference ketenagakerjaanData32 = databaseReference.child("Ketenagakerjaan_JumlahAK_2023");
    private DatabaseReference ketenagakerjaanData33 = databaseReference.child("Ketenagakerjaan_TPAK_2023");
    private DatabaseReference ketenagakerjaanData34 = databaseReference.child("Ketenagakerjaan_Pengangguran_2023");
    private DatabaseReference ketenagakerjaanData35 = databaseReference.child("Ketenagakerjaan_TPT_2023");
    private DatabaseReference ketenagakerjaanData36 = databaseReference.child("Ketenagakerjaan_TKK_2023");

    private DatabaseReference ketenagakerjaanData37 = databaseReference.child("Ketenagakerjaan_Tahun_2024");
    private DatabaseReference ketenagakerjaanData38 = databaseReference.child("Ketenagakerjaan_JumlahAK_2024");
    private DatabaseReference ketenagakerjaanData39 = databaseReference.child("Ketenagakerjaan_TPAK_2024");
    private DatabaseReference ketenagakerjaanData40 = databaseReference.child("Ketenagakerjaan_Pengangguran_2024");
    private DatabaseReference ketenagakerjaanData41 = databaseReference.child("Ketenagakerjaan_TPT_2024");
    private DatabaseReference ketenagakerjaanData42 = databaseReference.child("Ketenagakerjaan_TKK_2024");

    private DatabaseReference ketenagakerjaanData43 = databaseReference.child("Ketenagakerjaan_Tahun_2025");
    private DatabaseReference ketenagakerjaanData44 = databaseReference.child("Ketenagakerjaan_JumlahAK_2025");
    private DatabaseReference ketenagakerjaanData45 = databaseReference.child("Ketenagakerjaan_TPAK_2025");
    private DatabaseReference ketenagakerjaanData46 = databaseReference.child("Ketenagakerjaan_Pengangguran_2025");
    private DatabaseReference ketenagakerjaanData47 = databaseReference.child("Ketenagakerjaan_TPT_2025");
    private DatabaseReference ketenagakerjaanData48 = databaseReference.child("Ketenagakerjaan_TKK_2025");


    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketenagakerjaan);


        ktn_tahun1 = (TextView)findViewById(R.id.tahun_ktn1);
        ktn_jumlahAK1 = (TextView)findViewById(R.id.jumlahAK_ktn1);
        ktn_TPAK1 = (TextView)findViewById(R.id.TPAK_ktn1);
        ktn_pengangguran1 = (TextView)findViewById(R.id.pengangguran_ktn1);
        ktn_TPT1 = (TextView)findViewById(R.id.TPT_ktn1);
        ktn_TKK1 = (TextView)findViewById(R.id.TKK_ktn1);

        ktn_tahun2 = (TextView)findViewById(R.id.tahun_ktn2);
        ktn_jumlahAK2 = (TextView)findViewById(R.id.jumlahAK_ktn2);
        ktn_TPAK2 = (TextView)findViewById(R.id.TPAK_ktn2);
        ktn_pengangguran2 = (TextView)findViewById(R.id.pengangguran_ktn2);
        ktn_TPT2 = (TextView)findViewById(R.id.TPT_ktn2);
        ktn_TKK2 = (TextView)findViewById(R.id.TKK_ktn2);

        ktn_tahun3 = (TextView)findViewById(R.id.tahun_ktn3);
        ktn_jumlahAK3 = (TextView)findViewById(R.id.jumlahAK_ktn3);
        ktn_TPAK3 = (TextView)findViewById(R.id.TPAK_ktn3);
        ktn_pengangguran3 = (TextView)findViewById(R.id.pengangguran_ktn3);
        ktn_TPT3 = (TextView)findViewById(R.id.TPT_ktn3);
        ktn_TKK3 = (TextView)findViewById(R.id.TKK_ktn3);

        ktn_tahun4 = (TextView)findViewById(R.id.tahun_ktnNew1);
        ktn_jumlahAK4 = (TextView)findViewById(R.id.jumlahAK_ktnNew1);
        ktn_TPAK4 = (TextView)findViewById(R.id.TPAK_ktnNew1);
        ktn_pengangguran4 = (TextView)findViewById(R.id.pengangguran_ktnNew1);
        ktn_TPT4 = (TextView)findViewById(R.id.TPT_ktnNew1);
        ktn_TKK4 = (TextView)findViewById(R.id.TKK_ktnNew1);

        ktn_tahun5 = (TextView)findViewById(R.id.tahun_ktnNew2);
        ktn_jumlahAK5 = (TextView)findViewById(R.id.jumlahAK_ktnNew2);
        ktn_TPAK5 = (TextView)findViewById(R.id.TPAK_ktnNew2);
        ktn_pengangguran5 = (TextView)findViewById(R.id.pengangguran_ktnNew2);
        ktn_TPT5 = (TextView)findViewById(R.id.TPT_ktnNew2);
        ktn_TKK5 = (TextView)findViewById(R.id.TKK_ktnNew2);

        ktn_tahun6 = (TextView)findViewById(R.id.tahun_ktnNew3);
        ktn_jumlahAK6 = (TextView)findViewById(R.id.jumlahAK_ktnNew3);
        ktn_TPAK6 = (TextView)findViewById(R.id.TPAK_ktnNew3);
        ktn_pengangguran6 = (TextView)findViewById(R.id.pengangguran_ktnNew3);
        ktn_TPT6 = (TextView)findViewById(R.id.TPT_ktnNew3);
        ktn_TKK6 = (TextView)findViewById(R.id.TKK_ktnNew3);

        ktn_tahun7 = (TextView)findViewById(R.id.tahun_ktnNew4);
        ktn_jumlahAK7 = (TextView)findViewById(R.id.jumlahAK_ktnNew4);
        ktn_TPAK7 = (TextView)findViewById(R.id.TPAK_ktnNew4);
        ktn_pengangguran7 = (TextView)findViewById(R.id.pengangguran_ktnNew4);
        ktn_TPT7 = (TextView)findViewById(R.id.TPT_ktnNew4);
        ktn_TKK7 = (TextView)findViewById(R.id.TKK_ktnNew4);

        ktn_tahun8 = (TextView)findViewById(R.id.tahun_ktnNew5);
        ktn_jumlahAK8 = (TextView)findViewById(R.id.jumlahAK_ktnNew5);
        ktn_TPAK8 = (TextView)findViewById(R.id.TPAK_ktnNew5);
        ktn_pengangguran8 = (TextView)findViewById(R.id.pengangguran_ktnNew5);
        ktn_TPT8 = (TextView)findViewById(R.id.TPT_ktnNew5);
        ktn_TKK8 = (TextView)findViewById(R.id.TKK_ktnNew5);




        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.ketenagakerjaan);
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
        Intent intent = new Intent(KetenagakerjaanActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(KetenagakerjaanActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(KetenagakerjaanActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }



    public void back(View view) {
        Intent intent = new Intent(KetenagakerjaanActivity.this, SosialActivity.class);
        startActivity(intent);
    }


    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("Ketenagakerjaan_Tahun_2020")) {

                String ketenagakerjaan1 = snapshot.getValue(String.class);
                ktn_tahun1.setText(ketenagakerjaan1);
            }

            if (key.equals("Ketenagakerjaan_JumlahAK_2020")) {

                String ketenagakerjaan2 = snapshot.getValue(String.class);
                ktn_jumlahAK1.setText(ketenagakerjaan2);
            }

            if (key.equals("Ketenagakerjaan_TPAK_2020")) {

                String ketenagakerjaan3 = snapshot.getValue(String.class);
                ktn_TPAK1.setText(ketenagakerjaan3);
            }

            if (key.equals("Ketenagakerjaan_Pengangguran_2020")) {

                String ketenagakerjaan4 = snapshot.getValue(String.class);
                ktn_pengangguran1.setText(ketenagakerjaan4);
            }

            if (key.equals("Ketenagakerjaan_TPT_2020")) {

                String ketenagakerjaan5 = snapshot.getValue(String.class);
                ktn_TPT1.setText(ketenagakerjaan5);
            }

            if (key.equals("Ketenagakerjaan_TKK_2020")) {

                String ketenagakerjaan6 = snapshot.getValue(String.class);
                ktn_TKK1.setText(ketenagakerjaan6);
            }



            if (key.equals("Ketenagakerjaan_Tahun_2019")) {

                String ketenagakerjaan7 = snapshot.getValue(String.class);
                ktn_tahun2.setText(ketenagakerjaan7);
            }

            if (key.equals("Ketenagakerjaan_JumlahAK_2019")) {

                String ketenagakerjaan8 = snapshot.getValue(String.class);
                ktn_jumlahAK2.setText(ketenagakerjaan8);
            }

            if (key.equals("Ketenagakerjaan_TPAK_2019")) {

                String ketenagakerjaan9 = snapshot.getValue(String.class);
                ktn_TPAK2.setText(ketenagakerjaan9);
            }

            if (key.equals("Ketenagakerjaan_Pengangguran_2019")) {

                String ketenagakerjaan10 = snapshot.getValue(String.class);
                ktn_pengangguran2.setText(ketenagakerjaan10);
            }

            if (key.equals("Ketenagakerjaan_TPT_2019")) {

                String ketenagakerjaan11 = snapshot.getValue(String.class);
                ktn_TPT2.setText(ketenagakerjaan11);
            }

            if (key.equals("Ketenagakerjaan_TKK_2019")) {

                String ketenagakerjaan12 = snapshot.getValue(String.class);
                ktn_TKK2.setText(ketenagakerjaan12);
            }



            if (key.equals("Ketenagakerjaan_Tahun_2018")) {

                String ketenagakerjaan13 = snapshot.getValue(String.class);
                ktn_tahun3.setText(ketenagakerjaan13);
            }

            if (key.equals("Ketenagakerjaan_JumlahAK_2018")) {

                String ketenagakerjaan14 = snapshot.getValue(String.class);
                ktn_jumlahAK3.setText(ketenagakerjaan14);
            }

            if (key.equals("Ketenagakerjaan_TPAK_2018")) {

                String ketenagakerjaan15 = snapshot.getValue(String.class);
                ktn_TPAK3.setText(ketenagakerjaan15);
            }

            if (key.equals("Ketenagakerjaan_Pengangguran_2018")) {

                String ketenagakerjaan16 = snapshot.getValue(String.class);
                ktn_pengangguran3.setText(ketenagakerjaan16);
            }

            if (key.equals("Ketenagakerjaan_TPT_2018")) {

                String ketenagakerjaan17 = snapshot.getValue(String.class);
                ktn_TPT3.setText(ketenagakerjaan17);
            }

            if (key.equals("Ketenagakerjaan_TKK_2018")) {

                String ketenagakerjaan18 = snapshot.getValue(String.class);
                ktn_TKK3.setText(ketenagakerjaan18);
            }




            if (key.equals("Ketenagakerjaan_Tahun_2021")) {

                String ketenagakerjaan19 = snapshot.getValue(String.class);
                ktn_tahun4.setText(ketenagakerjaan19);
            }

            if (key.equals("Ketenagakerjaan_JumlahAK_2021")) {

                String ketenagakerjaan20 = snapshot.getValue(String.class);
                ktn_jumlahAK4.setText(ketenagakerjaan20);
            }

            if (key.equals("Ketenagakerjaan_TPAK_2021")) {

                String ketenagakerjaan21 = snapshot.getValue(String.class);
                ktn_TPAK4.setText(ketenagakerjaan21);
            }

            if (key.equals("Ketenagakerjaan_Pengangguran_2021")) {

                String ketenagakerjaan22 = snapshot.getValue(String.class);
                ktn_pengangguran4.setText(ketenagakerjaan22);
            }

            if (key.equals("Ketenagakerjaan_TPT_2021")) {

                String ketenagakerjaan23 = snapshot.getValue(String.class);
                ktn_TPT4.setText(ketenagakerjaan23);
            }

            if (key.equals("Ketenagakerjaan_TKK_2021")) {

                String ketenagakerjaan24 = snapshot.getValue(String.class);
                ktn_TKK4.setText(ketenagakerjaan24);
            }




            if (key.equals("Ketenagakerjaan_Tahun_2022")) {

                String ketenagakerjaan25 = snapshot.getValue(String.class);
                ktn_tahun5.setText(ketenagakerjaan25);
            }

            if (key.equals("Ketenagakerjaan_JumlahAK_2022")) {

                String ketenagakerjaan26 = snapshot.getValue(String.class);
                ktn_jumlahAK5.setText(ketenagakerjaan26);
            }

            if (key.equals("Ketenagakerjaan_TPAK_2022")) {

                String ketenagakerjaan27 = snapshot.getValue(String.class);
                ktn_TPAK5.setText(ketenagakerjaan27);
            }

            if (key.equals("Ketenagakerjaan_Pengangguran_2022")) {

                String ketenagakerjaan28 = snapshot.getValue(String.class);
                ktn_pengangguran5.setText(ketenagakerjaan28);
            }

            if (key.equals("Ketenagakerjaan_TPT_2022")) {

                String ketenagakerjaan29 = snapshot.getValue(String.class);
                ktn_TPT5.setText(ketenagakerjaan29);
            }

            if (key.equals("Ketenagakerjaan_TKK_2022")) {

                String ketenagakerjaan30 = snapshot.getValue(String.class);
                ktn_TKK5.setText(ketenagakerjaan30);
            }




            if (key.equals("Ketenagakerjaan_Tahun_2023")) {

                String ketenagakerjaan31 = snapshot.getValue(String.class);
                ktn_tahun6.setText(ketenagakerjaan31);
            }

            if (key.equals("Ketenagakerjaan_JumlahAK_2023")) {

                String ketenagakerjaan32 = snapshot.getValue(String.class);
                ktn_jumlahAK6.setText(ketenagakerjaan32);
            }

            if (key.equals("Ketenagakerjaan_TPAK_2023")) {

                String ketenagakerjaan33 = snapshot.getValue(String.class);
                ktn_TPAK6.setText(ketenagakerjaan33);
            }

            if (key.equals("Ketenagakerjaan_Pengangguran_2023")) {

                String ketenagakerjaan34 = snapshot.getValue(String.class);
                ktn_pengangguran6.setText(ketenagakerjaan34);
            }

            if (key.equals("Ketenagakerjaan_TPT_2023")) {

                String ketenagakerjaan35 = snapshot.getValue(String.class);
                ktn_TPT6.setText(ketenagakerjaan35);
            }

            if (key.equals("Ketenagakerjaan_TKK_2023")) {

                String ketenagakerjaan36 = snapshot.getValue(String.class);
                ktn_TKK6.setText(ketenagakerjaan36);
            }




            if (key.equals("Ketenagakerjaan_Tahun_2024")) {

                String ketenagakerjaan37 = snapshot.getValue(String.class);
                ktn_tahun7.setText(ketenagakerjaan37);
            }

            if (key.equals("Ketenagakerjaan_JumlahAK_2024")) {

                String ketenagakerjaan38 = snapshot.getValue(String.class);
                ktn_jumlahAK7.setText(ketenagakerjaan38);
            }

            if (key.equals("Ketenagakerjaan_TPAK_2024")) {

                String ketenagakerjaan39 = snapshot.getValue(String.class);
                ktn_TPAK7.setText(ketenagakerjaan39);
            }

            if (key.equals("Ketenagakerjaan_Pengangguran_2024")) {

                String ketenagakerjaan40 = snapshot.getValue(String.class);
                ktn_pengangguran7.setText(ketenagakerjaan40);
            }

            if (key.equals("Ketenagakerjaan_TPT_2024")) {

                String ketenagakerjaan41 = snapshot.getValue(String.class);
                ktn_TPT7.setText(ketenagakerjaan41);
            }

            if (key.equals("Ketenagakerjaan_TKK_2024")) {

                String ketenagakerjaan42 = snapshot.getValue(String.class);
                ktn_TKK7.setText(ketenagakerjaan42);
            }




            if (key.equals("Ketenagakerjaan_Tahun_2025")) {

                String ketenagakerjaan43 = snapshot.getValue(String.class);
                ktn_tahun8.setText(ketenagakerjaan43);
            }

            if (key.equals("Ketenagakerjaan_JumlahAK_2025")) {

                String ketenagakerjaan44 = snapshot.getValue(String.class);
                ktn_jumlahAK8.setText(ketenagakerjaan44);
            }

            if (key.equals("Ketenagakerjaan_TPAK_2025")) {

                String ketenagakerjaan45 = snapshot.getValue(String.class);
                ktn_TPAK8.setText(ketenagakerjaan45);
            }

            if (key.equals("Ketenagakerjaan_Pengangguran_2025")) {

                String ketenagakerjaan46 = snapshot.getValue(String.class);
                ktn_pengangguran8.setText(ketenagakerjaan46);
            }

            if (key.equals("Ketenagakerjaan_TPT_2025")) {

                String ketenagakerjaan47 = snapshot.getValue(String.class);
                ktn_TPT8.setText(ketenagakerjaan47);
            }

            if (key.equals("Ketenagakerjaan_TKK_2025")) {

                String ketenagakerjaan48 = snapshot.getValue(String.class);
                ktn_TKK8.setText(ketenagakerjaan48);
            }
        }
    }



    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        ketenagakerjaanData1.addValueEventListener(this);
        ketenagakerjaanData2.addValueEventListener(this);
        ketenagakerjaanData3.addValueEventListener(this);
        ketenagakerjaanData4.addValueEventListener(this);
        ketenagakerjaanData5.addValueEventListener(this);
        ketenagakerjaanData6.addValueEventListener(this);

        ketenagakerjaanData7.addValueEventListener(this);
        ketenagakerjaanData8.addValueEventListener(this);
        ketenagakerjaanData9.addValueEventListener(this);
        ketenagakerjaanData10.addValueEventListener(this);
        ketenagakerjaanData11.addValueEventListener(this);
        ketenagakerjaanData12.addValueEventListener(this);

        ketenagakerjaanData13.addValueEventListener(this);
        ketenagakerjaanData14.addValueEventListener(this);
        ketenagakerjaanData15.addValueEventListener(this);
        ketenagakerjaanData16.addValueEventListener(this);
        ketenagakerjaanData17.addValueEventListener(this);
        ketenagakerjaanData18.addValueEventListener(this);

        ketenagakerjaanData19.addValueEventListener(this);
        ketenagakerjaanData20.addValueEventListener(this);
        ketenagakerjaanData21.addValueEventListener(this);
        ketenagakerjaanData22.addValueEventListener(this);
        ketenagakerjaanData23.addValueEventListener(this);
        ketenagakerjaanData24.addValueEventListener(this);

        ketenagakerjaanData25.addValueEventListener(this);
        ketenagakerjaanData26.addValueEventListener(this);
        ketenagakerjaanData27.addValueEventListener(this);
        ketenagakerjaanData28.addValueEventListener(this);
        ketenagakerjaanData29.addValueEventListener(this);
        ketenagakerjaanData30.addValueEventListener(this);

        ketenagakerjaanData31.addValueEventListener(this);
        ketenagakerjaanData32.addValueEventListener(this);
        ketenagakerjaanData33.addValueEventListener(this);
        ketenagakerjaanData34.addValueEventListener(this);
        ketenagakerjaanData35.addValueEventListener(this);
        ketenagakerjaanData36.addValueEventListener(this);

        ketenagakerjaanData37.addValueEventListener(this);
        ketenagakerjaanData38.addValueEventListener(this);
        ketenagakerjaanData39.addValueEventListener(this);
        ketenagakerjaanData40.addValueEventListener(this);
        ketenagakerjaanData41.addValueEventListener(this);
        ketenagakerjaanData42.addValueEventListener(this);

        ketenagakerjaanData43.addValueEventListener(this);
        ketenagakerjaanData44.addValueEventListener(this);
        ketenagakerjaanData45.addValueEventListener(this);
        ketenagakerjaanData46.addValueEventListener(this);
        ketenagakerjaanData47.addValueEventListener(this);
        ketenagakerjaanData48.addValueEventListener(this);
    }

}