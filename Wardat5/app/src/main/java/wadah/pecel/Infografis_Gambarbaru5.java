package wadah.pecel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class Infografis_Gambarbaru5 extends AppCompatActivity {

    ImageView gambarzoom_infografis5;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference infografisGambarzoom5 = databaseReference.child("infografis_tambahgambar5");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infografis_gambarbaru5);

        gambarzoom_infografis5 = (ImageView)findViewById(R.id.img_infografisbaru5);

        infografisGambarzoom5.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String link1 = snapshot.getValue(String.class);
                Picasso.get().load(link1).into(gambarzoom_infografis5);
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Infografis_Gambarbaru5.this,"Error Loading Image", Toast.LENGTH_SHORT).show();

            }
        });

    }
}