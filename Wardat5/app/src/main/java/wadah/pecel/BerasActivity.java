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

public class BerasActivity extends AppCompatActivity implements ValueEventListener {

    //untuk connect ke firebase
    //tidak perlu diubah
    //apabila ingin mengubah data bisa langsung ke firebase

    TextView beras_tahun1, beras_tahun2, beras_tahun3,beras_tahun4,beras_tahun5,beras_tahun6,beras_tahun7,beras_tahun8,
            beras_konversi1, beras_konversi2, beras_konversi3,beras_konversi4,beras_konversi5,beras_konversi6,beras_konversi7,beras_konversi8,
            beras_konsumsi1, beras_konsumsi2, beras_konsumsi3,beras_konsumsi4,beras_konsumsi5,beras_konsumsi6,beras_konsumsi7,beras_konsumsi8;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference berasData1 = databaseReference.child("Beras_tahun_2020");
    private DatabaseReference berasData2 = databaseReference.child("Beras_konversiBeras_2020");
    private DatabaseReference berasData3 = databaseReference.child("Beras_konsumsiBeras_2020");

    private DatabaseReference berasData4 = databaseReference.child("Beras_tahun_2019");
    private DatabaseReference berasData5 = databaseReference.child("Beras_konversiBeras_2019");
    private DatabaseReference berasData6 = databaseReference.child("Beras_konsumsiBeras_2019");

    private DatabaseReference berasData7 = databaseReference.child("Beras_tahun_2018");
    private DatabaseReference berasData8 = databaseReference.child("Beras_konversiBeras_2018");
    private DatabaseReference berasData9 = databaseReference.child("Beras_konsumsiBeras_2018");


    private DatabaseReference berasData10 = databaseReference.child("Beras_tahun_2021");
    private DatabaseReference berasData11 = databaseReference.child("Beras_konversiBeras_2021");
    private DatabaseReference berasData12 = databaseReference.child("Beras_konsumsiBeras_2021");

    private DatabaseReference berasData13 = databaseReference.child("Beras_tahun_2022");
    private DatabaseReference berasData14 = databaseReference.child("Beras_konversiBeras_2022");
    private DatabaseReference berasData15 = databaseReference.child("Beras_konsumsiBeras_2022");

    private DatabaseReference berasData16 = databaseReference.child("Beras_tahun_2023");
    private DatabaseReference berasData17 = databaseReference.child("Beras_konversiBeras_2023");
    private DatabaseReference berasData18 = databaseReference.child("Beras_konsumsiBeras_2023");

    private DatabaseReference berasData19 = databaseReference.child("Beras_tahun_2024");
    private DatabaseReference berasData20 = databaseReference.child("Beras_konversiBeras_2024");
    private DatabaseReference berasData21 = databaseReference.child("Beras_konsumsiBeras_2024");

    private DatabaseReference berasData22 = databaseReference.child("Beras_tahun_2025");
    private DatabaseReference berasData23 = databaseReference.child("Beras_konversiBeras_2025");
    private DatabaseReference berasData24 = databaseReference.child("Beras_konsumsiBeras_2025");
    

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beras);

        beras_tahun1 = (TextView)findViewById(R.id.beras_tahun1);
        beras_konversi1 = (TextView)findViewById(R.id.beras_konversi1);
        beras_konsumsi1 = (TextView)findViewById(R.id.beras_konsumsi1);

        beras_tahun2 = (TextView)findViewById(R.id.beras_tahun2);
        beras_konversi2 = (TextView)findViewById(R.id.beras_konversi2);
        beras_konsumsi2 = (TextView)findViewById(R.id.beras_konsumsi2);

        beras_tahun3 = (TextView)findViewById(R.id.beras_tahun3);
        beras_konversi3 = (TextView)findViewById(R.id.beras_konversi3);
        beras_konsumsi3 = (TextView)findViewById(R.id.beras_konsumsi3);


        beras_tahun4 = (TextView)findViewById(R.id.beras_tahunNew1);
        beras_konversi4 = (TextView)findViewById(R.id.beras_konversiNew1);
        beras_konsumsi4 = (TextView)findViewById(R.id.beras_konsumsiNew1);

        beras_tahun5 = (TextView)findViewById(R.id.beras_tahunNew2);
        beras_konversi5 = (TextView)findViewById(R.id.beras_konversiNew2);
        beras_konsumsi5 = (TextView)findViewById(R.id.beras_konsumsiNew2);

        beras_tahun6 = (TextView)findViewById(R.id.beras_tahunNew3);
        beras_konversi6 = (TextView)findViewById(R.id.beras_konversiNew3);
        beras_konsumsi6 = (TextView)findViewById(R.id.beras_konsumsiNew3);

        beras_tahun7 = (TextView)findViewById(R.id.beras_tahunNew4);
        beras_konversi7 = (TextView)findViewById(R.id.beras_konversiNew4);
        beras_konsumsi7 = (TextView)findViewById(R.id.beras_konsumsiNew4);

        beras_tahun8 = (TextView)findViewById(R.id.beras_tahunNew5);
        beras_konversi8 = (TextView)findViewById(R.id.beras_konversiNew5);
        beras_konsumsi8 = (TextView)findViewById(R.id.beras_konsumsiNew5);



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.beras);
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
        Intent intent = new Intent(BerasActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(BerasActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(BerasActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(BerasActivity.this, PertanianActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("Beras_tahun_2020")) {

                String beras1 = snapshot.getValue(String.class);
                beras_tahun1.setText(beras1);
            }

            if (key.equals("Beras_konversiBeras_2020")) {

                String beras2 = snapshot.getValue(String.class);
                beras_konversi1.setText(beras2);
            }

            if (key.equals("Beras_konsumsiBeras_2020")) {

                String beras3 = snapshot.getValue(String.class);
                beras_konsumsi1.setText(beras3);
            }


            if (key.equals("Beras_tahun_2019")) {

                String beras4 = snapshot.getValue(String.class);
                beras_tahun2.setText(beras4);
            }

            if (key.equals("Beras_konversiBeras_2019")) {

                String beras5 = snapshot.getValue(String.class);
                beras_konversi2.setText(beras5);
            }

            if (key.equals("Beras_konsumsiBeras_2019")) {

                String beras6 = snapshot.getValue(String.class);
                beras_konsumsi2.setText(beras6);
            }


            if (key.equals("Beras_tahun_2018")) {

                String beras7 = snapshot.getValue(String.class);
                beras_tahun3.setText(beras7);
            }

            if (key.equals("Beras_konversiBeras_2018")) {

                String beras8 = snapshot.getValue(String.class);
                beras_konversi3.setText(beras8);
            }

            if (key.equals("Beras_konsumsiBeras_2018")) {

                String beras9 = snapshot.getValue(String.class);
                beras_konsumsi3.setText(beras9);
            }






            if (key.equals("Beras_tahun_2021")) {

                String beras10 = snapshot.getValue(String.class);
                beras_tahun4.setText(beras10);
            }

            if (key.equals("Beras_konversiBeras_2021")) {

                String beras11 = snapshot.getValue(String.class);
                beras_konversi4.setText(beras11);
            }

            if (key.equals("Beras_konsumsiBeras_2021")) {

                String beras12 = snapshot.getValue(String.class);
                beras_konsumsi4.setText(beras12);
            }



            if (key.equals("Beras_tahun_2022")) {

                String beras13 = snapshot.getValue(String.class);
                beras_tahun5.setText(beras13);
            }

            if (key.equals("Beras_konversiBeras_2022")) {

                String beras14 = snapshot.getValue(String.class);
                beras_konversi5.setText(beras14);
            }

            if (key.equals("Beras_konsumsiBeras_2022")) {

                String beras15 = snapshot.getValue(String.class);
                beras_konsumsi5.setText(beras15);
            }



            if (key.equals("Beras_tahun_2023")) {

                String beras16 = snapshot.getValue(String.class);
                beras_tahun6.setText(beras16);
            }

            if (key.equals("Beras_konversiBeras_2023")) {

                String beras17 = snapshot.getValue(String.class);
                beras_konversi6.setText(beras17);
            }

            if (key.equals("Beras_konsumsiBeras_2023")) {

                String beras18 = snapshot.getValue(String.class);
                beras_konsumsi6.setText(beras18);
            }



            if (key.equals("Beras_tahun_2024")) {

                String beras19 = snapshot.getValue(String.class);
                beras_tahun7.setText(beras19);
            }

            if (key.equals("Beras_konversiBeras_2024")) {

                String beras20 = snapshot.getValue(String.class);
                beras_konversi7.setText(beras20);
            }

            if (key.equals("Beras_konsumsiBeras_2024")) {

                String beras21 = snapshot.getValue(String.class);
                beras_konsumsi7.setText(beras21);
            }



            if (key.equals("Beras_tahun_2025")) {

                String beras22 = snapshot.getValue(String.class);
                beras_tahun8.setText(beras22);
            }

            if (key.equals("Beras_konversiBeras_2025")) {

                String beras23 = snapshot.getValue(String.class);
                beras_konversi8.setText(beras23);
            }

            if (key.equals("Beras_konsumsiBeras_2025")) {

                String beras24 = snapshot.getValue(String.class);
                beras_konsumsi8.setText(beras24);
            }
        }
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        berasData1.addValueEventListener(this);
        berasData2.addValueEventListener(this);
        berasData3.addValueEventListener(this);

        berasData4.addValueEventListener(this);
        berasData5.addValueEventListener(this);
        berasData6.addValueEventListener(this);

        berasData7.addValueEventListener(this);
        berasData8.addValueEventListener(this);
        berasData9.addValueEventListener(this);

        berasData10.addValueEventListener(this);
        berasData11.addValueEventListener(this);
        berasData12.addValueEventListener(this);

        berasData13.addValueEventListener(this);
        berasData14.addValueEventListener(this);
        berasData15.addValueEventListener(this);

        berasData16.addValueEventListener(this);
        berasData17.addValueEventListener(this);
        berasData18.addValueEventListener(this);

        berasData19.addValueEventListener(this);
        berasData20.addValueEventListener(this);
        berasData21.addValueEventListener(this);

        berasData22.addValueEventListener(this);
        berasData23.addValueEventListener(this);
        berasData24.addValueEventListener(this);
    }
}