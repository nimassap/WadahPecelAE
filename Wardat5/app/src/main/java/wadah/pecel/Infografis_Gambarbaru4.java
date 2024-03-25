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

public class Infografis_Gambarbaru4 extends AppCompatActivity {

    ImageView gambarzoom_infografis4;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference infografisGambarzoom4 = databaseReference.child("infografis_tambahgambar4");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infografis_gambarbaru4);

        gambarzoom_infografis4 = (ImageView)findViewById(R.id.img_infografisbaru4);

        infografisGambarzoom4.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String link1 = snapshot.getValue(String.class);
                Picasso.get().load(link1).into(gambarzoom_infografis4);
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Infografis_Gambarbaru4.this,"Error Loading Image", Toast.LENGTH_SHORT).show();

            }
        });

    }
}