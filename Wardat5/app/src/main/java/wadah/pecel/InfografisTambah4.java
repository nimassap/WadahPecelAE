package wadah.pecel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class InfografisTambah4 extends AppCompatActivity {

    ImageView gambarbaru_infografis4;
    TextView tambahtext4baru1, tambahtext4baru2, tambahtext4baru3, tambahtext4baru4, tambahtext4baru5, tambahtext4baru6, tambahtext4baru7;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference infografisGambarbaru4 = databaseReference.child("infografis_tambahgambar4");
    private DatabaseReference infografistext4baru1 = databaseReference.child("infografisbaru4_text1");
    private DatabaseReference infografistext4baru2 = databaseReference.child("infografisbaru4_text2");
    private DatabaseReference infografistext4baru3 = databaseReference.child("infografisbaru4_text3");
    private DatabaseReference infografistext4baru4 = databaseReference.child("infografisbaru4_text4");
    private DatabaseReference infografistext4baru5 = databaseReference.child("infografisbaru4_text5");
    private DatabaseReference infografistext4baru6 = databaseReference.child("infografisbaru4_text6");
    private DatabaseReference infografistext4baru7 = databaseReference.child("infografisbaru4_text7");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infografis_tambah4);

        gambarbaru_infografis4 = (ImageView)findViewById(R.id.infografis_gambarbaru4);

        tambahtext4baru1 = (TextView)findViewById(R.id.text4_infografisbaru1);
        tambahtext4baru2 = (TextView)findViewById(R.id.text4_infografisbaru2);
        tambahtext4baru3 = (TextView)findViewById(R.id.text4_infografisbaru3);
        tambahtext4baru4 = (TextView)findViewById(R.id.text4_infografisbaru4);
        tambahtext4baru5 = (TextView)findViewById(R.id.text4_infografisbaru5);
        tambahtext4baru6 = (TextView)findViewById(R.id.text4_infografisbaru6);
        tambahtext4baru7 = (TextView)findViewById(R.id.text4_infografisbaru7);

        infografisGambarbaru4.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String link4 = snapshot.getValue(String.class);
                Picasso.get().load(link4).into(gambarbaru_infografis4);
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(InfografisTambah4.this,"Error Loading Image", Toast.LENGTH_SHORT).show();

            }
        });

        infografistext4baru1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru4text1 = snapshot.getValue(String.class);
                tambahtext4baru1.setText(baru4text1);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah4.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografistext4baru2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru4text2 = snapshot.getValue(String.class);
                tambahtext4baru2.setText(baru4text2);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah4.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografistext4baru3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru4text3 = snapshot.getValue(String.class);
                tambahtext4baru3.setText(baru4text3);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah4.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografistext4baru4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru4text4 = snapshot.getValue(String.class);
                tambahtext4baru4.setText(baru4text4);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah4.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografistext4baru5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru4text5 = snapshot.getValue(String.class);
                tambahtext4baru5.setText(baru4text5);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah4.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografistext4baru6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru4text6 = snapshot.getValue(String.class);
                tambahtext4baru6.setText(baru4text6);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah4.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografistext4baru7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru4text7 = snapshot.getValue(String.class);
                tambahtext4baru7.setText(baru4text7);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah4.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.infografis_baru4);
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

    public void infografis_gambarbaru4(View view) {
        Intent intent = new Intent(InfografisTambah4.this, Infografis_Gambarbaru4.class);
        startActivity(intent);
    }

    public void Home(View view) {
        Intent intent = new Intent(InfografisTambah4.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(InfografisTambah4.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(InfografisTambah4.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }
        

}