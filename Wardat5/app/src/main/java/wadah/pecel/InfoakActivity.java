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

public class InfoakActivity extends AppCompatActivity implements ValueEventListener {

    //untuk connect ke firebase
    //tidak perlu diubah
    //apabila ingin mengubah data bisa langsung ke firebase

    TextView textInfoak1, textInfoak2, textInfoak3, textInfoak4, textInfoak5, textInfoak6, textInfoak7;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference infoakData1 = databaseReference.child("Infografis_Ketenagakerjaan_Paragraf1");
    private DatabaseReference infoakData2 = databaseReference.child("Infografis_Ketenagakerjaan_Paragraf2");
    private DatabaseReference infoakData3 = databaseReference.child("Infografis_Ketenagakerjaan_Paragraf3");
    private DatabaseReference infoakData4 = databaseReference.child("Infografis_Ketenagakerjaan_Paragraf4");
    private DatabaseReference infoakData5 = databaseReference.child("Infografis_Ketenagakerjaan_Paragraf5");
    private DatabaseReference infoakData6 = databaseReference.child("Infografis_Ketenagakerjaan_Paragraf6");
    private DatabaseReference infoakData7 = databaseReference.child("Infografis_Ketenagakerjaan_Paragraf7");


    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infoak);

        textInfoak1 = (TextView)findViewById(R.id.text_infoak1);
        textInfoak2 = (TextView)findViewById(R.id.text_infoak2);
        textInfoak3 = (TextView)findViewById(R.id.text_infoak3);
        textInfoak4 = (TextView)findViewById(R.id.text_infoak4);
        textInfoak5 = (TextView)findViewById(R.id.text_infoak5);
        textInfoak6 = (TextView)findViewById(R.id.text_infoak6);
        textInfoak7 = (TextView)findViewById(R.id.text_infoak7);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.infoak);
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
        Intent intent = new Intent(InfoakActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(InfoakActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(InfoakActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }

    public void ketenagakerjaan(View view) {
        Intent intent = new Intent(InfoakActivity.this, InfoakGambar.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null){

            String key = snapshot.getKey();
            if (key.equals("Infografis_Ketenagakerjaan_Paragraf1")){

                String infoak1 = snapshot.getValue(String.class);
                textInfoak1.setText(infoak1);
            }

            if (key.equals("Infografis_Ketenagakerjaan_Paragraf2")){

                String infoak2 = snapshot.getValue(String.class);
                textInfoak2.setText(infoak2);
            }

            if (key.equals("Infografis_Ketenagakerjaan_Paragraf3")){

                String infoak3 = snapshot.getValue(String.class);
                textInfoak3.setText(infoak3);
            }

            if (key.equals("Infografis_Ketenagakerjaan_Paragraf4")){

                String infoak4 = snapshot.getValue(String.class);
                textInfoak4.setText(infoak4);
            }

            if (key.equals("Infografis_Ketenagakerjaan_Paragraf5")){

                String infoak5 = snapshot.getValue(String.class);
                textInfoak5.setText(infoak5);
            }

            if (key.equals("Infografis_Ketenagakerjaan_Paragraf6")){

                String infoak6 = snapshot.getValue(String.class);
                textInfoak6.setText(infoak6);
            }

            if (key.equals("Infografis_Ketenagakerjaan_Paragraf7")){

                String infoak7 = snapshot.getValue(String.class);
                textInfoak7.setText(infoak7);
            }


        }

    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart(){
        super.onStart();
        infoakData1.addValueEventListener(this);
        infoakData2.addValueEventListener(this);
        infoakData3.addValueEventListener(this);
        infoakData4.addValueEventListener(this);
        infoakData5.addValueEventListener(this);
        infoakData6.addValueEventListener(this);
        infoakData7.addValueEventListener(this);

    }

}