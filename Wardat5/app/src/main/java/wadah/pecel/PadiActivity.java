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

public class PadiActivity extends AppCompatActivity implements ValueEventListener {

    TextView padi_tahun1, padi_tahun2, padi_tahun3, padi_tahun4, padi_tahun5, padi_tahun6, padi_tahun7, padi_tahun8,
            padi_luasPanen1, padi_luasPanen2, padi_luasPanen3, padi_luasPanen4, padi_luasPanen5, padi_luasPanen6, padi_luasPanen7, padi_luasPanen8,
            padi_produksiPadi1, padi_produksiPadi2, padi_produksiPadi3, padi_produksiPadi4, padi_produksiPadi5, padi_produksiPadi6, padi_produksiPadi7, padi_produksiPadi8,
            padi_sawahSubroundI1, padi_sawahSubroundI2, padi_sawahSubroundI3, padi_sawahSubroundI4, padi_sawahSubroundI5, padi_sawahSubroundI6, padi_sawahSubroundI7, padi_sawahSubroundI8,
            padi_sawahSubroundII1, padi_sawahSubroundII2, padi_sawahSubroundII3, padi_sawahSubroundII4, padi_sawahSubroundII5, padi_sawahSubroundII6, padi_sawahSubroundII7, padi_sawahSubroundII8,
            padi_sawahSubroundIII1, padi_sawahSubroundIII2, padi_sawahSubroundIII3, padi_sawahSubroundIII4, padi_sawahSubroundIII5, padi_sawahSubroundIII6, padi_sawahSubroundIII7, padi_sawahSubroundIII8,
            padi_ladangSubroundI1, padi_ladangSubroundI2, padi_ladangSubroundI3, padi_ladangSubroundI4, padi_ladangSubroundI5, padi_ladangSubroundI6, padi_ladangSubroundI7, padi_ladangSubroundI8,
            padi_ladangSubroundII1, padi_ladangSubroundII2, padi_ladangSubroundII3, padi_ladangSubroundII4, padi_ladangSubroundII5, padi_ladangSubroundII6, padi_ladangSubroundII7, padi_ladangSubroundII8,
            padi_ladangSubroundIII1, padi_ladangSubroundIII2, padi_ladangSubroundIII3, padi_ladangSubroundIII4, padi_ladangSubroundIII5, padi_ladangSubroundIII6, padi_ladangSubroundIII7, padi_ladangSubroundIII8;


    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference padiData1 = databaseReference.child("Padi_Tahun_2020");
    private DatabaseReference padiData2 = databaseReference.child("Padi_luasPanen_2020");
    private DatabaseReference padiData3 = databaseReference.child("Padi_produksiPadi_2020");
    private DatabaseReference padiData4 = databaseReference.child("Padi_sawahSubroundI_2020");
    private DatabaseReference padiData5 = databaseReference.child("Padi_sawahSubroundII_2020");
    private DatabaseReference padiData6 = databaseReference.child("Padi_sawahSubroundIII_2020");
    private DatabaseReference padiData7 = databaseReference.child("Padi_ladangSubroundI_2020");
    private DatabaseReference padiData8 = databaseReference.child("Padi_ladangSubroundII_2020");
    private DatabaseReference padiData9 = databaseReference.child("Padi_ladangSubroundIII_2020");

    private DatabaseReference padiData10 = databaseReference.child("Padi_Tahun_2019");
    private DatabaseReference padiData11 = databaseReference.child("Padi_luasPanen_2019");
    private DatabaseReference padiData12 = databaseReference.child("Padi_produksiPadi_2019");
    private DatabaseReference padiData13 = databaseReference.child("Padi_sawahSubroundI_2019");
    private DatabaseReference padiData14 = databaseReference.child("Padi_sawahSubroundII_2019");
    private DatabaseReference padiData15 = databaseReference.child("Padi_sawahSubroundIII_2019");
    private DatabaseReference padiData16 = databaseReference.child("Padi_ladangSubroundI_2019");
    private DatabaseReference padiData17 = databaseReference.child("Padi_ladangSubroundII_2019");
    private DatabaseReference padiData18 = databaseReference.child("Padi_ladangSubroundIII_2019");

    private DatabaseReference padiData19 = databaseReference.child("Padi_Tahun_2018");
    private DatabaseReference padiData20 = databaseReference.child("Padi_luasPanen_2018");;
    private DatabaseReference padiData21 = databaseReference.child("Padi_produksiPadi_2018");
    private DatabaseReference padiData22 = databaseReference.child("Padi_sawahSubroundI_2018");
    private DatabaseReference padiData23 = databaseReference.child("Padi_sawahSubroundII_2018");
    private DatabaseReference padiData24 = databaseReference.child("Padi_sawahSubroundIII_2018");
    private DatabaseReference padiData25 = databaseReference.child("Padi_ladangSubroundI_2018");
    private DatabaseReference padiData26 = databaseReference.child("Padi_ladangSubroundII_2018");
    private DatabaseReference padiData27 = databaseReference.child("Padi_ladangSubroundIII_2018");

    private DatabaseReference padiData28 = databaseReference.child("Padi_Tahun_2021");
    private DatabaseReference padiData29 = databaseReference.child("Padi_luasPanen_2021");;
    private DatabaseReference padiData30 = databaseReference.child("Padi_produksiPadi_2021");
    private DatabaseReference padiData31 = databaseReference.child("Padi_sawahSubroundI_2021");
    private DatabaseReference padiData32 = databaseReference.child("Padi_sawahSubroundII_2021");
    private DatabaseReference padiData33 = databaseReference.child("Padi_sawahSubroundIII_2021");
    private DatabaseReference padiData34 = databaseReference.child("Padi_ladangSubroundI_2021");
    private DatabaseReference padiData35 = databaseReference.child("Padi_ladangSubroundII_2021");
    private DatabaseReference padiData36 = databaseReference.child("Padi_ladangSubroundIII_2021");

    private DatabaseReference padiData37 = databaseReference.child("Padi_Tahun_2022");
    private DatabaseReference padiData38 = databaseReference.child("Padi_luasPanen_2022");;
    private DatabaseReference padiData39 = databaseReference.child("Padi_produksiPadi_2022");
    private DatabaseReference padiData40 = databaseReference.child("Padi_sawahSubroundI_2022");
    private DatabaseReference padiData41 = databaseReference.child("Padi_sawahSubroundII_2022");
    private DatabaseReference padiData42 = databaseReference.child("Padi_sawahSubroundIII_2022");
    private DatabaseReference padiData43 = databaseReference.child("Padi_ladangSubroundI_2022");
    private DatabaseReference padiData44 = databaseReference.child("Padi_ladangSubroundII_2022");
    private DatabaseReference padiData45 = databaseReference.child("Padi_ladangSubroundIII_2022");

    private DatabaseReference padiData46 = databaseReference.child("Padi_Tahun_2023");
    private DatabaseReference padiData47 = databaseReference.child("Padi_luasPanen_2023");;
    private DatabaseReference padiData48 = databaseReference.child("Padi_produksiPadi_2023");
    private DatabaseReference padiData49 = databaseReference.child("Padi_sawahSubroundI_2023");
    private DatabaseReference padiData50 = databaseReference.child("Padi_sawahSubroundII_2023");
    private DatabaseReference padiData51 = databaseReference.child("Padi_sawahSubroundIII_2023");
    private DatabaseReference padiData52 = databaseReference.child("Padi_ladangSubroundI_2023");
    private DatabaseReference padiData53 = databaseReference.child("Padi_ladangSubroundII_2023");
    private DatabaseReference padiData54 = databaseReference.child("Padi_ladangSubroundIII_2023");

    private DatabaseReference padiData55 = databaseReference.child("Padi_Tahun_2024");
    private DatabaseReference padiData56 = databaseReference.child("Padi_luasPanen_2024");;
    private DatabaseReference padiData57 = databaseReference.child("Padi_produksiPadi_2024");
    private DatabaseReference padiData58 = databaseReference.child("Padi_sawahSubroundI_2024");
    private DatabaseReference padiData59 = databaseReference.child("Padi_sawahSubroundII_2024");
    private DatabaseReference padiData60 = databaseReference.child("Padi_sawahSubroundIII_2024");
    private DatabaseReference padiData61 = databaseReference.child("Padi_ladangSubroundI_2024");
    private DatabaseReference padiData62 = databaseReference.child("Padi_ladangSubroundII_2024");
    private DatabaseReference padiData63 = databaseReference.child("Padi_ladangSubroundIII_2024");

    private DatabaseReference padiData64 = databaseReference.child("Padi_Tahun_2025");
    private DatabaseReference padiData65 = databaseReference.child("Padi_luasPanen_2025");;
    private DatabaseReference padiData66 = databaseReference.child("Padi_produksiPadi_2025");
    private DatabaseReference padiData67 = databaseReference.child("Padi_sawahSubroundI_2025");
    private DatabaseReference padiData68 = databaseReference.child("Padi_sawahSubroundII_2025");
    private DatabaseReference padiData69 = databaseReference.child("Padi_sawahSubroundIII_2025");
    private DatabaseReference padiData70 = databaseReference.child("Padi_ladangSubroundI_2025");
    private DatabaseReference padiData71 = databaseReference.child("Padi_ladangSubroundII_2025");
    private DatabaseReference padiData72 = databaseReference.child("Padi_ladangSubroundIII_2025");



    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padi);

        padi_tahun1 = (TextView)findViewById(R.id.padi_tahun1);
        padi_luasPanen1 = (TextView)findViewById(R.id.luaspanen1);
        padi_produksiPadi1 = (TextView)findViewById(R.id.produksipadi1);
        padi_sawahSubroundI1 = (TextView)findViewById(R.id.sawahsubI1);
        padi_sawahSubroundII1 = (TextView)findViewById(R.id.sawahsubII1);
        padi_sawahSubroundIII1 = (TextView)findViewById(R.id.sawahsubIII1);
        padi_ladangSubroundI1 = (TextView)findViewById(R.id.ladangsubI1);
        padi_ladangSubroundII1 = (TextView)findViewById(R.id.ladangsubII1);
        padi_ladangSubroundIII1 = (TextView)findViewById(R.id.ladangsubIII1);

        padi_tahun2 = (TextView)findViewById(R.id.padi_tahun2);
        padi_luasPanen2 = (TextView)findViewById(R.id.luaspanen2);
        padi_produksiPadi2 = (TextView)findViewById(R.id.produksipadi2);
        padi_sawahSubroundI2 = (TextView)findViewById(R.id.sawahsubI2);
        padi_sawahSubroundII2 = (TextView)findViewById(R.id.sawahsubII2);
        padi_sawahSubroundIII2 = (TextView)findViewById(R.id.sawahsubIII2);
        padi_ladangSubroundI2 = (TextView)findViewById(R.id.ladangsubI2);
        padi_ladangSubroundII2 = (TextView)findViewById(R.id.ladangsubII2);
        padi_ladangSubroundIII2 = (TextView)findViewById(R.id.ladangsubIII2);

        padi_tahun3 = (TextView)findViewById(R.id.padi_tahun3);
        padi_luasPanen3 = (TextView)findViewById(R.id.luaspanen3);
        padi_produksiPadi3 = (TextView)findViewById(R.id.produksipadi3);
        padi_sawahSubroundI3 = (TextView)findViewById(R.id.sawahsubI3);
        padi_sawahSubroundII3 = (TextView)findViewById(R.id.sawahsubII3);
        padi_sawahSubroundIII3 = (TextView)findViewById(R.id.sawahsubIII3);
        padi_ladangSubroundI3 = (TextView)findViewById(R.id.ladangsubI3);
        padi_ladangSubroundII3 = (TextView)findViewById(R.id.ladangsubII3);
        padi_ladangSubroundIII3 = (TextView)findViewById(R.id.ladangsubIII3);

        padi_tahun4 = (TextView)findViewById(R.id.padi_tahunNew1);
        padi_luasPanen4 = (TextView)findViewById(R.id.luaspanenNew1);
        padi_produksiPadi4 = (TextView)findViewById(R.id.produksipadiNew1);
        padi_sawahSubroundI4 = (TextView)findViewById(R.id.sawahsubINew1);
        padi_sawahSubroundII4 = (TextView)findViewById(R.id.sawahsubIINew1);
        padi_sawahSubroundIII4 = (TextView)findViewById(R.id.sawahsubIIINew1);
        padi_ladangSubroundI4 = (TextView)findViewById(R.id.ladangsubINew1);
        padi_ladangSubroundII4 = (TextView)findViewById(R.id.ladangsubIINew1);
        padi_ladangSubroundIII4 = (TextView)findViewById(R.id.ladangsubIIINew1);

        padi_tahun5 = (TextView)findViewById(R.id.padi_tahunNew2);
        padi_luasPanen5 = (TextView)findViewById(R.id.luaspanenNew2);
        padi_produksiPadi5 = (TextView)findViewById(R.id.produksipadiNew2);
        padi_sawahSubroundI5 = (TextView)findViewById(R.id.sawahsubINew2);
        padi_sawahSubroundII5 = (TextView)findViewById(R.id.sawahsubIINew2);
        padi_sawahSubroundIII5 = (TextView)findViewById(R.id.sawahsubIIINew2);
        padi_ladangSubroundI5 = (TextView)findViewById(R.id.ladangsubINew2);
        padi_ladangSubroundII5 = (TextView)findViewById(R.id.ladangsubIINew2);
        padi_ladangSubroundIII5 = (TextView)findViewById(R.id.ladangsubIIINew2);

        padi_tahun6 = (TextView)findViewById(R.id.padi_tahunNew3);
        padi_luasPanen6 = (TextView)findViewById(R.id.luaspanenNew3);
        padi_produksiPadi6 = (TextView)findViewById(R.id.produksipadiNew3);
        padi_sawahSubroundI6 = (TextView)findViewById(R.id.sawahsubINew3);
        padi_sawahSubroundII6 = (TextView)findViewById(R.id.sawahsubIINew3);
        padi_sawahSubroundIII6 = (TextView)findViewById(R.id.sawahsubIIINew3);
        padi_ladangSubroundI6 = (TextView)findViewById(R.id.ladangsubINew3);
        padi_ladangSubroundII6 = (TextView)findViewById(R.id.ladangsubIINew3);
        padi_ladangSubroundIII6 = (TextView)findViewById(R.id.ladangsubIIINew3);

        padi_tahun7 = (TextView)findViewById(R.id.padi_tahunNew4);
        padi_luasPanen7 = (TextView)findViewById(R.id.luaspanenNew4);
        padi_produksiPadi7 = (TextView)findViewById(R.id.produksipadiNew4);
        padi_sawahSubroundI7 = (TextView)findViewById(R.id.sawahsubINew4);
        padi_sawahSubroundII7 = (TextView)findViewById(R.id.sawahsubIINew4);
        padi_sawahSubroundIII7 = (TextView)findViewById(R.id.sawahsubIIINew4);
        padi_ladangSubroundI7 = (TextView)findViewById(R.id.ladangsubINew4);
        padi_ladangSubroundII7 = (TextView)findViewById(R.id.ladangsubIINew4);
        padi_ladangSubroundIII7 = (TextView)findViewById(R.id.ladangsubIIINew4);

        padi_tahun8 = (TextView)findViewById(R.id.padi_tahunNew5);
        padi_luasPanen8 = (TextView)findViewById(R.id.luaspanenNew5);
        padi_produksiPadi8 = (TextView)findViewById(R.id.produksipadiNew5);
        padi_sawahSubroundI8 = (TextView)findViewById(R.id.sawahsubINew5);
        padi_sawahSubroundII8 = (TextView)findViewById(R.id.sawahsubIINew5);
        padi_sawahSubroundIII8 = (TextView)findViewById(R.id.sawahsubIIINew5);
        padi_ladangSubroundI8 = (TextView)findViewById(R.id.ladangsubINew5);
        padi_ladangSubroundII8 = (TextView)findViewById(R.id.ladangsubIINew5);
        padi_ladangSubroundIII8 = (TextView)findViewById(R.id.ladangsubIIINew5);



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.padi);
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
        Intent intent = new Intent(PadiActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(PadiActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(PadiActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }


    public void back(View view) {
        Intent intent = new Intent(PadiActivity.this, PertanianActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("Padi_Tahun_2020")) {

                String padi1 = snapshot.getValue(String.class);
                padi_tahun1.setText(padi1);
            }

            if (key.equals("Padi_luasPanen_2020")) {

                String padi2 = snapshot.getValue(String.class);
                padi_luasPanen1.setText(padi2);
            }

            if (key.equals("Padi_produksiPadi_2020")) {

                String padi3 = snapshot.getValue(String.class);
                padi_produksiPadi1.setText(padi3);
            }

            if (key.equals("Padi_sawahSubroundI_2020")) {

                String padi4 = snapshot.getValue(String.class);
                padi_sawahSubroundI1.setText(padi4);
            }

            if (key.equals("Padi_sawahSubroundII_2020")) {

                String padi5 = snapshot.getValue(String.class);
                padi_sawahSubroundII1.setText(padi5);
            }

            if (key.equals("Padi_sawahSubroundIII_2020")) {

                String padi6 = snapshot.getValue(String.class);
                padi_sawahSubroundIII1.setText(padi6);
            }

            if (key.equals("Padi_ladangSubroundI_2020")) {

                String padi7 = snapshot.getValue(String.class);
                padi_ladangSubroundI1.setText(padi7);
            }

            if (key.equals("Padi_ladangSubroundII_2020")) {

                String padi8 = snapshot.getValue(String.class);
                padi_ladangSubroundII1.setText(padi8);
            }

            if (key.equals("Padi_ladangSubroundIII_2020")) {

                String padi9 = snapshot.getValue(String.class);
                padi_ladangSubroundIII1.setText(padi9);
            }




            if (key.equals("Padi_Tahun_2019")) {

                String padi10 = snapshot.getValue(String.class);
                padi_tahun2.setText(padi10);
            }

            if (key.equals("Padi_luasPanen_2019")) {

                String padi11 = snapshot.getValue(String.class);
                padi_luasPanen2.setText(padi11);
            }

            if (key.equals("Padi_produksiPadi_2019")) {

                String padi12 = snapshot.getValue(String.class);
                padi_produksiPadi2.setText(padi12);
            }

            if (key.equals("Padi_sawahSubroundI_2019")) {

                String padi13 = snapshot.getValue(String.class);
                padi_sawahSubroundI2.setText(padi13);
            }

            if (key.equals("Padi_sawahSubroundII_2019")) {

                String padi14 = snapshot.getValue(String.class);
                padi_sawahSubroundII2.setText(padi14);
            }

            if (key.equals("Padi_sawahSubroundIII_2019")) {

                String padi15 = snapshot.getValue(String.class);
                padi_sawahSubroundIII2.setText(padi15);
            }

            if (key.equals("Padi_ladangSubroundI_2019")) {

                String padi16 = snapshot.getValue(String.class);
                padi_ladangSubroundI2.setText(padi16);
            }

            if (key.equals("Padi_ladangSubroundII_2019")) {

                String padi17 = snapshot.getValue(String.class);
                padi_ladangSubroundII2.setText(padi17);
            }

            if (key.equals("Padi_ladangSubroundIII_2019")) {

                String padi18 = snapshot.getValue(String.class);
                padi_ladangSubroundIII2.setText(padi18);
            }




            if (key.equals("Padi_Tahun_2018")) {

                String padi19 = snapshot.getValue(String.class);
                padi_tahun3.setText(padi19);
            }

            if (key.equals("Padi_luasPanen_2018")) {

                String padi20 = snapshot.getValue(String.class);
                padi_luasPanen3.setText(padi20);
            }

            if (key.equals("Padi_produksiPadi_2018")) {

                String padi21 = snapshot.getValue(String.class);
                padi_produksiPadi3.setText(padi21);
            }

            if (key.equals("Padi_sawahSubroundI_2018")) {

                String padi22 = snapshot.getValue(String.class);
                padi_sawahSubroundI3.setText(padi22);
            }

            if (key.equals("Padi_sawahSubroundII_2018")) {

                String padi23 = snapshot.getValue(String.class);
                padi_sawahSubroundII3.setText(padi23);
            }

            if (key.equals("Padi_sawahSubroundIII_2018")) {

                String padi24 = snapshot.getValue(String.class);
                padi_sawahSubroundIII3.setText(padi24);
            }

            if (key.equals("Padi_ladangSubroundI_2018")) {

                String padi25 = snapshot.getValue(String.class);
                padi_ladangSubroundI3.setText(padi25);
            }

            if (key.equals("Padi_ladangSubroundII_2018")) {

                String padi26 = snapshot.getValue(String.class);
                padi_ladangSubroundII3.setText(padi26);
            }

            if (key.equals("Padi_ladangSubroundIII_2018")) {

                String padi27 = snapshot.getValue(String.class);
                padi_ladangSubroundIII3.setText(padi27);
            }




            if (key.equals("Padi_Tahun_2021")) {

                String padi28 = snapshot.getValue(String.class);
                padi_tahun4.setText(padi28);
            }

            if (key.equals("Padi_luasPanen_2021")) {

                String padi29 = snapshot.getValue(String.class);
                padi_luasPanen4.setText(padi29);
            }

            if (key.equals("Padi_produksiPadi_2021")) {

                String padi30 = snapshot.getValue(String.class);
                padi_produksiPadi4.setText(padi30);
            }

            if (key.equals("Padi_sawahSubroundI_2021")) {

                String padi31 = snapshot.getValue(String.class);
                padi_sawahSubroundI4.setText(padi31);
            }

            if (key.equals("Padi_sawahSubroundII_2021")) {

                String padi32 = snapshot.getValue(String.class);
                padi_sawahSubroundII4.setText(padi32);
            }

            if (key.equals("Padi_sawahSubroundIII_2021")) {

                String padi33 = snapshot.getValue(String.class);
                padi_sawahSubroundIII4.setText(padi33);
            }

            if (key.equals("Padi_ladangSubroundI_2021")) {

                String padi34 = snapshot.getValue(String.class);
                padi_ladangSubroundI4.setText(padi34);
            }

            if (key.equals("Padi_ladangSubroundII_2021")) {

                String padi35 = snapshot.getValue(String.class);
                padi_ladangSubroundII4.setText(padi35);
            }

            if (key.equals("Padi_ladangSubroundIII_2021")) {

                String padi36 = snapshot.getValue(String.class);
                padi_ladangSubroundIII4.setText(padi36);
            }




            if (key.equals("Padi_Tahun_2022")) {

                String padi37 = snapshot.getValue(String.class);
                padi_tahun5.setText(padi37);
            }

            if (key.equals("Padi_luasPanen_2022")) {

                String padi38 = snapshot.getValue(String.class);
                padi_luasPanen5.setText(padi38);
            }

            if (key.equals("Padi_produksiPadi_2022")) {

                String padi39 = snapshot.getValue(String.class);
                padi_produksiPadi5.setText(padi39);
            }

            if (key.equals("Padi_sawahSubroundI_2022")) {

                String padi40 = snapshot.getValue(String.class);
                padi_sawahSubroundI5.setText(padi40);
            }

            if (key.equals("Padi_sawahSubroundII_2022")) {

                String padi41 = snapshot.getValue(String.class);
                padi_sawahSubroundII5.setText(padi41);
            }

            if (key.equals("Padi_sawahSubroundIII_2022")) {

                String padi42 = snapshot.getValue(String.class);
                padi_sawahSubroundIII5.setText(padi42);
            }

            if (key.equals("Padi_ladangSubroundI_2022")) {

                String padi43 = snapshot.getValue(String.class);
                padi_ladangSubroundI5.setText(padi43);
            }

            if (key.equals("Padi_ladangSubroundII_2022")) {

                String padi44 = snapshot.getValue(String.class);
                padi_ladangSubroundII5.setText(padi44);
            }

            if (key.equals("Padi_ladangSubroundIII_2022")) {

                String padi45 = snapshot.getValue(String.class);
                padi_ladangSubroundIII5.setText(padi45);
            }




            if (key.equals("Padi_Tahun_2023")) {

                String padi46 = snapshot.getValue(String.class);
                padi_tahun6.setText(padi46);
            }

            if (key.equals("Padi_luasPanen_2023")) {

                String padi47 = snapshot.getValue(String.class);
                padi_luasPanen6.setText(padi47);
            }

            if (key.equals("Padi_produksiPadi_2023")) {

                String padi48 = snapshot.getValue(String.class);
                padi_produksiPadi6.setText(padi48);
            }

            if (key.equals("Padi_sawahSubroundI_2023")) {

                String padi49 = snapshot.getValue(String.class);
                padi_sawahSubroundI6.setText(padi49);
            }

            if (key.equals("Padi_sawahSubroundII_2023")) {

                String padi50 = snapshot.getValue(String.class);
                padi_sawahSubroundII6.setText(padi50);
            }

            if (key.equals("Padi_sawahSubroundIII_2023")) {

                String padi51 = snapshot.getValue(String.class);
                padi_sawahSubroundIII6.setText(padi51);
            }

            if (key.equals("Padi_ladangSubroundI_2023")) {

                String padi52 = snapshot.getValue(String.class);
                padi_ladangSubroundI6.setText(padi52);
            }

            if (key.equals("Padi_ladangSubroundII_2023")) {

                String padi53 = snapshot.getValue(String.class);
                padi_ladangSubroundII6.setText(padi53);
            }

            if (key.equals("Padi_ladangSubroundIII_2023")) {

                String padi54 = snapshot.getValue(String.class);
                padi_ladangSubroundIII6.setText(padi54);
            }




            if (key.equals("Padi_Tahun_2024")) {

                String padi55 = snapshot.getValue(String.class);
                padi_tahun7.setText(padi55);
            }

            if (key.equals("Padi_luasPanen_2024")) {

                String padi56 = snapshot.getValue(String.class);
                padi_luasPanen7.setText(padi56);
            }

            if (key.equals("Padi_produksiPadi_2024")) {

                String padi57 = snapshot.getValue(String.class);
                padi_produksiPadi7.setText(padi57);
            }

            if (key.equals("Padi_sawahSubroundI_2024")) {

                String padi58 = snapshot.getValue(String.class);
                padi_sawahSubroundI7.setText(padi58);
            }

            if (key.equals("Padi_sawahSubroundII_2024")) {

                String padi59 = snapshot.getValue(String.class);
                padi_sawahSubroundII7.setText(padi59);
            }

            if (key.equals("Padi_sawahSubroundIII_2024")) {

                String padi60 = snapshot.getValue(String.class);
                padi_sawahSubroundIII7.setText(padi60);
            }

            if (key.equals("Padi_ladangSubroundI_2024")) {

                String padi61 = snapshot.getValue(String.class);
                padi_ladangSubroundI7.setText(padi61);
            }

            if (key.equals("Padi_ladangSubroundII_2024")) {

                String padi62 = snapshot.getValue(String.class);
                padi_ladangSubroundII7.setText(padi62);
            }

            if (key.equals("Padi_ladangSubroundIII_2024")) {

                String padi63 = snapshot.getValue(String.class);
                padi_ladangSubroundIII7.setText(padi63);
            }




            if (key.equals("Padi_Tahun_2025")) {

                String padi64 = snapshot.getValue(String.class);
                padi_tahun8.setText(padi64);
            }

            if (key.equals("Padi_luasPanen_2025")) {

                String padi65 = snapshot.getValue(String.class);
                padi_luasPanen8.setText(padi65);
            }

            if (key.equals("Padi_produksiPadi_2025")) {

                String padi66 = snapshot.getValue(String.class);
                padi_produksiPadi8.setText(padi66);
            }

            if (key.equals("Padi_sawahSubroundI_2025")) {

                String padi67 = snapshot.getValue(String.class);
                padi_sawahSubroundI8.setText(padi67);
            }

            if (key.equals("Padi_sawahSubroundII_2025")) {

                String padi68 = snapshot.getValue(String.class);
                padi_sawahSubroundII8.setText(padi68);
            }

            if (key.equals("Padi_sawahSubroundIII_2025")) {

                String padi69 = snapshot.getValue(String.class);
                padi_sawahSubroundIII8.setText(padi69);
            }

            if (key.equals("Padi_ladangSubroundI_2025")) {

                String padi70 = snapshot.getValue(String.class);
                padi_ladangSubroundI8.setText(padi70);
            }

            if (key.equals("Padi_ladangSubroundII_2025")) {

                String padi71 = snapshot.getValue(String.class);
                padi_ladangSubroundII8.setText(padi71);
            }

            if (key.equals("Padi_ladangSubroundIII_2025")) {

                String padi72 = snapshot.getValue(String.class);
                padi_ladangSubroundIII8.setText(padi72);
            }
        }
        
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        padiData1.addValueEventListener(this);
        padiData2.addValueEventListener(this);
        padiData3.addValueEventListener(this);
        padiData4.addValueEventListener(this);
        padiData5.addValueEventListener(this);
        padiData6.addValueEventListener(this);
        padiData7.addValueEventListener(this);
        padiData8.addValueEventListener(this);
        padiData9.addValueEventListener(this);

        padiData10.addValueEventListener(this);
        padiData11.addValueEventListener(this);
        padiData12.addValueEventListener(this);
        padiData13.addValueEventListener(this);
        padiData14.addValueEventListener(this);
        padiData15.addValueEventListener(this);
        padiData16.addValueEventListener(this);
        padiData17.addValueEventListener(this);
        padiData18.addValueEventListener(this);

        padiData19.addValueEventListener(this);
        padiData20.addValueEventListener(this);
        padiData21.addValueEventListener(this);
        padiData22.addValueEventListener(this);
        padiData23.addValueEventListener(this);
        padiData24.addValueEventListener(this);
        padiData25.addValueEventListener(this);
        padiData26.addValueEventListener(this);
        padiData27.addValueEventListener(this);

        padiData28.addValueEventListener(this);
        padiData29.addValueEventListener(this);
        padiData30.addValueEventListener(this);
        padiData31.addValueEventListener(this);
        padiData32.addValueEventListener(this);
        padiData33.addValueEventListener(this);
        padiData34.addValueEventListener(this);
        padiData35.addValueEventListener(this);
        padiData36.addValueEventListener(this);

        padiData37.addValueEventListener(this);
        padiData38.addValueEventListener(this);
        padiData39.addValueEventListener(this);
        padiData40.addValueEventListener(this);
        padiData41.addValueEventListener(this);
        padiData42.addValueEventListener(this);
        padiData43.addValueEventListener(this);
        padiData44.addValueEventListener(this);
        padiData45.addValueEventListener(this);

        padiData46.addValueEventListener(this);
        padiData47.addValueEventListener(this);
        padiData48.addValueEventListener(this);
        padiData49.addValueEventListener(this);
        padiData50.addValueEventListener(this);
        padiData51.addValueEventListener(this);
        padiData52.addValueEventListener(this);
        padiData53.addValueEventListener(this);
        padiData54.addValueEventListener(this);

        padiData55.addValueEventListener(this);
        padiData56.addValueEventListener(this);
        padiData57.addValueEventListener(this);
        padiData58.addValueEventListener(this);
        padiData59.addValueEventListener(this);
        padiData60.addValueEventListener(this);
        padiData61.addValueEventListener(this);
        padiData62.addValueEventListener(this);
        padiData63.addValueEventListener(this);

        padiData64.addValueEventListener(this);
        padiData65.addValueEventListener(this);
        padiData66.addValueEventListener(this);
        padiData67.addValueEventListener(this);
        padiData68.addValueEventListener(this);
        padiData69.addValueEventListener(this);
        padiData70.addValueEventListener(this);
        padiData71.addValueEventListener(this);
        padiData72.addValueEventListener(this);
    }
    
}