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

public class PdrbluarActivity extends AppCompatActivity implements ValueEventListener {

    TextView PDRBpengeluaran_tahun1, PDRBpengeluaran_tahun2, PDRBpengeluaran_tahun3, PDRBpengeluaran_tahun4, PDRBpengeluaran_tahun5, PDRBpengeluaran_tahun6, PDRBpengeluaran_tahun7, PDRBpengeluaran_tahun8, PDRBpengeluaran_tahun9, PDRBpengeluaran_tahun10, PDRBpengeluaran_tahun11,
            PDRBpengeluaran_adhb1, PDRBpengeluaran_adhb2, PDRBpengeluaran_adhb3, PDRBpengeluaran_adhb4, PDRBpengeluaran_adhb5, PDRBpengeluaran_adhb6, PDRBpengeluaran_adhb7, PDRBpengeluaran_adhb8, PDRBpengeluaran_adhb9, PDRBpengeluaran_adhb10, PDRBpengeluaran_adhb11,
            PDRBpengeluaran_adhk1, PDRBpengeluaran_adhk2, PDRBpengeluaran_adhk3, PDRBpengeluaran_adhk4, PDRBpengeluaran_adhk5, PDRBpengeluaran_adhk6, PDRBpengeluaran_adhk7, PDRBpengeluaran_adhk8, PDRBpengeluaran_adhk9, PDRBpengeluaran_adhk10, PDRBpengeluaran_adhk11,
            PDRBpengeluaran_pertumbuhan1, PDRBpengeluaran_pertumbuhan2, PDRBpengeluaran_pertumbuhan3, PDRBpengeluaran_pertumbuhan4, PDRBpengeluaran_pertumbuhan5, PDRBpengeluaran_pertumbuhan6, PDRBpengeluaran_pertumbuhan7, PDRBpengeluaran_pertumbuhan8, PDRBpengeluaran_pertumbuhan9, PDRBpengeluaran_pertumbuhan10,PDRBpengeluaran_pertumbuhan11;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference PDRBpengeluaranData1 = databaseReference.child("PDRBpengeluaran_tahun_2020");
    private DatabaseReference PDRBpengeluaranData2 = databaseReference.child("PDRBpengeluaran_adhb_2020");
    private DatabaseReference PDRBpengeluaranData3 = databaseReference.child("PDRBpengeluaran_adhk_2020");
    private DatabaseReference PDRBpengeluaranData4 = databaseReference.child("PDRBpengeluaran_pertumbuhan_2020");

    private DatabaseReference PDRBpengeluaranData5 = databaseReference.child("PDRBpengeluaran_tahun_2019");
    private DatabaseReference PDRBpengeluaranData6 = databaseReference.child("PDRBpengeluaran_adhb_2019");
    private DatabaseReference PDRBpengeluaranData7 = databaseReference.child("PDRBpengeluaran_adhk_2019");
    private DatabaseReference PDRBpengeluaranData8 = databaseReference.child("PDRBpengeluaran_pertumbuhan_2019");

    private DatabaseReference PDRBpengeluaranData9 = databaseReference.child("PDRBpengeluaran_tahun_2018");
    private DatabaseReference PDRBpengeluaranData10 = databaseReference.child("PDRBpengeluaran_adhb_2018");
    private DatabaseReference PDRBpengeluaranData11 = databaseReference.child("PDRBpengeluaran_adhk_2018");
    private DatabaseReference PDRBpengeluaranData12 = databaseReference.child("PDRBpengeluaran_pertumbuhan_2018");

    private DatabaseReference PDRBpengeluaranData13 = databaseReference.child("PDRBpengeluaran_tahun_2017");
    private DatabaseReference PDRBpengeluaranData14 = databaseReference.child("PDRBpengeluaran_adhb_2017");
    private DatabaseReference PDRBpengeluaranData15 = databaseReference.child("PDRBpengeluaran_adhk_2017");
    private DatabaseReference PDRBpengeluaranData16 = databaseReference.child("PDRBpengeluaran_pertumbuhan_2017");

    private DatabaseReference PDRBpengeluaranData17 = databaseReference.child("PDRBpengeluaran_tahun_2016");
    private DatabaseReference PDRBpengeluaranData18 = databaseReference.child("PDRBpengeluaran_adhb_2016");
    private DatabaseReference PDRBpengeluaranData19 = databaseReference.child("PDRBpengeluaran_adhk_2016");
    private DatabaseReference PDRBpengeluaranData20 = databaseReference.child("PDRBpengeluaran_pertumbuhan_2016");

    private DatabaseReference PDRBpengeluaranData21 = databaseReference.child("PDRBpengeluaran_tahun_2015");
    private DatabaseReference PDRBpengeluaranData22 = databaseReference.child("PDRBpengeluaran_adhb_2015");
    private DatabaseReference PDRBpengeluaranData23 = databaseReference.child("PDRBpengeluaran_adhk_2015");
    private DatabaseReference PDRBpengeluaranData24 = databaseReference.child("PDRBpengeluaran_pertumbuhan_2015");

    private DatabaseReference PDRBpengeluaranData25 = databaseReference.child("PDRBpengeluaran_tahun_2021");
    private DatabaseReference PDRBpengeluaranData26 = databaseReference.child("PDRBpengeluaran_adhb_2021");
    private DatabaseReference PDRBpengeluaranData27 = databaseReference.child("PDRBpengeluaran_adhk_2021");
    private DatabaseReference PDRBpengeluaranData28 = databaseReference.child("PDRBpengeluaran_pertumbuhan_2021");

    private DatabaseReference PDRBpengeluaranData29 = databaseReference.child("PDRBpengeluaran_tahun_2022");
    private DatabaseReference PDRBpengeluaranData30 = databaseReference.child("PDRBpengeluaran_adhb_2022");
    private DatabaseReference PDRBpengeluaranData31 = databaseReference.child("PDRBpengeluaran_adhk_2022");
    private DatabaseReference PDRBpengeluaranData32 = databaseReference.child("PDRBpengeluaran_pertumbuhan_2022");

    private DatabaseReference PDRBpengeluaranData33 = databaseReference.child("PDRBpengeluaran_tahun_2023");
    private DatabaseReference PDRBpengeluaranData34 = databaseReference.child("PDRBpengeluaran_adhb_2023");
    private DatabaseReference PDRBpengeluaranData35 = databaseReference.child("PDRBpengeluaran_adhk_2023");
    private DatabaseReference PDRBpengeluaranData36 = databaseReference.child("PDRBpengeluaran_pertumbuhan_2023");

    private DatabaseReference PDRBpengeluaranData37 = databaseReference.child("PDRBpengeluaran_tahun_2024");
    private DatabaseReference PDRBpengeluaranData38 = databaseReference.child("PDRBpengeluaran_adhb_2024");
    private DatabaseReference PDRBpengeluaranData39 = databaseReference.child("PDRBpengeluaran_adhk_2024");
    private DatabaseReference PDRBpengeluaranData40 = databaseReference.child("PDRBpengeluaran_pertumbuhan_2024");

    private DatabaseReference PDRBpengeluaranData41 = databaseReference.child("PDRBpengeluaran_tahun_2025");
    private DatabaseReference PDRBpengeluaranData42 = databaseReference.child("PDRBpengeluaran_adhb_2025");
    private DatabaseReference PDRBpengeluaranData43 = databaseReference.child("PDRBpengeluaran_adhk_2025");
    private DatabaseReference PDRBpengeluaranData44 = databaseReference.child("PDRBpengeluaran_pertumbuhan_2025");




    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdrbluar);

        PDRBpengeluaran_tahun1 = (TextView)findViewById(R.id.pdrbluar_tahun1);
        PDRBpengeluaran_adhb1 = (TextView)findViewById(R.id.pdrbluar_adhb1);
        PDRBpengeluaran_adhk1 = (TextView)findViewById(R.id.pdrbluar_adhk1);
        PDRBpengeluaran_pertumbuhan1 = (TextView)findViewById(R.id.pdrbluar_pertumbuhan1);

        PDRBpengeluaran_tahun2 = (TextView)findViewById(R.id.pdrbluar_tahun2);
        PDRBpengeluaran_adhb2 = (TextView)findViewById(R.id.pdrbluar_adhb2);
        PDRBpengeluaran_adhk2 = (TextView)findViewById(R.id.pdrbluar_adhk2);
        PDRBpengeluaran_pertumbuhan2 = (TextView)findViewById(R.id.pdrbluar_pertumbuhan2);

        PDRBpengeluaran_tahun3 = (TextView)findViewById(R.id.pdrbluar_tahun3);
        PDRBpengeluaran_adhb3 = (TextView)findViewById(R.id.pdrbluar_adhb3);
        PDRBpengeluaran_adhk3 = (TextView)findViewById(R.id.pdrbluar_adhk3);
        PDRBpengeluaran_pertumbuhan3 = (TextView)findViewById(R.id.pdrbluar_pertumbuhan3);

        PDRBpengeluaran_tahun4 = (TextView)findViewById(R.id.pdrbluar_tahun4);
        PDRBpengeluaran_adhb4 = (TextView)findViewById(R.id.pdrbluar_adhb4);
        PDRBpengeluaran_adhk4 = (TextView)findViewById(R.id.pdrbluar_adhk4);
        PDRBpengeluaran_pertumbuhan4 = (TextView)findViewById(R.id.pdrbluar_pertumbuhan4);

        PDRBpengeluaran_tahun5 = (TextView)findViewById(R.id.pdrbluar_tahun5);
        PDRBpengeluaran_adhb5 = (TextView)findViewById(R.id.pdrbluar_adhb5);
        PDRBpengeluaran_adhk5 = (TextView)findViewById(R.id.pdrbluar_adhk5);
        PDRBpengeluaran_pertumbuhan5 = (TextView)findViewById(R.id.pdrbluar_pertumbuhan5);

        PDRBpengeluaran_tahun6 = (TextView)findViewById(R.id.pdrbluar_tahun6);
        PDRBpengeluaran_adhb6 = (TextView)findViewById(R.id.pdrbluar_adhb6);
        PDRBpengeluaran_adhk6 = (TextView)findViewById(R.id.pdrbluar_adhk6);
        PDRBpengeluaran_pertumbuhan6 = (TextView)findViewById(R.id.pdrbluar_pertumbuhan6);

        PDRBpengeluaran_tahun7 = (TextView)findViewById(R.id.pdrbluar_tahunNew1);
        PDRBpengeluaran_adhb7 = (TextView)findViewById(R.id.pdrbluar_adhbNew1);
        PDRBpengeluaran_adhk7 = (TextView)findViewById(R.id.pdrbluar_adhkNew1);
        PDRBpengeluaran_pertumbuhan7 = (TextView)findViewById(R.id.pdrbluar_pertumbuhanNew1);

        PDRBpengeluaran_tahun8 = (TextView)findViewById(R.id.pdrbluar_tahunNew2);
        PDRBpengeluaran_adhb8 = (TextView)findViewById(R.id.pdrbluar_adhbNew2);
        PDRBpengeluaran_adhk8 = (TextView)findViewById(R.id.pdrbluar_adhkNew2);
        PDRBpengeluaran_pertumbuhan8 = (TextView)findViewById(R.id.pdrbluar_pertumbuhanNew2);

        PDRBpengeluaran_tahun9 = (TextView)findViewById(R.id.pdrbluar_tahunNew3);
        PDRBpengeluaran_adhb9 = (TextView)findViewById(R.id.pdrbluar_adhbNew3);
        PDRBpengeluaran_adhk9 = (TextView)findViewById(R.id.pdrbluar_adhkNew3);
        PDRBpengeluaran_pertumbuhan9 = (TextView)findViewById(R.id.pdrbluar_pertumbuhanNew3);

        PDRBpengeluaran_tahun10 = (TextView)findViewById(R.id.pdrbluar_tahunNew4);
        PDRBpengeluaran_adhb10 = (TextView)findViewById(R.id.pdrbluar_adhbNew4);
        PDRBpengeluaran_adhk10 = (TextView)findViewById(R.id.pdrbluar_adhkNew4);
        PDRBpengeluaran_pertumbuhan10 = (TextView)findViewById(R.id.pdrbluar_pertumbuhanNew4);

        PDRBpengeluaran_tahun11 = (TextView)findViewById(R.id.pdrbluar_tahunNew5);
        PDRBpengeluaran_adhb11 = (TextView)findViewById(R.id.pdrbluar_adhbNew5);
        PDRBpengeluaran_adhk11 = (TextView)findViewById(R.id.pdrbluar_adhkNew5);
        PDRBpengeluaran_pertumbuhan11 = (TextView)findViewById(R.id.pdrbluar_pertumbuhanNew5);



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.pdrbluar);
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
        Intent intent = new Intent(PdrbluarActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(PdrbluarActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(PdrbluarActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }


    public void back(View view) {
        Intent intent = new Intent(PdrbluarActivity.this, EkonomiActivity.class);
        startActivity(intent);
    }

    public void distluar(View view) {
        Intent intent = new Intent(PdrbluarActivity.this, InfopdrbluarActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("PDRBpengeluaran_tahun_2020")) {

                String PDRBpengeluaran1 = snapshot.getValue(String.class);
                PDRBpengeluaran_tahun1.setText(PDRBpengeluaran1);
            }

            if (key.equals("PDRBpengeluaran_adhb_2020")) {

                String PDRBpengeluaran2 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhb1.setText(PDRBpengeluaran2);
            }

            if (key.equals("PDRBpengeluaran_adhk_2020")) {

                String PDRBpengeluaran3 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhk1.setText(PDRBpengeluaran3);
            }

            if (key.equals("PDRBpengeluaran_pertumbuhan_2020")) {

                String PDRBpengeluaran4 = snapshot.getValue(String.class);
                PDRBpengeluaran_pertumbuhan1.setText(PDRBpengeluaran4);
            }


            if (key.equals("PDRBpengeluaran_tahun_2019")) {

                String PDRBpengeluaran5 = snapshot.getValue(String.class);
                PDRBpengeluaran_tahun2.setText(PDRBpengeluaran5);
            }

            if (key.equals("PDRBpengeluaran_adhb_2019")) {

                String PDRBpengeluaran6 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhb2.setText(PDRBpengeluaran6);
            }

            if (key.equals("PDRBpengeluaran_adhk_2019")) {

                String PDRBpengeluaran7 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhk2.setText(PDRBpengeluaran7);
            }

            if (key.equals("PDRBpengeluaran_pertumbuhan_2019")) {

                String PDRBpengeluaran8 = snapshot.getValue(String.class);
                PDRBpengeluaran_pertumbuhan2.setText(PDRBpengeluaran8);
            }


            if (key.equals("PDRBpengeluaran_tahun_2018")) {

                String PDRBpengeluaran9 = snapshot.getValue(String.class);
                PDRBpengeluaran_tahun3.setText(PDRBpengeluaran9);
            }

            if (key.equals("PDRBpengeluaran_adhb_2018")) {

                String PDRBpengeluaran10 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhb3.setText(PDRBpengeluaran10);
            }

            if (key.equals("PDRBpengeluaran_adhk_2018")) {

                String PDRBpengeluaran11 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhk3.setText(PDRBpengeluaran11);
            }

            if (key.equals("PDRBpengeluaran_pertumbuhan_2018")) {

                String PDRBpengeluaran12 = snapshot.getValue(String.class);
                PDRBpengeluaran_pertumbuhan3.setText(PDRBpengeluaran12);
            }


            if (key.equals("PDRBpengeluaran_tahun_2017")) {

                String PDRBpengeluaran13 = snapshot.getValue(String.class);
                PDRBpengeluaran_tahun4.setText(PDRBpengeluaran13);
            }

            if (key.equals("PDRBpengeluaran_adhb_2017")) {

                String PDRBpengeluaran14 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhb4.setText(PDRBpengeluaran14);
            }

            if (key.equals("PDRBpengeluaran_adhk_2017")) {

                String PDRBpengeluaran15 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhk4.setText(PDRBpengeluaran15);
            }

            if (key.equals("PDRBpengeluaran_pertumbuhan_2017")) {

                String PDRBpengeluaran16 = snapshot.getValue(String.class);
                PDRBpengeluaran_pertumbuhan4.setText(PDRBpengeluaran16);
            }


            if (key.equals("PDRBpengeluaran_tahun_2016")) {

                String PDRBpengeluaran17 = snapshot.getValue(String.class);
                PDRBpengeluaran_tahun5.setText(PDRBpengeluaran17);
            }

            if (key.equals("PDRBpengeluaran_adhb_2016")) {

                String PDRBpengeluaran18 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhb5.setText(PDRBpengeluaran18);
            }

            if (key.equals("PDRBpengeluaran_adhk_2016")) {

                String PDRBpengeluaran19 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhk5.setText(PDRBpengeluaran19);
            }

            if (key.equals("PDRBpengeluaran_pertumbuhan_2016")) {

                String PDRBpengeluaran20 = snapshot.getValue(String.class);
                PDRBpengeluaran_pertumbuhan5.setText(PDRBpengeluaran20);
            }


            if (key.equals("PDRBpengeluaran_tahun_2015")) {

                String PDRBpengeluaran21 = snapshot.getValue(String.class);
                PDRBpengeluaran_tahun6.setText(PDRBpengeluaran21);
            }

            if (key.equals("PDRBpengeluaran_adhb_2015")) {

                String PDRBpengeluaran22 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhb6.setText(PDRBpengeluaran22);
            }

            if (key.equals("PDRBpengeluaran_adhk_2015")) {

                String PDRBpengeluaran23 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhk6.setText(PDRBpengeluaran23);
            }

            if (key.equals("PDRBpengeluaran_pertumbuhan_2015")) {

                String PDRBpengeluaran24 = snapshot.getValue(String.class);
                PDRBpengeluaran_pertumbuhan6.setText(PDRBpengeluaran24);
            }



            if (key.equals("PDRBpengeluaran_tahun_2021")) {

                String PDRBpengeluaran25 = snapshot.getValue(String.class);
                PDRBpengeluaran_tahun7.setText(PDRBpengeluaran25);
            }

            if (key.equals("PDRBpengeluaran_adhb_2021")) {

                String PDRBpengeluaran26 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhb7.setText(PDRBpengeluaran26);
            }

            if (key.equals("PDRBpengeluaran_adhk_2021")) {

                String PDRBpengeluaran27 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhk7.setText(PDRBpengeluaran27);
            }

            if (key.equals("PDRBpengeluaran_pertumbuhan_2021")) {

                String PDRBpengeluaran28 = snapshot.getValue(String.class);
                PDRBpengeluaran_pertumbuhan7.setText(PDRBpengeluaran28);
            }




            if (key.equals("PDRBpengeluaran_tahun_2022")) {

                String PDRBpengeluaran29 = snapshot.getValue(String.class);
                PDRBpengeluaran_tahun8.setText(PDRBpengeluaran29);
            }

            if (key.equals("PDRBpengeluaran_adhb_2022")) {

                String PDRBpengeluaran30 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhb8.setText(PDRBpengeluaran30);
            }

            if (key.equals("PDRBpengeluaran_adhk_2022")) {

                String PDRBpengeluaran31 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhk8.setText(PDRBpengeluaran31);
            }

            if (key.equals("PDRBpengeluaran_pertumbuhan_2022")) {

                String PDRBpengeluaran32 = snapshot.getValue(String.class);
                PDRBpengeluaran_pertumbuhan8.setText(PDRBpengeluaran32);
            }




            if (key.equals("PDRBpengeluaran_tahun_2023")) {

                String PDRBpengeluaran33 = snapshot.getValue(String.class);
                PDRBpengeluaran_tahun9.setText(PDRBpengeluaran33);
            }

            if (key.equals("PDRBpengeluaran_adhb_2023")) {

                String PDRBpengeluaran34 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhb9.setText(PDRBpengeluaran34);
            }

            if (key.equals("PDRBpengeluaran_adhk_2023")) {

                String PDRBpengeluaran35 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhk9.setText(PDRBpengeluaran35);
            }

            if (key.equals("PDRBpengeluaran_pertumbuhan_2023")) {

                String PDRBpengeluaran36 = snapshot.getValue(String.class);
                PDRBpengeluaran_pertumbuhan9.setText(PDRBpengeluaran36);
            }



            if (key.equals("PDRBpengeluaran_tahun_2024")) {

                String PDRBpengeluaran37 = snapshot.getValue(String.class);
                PDRBpengeluaran_tahun10.setText(PDRBpengeluaran37);
            }

            if (key.equals("PDRBpengeluaran_adhb_2024")) {

                String PDRBpengeluaran38 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhb10.setText(PDRBpengeluaran38);
            }

            if (key.equals("PDRBpengeluaran_adhk_2024")) {

                String PDRBpengeluaran39 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhk10.setText(PDRBpengeluaran39);
            }

            if (key.equals("PDRBpengeluaran_pertumbuhan_2024")) {

                String PDRBpengeluaran40 = snapshot.getValue(String.class);
                PDRBpengeluaran_pertumbuhan10.setText(PDRBpengeluaran40);
            }



            if (key.equals("PDRBpengeluaran_tahun_2025")) {

                String PDRBpengeluaran41 = snapshot.getValue(String.class);
                PDRBpengeluaran_tahun11.setText(PDRBpengeluaran41);
            }

            if (key.equals("PDRBpengeluaran_adhb_2025")) {

                String PDRBpengeluaran42 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhb11.setText(PDRBpengeluaran42);
            }

            if (key.equals("PDRBpengeluaran_adhk_2025")) {

                String PDRBpengeluaran43 = snapshot.getValue(String.class);
                PDRBpengeluaran_adhk11.setText(PDRBpengeluaran43);
            }

            if (key.equals("PDRBpengeluaran_pertumbuhan_2025")) {

                String PDRBpengeluaran44 = snapshot.getValue(String.class);
                PDRBpengeluaran_pertumbuhan11.setText(PDRBpengeluaran44);
            }

        }
        
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        PDRBpengeluaranData1.addValueEventListener(this);
        PDRBpengeluaranData2.addValueEventListener(this);
        PDRBpengeluaranData3.addValueEventListener(this);
        PDRBpengeluaranData4.addValueEventListener(this);

        PDRBpengeluaranData5.addValueEventListener(this);
        PDRBpengeluaranData6.addValueEventListener(this);
        PDRBpengeluaranData7.addValueEventListener(this);
        PDRBpengeluaranData8.addValueEventListener(this);

        PDRBpengeluaranData9.addValueEventListener(this);
        PDRBpengeluaranData10.addValueEventListener(this);
        PDRBpengeluaranData11.addValueEventListener(this);
        PDRBpengeluaranData12.addValueEventListener(this);

        PDRBpengeluaranData13.addValueEventListener(this);
        PDRBpengeluaranData14.addValueEventListener(this);
        PDRBpengeluaranData15.addValueEventListener(this);
        PDRBpengeluaranData16.addValueEventListener(this);

        PDRBpengeluaranData17.addValueEventListener(this);
        PDRBpengeluaranData18.addValueEventListener(this);
        PDRBpengeluaranData19.addValueEventListener(this);
        PDRBpengeluaranData20.addValueEventListener(this);

        PDRBpengeluaranData21.addValueEventListener(this);
        PDRBpengeluaranData22.addValueEventListener(this);
        PDRBpengeluaranData23.addValueEventListener(this);
        PDRBpengeluaranData24.addValueEventListener(this);

        PDRBpengeluaranData25.addValueEventListener(this);
        PDRBpengeluaranData26.addValueEventListener(this);
        PDRBpengeluaranData27.addValueEventListener(this);
        PDRBpengeluaranData28.addValueEventListener(this);

        PDRBpengeluaranData29.addValueEventListener(this);
        PDRBpengeluaranData30.addValueEventListener(this);
        PDRBpengeluaranData31.addValueEventListener(this);
        PDRBpengeluaranData32.addValueEventListener(this);

        PDRBpengeluaranData33.addValueEventListener(this);
        PDRBpengeluaranData34.addValueEventListener(this);
        PDRBpengeluaranData35.addValueEventListener(this);
        PDRBpengeluaranData36.addValueEventListener(this);

        PDRBpengeluaranData37.addValueEventListener(this);
        PDRBpengeluaranData38.addValueEventListener(this);
        PDRBpengeluaranData39.addValueEventListener(this);
        PDRBpengeluaranData40.addValueEventListener(this);

        PDRBpengeluaranData41.addValueEventListener(this);
        PDRBpengeluaranData42.addValueEventListener(this);
        PDRBpengeluaranData43.addValueEventListener(this);
        PDRBpengeluaranData44.addValueEventListener(this);
    }
    
}