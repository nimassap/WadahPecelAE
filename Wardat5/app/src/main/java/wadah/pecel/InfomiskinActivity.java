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

public class InfomiskinActivity extends AppCompatActivity implements ValueEventListener {

    TextView textInfomiskin1, textInfomiskin2, textInfomiskin3, textInfomiskin4, textInfomiskin5, textInfomiskin6, textInfomiskin7;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference InfomiskinData1 = databaseReference.child("Infografis_Kemiskinan_Paragraf1");
    private DatabaseReference InfomiskinData2 = databaseReference.child("Infografis_Kemiskinan_Paragraf2");
    private DatabaseReference InfomiskinData3 = databaseReference.child("Infografis_Kemiskinan_Paragraf3");
    private DatabaseReference InfomiskinData4 = databaseReference.child("Infografis_Kemiskinan_Paragraf4");
    private DatabaseReference InfomiskinData5 = databaseReference.child("Infografis_Kemiskinan_Paragraf5");
    private DatabaseReference InfomiskinData6 = databaseReference.child("Infografis_Kemiskinan_Paragraf6");
    private DatabaseReference InfomiskinData7 = databaseReference.child("Infografis_Kemiskinan_Paragraf7");



    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infomiskin);

        textInfomiskin1 = (TextView)findViewById(R.id.text_infomiskin1);
        textInfomiskin2 = (TextView)findViewById(R.id.text_infomiskin2);
        textInfomiskin3 = (TextView)findViewById(R.id.text_infomiskin3);
        textInfomiskin4 = (TextView)findViewById(R.id.text_infomiskin4);
        textInfomiskin5 = (TextView)findViewById(R.id.text_infomiskin5);
        textInfomiskin6 = (TextView)findViewById(R.id.text_infomiskin6);
        textInfomiskin7 = (TextView)findViewById(R.id.text_infomiskin7);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.infomiskin);
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
        Intent intent = new Intent(InfomiskinActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(InfomiskinActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(InfomiskinActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }

    public void kemiskinan(View view) {
        Intent intent = new Intent(InfomiskinActivity.this, InfomiskinGambar.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("Infografis_Kemiskinan_Paragraf1")) {

                String Infomiskin1 = snapshot.getValue(String.class);
                textInfomiskin1.setText(Infomiskin1);
            }

            if (key.equals("Infografis_Kemiskinan_Paragraf2")) {

                String Infomiskin2 = snapshot.getValue(String.class);
                textInfomiskin2.setText(Infomiskin2);
            }

            if (key.equals("Infografis_Kemiskinan_Paragraf3")) {

                String Infomiskin3 = snapshot.getValue(String.class);
                textInfomiskin3.setText(Infomiskin3);
            }

            if (key.equals("Infografis_Kemiskinan_Paragraf4")) {

                String Infomiskin4 = snapshot.getValue(String.class);
                textInfomiskin4.setText(Infomiskin4);
            }

            if (key.equals("Infografis_Kemiskinan_Paragraf5")) {

                String Infomiskin5 = snapshot.getValue(String.class);
                textInfomiskin5.setText(Infomiskin5);
            }

            if (key.equals("Infografis_Kemiskinan_Paragraf6")) {

                String Infomiskin6 = snapshot.getValue(String.class);
                textInfomiskin6.setText(Infomiskin6);
            }

            if (key.equals("Infografis_Kemiskinan_Paragraf7")) {

                String Infomiskin7 = snapshot.getValue(String.class);
                textInfomiskin7.setText(Infomiskin7);
            }
        }
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {


    }

    @Override
    protected void onStart() {
        super.onStart();
        InfomiskinData1.addValueEventListener(this);
        InfomiskinData2.addValueEventListener(this);
        InfomiskinData3.addValueEventListener(this);
        InfomiskinData4.addValueEventListener(this);
        InfomiskinData5.addValueEventListener(this);
        InfomiskinData6.addValueEventListener(this);
        InfomiskinData7.addValueEventListener(this);
    }
}