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

public class GiniActivity extends AppCompatActivity implements ValueEventListener {

    //untuk connect ke firebase
    //tidak perlu diubah
    //apabila ingin mengubah data bisa langsung ke firebase

    TextView gini_tahun1, gini_tahun2, gini_tahun3,gini_tahun4,gini_tahun5,gini_tahun6,gini_tahun7,gini_tahun8,
            gini_rasio1, gini_rasio2, gini_rasio3, gini_rasio4,gini_rasio5,gini_rasio6,gini_rasio7,gini_rasio8,
            gini_RSE1, gini_RSE2, gini_RSE3,gini_RSE4,gini_RSE5,gini_RSE6,gini_RSE7,gini_RSE8,
            gini_IndeksL1, gini_IndeksL2, gini_IndeksL3,gini_IndeksL4,gini_IndeksL5,gini_IndeksL6,gini_IndeksL7,gini_IndeksL8,
            gini_IndeksT1, gini_IndeksT2, gini_IndeksT3,gini_IndeksT4,gini_IndeksT5,gini_IndeksT6,gini_IndeksT7,gini_IndeksT8,
            gini_terendah1, gini_terendah2, gini_terendah3,gini_terendah4,gini_terendah5,gini_terendah6,gini_terendah7,gini_terendah8,
            gini_menengah1, gini_menengah2, gini_menengah3,gini_menengah4,gini_menengah5,gini_menengah6,gini_menengah7,gini_menengah8,
            gini_teratas1, gini_teratas2, gini_teratas3,gini_teratas4,gini_teratas5,gini_teratas6,gini_teratas7,gini_teratas8;


    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference giniData1 = databaseReference.child("Gini_Tahun_2020");
    private DatabaseReference giniData2 = databaseReference.child("Gini_Rasio_2020");
    private DatabaseReference giniData3 = databaseReference.child("Gini_RSE_2020");
    private DatabaseReference giniData4 = databaseReference.child("Gini_IndeksL_2020");
    private DatabaseReference giniData5 = databaseReference.child("Gini_IndeksTheil_2020");
    private DatabaseReference giniData6 = databaseReference.child("Gini_PersentaseTerendah_2020");
    private DatabaseReference giniData7 = databaseReference.child("Gini_PersentaseMenengah_2020");
    private DatabaseReference giniData8 = databaseReference.child("Gini_PersentaseTeratas_2020");
    
    private DatabaseReference giniData9 = databaseReference.child("Gini_Tahun_2019");
    private DatabaseReference giniData10 = databaseReference.child("Gini_Rasio_2019");
    private DatabaseReference giniData11 = databaseReference.child("Gini_RSE_2019");
    private DatabaseReference giniData12 = databaseReference.child("Gini_IndeksL_2019");
    private DatabaseReference giniData13 = databaseReference.child("Gini_IndeksTheil_2019");
    private DatabaseReference giniData14 = databaseReference.child("Gini_PersentaseTerendah_2019");
    private DatabaseReference giniData15 = databaseReference.child("Gini_PersentaseMenengah_2019");
    private DatabaseReference giniData16 = databaseReference.child("Gini_PersentaseTeratas_2019");
    
    private DatabaseReference giniData17 = databaseReference.child("Gini_Tahun_2018");
    private DatabaseReference giniData18 = databaseReference.child("Gini_Rasio_2018");;
    private DatabaseReference giniData19 = databaseReference.child("Gini_RSE_2018");
    private DatabaseReference giniData20 = databaseReference.child("Gini_IndeksL_2018");
    private DatabaseReference giniData21 = databaseReference.child("Gini_IndeksTheil_2018");
    private DatabaseReference giniData22 = databaseReference.child("Gini_PersentaseTerendah_2018");
    private DatabaseReference giniData23 = databaseReference.child("Gini_PersentaseMenengah_2018");
    private DatabaseReference giniData24 = databaseReference.child("Gini_PersentaseTeratas_2018");


    private DatabaseReference giniData25 = databaseReference.child("Gini_Tahun_2021");
    private DatabaseReference giniData26 = databaseReference.child("Gini_Rasio_2021");;
    private DatabaseReference giniData27 = databaseReference.child("Gini_RSE_2021");
    private DatabaseReference giniData28 = databaseReference.child("Gini_IndeksL_2021");
    private DatabaseReference giniData29 = databaseReference.child("Gini_IndeksTheil_2021");
    private DatabaseReference giniData30 = databaseReference.child("Gini_PersentaseTerendah_2021");
    private DatabaseReference giniData31 = databaseReference.child("Gini_PersentaseMenengah_2021");
    private DatabaseReference giniData32 = databaseReference.child("Gini_PersentaseTeratas_2021");

    private DatabaseReference giniData33 = databaseReference.child("Gini_Tahun_2022");
    private DatabaseReference giniData34 = databaseReference.child("Gini_Rasio_2022");;
    private DatabaseReference giniData35 = databaseReference.child("Gini_RSE_2022");
    private DatabaseReference giniData36 = databaseReference.child("Gini_IndeksL_2022");
    private DatabaseReference giniData37 = databaseReference.child("Gini_IndeksTheil_2022");
    private DatabaseReference giniData38 = databaseReference.child("Gini_PersentaseTerendah_2022");
    private DatabaseReference giniData39 = databaseReference.child("Gini_PersentaseMenengah_2022");
    private DatabaseReference giniData40 = databaseReference.child("Gini_PersentaseTeratas_2022");

    private DatabaseReference giniData41 = databaseReference.child("Gini_Tahun_2023");
    private DatabaseReference giniData42 = databaseReference.child("Gini_Rasio_2023");;
    private DatabaseReference giniData43 = databaseReference.child("Gini_RSE_2023");
    private DatabaseReference giniData44 = databaseReference.child("Gini_IndeksL_2023");
    private DatabaseReference giniData45 = databaseReference.child("Gini_IndeksTheil_2023");
    private DatabaseReference giniData46 = databaseReference.child("Gini_PersentaseTerendah_2023");
    private DatabaseReference giniData47 = databaseReference.child("Gini_PersentaseMenengah_2023");
    private DatabaseReference giniData48 = databaseReference.child("Gini_PersentaseTeratas_2023");

    private DatabaseReference giniData49 = databaseReference.child("Gini_Tahun_2024");
    private DatabaseReference giniData50 = databaseReference.child("Gini_Rasio_2024");;
    private DatabaseReference giniData51 = databaseReference.child("Gini_RSE_2024");
    private DatabaseReference giniData52 = databaseReference.child("Gini_IndeksL_2024");
    private DatabaseReference giniData53 = databaseReference.child("Gini_IndeksTheil_2024");
    private DatabaseReference giniData54 = databaseReference.child("Gini_PersentaseTerendah_2024");
    private DatabaseReference giniData55 = databaseReference.child("Gini_PersentaseMenengah_2024");
    private DatabaseReference giniData56 = databaseReference.child("Gini_PersentaseTeratas_2024");

    private DatabaseReference giniData57 = databaseReference.child("Gini_Tahun_2025");
    private DatabaseReference giniData58 = databaseReference.child("Gini_Rasio_2025");;
    private DatabaseReference giniData59 = databaseReference.child("Gini_RSE_2025");
    private DatabaseReference giniData60 = databaseReference.child("Gini_IndeksL_2025");
    private DatabaseReference giniData61 = databaseReference.child("Gini_IndeksTheil_2025");
    private DatabaseReference giniData62 = databaseReference.child("Gini_PersentaseTerendah_2025");
    private DatabaseReference giniData63 = databaseReference.child("Gini_PersentaseMenengah_2025");
    private DatabaseReference giniData64 = databaseReference.child("Gini_PersentaseTeratas_2025");



    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gini);

        gini_tahun1 = (TextView)findViewById(R.id.gini_tahun1);
        gini_rasio1 = (TextView)findViewById(R.id.ginirasio1);
        gini_RSE1 = (TextView)findViewById(R.id.RSE1);
        gini_IndeksL1 = (TextView)findViewById(R.id.IndeksL1);
        gini_IndeksT1 = (TextView)findViewById(R.id.IndeksTheil1);
        gini_terendah1 = (TextView)findViewById(R.id.terendah1);
        gini_menengah1 = (TextView)findViewById(R.id.menengah1);
        gini_teratas1 = (TextView)findViewById(R.id.teratas1);

        gini_tahun2 = (TextView)findViewById(R.id.gini_tahun2);
        gini_rasio2 = (TextView)findViewById(R.id.ginirasio2);
        gini_RSE2 = (TextView)findViewById(R.id.RSE2);
        gini_IndeksL2 = (TextView)findViewById(R.id.IndeksL2);
        gini_IndeksT2 = (TextView)findViewById(R.id.IndeksTheil2);
        gini_terendah2 = (TextView)findViewById(R.id.terendah2);
        gini_menengah2 = (TextView)findViewById(R.id.menengah2);
        gini_teratas2 = (TextView)findViewById(R.id.teratas2);

        gini_tahun3 = (TextView)findViewById(R.id.gini_tahun3);
        gini_rasio3 = (TextView)findViewById(R.id.ginirasio3);
        gini_RSE3 = (TextView)findViewById(R.id.RSE3);
        gini_IndeksL3 = (TextView)findViewById(R.id.IndeksL3);
        gini_IndeksT3 = (TextView)findViewById(R.id.IndeksTheil3);
        gini_terendah3 = (TextView)findViewById(R.id.terendah3);
        gini_menengah3 = (TextView)findViewById(R.id.menengah3);
        gini_teratas3 = (TextView)findViewById(R.id.teratas3);


        gini_tahun4 = (TextView)findViewById(R.id.gini_tahunNew1);
        gini_rasio4 = (TextView)findViewById(R.id.ginirasioNew1);
        gini_RSE4 = (TextView)findViewById(R.id.RSENew1);
        gini_IndeksL4 = (TextView)findViewById(R.id.IndeksLNew1);
        gini_IndeksT4 = (TextView)findViewById(R.id.IndeksTheilNew1);
        gini_terendah4 = (TextView)findViewById(R.id.terendahNew1);
        gini_menengah4 = (TextView)findViewById(R.id.menengahNew1);
        gini_teratas4 = (TextView)findViewById(R.id.teratasNew1);

        gini_tahun5 = (TextView)findViewById(R.id.gini_tahunNew2);
        gini_rasio5 = (TextView)findViewById(R.id.ginirasioNew2);
        gini_RSE5 = (TextView)findViewById(R.id.RSENew2);
        gini_IndeksL5 = (TextView)findViewById(R.id.IndeksLNew2);
        gini_IndeksT5 = (TextView)findViewById(R.id.IndeksTheilNew2);
        gini_terendah5 = (TextView)findViewById(R.id.terendahNew2);
        gini_menengah5 = (TextView)findViewById(R.id.menengahNew2);
        gini_teratas5 = (TextView)findViewById(R.id.teratasNew2);

        gini_tahun6 = (TextView)findViewById(R.id.gini_tahunNew3);
        gini_rasio6 = (TextView)findViewById(R.id.ginirasioNew3);
        gini_RSE6 = (TextView)findViewById(R.id.RSENew3);
        gini_IndeksL6 = (TextView)findViewById(R.id.IndeksLNew3);
        gini_IndeksT6 = (TextView)findViewById(R.id.IndeksTheilNew3);
        gini_terendah6 = (TextView)findViewById(R.id.terendahNew3);
        gini_menengah6 = (TextView)findViewById(R.id.menengahNew3);
        gini_teratas6 = (TextView)findViewById(R.id.teratasNew3);

        gini_tahun7 = (TextView)findViewById(R.id.gini_tahunNew4);
        gini_rasio7 = (TextView)findViewById(R.id.ginirasioNew4);
        gini_RSE7 = (TextView)findViewById(R.id.RSENew4);
        gini_IndeksL7 = (TextView)findViewById(R.id.IndeksLNew4);
        gini_IndeksT7 = (TextView)findViewById(R.id.IndeksTheilNew4);
        gini_terendah7 = (TextView)findViewById(R.id.terendahNew4);
        gini_menengah7 = (TextView)findViewById(R.id.menengahNew4);
        gini_teratas7 = (TextView)findViewById(R.id.teratasNew4);

        gini_tahun8 = (TextView)findViewById(R.id.gini_tahunNew5);
        gini_rasio8 = (TextView)findViewById(R.id.ginirasioNew5);
        gini_RSE8 = (TextView)findViewById(R.id.RSENew5);
        gini_IndeksL8 = (TextView)findViewById(R.id.IndeksLNew5);
        gini_IndeksT8 = (TextView)findViewById(R.id.IndeksTheilNew5);
        gini_terendah8 = (TextView)findViewById(R.id.terendahNew5);
        gini_menengah8 = (TextView)findViewById(R.id.menengahNew5);
        gini_teratas8 = (TextView)findViewById(R.id.teratasNew5);
        

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.gini);
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
        Intent intent = new Intent(GiniActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(GiniActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(GiniActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(GiniActivity.this, SosialActivity.class);
        startActivity(intent);

    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("Gini_Tahun_2020")) {

                String gini1 = snapshot.getValue(String.class);
                gini_tahun1.setText(gini1);
            }

            if (key.equals("Gini_Rasio_2020")) {

                String gini2 = snapshot.getValue(String.class);
                gini_rasio1.setText(gini2);
            }

            if (key.equals("Gini_RSE_2020")) {

                String gini3 = snapshot.getValue(String.class);
                gini_RSE1.setText(gini3);
            }

            if (key.equals("Gini_IndeksL_2020")) {

                String gini4 = snapshot.getValue(String.class);
                gini_IndeksL1.setText(gini4);
            }

            if (key.equals("Gini_IndeksTheil_2020")) {

                String gini5 = snapshot.getValue(String.class);
                gini_IndeksT1.setText(gini5);
            }

            if (key.equals("Gini_PersentaseTerendah_2020")) {

                String gini6 = snapshot.getValue(String.class);
                gini_terendah1.setText(gini6);
            }

            if (key.equals("Gini_PersentaseMenengah_2020")) {

                String gini7 = snapshot.getValue(String.class);
                gini_menengah1.setText(gini7);
            }

            if (key.equals("Gini_PersentaseTeratas_2020")) {

                String gini8 = snapshot.getValue(String.class);
                gini_teratas1.setText(gini8);
            }



            if (key.equals("Gini_Tahun_2019")) {

                String gini9 = snapshot.getValue(String.class);
                gini_tahun2.setText(gini9);
            }

            if (key.equals("Gini_Rasio_2019")) {

                String gini10 = snapshot.getValue(String.class);
                gini_rasio2.setText(gini10);
            }

            if (key.equals("Gini_RSE_2019")) {

                String gini11 = snapshot.getValue(String.class);
                gini_RSE2.setText(gini11);
            }

            if (key.equals("Gini_IndeksL_2019")) {

                String gini12 = snapshot.getValue(String.class);
                gini_IndeksL2.setText(gini12);
            }

            if (key.equals("Gini_IndeksTheil_2019")) {

                String gini13 = snapshot.getValue(String.class);
                gini_IndeksT2.setText(gini13);
            }

            if (key.equals("Gini_PersentaseTerendah_2019")) {

                String gini14 = snapshot.getValue(String.class);
                gini_terendah2.setText(gini14);
            }

            if (key.equals("Gini_PersentaseMenengah_2019")) {

                String gini15 = snapshot.getValue(String.class);
                gini_menengah2.setText(gini15);
            }

            if (key.equals("Gini_PersentaseTeratas_2019")) {

                String gini16 = snapshot.getValue(String.class);
                gini_teratas2.setText(gini16);
            }



            if (key.equals("Gini_Tahun_2018")) {

                String gini17 = snapshot.getValue(String.class);
                gini_tahun3.setText(gini17);
            }

            if (key.equals("Gini_Rasio_2018")) {

                String gini18 = snapshot.getValue(String.class);
                gini_rasio3.setText(gini18);
            }

            if (key.equals("Gini_RSE_2018")) {

                String gini19 = snapshot.getValue(String.class);
                gini_RSE3.setText(gini19);
            }

            if (key.equals("Gini_IndeksL_2018")) {

                String gini20 = snapshot.getValue(String.class);
                gini_IndeksL3.setText(gini20);
            }

            if (key.equals("Gini_IndeksTheil_2018")) {

                String gini21 = snapshot.getValue(String.class);
                gini_IndeksT3.setText(gini21);
            }

            if (key.equals("Gini_PersentaseTerendah_2018")) {

                String gini22 = snapshot.getValue(String.class);
                gini_terendah3.setText(gini22);
            }

            if (key.equals("Gini_PersentaseMenengah_2018")) {

                String gini23 = snapshot.getValue(String.class);
                gini_menengah3.setText(gini23);
            }

            if (key.equals("Gini_PersentaseTeratas_2018")) {

                String gini24 = snapshot.getValue(String.class);
                gini_teratas3.setText(gini24);
            }







            if (key.equals("Gini_Tahun_2021")) {

                String gini25 = snapshot.getValue(String.class);
                gini_tahun4.setText(gini25);
            }

            if (key.equals("Gini_Rasio_2021")) {

                String gini26 = snapshot.getValue(String.class);
                gini_rasio4.setText(gini26);
            }

            if (key.equals("Gini_RSE_2021")) {

                String gini27 = snapshot.getValue(String.class);
                gini_RSE4.setText(gini27);
            }

            if (key.equals("Gini_IndeksL_2021")) {

                String gini28 = snapshot.getValue(String.class);
                gini_IndeksL4.setText(gini28);
            }

            if (key.equals("Gini_IndeksTheil_2021")) {

                String gini29 = snapshot.getValue(String.class);
                gini_IndeksT4.setText(gini29);
            }

            if (key.equals("Gini_PersentaseTerendah_2021")) {

                String gini30 = snapshot.getValue(String.class);
                gini_terendah4.setText(gini30);
            }

            if (key.equals("Gini_PersentaseMenengah_2021")) {

                String gini31 = snapshot.getValue(String.class);
                gini_menengah4.setText(gini31);
            }

            if (key.equals("Gini_PersentaseTeratas_2021")) {

                String gini32 = snapshot.getValue(String.class);
                gini_teratas4.setText(gini32);
            }




            if (key.equals("Gini_Tahun_2022")) {

                String gini33 = snapshot.getValue(String.class);
                gini_tahun5.setText(gini33);
            }

            if (key.equals("Gini_Rasio_2022")) {

                String gini34 = snapshot.getValue(String.class);
                gini_rasio5.setText(gini34);
            }

            if (key.equals("Gini_RSE_2022")) {

                String gini35 = snapshot.getValue(String.class);
                gini_RSE5.setText(gini35);
            }

            if (key.equals("Gini_IndeksL_2022")) {

                String gini36 = snapshot.getValue(String.class);
                gini_IndeksL5.setText(gini36);
            }

            if (key.equals("Gini_IndeksTheil_2022")) {

                String gini37 = snapshot.getValue(String.class);
                gini_IndeksT5.setText(gini37);
            }

            if (key.equals("Gini_PersentaseTerendah_2022")) {

                String gini38 = snapshot.getValue(String.class);
                gini_terendah5.setText(gini38);
            }

            if (key.equals("Gini_PersentaseMenengah_2022")) {

                String gini39 = snapshot.getValue(String.class);
                gini_menengah5.setText(gini39);
            }

            if (key.equals("Gini_PersentaseTeratas_2022")) {

                String gini40 = snapshot.getValue(String.class);
                gini_teratas5.setText(gini40);
            }




            if (key.equals("Gini_Tahun_2023")) {

                String gini41 = snapshot.getValue(String.class);
                gini_tahun6.setText(gini41);
            }

            if (key.equals("Gini_Rasio_2023")) {

                String gini42 = snapshot.getValue(String.class);
                gini_rasio6.setText(gini42);
            }

            if (key.equals("Gini_RSE_2023")) {

                String gini43 = snapshot.getValue(String.class);
                gini_RSE6.setText(gini43);
            }

            if (key.equals("Gini_IndeksL_2023")) {

                String gini44 = snapshot.getValue(String.class);
                gini_IndeksL6.setText(gini44);
            }

            if (key.equals("Gini_IndeksTheil_2023")) {

                String gini45 = snapshot.getValue(String.class);
                gini_IndeksT6.setText(gini45);
            }

            if (key.equals("Gini_PersentaseTerendah_2023")) {

                String gini46 = snapshot.getValue(String.class);
                gini_terendah6.setText(gini46);
            }

            if (key.equals("Gini_PersentaseMenengah_2023")) {

                String gini47 = snapshot.getValue(String.class);
                gini_menengah6.setText(gini47);
            }

            if (key.equals("Gini_PersentaseTeratas_2023")) {

                String gini48 = snapshot.getValue(String.class);
                gini_teratas6.setText(gini48);
            }




            if (key.equals("Gini_Tahun_2024")) {

                String gini49 = snapshot.getValue(String.class);
                gini_tahun7.setText(gini49);
            }

            if (key.equals("Gini_Rasio_2024")) {

                String gini50 = snapshot.getValue(String.class);
                gini_rasio7.setText(gini50);
            }

            if (key.equals("Gini_RSE_2024")) {

                String gini51 = snapshot.getValue(String.class);
                gini_RSE7.setText(gini51);
            }

            if (key.equals("Gini_IndeksL_2024")) {

                String gini52 = snapshot.getValue(String.class);
                gini_IndeksL7.setText(gini52);
            }

            if (key.equals("Gini_IndeksTheil_2024")) {

                String gini53 = snapshot.getValue(String.class);
                gini_IndeksT7.setText(gini53);
            }

            if (key.equals("Gini_PersentaseTerendah_2024")) {

                String gini54 = snapshot.getValue(String.class);
                gini_terendah7.setText(gini54);
            }

            if (key.equals("Gini_PersentaseMenengah_2024")) {

                String gini55 = snapshot.getValue(String.class);
                gini_menengah7.setText(gini55);
            }

            if (key.equals("Gini_PersentaseTeratas_2024")) {

                String gini56 = snapshot.getValue(String.class);
                gini_teratas7.setText(gini56);
            }




            if (key.equals("Gini_Tahun_2025")) {

                String gini57 = snapshot.getValue(String.class);
                gini_tahun8.setText(gini57);
            }

            if (key.equals("Gini_Rasio_2025")) {

                String gini58 = snapshot.getValue(String.class);
                gini_rasio8.setText(gini58);
            }

            if (key.equals("Gini_RSE_2025")) {

                String gini59 = snapshot.getValue(String.class);
                gini_RSE8.setText(gini59);
            }

            if (key.equals("Gini_IndeksL_2025")) {

                String gini60 = snapshot.getValue(String.class);
                gini_IndeksL8.setText(gini60);
            }

            if (key.equals("Gini_IndeksTheil_2025")) {

                String gini61 = snapshot.getValue(String.class);
                gini_IndeksT8.setText(gini61);
            }

            if (key.equals("Gini_PersentaseTerendah_2025")) {

                String gini62 = snapshot.getValue(String.class);
                gini_terendah8.setText(gini62);
            }

            if (key.equals("Gini_PersentaseMenengah_2025")) {

                String gini63 = snapshot.getValue(String.class);
                gini_menengah8.setText(gini63);
            }

            if (key.equals("Gini_PersentaseTeratas_2025")) {

                String gini64 = snapshot.getValue(String.class);
                gini_teratas8.setText(gini64);
            }
        }
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        giniData1.addValueEventListener(this);
        giniData2.addValueEventListener(this);
        giniData3.addValueEventListener(this);
        giniData4.addValueEventListener(this);
        giniData5.addValueEventListener(this);
        giniData6.addValueEventListener(this);
        giniData7.addValueEventListener(this);
        giniData8.addValueEventListener(this);

        giniData9.addValueEventListener(this);
        giniData10.addValueEventListener(this);
        giniData11.addValueEventListener(this);
        giniData12.addValueEventListener(this);
        giniData13.addValueEventListener(this);
        giniData14.addValueEventListener(this);
        giniData15.addValueEventListener(this);
        giniData16.addValueEventListener(this);

        giniData17.addValueEventListener(this);
        giniData18.addValueEventListener(this);
        giniData19.addValueEventListener(this);
        giniData20.addValueEventListener(this);
        giniData21.addValueEventListener(this);
        giniData22.addValueEventListener(this);
        giniData23.addValueEventListener(this);
        giniData24.addValueEventListener(this);

        giniData25.addValueEventListener(this);
        giniData26.addValueEventListener(this);
        giniData27.addValueEventListener(this);
        giniData28.addValueEventListener(this);
        giniData29.addValueEventListener(this);
        giniData30.addValueEventListener(this);
        giniData31.addValueEventListener(this);
        giniData32.addValueEventListener(this);

        giniData33.addValueEventListener(this);
        giniData34.addValueEventListener(this);
        giniData35.addValueEventListener(this);
        giniData36.addValueEventListener(this);
        giniData37.addValueEventListener(this);
        giniData38.addValueEventListener(this);
        giniData39.addValueEventListener(this);
        giniData40.addValueEventListener(this);

        giniData41.addValueEventListener(this);
        giniData42.addValueEventListener(this);
        giniData43.addValueEventListener(this);
        giniData44.addValueEventListener(this);
        giniData45.addValueEventListener(this);
        giniData46.addValueEventListener(this);
        giniData47.addValueEventListener(this);
        giniData48.addValueEventListener(this);

        giniData49.addValueEventListener(this);
        giniData50.addValueEventListener(this);
        giniData51.addValueEventListener(this);
        giniData52.addValueEventListener(this);
        giniData53.addValueEventListener(this);
        giniData54.addValueEventListener(this);
        giniData55.addValueEventListener(this);
        giniData56.addValueEventListener(this);

        giniData57.addValueEventListener(this);
        giniData58.addValueEventListener(this);
        giniData59.addValueEventListener(this);
        giniData60.addValueEventListener(this);
        giniData61.addValueEventListener(this);
        giniData62.addValueEventListener(this);
        giniData63.addValueEventListener(this);
        giniData64.addValueEventListener(this);
    }
}