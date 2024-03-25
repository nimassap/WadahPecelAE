package wadah.pecel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    RecyclerView recyclerView;
    List<TentangKami> tentangKamiList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.background)));

        recyclerView = findViewById(R.id.recylerview);

        initData();
        setRecyclerView();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.profile);
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

    private void setRecyclerView() {
        AdapterProfile adapter = new AdapterProfile(tentangKamiList);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initData() {
        tentangKamiList = new ArrayList<>();
        tentangKamiList.add(new TentangKami("Informasi Umum", "Badan Pusat Statistik adalah Lembaga Pemerintah Non-Departemen yang bertanggung jawab langsung kepada Presiden. Sebelumnya, BPS merupakan Biro Pusat Statistik, yang dibentuk berdasarkan UU Nomor 6 Tahun 1960 tentang Sensus dan UU Nomer 7 Tahun 1960 tentang Statistik. Sebagai pengganti kedua UU tersebut ditetapkan UU Nomor 16 Tahun 1997 tentang Statistik. Berdasarkan UU ini yang ditindaklanjuti dengan peraturan perundangan dibawahnya, secara formal nama Biro Pusat Statistik diganti menjadi Badan Pusat Statistik.\n " +
                "\n \nMateri yang merupakan muatan baru dalam UU Nomor 16 Tahun 1997, antara lain :\n" +
                "\n- Jenis statistik berdasarkan tujuan pemanfaatannya terdiri atas statistik dasar yang sepenuhnya diselenggarakan oleh BPS, statistik sektoral yang dilaksanakan oleh instansi Pemerintah secara mandiri atau bersama dengan BPS, serta statistik khusus yang diselenggarakan oleh lembaga, organisasi, perorangan, dan atau unsur masyarakat lainnya secara mandiri atau bersama dengan BPS.\n" +
                "\n- Hasil statistik yang diselenggarakan oleh BPS diumumkan dalam Berita Resmi Statistik (BRS) secara teratur dan transparan agar masyarakat dengan mudah mengetahui dan atau mendapatkan data yang diperlukan.\n" +
                "\n- Sistem Statistik Nasional yang andal, efektif, dan efisien.\n" +
                "\n- Dibentuknya Forum Masyarakat Statistik sebagai wadah untuk menampung aspirasi masyarakat statistik, yang bertugas memberikan saran dan pertimbangan kepada BPS.\n" +
                "\n \nBerdasarkan undang-undang yang telah disebutkan di atas, peranan yang harus dijalankan oleh BPS adalah sebagai berikut :\n" +
                "\n- Menyediakan kebutuhan data bagi pemerintah dan masyarakat. Data ini didapatkan dari sensus atau survey yang dilakukan sendiri dan juga dari departemen atau lembaga pemerintahan lainnya sebagai data sekunder.\n" +
                "\n- Membantu kegiatan statistik di departemen, lembaga pemerintah atau institusi lainnya, dalam membangun sistem perstatistikan nasional.\n" +
                "\n- Mengembangkan dan mempromosikan standar teknik dan metodologi statistik, dan menyediakan pelayanan pada bidang pendidikan dan pelatihan statistik.\n" +
                "\n- Membangun kerjasama dengan institusi internasional dan negara lain untuk kepentingan perkembangan statistik Indonesia."));

        tentangKamiList.add(new TentangKami("Visi Misi", "Dengan mempertimbangkan capaian kinerja, memperhatikan aspirasi masyarakat, potensi dan permasalahan, serta mewujudkan Visi Presiden dan Wakil Presiden maka visi Badan Pusat Statistik untuk tahun 2020-2024 adalah:\n" +
                "\n \n“Penyedia Data Statistik Berkualitas untuk Indonesia Maju”\n" +
                "\n(“Provider of Qualified Statistical Data for Advanced Indonesia”)\n" +
                "\n \nDalam visi yang baru tersebut berarti bahwa BPS berperan dalam penyediaan data statistik nasional maupun internasional, untuk menghasilkan statistik yang mempunyai kebenaran akurat dan menggambarkan keadaan yang sebenarnya, dalam rangka mendukung Indonesia Maju.\n" +
                "\n \nDengan visi baru ini, eksistensi BPS sebagai penyedia data dan informasi statistik menjadi semakin penting, karena memegang peran dan pengaruh sentral dalam penyediaan statistik berkualitas tidak hanya di Indonesia, melainkan juga di tingkat dunia. Dengan visi tersebut juga, semakin menguatkan peran BPS sebagai pembina data statistik.\n" +
                "\n \nMisi BPS dirumuskan dengan memperhatikan fungsi dan kewenangan BPS, visi BPS serta melaksanakan Misi Presiden dan Wakil Presiden yang Ke-1 (Peningkatan Kualitas Manusia Indonesia), Ke-2 (Struktur Ekonomi yang Produktif, Mandiri, dan Berdaya Saing) dan yang Ke-3 Pembangunan yang Merata dan Berkeadilan, dengan uraian sebagai berikut:\n" +
                "\n1. Menyediakan statistik berkualitas yang berstandar nasional dan internasional\n" +
                "\n2. Membina K/L/D/I melalui Sistem Statistik Nasional yang berkesinambungan\n" +
                "\n3. Mewujudkan pelayanan prima di bidang statistik untuk terwujudnya Sistem Statistik Nasional\n" +
                "\n4. Membangun SDM yang unggul dan adaptif berlandaskan nilai profesionalisme, integritas dan amanah."));


        tentangKamiList.add(new TentangKami("Struktur Organisasi", "Berdasarkan Peraturan Kepala Badan Pusat Statistik Nomor 8 Tahun 2020 tentang Organisasi dan Tata Kerja Badan Pusat Statistik Kabupaten/Kota. Susunan organisasi BPS terdiri dari:\n" +
                "\n1. Kepala;\n" +
                "\n2. Bagian Umum;\n" +
                "\n3. Kelompok Jabatan Fungsional.\n" +
                "\n \nKepala BPS Kabupaten/Kota mempunyai tugas memimpin BPS Kabupaten/Kota sesuai dengan tugas dan fungsi BPS Kabupaten/Kota serta membina aparatur BPS Kabupaten/Kota agar berdaya guna dan berhasil guna.\n" +
                "\n \nBagian Umum mempunyai tugas melaksanakan penyusunan perencanaan, keuangan, sumber daya manusia, hubungan masyarakat. hukum dan organisasi, kearsipan, persandian, barang milik negara, perlengkapan dan rumah tangga.\n" +
                "\n \nKelompok Jabatan Fungsional mempunyai tugas memberikan pelayanan fungsional dalam pelaksanaan tugas dan fungsi BPS Kabupaten/Kota sesuai dengan bidang keahlian dan ketrampilan\n"));

        tentangKamiList.add(new TentangKami("Tugas, Fungsi dan Wewenang", "Tugas, fungsi dan kewenangan BPS telah ditetapkan berdasarkan Peraturan Presiden Nomor 86 Tahun 2007 tentang Badan Pusat Statistik dan Peraturan Kepala Badan Pusat Statistik Nomor 7 Tahun 2008 tentang Organisasi dan Tata Kerja Badan Pusat Statistik.\n" +
                "\n \n1. Tugas\n" +
                "\nMelaksanakan tugas pemerintahan dibidang statistik sesuai peraturan perundang-undangan.\n" +
                "\n \n2. Fungsi\n" +
                "\na. Pengkajian, penyusunan dan perumusan kebijakan dibidang statistik;\n" +
                "\nb. Pengkoordinasian kegiatan statistik nasional dan regional;\n" +
                "\nc. Penetapan dan penyelenggaraan statistik dasar;\n" +
                "\nd. Penetapan sistem statistik nasional;\n" +
                "\ne. Pembinaan dan fasilitasi terhadap kegiatan instansi pemerintah dibidang kegiatan statistik; dan\n" +
                "\nf. Penyelenggaraan pembinaan dan pelayanan administrasi umum dibidang perencanaan umum, ketatausahaan, organisasi dan tatalaksana, kepegawaian, keuangan, kearsipan, kehumasan, hukum, perlengkapan dan rumah tangga.\n" +
                "\n \n3. Kewenangan\n" +
                "\na. Penyusunan rencana nasional secara makro di bidangnya;\n" +
                "\nb. Perumusan kebijakan di bidangnya untuk mendukung pembangunan secara makro;\n" +
                "\nc. Penetapan sistem informasi di bidangnya;\n" +
                "\nd. Penetapan dan penyelenggaraan statistik nasional;\n" +
                "\ne. Kewenangan lain sesuai dengan ketentuan peraturan perundang-undangan yang berlaku, yaitu;\n" +
                "\nf. i. Perumusan dan pelaksanaan kebijakan tertentu di bidang kegiatan statistik;\n" +
                "  ii. Penyusun pedoman penyelenggaraan survei statistik sektoral."));

        tentangKamiList.add(new TentangKami("Pengolahan Data", "Tahap pengolahan data sangat menentukan seberapa jauh tingkat keakuratan dan ketepatan data statistik yang dihasilkan. BPS merupakan instansi perintis dalam penggunaan komputer karena telah memulai menggunakannya sejak sekitar 1960. Sebelum menggunakan komputer, BPS menggunakan kalkulator dan alat hitung sipoa dalam mengolah data.\n" +
                "\n" +
                "Teknologi komputer yang diterapkan di BPS selalu disesuaikan dengan perkembangan teknologi informasi dan juga mengacu kepada kebutuhan. Personal komputer yang secara umum lebih murah dan efisien telah dicoba digunakan untuk menggantikan mainframe. Sejak 1980-an, personal komputer telah digunakan di seluruh kantor BPS provinsi, diikuti dengan penggunaan komputer di seluruh BPS kabupaten dan kota sejak 1992.\n" +
                "\nDengan menggunakan personal komputer, kantor statistik di daerah dapat segera memproses pengolahan data, yang merupakan rangkaian kegiatan yang dimulai dari pengumpulan data, kemudian memasukkan data mentah ke dalam komputer dan selanjutnya data tersebut dikirim ke BPS pusat untuk diolah menjadi data nasional.\n" +
                "\n" +
                "Pengolahan data menggunakan personal komputer telah lama menjadi contoh pengolahan yang diterapkan oleh direktorat teknis di BPS pusat, terutama jika direktorat tersebut harus mempublikasikan hasil yang diperoleh dari survei yang diselenggarakan.\n" +
                "\nPengolahan data Sensus Penduduk tahun 2000 telah menggunakan mesin scanner, tujuannya untuk mempercepat kegiatan pengolahan data. Efek positif dari penggunaan komputer oleh direktorat teknis yaitu selain lebih cepat, juga dapat memotivasi pegawai yang terlibat turut bertanggung jawab untuk menghasilkan sebanyak mungkin data statistik dan indikator secara tepat waktu dan akurat dibanding sebelumnya. Selain itu, penggunaan computer sangat mendukung BPS dalam menghasilkan berbagai data statistik dan indikator-indikator yang rumit seperti kemiskinan, Input-Output (I-O) table, Social Accounting Matrix (SAM), dan berbagai macam indeks komposit dalam waktu yang relatif singkat.\n" +
                "\n" +
                "Pada 1993, BPS mulai mengembangkan sebuah sistem informasi statistik secara geografis khususnya untuk pengolahan data wilayah sampai unit administrasi yang terkecil yang telah mulai dibuat secara manual sejak 1970. Data wilayah ini dibuat khususnya untuk menyajikan karakteristik daerah yang menonjol yang diperlukan oleh para perumus kebijakan dalam perencanaan pembangunan.\n" +
                "\n" +
                "Dalam mengolah data, BPS juga telah mengembangkan berbagai program aplikasi untuk data entry, editing, validasi, tabulasi dan analisis dengan menggunakan berbagai macam bahasa dan paket komputer. BPS bertanggung jawab untuk mengembangkan berbagai perangkat lunak komputer serta mentransfer pengetahuan dan keahliannya kepada staf BPS daerah.\n" +
                "\n" +
                "Pembangunan infrastruktur teknologi informasi di BPS didasarkan pada tujuan yang ingin dicapai yaitu mengikuti perkembangan permintaan dan kebutuhan dalam pengolahan data statistik; melakukan pembaharuan/inovasi dalam hal metode kerja yang lebih baik serta memberikan kemudahan kepada publik dalam mendapatkan informasi statistik.\n"));


    }

    public void Home(View view) {
        Intent intent = new Intent(ProfileActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(ProfileActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }
}