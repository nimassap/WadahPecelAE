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

public class PddklapusActivity extends AppCompatActivity implements ValueEventListener {

    TextView pendlapus_tahun1, pendlapus_tahun2, pendlapus_tahun3, pendlapus_tahun4, pendlapus_tahun5,pendlapus_tahun6,pendlapus_tahun7,pendlapus_tahun8,
            pendlapus_pertanian1, pendlapus_pertanian2, pendlapus_pertanian3, pendlapus_pertanian4, pendlapus_pertanian5,pendlapus_pertanian6,pendlapus_pertanian7,pendlapus_pertanian8,
            pendlapus_manufaktur1, pendlapus_manufaktur2, pendlapus_manufaktur3, pendlapus_manufaktur4, pendlapus_manufaktur5,pendlapus_manufaktur6,pendlapus_manufaktur7,pendlapus_manufaktur8,
            pendlapus_jasa1, pendlapus_jasa2, pendlapus_jasa3, pendlapus_jasa4, pendlapus_jasa5,pendlapus_jasa6,pendlapus_jasa7,pendlapus_jasa8,
            pendlapus_jumlahbekerja1, pendlapus_jumlahbekerja2, pendlapus_jumlahbekerja3, pendlapus_jumlahbekerja4, pendlapus_jumlahbekerja5,pendlapus_jumlahbekerja6,pendlapus_jumlahbekerja7,pendlapus_jumlahbekerja8;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference penduduklapusData1 = databaseReference.child("PendudukLapUs_tahun_2020");
    private DatabaseReference penduduklapusData2 = databaseReference.child("PendudukLapUs_pertanian_2020");
    private DatabaseReference penduduklapusData3 = databaseReference.child("PendudukLapUs_manufaktur_2020");
    private DatabaseReference penduduklapusData4 = databaseReference.child("PendudukLapUs_jasa_2020");
    private DatabaseReference penduduklapusData5 = databaseReference.child("PendudukLapUs_jumlahbekerja_2020");

    private DatabaseReference penduduklapusData6 = databaseReference.child("PendudukLapUs_tahun_2019");
    private DatabaseReference penduduklapusData7 = databaseReference.child("PendudukLapUs_pertanian_2019");
    private DatabaseReference penduduklapusData8 = databaseReference.child("PendudukLapUs_manufaktur_2019");
    private DatabaseReference penduduklapusData9 = databaseReference.child("PendudukLapUs_jasa_2019");
    private DatabaseReference penduduklapusData10 = databaseReference.child("PendudukLapUs_jumlahbekerja_2019");

    private DatabaseReference penduduklapusData11 = databaseReference.child("PendudukLapUs_tahun_2018");
    private DatabaseReference penduduklapusData12 = databaseReference.child("PendudukLapUs_pertanian_2018");
    private DatabaseReference penduduklapusData13 = databaseReference.child("PendudukLapUs_manufaktur_2018");
    private DatabaseReference penduduklapusData14 = databaseReference.child("PendudukLapUs_jasa_2018");
    private DatabaseReference penduduklapusData15 = databaseReference.child("PendudukLapUs_jumlahbekerja_2018");

    private DatabaseReference penduduklapusData16 = databaseReference.child("PendudukLapUs_tahun_2021");
    private DatabaseReference penduduklapusData17 = databaseReference.child("PendudukLapUs_pertanian_2021");
    private DatabaseReference penduduklapusData18 = databaseReference.child("PendudukLapUs_manufaktur_2021");
    private DatabaseReference penduduklapusData19 = databaseReference.child("PendudukLapUs_jasa_2021");
    private DatabaseReference penduduklapusData20 = databaseReference.child("PendudukLapUs_jumlahbekerja_2021");

    private DatabaseReference penduduklapusData21 = databaseReference.child("PendudukLapUs_tahun_2022");
    private DatabaseReference penduduklapusData22 = databaseReference.child("PendudukLapUs_pertanian_2022");
    private DatabaseReference penduduklapusData23 = databaseReference.child("PendudukLapUs_manufaktur_2022");
    private DatabaseReference penduduklapusData24 = databaseReference.child("PendudukLapUs_jasa_2022");
    private DatabaseReference penduduklapusData25 = databaseReference.child("PendudukLapUs_jumlahbekerja_2022");

    private DatabaseReference penduduklapusData26 = databaseReference.child("PendudukLapUs_tahun_2023");
    private DatabaseReference penduduklapusData27 = databaseReference.child("PendudukLapUs_pertanian_2023");
    private DatabaseReference penduduklapusData28 = databaseReference.child("PendudukLapUs_manufaktur_2023");
    private DatabaseReference penduduklapusData29 = databaseReference.child("PendudukLapUs_jasa_2023");
    private DatabaseReference penduduklapusData30 = databaseReference.child("PendudukLapUs_jumlahbekerja_2023");

    private DatabaseReference penduduklapusData31 = databaseReference.child("PendudukLapUs_tahun_2024");
    private DatabaseReference penduduklapusData32 = databaseReference.child("PendudukLapUs_pertanian_2024");
    private DatabaseReference penduduklapusData33 = databaseReference.child("PendudukLapUs_manufaktur_2024");
    private DatabaseReference penduduklapusData34 = databaseReference.child("PendudukLapUs_jasa_2024");
    private DatabaseReference penduduklapusData35 = databaseReference.child("PendudukLapUs_jumlahbekerja_2024");

    private DatabaseReference penduduklapusData36 = databaseReference.child("PendudukLapUs_tahun_2025");
    private DatabaseReference penduduklapusData37 = databaseReference.child("PendudukLapUs_pertanian_2025");
    private DatabaseReference penduduklapusData38 = databaseReference.child("PendudukLapUs_manufaktur_2025");
    private DatabaseReference penduduklapusData39 = databaseReference.child("PendudukLapUs_jasa_2025");
    private DatabaseReference penduduklapusData40 = databaseReference.child("PendudukLapUs_jumlahbekerja_2025");

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pddklapus);

        pendlapus_tahun1 = (TextView)findViewById(R.id.pendlapus_tahun1);
        pendlapus_pertanian1 = (TextView)findViewById(R.id.pendlapus_pertanian1);
        pendlapus_manufaktur1 = (TextView)findViewById(R.id.pendlapus_manufaktur1);
        pendlapus_jasa1 = (TextView)findViewById(R.id.pendlapus_jasa1);
        pendlapus_jumlahbekerja1 = (TextView)findViewById(R.id.pendlapus_jmlbekerja1);

        pendlapus_tahun2 = (TextView)findViewById(R.id.pendlapus_tahun2);
        pendlapus_pertanian2 = (TextView)findViewById(R.id.pendlapus_pertanian2);
        pendlapus_manufaktur2 = (TextView)findViewById(R.id.pendlapus_manufaktur2);
        pendlapus_jasa2 = (TextView)findViewById(R.id.pendlapus_jasa2);
        pendlapus_jumlahbekerja2 = (TextView)findViewById(R.id.pendlapus_jmlbekerja2);

        pendlapus_tahun3 = (TextView)findViewById(R.id.pendlapus_tahun3);
        pendlapus_pertanian3 = (TextView)findViewById(R.id.pendlapus_pertanian3);
        pendlapus_manufaktur3 = (TextView)findViewById(R.id.pendlapus_manufaktur3);
        pendlapus_jasa3 = (TextView)findViewById(R.id.pendlapus_jasa3);
        pendlapus_jumlahbekerja3 = (TextView)findViewById(R.id.pendlapus_jmlbekerja3);

        pendlapus_tahun4 = (TextView)findViewById(R.id.pendlapus_tahunNew1);
        pendlapus_pertanian4 = (TextView)findViewById(R.id.pendlapus_pertanianNew1);
        pendlapus_manufaktur4 = (TextView)findViewById(R.id.pendlapus_manufakturNew1);
        pendlapus_jasa4 = (TextView)findViewById(R.id.pendlapus_jasaNew1);
        pendlapus_jumlahbekerja4 = (TextView)findViewById(R.id.pendlapus_jmlbekerjaNew1);

        pendlapus_tahun5 = (TextView)findViewById(R.id.pendlapus_tahunNew2);
        pendlapus_pertanian5 = (TextView)findViewById(R.id.pendlapus_pertanianNew2);
        pendlapus_manufaktur5 = (TextView)findViewById(R.id.pendlapus_manufakturNew2);
        pendlapus_jasa5 = (TextView)findViewById(R.id.pendlapus_jasaNew2);
        pendlapus_jumlahbekerja5 = (TextView)findViewById(R.id.pendlapus_jmlbekerjaNew2);

        pendlapus_tahun6 = (TextView)findViewById(R.id.pendlapus_tahunNew3);
        pendlapus_pertanian6 = (TextView)findViewById(R.id.pendlapus_pertanianNew3);
        pendlapus_manufaktur6 = (TextView)findViewById(R.id.pendlapus_manufakturNew3);
        pendlapus_jasa6 = (TextView)findViewById(R.id.pendlapus_jasaNew3);
        pendlapus_jumlahbekerja6 = (TextView)findViewById(R.id.pendlapus_jmlbekerjaNew3);

        pendlapus_tahun7 = (TextView)findViewById(R.id.pendlapus_tahunNew4);
        pendlapus_pertanian7 = (TextView)findViewById(R.id.pendlapus_pertanianNew4);
        pendlapus_manufaktur7 = (TextView)findViewById(R.id.pendlapus_manufakturNew4);
        pendlapus_jasa7 = (TextView)findViewById(R.id.pendlapus_jasaNew4);
        pendlapus_jumlahbekerja7 = (TextView)findViewById(R.id.pendlapus_jmlbekerjaNew4);

        pendlapus_tahun8 = (TextView)findViewById(R.id.pendlapus_tahunNew5);
        pendlapus_pertanian8 = (TextView)findViewById(R.id.pendlapus_pertanianNew5);
        pendlapus_manufaktur8 = (TextView)findViewById(R.id.pendlapus_manufakturNew5);
        pendlapus_jasa8 = (TextView)findViewById(R.id.pendlapus_jasaNew5);
        pendlapus_jumlahbekerja8 = (TextView)findViewById(R.id.pendlapus_jmlbekerjaNew5);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.pddklapus);
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
        Intent intent = new Intent(PddklapusActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(PddklapusActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(PddklapusActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }


    public void back(View view) {
        Intent intent = new Intent(PddklapusActivity.this, SosialActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("PendudukLapUs_tahun_2020")) {

                String penduduklapus1 = snapshot.getValue(String.class);
                pendlapus_tahun1.setText(penduduklapus1);
            }

            if (key.equals("PendudukLapUs_pertanian_2020")) {

                String penduduklapus2 = snapshot.getValue(String.class);
                pendlapus_pertanian1.setText(penduduklapus2);
            }

            if (key.equals("PendudukLapUs_manufaktur_2020")) {

                String penduduklapus3 = snapshot.getValue(String.class);
                pendlapus_manufaktur1.setText(penduduklapus3);
            }

            if (key.equals("PendudukLapUs_jasa_2020")) {

                String penduduklapus4 = snapshot.getValue(String.class);
                pendlapus_jasa1.setText(penduduklapus4);
            }

            if (key.equals("PendudukLapUs_jumlahbekerja_2020")) {

                String penduduklapus5 = snapshot.getValue(String.class);
                pendlapus_jumlahbekerja1.setText(penduduklapus5);
            }



            if (key.equals("PendudukLapUs_tahun_2019")) {

                String penduduklapus6 = snapshot.getValue(String.class);
                pendlapus_tahun2.setText(penduduklapus6);
            }

            if (key.equals("PendudukLapUs_pertanian_2019")) {

                String penduduklapus7 = snapshot.getValue(String.class);
                pendlapus_pertanian2.setText(penduduklapus7);
            }

            if (key.equals("PendudukLapUs_manufaktur_2019")) {

                String penduduklapus8 = snapshot.getValue(String.class);
                pendlapus_manufaktur2.setText(penduduklapus8);
            }

            if (key.equals("PendudukLapUs_jasa_2019")) {

                String penduduklapus9 = snapshot.getValue(String.class);
                pendlapus_jasa2.setText(penduduklapus9);
            }

            if (key.equals("PendudukLapUs_jumlahbekerja_2019")) {

                String penduduklapus10 = snapshot.getValue(String.class);
                pendlapus_jumlahbekerja2.setText(penduduklapus10);
            }



            if (key.equals("PendudukLapUs_tahun_2018")) {

                String penduduklapus11 = snapshot.getValue(String.class);
                pendlapus_tahun3.setText(penduduklapus11);
            }

            if (key.equals("PendudukLapUs_pertanian_2018")) {

                String penduduklapus12 = snapshot.getValue(String.class);
                pendlapus_pertanian3.setText(penduduklapus12);
            }

            if (key.equals("PendudukLapUs_manufaktur_2018")) {

                String penduduklapus13 = snapshot.getValue(String.class);
                pendlapus_manufaktur3.setText(penduduklapus13);
            }

            if (key.equals("PendudukLapUs_jasa_2018")) {

                String penduduklapus14 = snapshot.getValue(String.class);
                pendlapus_jasa3.setText(penduduklapus14);
            }

            if (key.equals("PendudukLapUs_jumlahbekerja_2018")) {

                String penduduklapus15 = snapshot.getValue(String.class);
                pendlapus_jumlahbekerja3.setText(penduduklapus15);
            }




            if (key.equals("PendudukLapUs_tahun_2021")) {

                String penduduklapus16 = snapshot.getValue(String.class);
                pendlapus_tahun4.setText(penduduklapus16);
            }

            if (key.equals("PendudukLapUs_pertanian_2021")) {

                String penduduklapus17 = snapshot.getValue(String.class);
                pendlapus_pertanian4.setText(penduduklapus17);
            }

            if (key.equals("PendudukLapUs_manufaktur_2021")) {

                String penduduklapus18 = snapshot.getValue(String.class);
                pendlapus_manufaktur4.setText(penduduklapus18);
            }

            if (key.equals("PendudukLapUs_jasa_2021")) {

                String penduduklapus19 = snapshot.getValue(String.class);
                pendlapus_jasa4.setText(penduduklapus19);
            }

            if (key.equals("PendudukLapUs_jumlahbekerja_2021")) {

                String penduduklapus20 = snapshot.getValue(String.class);
                pendlapus_jumlahbekerja4.setText(penduduklapus20);
            }




            if (key.equals("PendudukLapUs_tahun_2022")) {

                String penduduklapus21 = snapshot.getValue(String.class);
                pendlapus_tahun5.setText(penduduklapus21);
            }

            if (key.equals("PendudukLapUs_pertanian_2022")) {

                String penduduklapus22 = snapshot.getValue(String.class);
                pendlapus_pertanian5.setText(penduduklapus22);
            }

            if (key.equals("PendudukLapUs_manufaktur_2022")) {

                String penduduklapus23 = snapshot.getValue(String.class);
                pendlapus_manufaktur5.setText(penduduklapus23);
            }

            if (key.equals("PendudukLapUs_jasa_2022")) {

                String penduduklapus24 = snapshot.getValue(String.class);
                pendlapus_jasa5.setText(penduduklapus24);
            }

            if (key.equals("PendudukLapUs_jumlahbekerja_2022")) {

                String penduduklapus25 = snapshot.getValue(String.class);
                pendlapus_jumlahbekerja5.setText(penduduklapus25);
            }




            if (key.equals("PendudukLapUs_tahun_2023")) {

                String penduduklapus26 = snapshot.getValue(String.class);
                pendlapus_tahun6.setText(penduduklapus26);
            }

            if (key.equals("PendudukLapUs_pertanian_2023")) {

                String penduduklapus27 = snapshot.getValue(String.class);
                pendlapus_pertanian6.setText(penduduklapus27);
            }

            if (key.equals("PendudukLapUs_manufaktur_2023")) {

                String penduduklapus28 = snapshot.getValue(String.class);
                pendlapus_manufaktur6.setText(penduduklapus28);
            }

            if (key.equals("PendudukLapUs_jasa_2023")) {

                String penduduklapus29 = snapshot.getValue(String.class);
                pendlapus_jasa6.setText(penduduklapus29);
            }

            if (key.equals("PendudukLapUs_jumlahbekerja_2023")) {

                String penduduklapus30 = snapshot.getValue(String.class);
                pendlapus_jumlahbekerja6.setText(penduduklapus30);
            }




            if (key.equals("PendudukLapUs_tahun_2024")) {

                String penduduklapus31 = snapshot.getValue(String.class);
                pendlapus_tahun7.setText(penduduklapus31);
            }

            if (key.equals("PendudukLapUs_pertanian_2024")) {

                String penduduklapus32 = snapshot.getValue(String.class);
                pendlapus_pertanian7.setText(penduduklapus32);
            }

            if (key.equals("PendudukLapUs_manufaktur_2024")) {

                String penduduklapus33 = snapshot.getValue(String.class);
                pendlapus_manufaktur7.setText(penduduklapus33);
            }

            if (key.equals("PendudukLapUs_jasa_2024")) {

                String penduduklapus34 = snapshot.getValue(String.class);
                pendlapus_jasa7.setText(penduduklapus34);
            }

            if (key.equals("PendudukLapUs_jumlahbekerja_2024")) {

                String penduduklapus35 = snapshot.getValue(String.class);
                pendlapus_jumlahbekerja7.setText(penduduklapus35);
            }




            if (key.equals("PendudukLapUs_tahun_2025")) {

                String penduduklapus36 = snapshot.getValue(String.class);
                pendlapus_tahun8.setText(penduduklapus36);
            }

            if (key.equals("PendudukLapUs_pertanian_2025")) {

                String penduduklapus37 = snapshot.getValue(String.class);
                pendlapus_pertanian8.setText(penduduklapus37);
            }

            if (key.equals("PendudukLapUs_manufaktur_2025")) {

                String penduduklapus38 = snapshot.getValue(String.class);
                pendlapus_manufaktur8.setText(penduduklapus38);
            }

            if (key.equals("PendudukLapUs_jasa_2025")) {

                String penduduklapus39 = snapshot.getValue(String.class);
                pendlapus_jasa8.setText(penduduklapus39);
            }

            if (key.equals("PendudukLapUs_jumlahbekerja_2025")) {

                String penduduklapus40 = snapshot.getValue(String.class);
                pendlapus_jumlahbekerja8.setText(penduduklapus40);
            }
        }
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        penduduklapusData1.addValueEventListener(this);
        penduduklapusData2.addValueEventListener(this);
        penduduklapusData3.addValueEventListener(this);
        penduduklapusData4.addValueEventListener(this);
        penduduklapusData5.addValueEventListener(this);

        penduduklapusData6.addValueEventListener(this);
        penduduklapusData7.addValueEventListener(this);
        penduduklapusData8.addValueEventListener(this);
        penduduklapusData9.addValueEventListener(this);
        penduduklapusData10.addValueEventListener(this);

        penduduklapusData11.addValueEventListener(this);
        penduduklapusData12.addValueEventListener(this);
        penduduklapusData13.addValueEventListener(this);
        penduduklapusData14.addValueEventListener(this);
        penduduklapusData15.addValueEventListener(this);

        penduduklapusData16.addValueEventListener(this);
        penduduklapusData17.addValueEventListener(this);
        penduduklapusData18.addValueEventListener(this);
        penduduklapusData19.addValueEventListener(this);
        penduduklapusData20.addValueEventListener(this);

        penduduklapusData21.addValueEventListener(this);
        penduduklapusData22.addValueEventListener(this);
        penduduklapusData23.addValueEventListener(this);
        penduduklapusData24.addValueEventListener(this);
        penduduklapusData25.addValueEventListener(this);

        penduduklapusData26.addValueEventListener(this);
        penduduklapusData27.addValueEventListener(this);
        penduduklapusData28.addValueEventListener(this);
        penduduklapusData29.addValueEventListener(this);
        penduduklapusData30.addValueEventListener(this);

        penduduklapusData31.addValueEventListener(this);
        penduduklapusData32.addValueEventListener(this);
        penduduklapusData33.addValueEventListener(this);
        penduduklapusData34.addValueEventListener(this);
        penduduklapusData35.addValueEventListener(this);

        penduduklapusData36.addValueEventListener(this);
        penduduklapusData37.addValueEventListener(this);
        penduduklapusData38.addValueEventListener(this);
        penduduklapusData39.addValueEventListener(this);
        penduduklapusData40.addValueEventListener(this);
    }
}