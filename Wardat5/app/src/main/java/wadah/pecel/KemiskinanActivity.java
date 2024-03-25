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

public class KemiskinanActivity extends AppCompatActivity implements ValueEventListener{

    TextView kemiskinan_tahun1, kemiskinan_tahun2, kemiskinan_tahun3, kemiskinan_tahun4, kemiskinan_tahun5, kemiskinan_tahun6, kemiskinan_tahunNew, kemiskinan_tahunNew2, kemiskinan_tahunNew3, kemiskinan_tahunNew4, kemiskinan_tahunNew5,
            pend_miskin1, pend_miskin2, pend_miskin3, pend_miskin4, pend_miskin5, pend_miskin6, pend_miskinNew, pend_miskinNew2, pend_miskinNew3, pend_miskinNew4, pend_miskinNew5,
            persen_km1, persen_km2, persen_km3, persen_km4, persen_km5, persen_km6, persen_kmNew, persen_kmNew2, persen_kmNew3, persen_kmNew4, persen_kmNew5,
            P1_1, P1_2, P1_3, P1_4, P1_5, P1_6, P1_New, P1_New2, P1_New3, P1_New4, P1_New5,
            P2_1, P2_2, P2_3, P2_4, P2_5, P2_6, P2_New, P2_New2,P2_New3,P2_New4,P2_New5,
            garis_km1, garis_km2, garis_km3, garis_km4, garis_km5, garis_km6, garis_kmNew, garis_kmNew2,garis_kmNew3,garis_kmNew4,garis_kmNew5;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference kemiskinanData1 = databaseReference.child("Kemiskinan_tahun_2020");
    private DatabaseReference kemiskinanData2 = databaseReference.child("Kemiskinan_penduduk_miskin_2020");
    private DatabaseReference kemiskinanData3 = databaseReference.child("Kemiskinan_persentase_2020");
    private DatabaseReference kemiskinanData4 = databaseReference.child("Kemiskinan_P1_2020");
    private DatabaseReference kemiskinanData5 = databaseReference.child("Kemiskinan_P2_2020");
    private DatabaseReference kemiskinanData6 = databaseReference.child("Kemiskinan_garis_2020");

    private DatabaseReference kemiskinanData7 = databaseReference.child("Kemiskinan_tahun_2019");
    private DatabaseReference kemiskinanData8 = databaseReference.child("Kemiskinan_penduduk_miskin_2019");
    private DatabaseReference kemiskinanData9 = databaseReference.child("Kemiskinan_persentase_2019");
    private DatabaseReference kemiskinanData10 = databaseReference.child("Kemiskinan_P1_2019");
    private DatabaseReference kemiskinanData11 = databaseReference.child("Kemiskinan_P2_2019");
    private DatabaseReference kemiskinanData12 = databaseReference.child("Kemiskinan_garis_2019");

    private DatabaseReference kemiskinanData13 = databaseReference.child("Kemiskinan_tahun_2018");
    private DatabaseReference kemiskinanData14 = databaseReference.child("Kemiskinan_penduduk_miskin_2018");
    private DatabaseReference kemiskinanData15 = databaseReference.child("Kemiskinan_persentase_2018");
    private DatabaseReference kemiskinanData16 = databaseReference.child("Kemiskinan_P1_2018");
    private DatabaseReference kemiskinanData17 = databaseReference.child("Kemiskinan_P2_2018");
    private DatabaseReference kemiskinanData18 = databaseReference.child("Kemiskinan_garis_2018");

    private DatabaseReference kemiskinanData19 = databaseReference.child("Kemiskinan_tahun_2017");
    private DatabaseReference kemiskinanData20 = databaseReference.child("Kemiskinan_penduduk_miskin_2017");
    private DatabaseReference kemiskinanData21 = databaseReference.child("Kemiskinan_persentase_2017");
    private DatabaseReference kemiskinanData22 = databaseReference.child("Kemiskinan_P1_2017");
    private DatabaseReference kemiskinanData23 = databaseReference.child("Kemiskinan_P2_2017");
    private DatabaseReference kemiskinanData24 = databaseReference.child("Kemiskinan_garis_2017");

    private DatabaseReference kemiskinanData25 = databaseReference.child("Kemiskinan_tahun_2016");
    private DatabaseReference kemiskinanData26 = databaseReference.child("Kemiskinan_penduduk_miskin_2016");
    private DatabaseReference kemiskinanData27 = databaseReference.child("Kemiskinan_persentase_2016");
    private DatabaseReference kemiskinanData28 = databaseReference.child("Kemiskinan_P1_2016");
    private DatabaseReference kemiskinanData29 = databaseReference.child("Kemiskinan_P2_2016");
    private DatabaseReference kemiskinanData30 = databaseReference.child("Kemiskinan_garis_2016");

    private DatabaseReference kemiskinanData31 = databaseReference.child("Kemiskinan_tahun_2015");
    private DatabaseReference kemiskinanData32 = databaseReference.child("Kemiskinan_penduduk_miskin_2015");
    private DatabaseReference kemiskinanData33 = databaseReference.child("Kemiskinan_persentase_2015");
    private DatabaseReference kemiskinanData34 = databaseReference.child("Kemiskinan_P1_2015");
    private DatabaseReference kemiskinanData35 = databaseReference.child("Kemiskinan_P2_2015");
    private DatabaseReference kemiskinanData36 = databaseReference.child("Kemiskinan_garis_2015");

    private DatabaseReference kemiskinanData37 = databaseReference.child("Kemiskinan_tahun_2021");
    private DatabaseReference kemiskinanData38 = databaseReference.child("Kemiskinan_penduduk_miskin_2021");
    private DatabaseReference kemiskinanData39 = databaseReference.child("Kemiskinan_persentase_2021");
    private DatabaseReference kemiskinanData40 = databaseReference.child("Kemiskinan_P1_2021");
    private DatabaseReference kemiskinanData41 = databaseReference.child("Kemiskinan_P2_2021");
    private DatabaseReference kemiskinanData42 = databaseReference.child("Kemiskinan_garis_2021");

    private DatabaseReference kemiskinanData43 = databaseReference.child("Kemiskinan_tahun_2022");
    private DatabaseReference kemiskinanData44 = databaseReference.child("Kemiskinan_penduduk_miskin_2022");
    private DatabaseReference kemiskinanData45 = databaseReference.child("Kemiskinan_persentase_2022");
    private DatabaseReference kemiskinanData46 = databaseReference.child("Kemiskinan_P1_2022");
    private DatabaseReference kemiskinanData47 = databaseReference.child("Kemiskinan_P2_2022");
    private DatabaseReference kemiskinanData48 = databaseReference.child("Kemiskinan_garis_2022");

    private DatabaseReference kemiskinanData49 = databaseReference.child("Kemiskinan_tahun_2023");
    private DatabaseReference kemiskinanData50 = databaseReference.child("Kemiskinan_penduduk_miskin_2023");
    private DatabaseReference kemiskinanData51 = databaseReference.child("Kemiskinan_persentase_2023");
    private DatabaseReference kemiskinanData52 = databaseReference.child("Kemiskinan_P1_2023");
    private DatabaseReference kemiskinanData53 = databaseReference.child("Kemiskinan_P2_2023");
    private DatabaseReference kemiskinanData54 = databaseReference.child("Kemiskinan_garis_2023");

    private DatabaseReference kemiskinanData55 = databaseReference.child("Kemiskinan_tahun_2024");
    private DatabaseReference kemiskinanData56 = databaseReference.child("Kemiskinan_penduduk_miskin_2024");
    private DatabaseReference kemiskinanData57 = databaseReference.child("Kemiskinan_persentase_2024");
    private DatabaseReference kemiskinanData58 = databaseReference.child("Kemiskinan_P1_2024");
    private DatabaseReference kemiskinanData59 = databaseReference.child("Kemiskinan_P2_2024");
    private DatabaseReference kemiskinanData60 = databaseReference.child("Kemiskinan_garis_2024");

    private DatabaseReference kemiskinanData61 = databaseReference.child("Kemiskinan_tahun_2025");
    private DatabaseReference kemiskinanData62 = databaseReference.child("Kemiskinan_penduduk_miskin_2025");
    private DatabaseReference kemiskinanData63 = databaseReference.child("Kemiskinan_persentase_2025");
    private DatabaseReference kemiskinanData64 = databaseReference.child("Kemiskinan_P1_2025");
    private DatabaseReference kemiskinanData65 = databaseReference.child("Kemiskinan_P2_2025");
    private DatabaseReference kemiskinanData66 = databaseReference.child("Kemiskinan_garis_2025");



    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kemiskinan);

        kemiskinan_tahun1 = (TextView)findViewById(R.id.tahun_km1);
        pend_miskin1 = (TextView)findViewById(R.id.pend_miskin1);
        persen_km1 = (TextView)findViewById(R.id.persen_km1);
        P1_1 = (TextView)findViewById(R.id.P1_1);
        P2_1 = (TextView)findViewById(R.id.P2_1);
        garis_km1 = (TextView)findViewById(R.id.garis_km1);

        kemiskinan_tahun2 = (TextView)findViewById(R.id.tahun_km2);
        pend_miskin2 = (TextView)findViewById(R.id.pend_miskin2);
        persen_km2 = (TextView)findViewById(R.id.persen_km2);
        P1_2 = (TextView)findViewById(R.id.P1_2);
        P2_2 = (TextView)findViewById(R.id.P2_2);
        garis_km2 = (TextView)findViewById(R.id.garis_km2);

        kemiskinan_tahun3 = (TextView)findViewById(R.id.tahun_km3);
        pend_miskin3 = (TextView)findViewById(R.id.pend_miskin3);
        persen_km3 = (TextView)findViewById(R.id.persen_km3);
        P1_3 = (TextView)findViewById(R.id.P1_3);
        P2_3 = (TextView)findViewById(R.id.P2_3);
        garis_km3 = (TextView)findViewById(R.id.garis_km3);

        kemiskinan_tahun4 = (TextView)findViewById(R.id.tahun_km4);
        pend_miskin4 = (TextView)findViewById(R.id.pend_miskin4);
        persen_km4 = (TextView)findViewById(R.id.persen_km4);
        P1_4 = (TextView)findViewById(R.id.P1_4);
        P2_4 = (TextView)findViewById(R.id.P2_4);
        garis_km4 = (TextView)findViewById(R.id.garis_km4);

        kemiskinan_tahun5 = (TextView)findViewById(R.id.tahun_km5);
        pend_miskin5 = (TextView)findViewById(R.id.pend_miskin5);
        persen_km5 = (TextView)findViewById(R.id.persen_km5);
        P1_5 = (TextView)findViewById(R.id.P1_5);
        P2_5 = (TextView)findViewById(R.id.P2_5);
        garis_km5 = (TextView)findViewById(R.id.garis_km5);

        kemiskinan_tahun6 = (TextView)findViewById(R.id.tahun_km6);
        pend_miskin6 = (TextView)findViewById(R.id.pend_miskin6);
        persen_km6 = (TextView)findViewById(R.id.persen_km6);
        P1_6 = (TextView)findViewById(R.id.P1_6);
        P2_6 = (TextView)findViewById(R.id.P2_6);
        garis_km6 = (TextView)findViewById(R.id.garis_km6);

        kemiskinan_tahunNew = (TextView)findViewById(R.id.tahun_kmNew1);
        pend_miskinNew = (TextView)findViewById(R.id.pend_miskinNew1);
        persen_kmNew = (TextView)findViewById(R.id.persen_kmNew1);
        P1_New = (TextView)findViewById(R.id.P1_New1);
        P2_New = (TextView)findViewById(R.id.P2_New1);
        garis_kmNew = (TextView)findViewById(R.id.garis_kmNew1);

        kemiskinan_tahunNew2 = (TextView)findViewById(R.id.tahun_kmNew2);
        pend_miskinNew2 = (TextView)findViewById(R.id.pend_miskinNew2);
        persen_kmNew2 = (TextView)findViewById(R.id.persen_kmNew2);
        P1_New2 = (TextView)findViewById(R.id.P1_New2);
        P2_New2 = (TextView)findViewById(R.id.P2_New2);
        garis_kmNew2 = (TextView)findViewById(R.id.garis_kmNew2);

        kemiskinan_tahunNew3 = (TextView)findViewById(R.id.tahun_kmNew3);
        pend_miskinNew3 = (TextView)findViewById(R.id.pend_miskinNew3);
        persen_kmNew3 = (TextView)findViewById(R.id.persen_kmNew3);
        P1_New3 = (TextView)findViewById(R.id.P1_New3);
        P2_New3 = (TextView)findViewById(R.id.P2_New3);
        garis_kmNew3 = (TextView)findViewById(R.id.garis_kmNew3);

        kemiskinan_tahunNew4 = (TextView)findViewById(R.id.tahun_kmNew4);
        pend_miskinNew4 = (TextView)findViewById(R.id.pend_miskinNew4);
        persen_kmNew4 = (TextView)findViewById(R.id.persen_kmNew4);
        P1_New4 = (TextView)findViewById(R.id.P1_New4);
        P2_New4 = (TextView)findViewById(R.id.P2_New4);
        garis_kmNew4 = (TextView)findViewById(R.id.garis_kmNew4);

        kemiskinan_tahunNew5 = (TextView)findViewById(R.id.tahun_kmNew5);
        pend_miskinNew5 = (TextView)findViewById(R.id.pend_miskinNew5);
        persen_kmNew5 = (TextView)findViewById(R.id.persen_kmNew5);
        P1_New5 = (TextView)findViewById(R.id.P1_New5);
        P2_New5 = (TextView)findViewById(R.id.P2_New5);
        garis_kmNew5 = (TextView)findViewById(R.id.garis_kmNew5);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.kemiskinan);
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
        Intent intent = new Intent(KemiskinanActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(KemiskinanActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(KemiskinanActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }


    public void back(View view) {
        Intent intent = new Intent(KemiskinanActivity.this, SosialActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null){

            String key = snapshot.getKey();
            if (key.equals("Kemiskinan_tahun_2020")){

                String kemiskinan1 = snapshot.getValue(String.class);
                kemiskinan_tahun1.setText(kemiskinan1);
            }

            if (key.equals("Kemiskinan_penduduk_miskin_2020")){

                String kemiskinan2 = snapshot.getValue(String.class);
                pend_miskin1.setText(kemiskinan2);
            }

            if (key.equals("Kemiskinan_persentase_2020")){

                String kemiskinan3 = snapshot.getValue(String.class);
                persen_km1.setText(kemiskinan3);
            }

            if (key.equals("Kemiskinan_P1_2020")){

                String kemiskinan4 = snapshot.getValue(String.class);
                P1_1.setText(kemiskinan4);
            }

            if (key.equals("Kemiskinan_P2_2020")){

                String kemiskinan5 = snapshot.getValue(String.class);
                P2_1.setText(kemiskinan5);
            }

            if (key.equals("Kemiskinan_garis_2020")){

                String kemiskinan6 = snapshot.getValue(String.class);
                garis_km1.setText(kemiskinan6);
            }



            if (key.equals("Kemiskinan_tahun_2019")){

                String kemiskinan7 = snapshot.getValue(String.class);
                kemiskinan_tahun2.setText(kemiskinan7);
            }

            if (key.equals("Kemiskinan_penduduk_miskin_2019")){

                String kemiskinan8 = snapshot.getValue(String.class);
                pend_miskin2.setText(kemiskinan8);
            }

            if (key.equals("Kemiskinan_persentase_2019")){

                String kemiskinan9 = snapshot.getValue(String.class);
                persen_km2.setText(kemiskinan9);
            }

            if (key.equals("Kemiskinan_P1_2019")){

                String kemiskinan10 = snapshot.getValue(String.class);
                P1_2.setText(kemiskinan10);
            }

            if (key.equals("Kemiskinan_P2_2019")){

                String kemiskinan11 = snapshot.getValue(String.class);
                P2_2.setText(kemiskinan11);
            }

            if (key.equals("Kemiskinan_garis_2019")){

                String kemiskinan12 = snapshot.getValue(String.class);
                garis_km2.setText(kemiskinan12);
            }



            if (key.equals("Kemiskinan_tahun_2018")){

                String kemiskinan13 = snapshot.getValue(String.class);
                kemiskinan_tahun3.setText(kemiskinan13);
            }

            if (key.equals("Kemiskinan_penduduk_miskin_2018")){

                String kemiskinan14 = snapshot.getValue(String.class);
                pend_miskin3.setText(kemiskinan14);
            }

            if (key.equals("Kemiskinan_persentase_2018")){

                String kemiskinan15 = snapshot.getValue(String.class);
                persen_km3.setText(kemiskinan15);
            }

            if (key.equals("Kemiskinan_P1_2018")){

                String kemiskinan16 = snapshot.getValue(String.class);
                P1_3.setText(kemiskinan16);
            }

            if (key.equals("Kemiskinan_P2_2018")){

                String kemiskinan17 = snapshot.getValue(String.class);
                P2_3.setText(kemiskinan17);
            }

            if (key.equals("Kemiskinan_garis_2018")){

                String kemiskinan18 = snapshot.getValue(String.class);
                garis_km3.setText(kemiskinan18);
            }



            if (key.equals("Kemiskinan_tahun_2017")){

                String kemiskinan19 = snapshot.getValue(String.class);
                kemiskinan_tahun4.setText(kemiskinan19);
            }

            if (key.equals("Kemiskinan_penduduk_miskin_2017")){

                String kemiskinan20 = snapshot.getValue(String.class);
                pend_miskin4.setText(kemiskinan20);
            }

            if (key.equals("Kemiskinan_persentase_2017")){

                String kemiskinan21 = snapshot.getValue(String.class);
                persen_km4.setText(kemiskinan21);
            }

            if (key.equals("Kemiskinan_P1_2017")){

                String kemiskinan22 = snapshot.getValue(String.class);
                P1_4.setText(kemiskinan22);
            }

            if (key.equals("Kemiskinan_P2_2017")){

                String kemiskinan23 = snapshot.getValue(String.class);
                P2_4.setText(kemiskinan23);
            }

            if (key.equals("Kemiskinan_garis_2017")){

                String kemiskinan24 = snapshot.getValue(String.class);
                garis_km4.setText(kemiskinan24);
            }



            if (key.equals("Kemiskinan_tahun_2016")){

                String kemiskinan25 = snapshot.getValue(String.class);
                kemiskinan_tahun5.setText(kemiskinan25);
            }

            if (key.equals("Kemiskinan_penduduk_miskin_2016")){

                String kemiskinan26 = snapshot.getValue(String.class);
                pend_miskin5.setText(kemiskinan26);
            }

            if (key.equals("Kemiskinan_persentase_2016")){

                String kemiskinan27 = snapshot.getValue(String.class);
                persen_km5.setText(kemiskinan27);
            }

            if (key.equals("Kemiskinan_P1_2016")){

                String kemiskinan28 = snapshot.getValue(String.class);
                P1_5.setText(kemiskinan28);
            }

            if (key.equals("Kemiskinan_P2_2016")){

                String kemiskinan29 = snapshot.getValue(String.class);
                P2_5.setText(kemiskinan29);
            }

            if (key.equals("Kemiskinan_garis_2016")){

                String kemiskinan30 = snapshot.getValue(String.class);
                garis_km5.setText(kemiskinan30);
            }



            if (key.equals("Kemiskinan_tahun_2015")){

                String kemiskinan31 = snapshot.getValue(String.class);
                kemiskinan_tahun6.setText(kemiskinan31);
            }

            if (key.equals("Kemiskinan_penduduk_miskin_2015")){

                String kemiskinan32 = snapshot.getValue(String.class);
                pend_miskin6.setText(kemiskinan32);
            }

            if (key.equals("Kemiskinan_persentase_2015")){

                String kemiskinan33 = snapshot.getValue(String.class);
                persen_km6.setText(kemiskinan33);
            }

            if (key.equals("Kemiskinan_P1_2015")){

                String kemiskinan34 = snapshot.getValue(String.class);
                P1_6.setText(kemiskinan34);
            }

            if (key.equals("Kemiskinan_P2_2015")){

                String kemiskinan35 = snapshot.getValue(String.class);
                P2_6.setText(kemiskinan35);
            }

            if (key.equals("Kemiskinan_garis_2015")){

                String kemiskinan36 = snapshot.getValue(String.class);
                garis_km6.setText(kemiskinan36);
            }




            if (key.equals("Kemiskinan_tahun_2021")){

                String kemiskinan37 = snapshot.getValue(String.class);
                kemiskinan_tahunNew.setText(kemiskinan37);
            }

            if (key.equals("Kemiskinan_penduduk_miskin_2021")){

                String kemiskinan38 = snapshot.getValue(String.class);
                pend_miskinNew.setText(kemiskinan38);
            }

            if (key.equals("Kemiskinan_persentase_2021")){

                String kemiskinan39 = snapshot.getValue(String.class);
                persen_kmNew.setText(kemiskinan39);
            }

            if (key.equals("Kemiskinan_P1_2021")){

                String kemiskinan40 = snapshot.getValue(String.class);
                P1_New.setText(kemiskinan40);
            }

            if (key.equals("Kemiskinan_P2_2021")){

                String kemiskinan41 = snapshot.getValue(String.class);
                P2_New.setText(kemiskinan41);
            }

            if (key.equals("Kemiskinan_garis_2021")){

                String kemiskinan42 = snapshot.getValue(String.class);
                garis_kmNew.setText(kemiskinan42);
            }





            if (key.equals("Kemiskinan_tahun_2022")){

                String kemiskinan43 = snapshot.getValue(String.class);
                kemiskinan_tahunNew2.setText(kemiskinan43);
            }

            if (key.equals("Kemiskinan_penduduk_miskin_2022")){

                String kemiskinan44 = snapshot.getValue(String.class);
                pend_miskinNew2.setText(kemiskinan44);
            }

            if (key.equals("Kemiskinan_persentase_2022")){

                String kemiskinan45 = snapshot.getValue(String.class);
                persen_kmNew2.setText(kemiskinan45);
            }

            if (key.equals("Kemiskinan_P1_2022")){

                String kemiskinan46 = snapshot.getValue(String.class);
                P1_New2.setText(kemiskinan46);
            }

            if (key.equals("Kemiskinan_P2_2022")){

                String kemiskinan47 = snapshot.getValue(String.class);
                P2_New2.setText(kemiskinan47);
            }

            if (key.equals("Kemiskinan_garis_2022")){

                String kemiskinan48 = snapshot.getValue(String.class);
                garis_kmNew2.setText(kemiskinan48);
            }




            if (key.equals("Kemiskinan_tahun_2023")){

                String kemiskinan49 = snapshot.getValue(String.class);
                kemiskinan_tahunNew3.setText(kemiskinan49);
            }

            if (key.equals("Kemiskinan_penduduk_miskin_2023")){

                String kemiskinan50 = snapshot.getValue(String.class);
                pend_miskinNew3.setText(kemiskinan50);
            }

            if (key.equals("Kemiskinan_persentase_2023")){

                String kemiskinan51 = snapshot.getValue(String.class);
                persen_kmNew3.setText(kemiskinan51);
            }

            if (key.equals("Kemiskinan_P1_2023")){

                String kemiskinan52 = snapshot.getValue(String.class);
                P1_New3.setText(kemiskinan52);
            }

            if (key.equals("Kemiskinan_P2_2023")){

                String kemiskinan53 = snapshot.getValue(String.class);
                P2_New3.setText(kemiskinan53);
            }

            if (key.equals("Kemiskinan_garis_2023")){

                String kemiskinan54 = snapshot.getValue(String.class);
                garis_kmNew3.setText(kemiskinan54);
            }




            if (key.equals("Kemiskinan_tahun_2024")){

                String kemiskinan55 = snapshot.getValue(String.class);
                kemiskinan_tahunNew4.setText(kemiskinan55);
            }

            if (key.equals("Kemiskinan_penduduk_miskin_2024")){

                String kemiskinan56 = snapshot.getValue(String.class);
                pend_miskinNew4.setText(kemiskinan56);
            }

            if (key.equals("Kemiskinan_persentase_2024")){

                String kemiskinan57 = snapshot.getValue(String.class);
                persen_kmNew4.setText(kemiskinan57);
            }

            if (key.equals("Kemiskinan_P1_2024")){

                String kemiskinan58 = snapshot.getValue(String.class);
                P1_New4.setText(kemiskinan58);
            }

            if (key.equals("Kemiskinan_P2_2024")){

                String kemiskinan59 = snapshot.getValue(String.class);
                P2_New4.setText(kemiskinan59);
            }

            if (key.equals("Kemiskinan_garis_2024")){

                String kemiskinan60 = snapshot.getValue(String.class);
                garis_kmNew4.setText(kemiskinan60);
            }




            if (key.equals("Kemiskinan_tahun_2025")){

                String kemiskinan61 = snapshot.getValue(String.class);
                kemiskinan_tahunNew5.setText(kemiskinan61);
            }

            if (key.equals("Kemiskinan_penduduk_miskin_2025")){

                String kemiskinan62 = snapshot.getValue(String.class);
                pend_miskinNew5.setText(kemiskinan62);
            }

            if (key.equals("Kemiskinan_persentase_2025")){

                String kemiskinan63 = snapshot.getValue(String.class);
                persen_kmNew5.setText(kemiskinan63);
            }

            if (key.equals("Kemiskinan_P1_2025")){

                String kemiskinan64 = snapshot.getValue(String.class);
                P1_New5.setText(kemiskinan64);
            }

            if (key.equals("Kemiskinan_P2_2025")){

                String kemiskinan65 = snapshot.getValue(String.class);
                P2_New5.setText(kemiskinan65);
            }

            if (key.equals("Kemiskinan_garis_2025")){

                String kemiskinan66 = snapshot.getValue(String.class);
                garis_kmNew5.setText(kemiskinan66);
            }
        }
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart(){
        super.onStart();

        kemiskinanData1.addValueEventListener(this);
        kemiskinanData2.addValueEventListener(this);
        kemiskinanData3.addValueEventListener(this);
        kemiskinanData4.addValueEventListener(this);
        kemiskinanData5.addValueEventListener(this);
        kemiskinanData6.addValueEventListener(this);

        kemiskinanData7.addValueEventListener(this);
        kemiskinanData8.addValueEventListener(this);
        kemiskinanData9.addValueEventListener(this);
        kemiskinanData10.addValueEventListener(this);
        kemiskinanData11.addValueEventListener(this);
        kemiskinanData12.addValueEventListener(this);

        kemiskinanData13.addValueEventListener(this);
        kemiskinanData14.addValueEventListener(this);
        kemiskinanData15.addValueEventListener(this);
        kemiskinanData16.addValueEventListener(this);
        kemiskinanData17.addValueEventListener(this);
        kemiskinanData18.addValueEventListener(this);

        kemiskinanData19.addValueEventListener(this);
        kemiskinanData20.addValueEventListener(this);
        kemiskinanData21.addValueEventListener(this);
        kemiskinanData22.addValueEventListener(this);
        kemiskinanData23.addValueEventListener(this);
        kemiskinanData24.addValueEventListener(this);

        kemiskinanData25.addValueEventListener(this);
        kemiskinanData26.addValueEventListener(this);
        kemiskinanData27.addValueEventListener(this);
        kemiskinanData28.addValueEventListener(this);
        kemiskinanData29.addValueEventListener(this);
        kemiskinanData30.addValueEventListener(this);

        kemiskinanData31.addValueEventListener(this);
        kemiskinanData32.addValueEventListener(this);
        kemiskinanData33.addValueEventListener(this);
        kemiskinanData34.addValueEventListener(this);
        kemiskinanData35.addValueEventListener(this);
        kemiskinanData36.addValueEventListener(this);

        kemiskinanData37.addValueEventListener(this);
        kemiskinanData38.addValueEventListener(this);
        kemiskinanData39.addValueEventListener(this);
        kemiskinanData40.addValueEventListener(this);
        kemiskinanData41.addValueEventListener(this);
        kemiskinanData42.addValueEventListener(this);

        kemiskinanData43.addValueEventListener(this);
        kemiskinanData44.addValueEventListener(this);
        kemiskinanData45.addValueEventListener(this);
        kemiskinanData46.addValueEventListener(this);
        kemiskinanData47.addValueEventListener(this);
        kemiskinanData48.addValueEventListener(this);

        kemiskinanData49.addValueEventListener(this);
        kemiskinanData50.addValueEventListener(this);
        kemiskinanData51.addValueEventListener(this);
        kemiskinanData52.addValueEventListener(this);
        kemiskinanData53.addValueEventListener(this);
        kemiskinanData54.addValueEventListener(this);

        kemiskinanData55.addValueEventListener(this);
        kemiskinanData56.addValueEventListener(this);
        kemiskinanData57.addValueEventListener(this);
        kemiskinanData58.addValueEventListener(this);
        kemiskinanData59.addValueEventListener(this);
        kemiskinanData60.addValueEventListener(this);

        kemiskinanData61.addValueEventListener(this);
        kemiskinanData62.addValueEventListener(this);
        kemiskinanData63.addValueEventListener(this);
        kemiskinanData64.addValueEventListener(this);
        kemiskinanData65.addValueEventListener(this);
        kemiskinanData66.addValueEventListener(this);

    }

}