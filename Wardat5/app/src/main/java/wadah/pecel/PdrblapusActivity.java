package wadah.pecel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TableLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class PdrblapusActivity extends AppCompatActivity implements ValueEventListener {

    TextView PDRBlapus_tahun1, PDRBlapus_tahun2, PDRBlapus_tahun3, PDRBlapus_tahun4, PDRBlapus_tahun5, PDRBlapus_tahun6, PDRBlapus_tahun7, PDRBlapus_tahun8, PDRBlapus_tahun9, PDRBlapus_tahun10, PDRBlapus_tahun11,
            PDRBlapus_adhb1, PDRBlapus_adhb2, PDRBlapus_adhb3, PDRBlapus_adhb4, PDRBlapus_adhb5, PDRBlapus_adhb6, PDRBlapus_adhb7, PDRBlapus_adhb8, PDRBlapus_adhb9, PDRBlapus_adhb10, PDRBlapus_adhb11,
            PDRBlapus_adhk1, PDRBlapus_adhk2, PDRBlapus_adhk3, PDRBlapus_adhk4, PDRBlapus_adhk5, PDRBlapus_adhk6, PDRBlapus_adhk7, PDRBlapus_adhk8, PDRBlapus_adhk9, PDRBlapus_adhk10, PDRBlapus_adhk11,
            PDRBlapus_pertumbuhan1, PDRBlapus_pertumbuhan2, PDRBlapus_pertumbuhan3, PDRBlapus_pertumbuhan4, PDRBlapus_pertumbuhan5, PDRBlapus_pertumbuhan6, PDRBlapus_pertumbuhan7, PDRBlapus_pertumbuhan8, PDRBlapus_pertumbuhan9,PDRBlapus_pertumbuhan10, PDRBlapus_pertumbuhan11;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference PDRBlapusData1 = databaseReference.child("PDRBlapus_tahun_2020");
    private DatabaseReference PDRBlapusData2 = databaseReference.child("PDRBlapus_adhb_2020");
    private DatabaseReference PDRBlapusData3 = databaseReference.child("PDRBlapus_adhk_2020");
    private DatabaseReference PDRBlapusData4 = databaseReference.child("PDRBlapus_pertumbuhan_2020");

    private DatabaseReference PDRBlapusData5 = databaseReference.child("PDRBlapus_tahun_2019");
    private DatabaseReference PDRBlapusData6 = databaseReference.child("PDRBlapus_adhb_2019");
    private DatabaseReference PDRBlapusData7 = databaseReference.child("PDRBlapus_adhk_2019");
    private DatabaseReference PDRBlapusData8 = databaseReference.child("PDRBlapus_pertumbuhan_2019");

    private DatabaseReference PDRBlapusData9 = databaseReference.child("PDRBlapus_tahun_2018");
    private DatabaseReference PDRBlapusData10 = databaseReference.child("PDRBlapus_adhb_2018");
    private DatabaseReference PDRBlapusData11 = databaseReference.child("PDRBlapus_adhk_2018");
    private DatabaseReference PDRBlapusData12 = databaseReference.child("PDRBlapus_pertumbuhan_2018");

    private DatabaseReference PDRBlapusData13 = databaseReference.child("PDRBlapus_tahun_2017");
    private DatabaseReference PDRBlapusData14 = databaseReference.child("PDRBlapus_adhb_2017");
    private DatabaseReference PDRBlapusData15 = databaseReference.child("PDRBlapus_adhk_2017");
    private DatabaseReference PDRBlapusData16 = databaseReference.child("PDRBlapus_pertumbuhan_2017");

    private DatabaseReference PDRBlapusData17 = databaseReference.child("PDRBlapus_tahun_2016");
    private DatabaseReference PDRBlapusData18 = databaseReference.child("PDRBlapus_adhb_2016");
    private DatabaseReference PDRBlapusData19 = databaseReference.child("PDRBlapus_adhk_2016");
    private DatabaseReference PDRBlapusData20 = databaseReference.child("PDRBlapus_pertumbuhan_2016");

    private DatabaseReference PDRBlapusData21 = databaseReference.child("PDRBlapus_tahun_2015");
    private DatabaseReference PDRBlapusData22 = databaseReference.child("PDRBlapus_adhb_2015");
    private DatabaseReference PDRBlapusData23 = databaseReference.child("PDRBlapus_adhk_2015");
    private DatabaseReference PDRBlapusData24 = databaseReference.child("PDRBlapus_pertumbuhan_2015");

    private DatabaseReference PDRBlapusData25 = databaseReference.child("PDRBlapus_tahun_2021");
    private DatabaseReference PDRBlapusData26 = databaseReference.child("PDRBlapus_adhb_2021");
    private DatabaseReference PDRBlapusData27 = databaseReference.child("PDRBlapus_adhk_2021");
    private DatabaseReference PDRBlapusData28 = databaseReference.child("PDRBlapus_pertumbuhan_2021");

    private DatabaseReference PDRBlapusData29 = databaseReference.child("PDRBlapus_tahun_2022");
    private DatabaseReference PDRBlapusData30 = databaseReference.child("PDRBlapus_adhb_2022");
    private DatabaseReference PDRBlapusData31 = databaseReference.child("PDRBlapus_adhk_2022");
    private DatabaseReference PDRBlapusData32 = databaseReference.child("PDRBlapus_pertumbuhan_2022");

    private DatabaseReference PDRBlapusData33 = databaseReference.child("PDRBlapus_tahun_2023");
    private DatabaseReference PDRBlapusData34 = databaseReference.child("PDRBlapus_adhb_2023");
    private DatabaseReference PDRBlapusData35 = databaseReference.child("PDRBlapus_adhk_2023");
    private DatabaseReference PDRBlapusData36 = databaseReference.child("PDRBlapus_pertumbuhan_2023");

    private DatabaseReference PDRBlapusData37 = databaseReference.child("PDRBlapus_tahun_2024");
    private DatabaseReference PDRBlapusData38 = databaseReference.child("PDRBlapus_adhb_2024");
    private DatabaseReference PDRBlapusData39 = databaseReference.child("PDRBlapus_adhk_2024");
    private DatabaseReference PDRBlapusData40 = databaseReference.child("PDRBlapus_pertumbuhan_2024");

    private DatabaseReference PDRBlapusData41 = databaseReference.child("PDRBlapus_tahun_2025");
    private DatabaseReference PDRBlapusData42 = databaseReference.child("PDRBlapus_adhb_2025");
    private DatabaseReference PDRBlapusData43 = databaseReference.child("PDRBlapus_adhk_2025");
    private DatabaseReference PDRBlapusData44 = databaseReference.child("PDRBlapus_pertumbuhan_2025");





    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdrblapus);




        PDRBlapus_tahun1 = (TextView)findViewById(R.id.pdrblapus_tahun1);
        PDRBlapus_adhb1 = (TextView)findViewById(R.id.pdrblapus_adhb1);
        PDRBlapus_adhk1 = (TextView)findViewById(R.id.pdrblapus_adhk1);
        PDRBlapus_pertumbuhan1 = (TextView)findViewById(R.id.Pertumbuhan_pdrblapus_1);

        PDRBlapus_tahun2 = (TextView)findViewById(R.id.pdrblapus_tahun2);
        PDRBlapus_adhb2 = (TextView)findViewById(R.id.pdrblapus_adhb2);
        PDRBlapus_adhk2 = (TextView)findViewById(R.id.pdrblapus_adhk2);
        PDRBlapus_pertumbuhan2 = (TextView)findViewById(R.id.Pertumbuhan_pdrblapus_2);

        PDRBlapus_tahun3 = (TextView)findViewById(R.id.pdrblapus_tahun3);
        PDRBlapus_adhb3 = (TextView)findViewById(R.id.pdrblapus_adhb3);
        PDRBlapus_adhk3 = (TextView)findViewById(R.id.pdrblapus_adhk3);
        PDRBlapus_pertumbuhan3 = (TextView)findViewById(R.id.Pertumbuhan_pdrblapus_3);

        PDRBlapus_tahun4 = (TextView)findViewById(R.id.pdrblapus_tahun4);
        PDRBlapus_adhb4 = (TextView)findViewById(R.id.pdrblapus_adhb4);
        PDRBlapus_adhk4 = (TextView)findViewById(R.id.pdrblapus_adhk4);
        PDRBlapus_pertumbuhan4 = (TextView)findViewById(R.id.Pertumbuhan_pdrblapus_4);

        PDRBlapus_tahun5 = (TextView)findViewById(R.id.pdrblapus_tahun5);
        PDRBlapus_adhb5 = (TextView)findViewById(R.id.pdrblapus_adhb5);
        PDRBlapus_adhk5 = (TextView)findViewById(R.id.pdrblapus_adhk5);
        PDRBlapus_pertumbuhan5 = (TextView)findViewById(R.id.Pertumbuhan_pdrblapus_5);

        PDRBlapus_tahun6 = (TextView)findViewById(R.id.pdrblapus_tahun6);
        PDRBlapus_adhb6 = (TextView)findViewById(R.id.pdrblapus_adhb6);
        PDRBlapus_adhk6 = (TextView)findViewById(R.id.pdrblapus_adhk6);
        PDRBlapus_pertumbuhan6 = (TextView)findViewById(R.id.Pertumbuhan_pdrblapus_6);

        PDRBlapus_tahun7 = (TextView)findViewById(R.id.pdrblapus_tahunNew1);
        PDRBlapus_adhb7 = (TextView)findViewById(R.id.pdrblapus_adhbNew1);
        PDRBlapus_adhk7 = (TextView)findViewById(R.id.pdrblapus_adhkNew1);
        PDRBlapus_pertumbuhan7 = (TextView)findViewById(R.id.Pertumbuhan_pdrblapus_New1);

        PDRBlapus_tahun8 = (TextView)findViewById(R.id.pdrblapus_tahunNew2);
        PDRBlapus_adhb8 = (TextView)findViewById(R.id.pdrblapus_adhbNew2);
        PDRBlapus_adhk8 = (TextView)findViewById(R.id.pdrblapus_adhkNew2);
        PDRBlapus_pertumbuhan8 = (TextView)findViewById(R.id.Pertumbuhan_pdrblapus_New2);

        PDRBlapus_tahun9 = (TextView)findViewById(R.id.pdrblapus_tahunNew3);
        PDRBlapus_adhb9 = (TextView)findViewById(R.id.pdrblapus_adhbNew3);
        PDRBlapus_adhk9 = (TextView)findViewById(R.id.pdrblapus_adhkNew3);
        PDRBlapus_pertumbuhan9 = (TextView)findViewById(R.id.Pertumbuhan_pdrblapus_New3);

        PDRBlapus_tahun10 = (TextView)findViewById(R.id.pdrblapus_tahunNew4);
        PDRBlapus_adhb10 = (TextView)findViewById(R.id.pdrblapus_adhbNew4);
        PDRBlapus_adhk10 = (TextView)findViewById(R.id.pdrblapus_adhkNew4);
        PDRBlapus_pertumbuhan10 = (TextView)findViewById(R.id.Pertumbuhan_pdrblapus_New4);

        PDRBlapus_tahun11 = (TextView)findViewById(R.id.pdrblapus_tahunNew5);
        PDRBlapus_adhb11 = (TextView)findViewById(R.id.pdrblapus_adhbNew5);
        PDRBlapus_adhk11 = (TextView)findViewById(R.id.pdrblapus_adhkNew5);
        PDRBlapus_pertumbuhan11 = (TextView)findViewById(R.id.Pertumbuhan_pdrblapus_New5);



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.pdrblapus);
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
        Intent intent = new Intent(PdrblapusActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(PdrblapusActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(PdrblapusActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }


    public void back(View view) {
        Intent intent = new Intent(PdrblapusActivity.this, EkonomiActivity.class);
        startActivity(intent);
    }

  /*  public void pdrblapus(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.pdrblapus);
        //menjalankanya pada imageview
        Animation startAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
        //memanggil resource animasi di folder res anim zoom_in.xml
        imageView.startAnimation(startAnimation);
        //mulai animasi
    } */

    public void distlapus(View view) {
        Intent intent = new Intent(PdrblapusActivity.this, InfopdrbluActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("PDRBlapus_tahun_2020")) {

                String PDRBlapus1 = snapshot.getValue(String.class);
                PDRBlapus_tahun1.setText(PDRBlapus1);
            }

            if (key.equals("PDRBlapus_adhb_2020")) {

                String PDRBlapus2 = snapshot.getValue(String.class);
                PDRBlapus_adhb1.setText(PDRBlapus2);
            }

            if (key.equals("PDRBlapus_adhk_2020")) {

                String PDRBlapus3 = snapshot.getValue(String.class);
                PDRBlapus_adhk1.setText(PDRBlapus3);
            }

            if (key.equals("PDRBlapus_pertumbuhan_2020")) {

                String PDRBlapus4 = snapshot.getValue(String.class);
                PDRBlapus_pertumbuhan1.setText(PDRBlapus4);
            }


            if (key.equals("PDRBlapus_tahun_2019")) {

                String PDRBlapus5 = snapshot.getValue(String.class);
                PDRBlapus_tahun2.setText(PDRBlapus5);
            }

            if (key.equals("PDRBlapus_adhb_2019")) {

                String PDRBlapus6 = snapshot.getValue(String.class);
                PDRBlapus_adhb2.setText(PDRBlapus6);
            }

            if (key.equals("PDRBlapus_adhk_2019")) {

                String PDRBlapus7 = snapshot.getValue(String.class);
                PDRBlapus_adhk2.setText(PDRBlapus7);
            }

            if (key.equals("PDRBlapus_pertumbuhan_2019")) {

                String PDRBlapus8 = snapshot.getValue(String.class);
                PDRBlapus_pertumbuhan2.setText(PDRBlapus8);
            }


            if (key.equals("PDRBlapus_tahun_2018")) {

                String PDRBlapus9 = snapshot.getValue(String.class);
                PDRBlapus_tahun3.setText(PDRBlapus9);
            }

            if (key.equals("PDRBlapus_adhb_2018")) {

                String PDRBlapus10 = snapshot.getValue(String.class);
                PDRBlapus_adhb3.setText(PDRBlapus10);
            }

            if (key.equals("PDRBlapus_adhk_2018")) {

                String PDRBlapus11 = snapshot.getValue(String.class);
                PDRBlapus_adhk3.setText(PDRBlapus11);
            }

            if (key.equals("PDRBlapus_pertumbuhan_2018")) {

                String PDRBlapus12 = snapshot.getValue(String.class);
                PDRBlapus_pertumbuhan3.setText(PDRBlapus12);
            }


            if (key.equals("PDRBlapus_tahun_2017")) {

                String PDRBlapus13 = snapshot.getValue(String.class);
                PDRBlapus_tahun4.setText(PDRBlapus13);
            }

            if (key.equals("PDRBlapus_adhb_2017")) {

                String PDRBlapus14 = snapshot.getValue(String.class);
                PDRBlapus_adhb4.setText(PDRBlapus14);
            }

            if (key.equals("PDRBlapus_adhk_2017")) {

                String PDRBlapus15 = snapshot.getValue(String.class);
                PDRBlapus_adhk4.setText(PDRBlapus15);
            }

            if (key.equals("PDRBlapus_pertumbuhan_2017")) {

                String PDRBlapus16 = snapshot.getValue(String.class);
                PDRBlapus_pertumbuhan4.setText(PDRBlapus16);
            }


            if (key.equals("PDRBlapus_tahun_2016")) {

                String PDRBlapus17 = snapshot.getValue(String.class);
                PDRBlapus_tahun5.setText(PDRBlapus17);
            }

            if (key.equals("PDRBlapus_adhb_2016")) {

                String PDRBlapus18 = snapshot.getValue(String.class);
                PDRBlapus_adhb5.setText(PDRBlapus18);
            }

            if (key.equals("PDRBlapus_adhk_2016")) {

                String PDRBlapus19 = snapshot.getValue(String.class);
                PDRBlapus_adhk5.setText(PDRBlapus19);
            }

            if (key.equals("PDRBlapus_pertumbuhan_2016")) {

                String PDRBlapus20 = snapshot.getValue(String.class);
                PDRBlapus_pertumbuhan5.setText(PDRBlapus20);
            }


            if (key.equals("PDRBlapus_tahun_2015")) {

                String PDRBlapus21 = snapshot.getValue(String.class);
                PDRBlapus_tahun6.setText(PDRBlapus21);
            }

            if (key.equals("PDRBlapus_adhb_2015")) {

                String PDRBlapus22 = snapshot.getValue(String.class);
                PDRBlapus_adhb6.setText(PDRBlapus22);
            }

            if (key.equals("PDRBlapus_adhk_2015")) {

                String PDRBlapus23 = snapshot.getValue(String.class);
                PDRBlapus_adhk6.setText(PDRBlapus23);
            }

            if (key.equals("PDRBlapus_pertumbuhan_2015")) {

                String PDRBlapus24 = snapshot.getValue(String.class);
                PDRBlapus_pertumbuhan6.setText(PDRBlapus24);
            }



            if (key.equals("PDRBlapus_tahun_2021")) {

                String PDRBlapus25 = snapshot.getValue(String.class);
                PDRBlapus_tahun7.setText(PDRBlapus25);
            }

            if (key.equals("PDRBlapus_adhb_2021")) {

                String PDRBlapus26 = snapshot.getValue(String.class);
                PDRBlapus_adhb7.setText(PDRBlapus26);
            }

            if (key.equals("PDRBlapus_adhk_2021")) {

                String PDRBlapus27 = snapshot.getValue(String.class);
                PDRBlapus_adhk7.setText(PDRBlapus27);
            }

            if (key.equals("PDRBlapus_pertumbuhan_2021")) {

                String PDRBlapus28 = snapshot.getValue(String.class);
                PDRBlapus_pertumbuhan7.setText(PDRBlapus28);
            }




            if (key.equals("PDRBlapus_tahun_2022")) {

                String PDRBlapus29 = snapshot.getValue(String.class);
                PDRBlapus_tahun8.setText(PDRBlapus29);
            }

            if (key.equals("PDRBlapus_adhb_2022")) {

                String PDRBlapus30 = snapshot.getValue(String.class);
                PDRBlapus_adhb8.setText(PDRBlapus30);
            }

            if (key.equals("PDRBlapus_adhk_2022")) {

                String PDRBlapus31 = snapshot.getValue(String.class);
                PDRBlapus_adhk8.setText(PDRBlapus31);
            }

            if (key.equals("PDRBlapus_pertumbuhan_2022")) {

                String PDRBlapus32 = snapshot.getValue(String.class);
                PDRBlapus_pertumbuhan8.setText(PDRBlapus32);
            }



            if (key.equals("PDRBlapus_tahun_2023")) {

                String PDRBlapus33 = snapshot.getValue(String.class);
                PDRBlapus_tahun9.setText(PDRBlapus33);
            }

            if (key.equals("PDRBlapus_adhb_2023")) {

                String PDRBlapus34 = snapshot.getValue(String.class);
                PDRBlapus_adhb9.setText(PDRBlapus34);
            }

            if (key.equals("PDRBlapus_adhk_2023")) {

                String PDRBlapus35 = snapshot.getValue(String.class);
                PDRBlapus_adhk9.setText(PDRBlapus35);
            }

            if (key.equals("PDRBlapus_pertumbuhan_2023")) {

                String PDRBlapus36 = snapshot.getValue(String.class);
                PDRBlapus_pertumbuhan9.setText(PDRBlapus36);
            }




            if (key.equals("PDRBlapus_tahun_2024")) {

                String PDRBlapus37 = snapshot.getValue(String.class);
                PDRBlapus_tahun10.setText(PDRBlapus37);
            }

            if (key.equals("PDRBlapus_adhb_2024")) {

                String PDRBlapus38 = snapshot.getValue(String.class);
                PDRBlapus_adhb10.setText(PDRBlapus38);
            }

            if (key.equals("PDRBlapus_adhk_2024")) {

                String PDRBlapus39 = snapshot.getValue(String.class);
                PDRBlapus_adhk10.setText(PDRBlapus39);
            }

            if (key.equals("PDRBlapus_pertumbuhan_2024")) {

                String PDRBlapus40 = snapshot.getValue(String.class);
                PDRBlapus_pertumbuhan10.setText(PDRBlapus40);
            }




            if (key.equals("PDRBlapus_tahun_2025")) {

                String PDRBlapus41 = snapshot.getValue(String.class);
                PDRBlapus_tahun11.setText(PDRBlapus41);
            }

            if (key.equals("PDRBlapus_adhb_2025")) {

                String PDRBlapus42 = snapshot.getValue(String.class);
                PDRBlapus_adhb11.setText(PDRBlapus42);
            }

            if (key.equals("PDRBlapus_adhk_2025")) {

                String PDRBlapus43 = snapshot.getValue(String.class);
                PDRBlapus_adhk11.setText(PDRBlapus43);
            }

            if (key.equals("PDRBlapus_pertumbuhan_2025")) {

                String PDRBlapus44 = snapshot.getValue(String.class);
                PDRBlapus_pertumbuhan11.setText(PDRBlapus44);
            }
        }
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        PDRBlapusData1.addValueEventListener(this);
        PDRBlapusData2.addValueEventListener(this);
        PDRBlapusData3.addValueEventListener(this);
        PDRBlapusData4.addValueEventListener(this);

        PDRBlapusData5.addValueEventListener(this);
        PDRBlapusData6.addValueEventListener(this);
        PDRBlapusData7.addValueEventListener(this);
        PDRBlapusData8.addValueEventListener(this);

        PDRBlapusData9.addValueEventListener(this);
        PDRBlapusData10.addValueEventListener(this);
        PDRBlapusData11.addValueEventListener(this);
        PDRBlapusData12.addValueEventListener(this);

        PDRBlapusData13.addValueEventListener(this);
        PDRBlapusData14.addValueEventListener(this);
        PDRBlapusData15.addValueEventListener(this);
        PDRBlapusData16.addValueEventListener(this);

        PDRBlapusData17.addValueEventListener(this);
        PDRBlapusData18.addValueEventListener(this);
        PDRBlapusData19.addValueEventListener(this);
        PDRBlapusData20.addValueEventListener(this);

        PDRBlapusData21.addValueEventListener(this);
        PDRBlapusData22.addValueEventListener(this);
        PDRBlapusData23.addValueEventListener(this);
        PDRBlapusData24.addValueEventListener(this);

        PDRBlapusData25.addValueEventListener(this);
        PDRBlapusData26.addValueEventListener(this);
        PDRBlapusData27.addValueEventListener(this);
        PDRBlapusData28.addValueEventListener(this);

        PDRBlapusData29.addValueEventListener(this);
        PDRBlapusData30.addValueEventListener(this);
        PDRBlapusData31.addValueEventListener(this);
        PDRBlapusData32.addValueEventListener(this);

        PDRBlapusData33.addValueEventListener(this);
        PDRBlapusData34.addValueEventListener(this);
        PDRBlapusData35.addValueEventListener(this);
        PDRBlapusData36.addValueEventListener(this);

        PDRBlapusData37.addValueEventListener(this);
        PDRBlapusData38.addValueEventListener(this);
        PDRBlapusData39.addValueEventListener(this);
        PDRBlapusData40.addValueEventListener(this);

        PDRBlapusData41.addValueEventListener(this);
        PDRBlapusData42.addValueEventListener(this);
        PDRBlapusData43.addValueEventListener(this);
        PDRBlapusData44.addValueEventListener(this);
    }
}