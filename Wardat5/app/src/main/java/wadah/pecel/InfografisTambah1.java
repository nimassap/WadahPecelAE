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

public class InfografisTambah1 extends AppCompatActivity {

    //untuk connect ke firebase
    //tidak perlu diubah
    //apabila ingin mengubah data bisa langsung ke firebase

    ImageView gambarbaru_infografis1;
    TextView tambahtext1baru1, tambahtext1baru2, tambahtext1baru3, tambahtext1baru4, tambahtext1baru5, tambahtext1baru6, tambahtext1baru7;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference infografisGambarbaru1 = databaseReference.child("infografis_tambahgambar1");
    private DatabaseReference infografisText1baru1 = databaseReference.child("infografisbaru1_text1");
    private DatabaseReference infografisText1baru2 = databaseReference.child("infografisbaru1_text2");
    private DatabaseReference infografisText1baru3 = databaseReference.child("infografisbaru1_text3");
    private DatabaseReference infografisText1baru4 = databaseReference.child("infografisbaru1_text4");
    private DatabaseReference infografisText1baru5 = databaseReference.child("infografisbaru1_text5");
    private DatabaseReference infografisText1baru6 = databaseReference.child("infografisbaru1_text6");
    private DatabaseReference infografisText1baru7 = databaseReference.child("infografisbaru1_text7");

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infografis_tambah1);

        gambarbaru_infografis1 = (ImageView)findViewById(R.id.infografis_gambarbaru1);

        tambahtext1baru1 = (TextView)findViewById(R.id.text1_infografisbaru1);
        tambahtext1baru2 = (TextView)findViewById(R.id.text1_infografisbaru2);
        tambahtext1baru3 = (TextView)findViewById(R.id.text1_infografisbaru3);
        tambahtext1baru4 = (TextView)findViewById(R.id.text1_infografisbaru4);
        tambahtext1baru5 = (TextView)findViewById(R.id.text1_infografisbaru5);
        tambahtext1baru6 = (TextView)findViewById(R.id.text1_infografisbaru6);
        tambahtext1baru7 = (TextView)findViewById(R.id.text1_infografisbaru7);

        infografisGambarbaru1.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String link1 = snapshot.getValue(String.class);
                Picasso.get().load(link1).into(gambarbaru_infografis1);
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(InfografisTambah1.this,"Error Loading Image", Toast.LENGTH_SHORT).show();

            }
        });

        infografisText1baru1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru1text1 = snapshot.getValue(String.class);
                tambahtext1baru1.setText(baru1text1);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah1.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografisText1baru2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru1text2 = snapshot.getValue(String.class);
                tambahtext1baru2.setText(baru1text2);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah1.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografisText1baru3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru1text3 = snapshot.getValue(String.class);
                tambahtext1baru3.setText(baru1text3);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah1.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografisText1baru4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru1text4 = snapshot.getValue(String.class);
                tambahtext1baru4.setText(baru1text4);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah1.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografisText1baru5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru1text5 = snapshot.getValue(String.class);
                tambahtext1baru5.setText(baru1text5);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah1.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografisText1baru6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru1text6 = snapshot.getValue(String.class);
                tambahtext1baru6.setText(baru1text6);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah1.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografisText1baru7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru1text7 = snapshot.getValue(String.class);
                tambahtext1baru7.setText(baru1text7);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah1.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.infografis_baru1);
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

    public void infografis_gambarbaru1(View view) {
        Intent intent = new Intent(InfografisTambah1.this, Infografis_Gambarbaru1.class);
        startActivity(intent);
    }

    public void Home(View view) {
        Intent intent = new Intent(InfografisTambah1.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(InfografisTambah1.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(InfografisTambah1.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }

}