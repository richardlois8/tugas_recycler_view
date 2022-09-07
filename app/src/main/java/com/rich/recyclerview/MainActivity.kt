package com.rich.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rich.recyclerview.diffutil.ContactAdapter
import com.rich.recyclerview.diffutil.MyContact
import com.rich.recyclerview.R
import com.rich.recyclerview.latihan.Student
import com.rich.recyclerview.latihan.StudentAdapter
import com.rich.recyclerview.tugas.Provinsi
import com.rich.recyclerview.tugas.ProvinsiAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerVeiwTugasConfig()
    }

    fun recyclerVeiwTugasConfig(){
        val listProvinsi = arrayListOf<Provinsi>(
            Provinsi("Aceh", "Banda Aceh", R.drawable.aceh),
            Provinsi("Sumatera Utara","Medan",R.drawable.sumatera_utara),
            Provinsi("Sumatera Selatan","Palembang",R.drawable.sumatera_selatan),
            Provinsi("Sumatera Barat","Padang",R.drawable.sumatera_barat),
            Provinsi("Bengkulu","Bengkulu",R.drawable.bengkulu),
            Provinsi("Riau","Pekanbaru",R.drawable.riau),
            Provinsi("Kep. Riau","Tanjung Pinang",R.drawable.kepulauan_riau),
            Provinsi("Jambi","Jambi",R.drawable.jambi),
            Provinsi("Lampung","Bandar Lampung",R.drawable.lampung),
            Provinsi("Kepulauan Bangka Belitung","Pangkal Pinang",R.drawable.bangka_belitung),

            Provinsi("Kalimantan Timur","Samarinda",R.drawable.kalimantan_timur),
            Provinsi("Kalimantan Barat","Pontianak",R.drawable.kalimantan_barat),
            Provinsi("Kalimantan Tengah","Palangkaraya",R.drawable.kalimantan_tengah),
            Provinsi("Kalimantan Selatan","Banjarbaru",R.drawable.kalimantan_selatan),
            Provinsi("Kalimantan Utara","Tanjung Selor",R.drawable.kalimantan_utara),

            Provinsi("DKI Jakarta", "Jakarta",R.drawable.dki_jakarta),
            Provinsi("Banten","Serang",R.drawable.banten),
            Provinsi("Jawa Barat", "Bandung",R.drawable.jawa_barat),
            Provinsi("Jawa Tengah", "Semarang",R.drawable.jawa_tengah),
            Provinsi("Jawa Timur", "Surabaya",R.drawable.jawa_timur),

            Provinsi("Bali","Denpasar",R.drawable.bali),
            Provinsi("Nusa Tenggara Barat","Mataram",R.drawable.ntb),
            Provinsi("Nusa Tenggara Timur","Kupang",R.drawable.ntt),

            Provinsi("Sulawesi Utara","Manado",R.drawable.sulawesi_utara),
            Provinsi("Sulawesi Tengah","Palu",R.drawable.sulawesi_tengah),
            Provinsi("Sulawesi Selatan","Makassar",R.drawable.sulawesi_selatan),
            Provinsi("Sulawesi Tenggara","Kendari",R.drawable.sulawesi_tenggara),
            Provinsi("Sulawesi Barat","Mamuju",R.drawable.sulawesi_barat),
            Provinsi("Gorontalo","Gorontalo",R.drawable.gorontalo),

            Provinsi("Maluku","Ambon",R.drawable.maluku),
            Provinsi("Maluku Utara","Ternate",R.drawable.maluku_utara),

            Provinsi("Papua Barat","Manokwari",R.drawable.papua_barat),
            Provinsi("Papua","Jayapura",R.drawable.papua),
            Provinsi("Papua Selatan","Merauke",R.drawable.papua_selatan),
            Provinsi("Papua Tengah","Nabire",R.drawable.papua_tengah),
            Provinsi("Papua Pegunungan","Jayawijaya",R.drawable.papua_pegunungan),

        )

        val rvTugas = findViewById<RecyclerView>(R.id.recyclerView)
        val provinsiAdapter = ProvinsiAdapter(listProvinsi)
        rvTugas.adapter = provinsiAdapter
        rvTugas.layoutManager = GridLayoutManager(this, 2)
    }

    fun normalRecViewConfig(){
        val listStudent = arrayListOf<Student>(
            Student("Richard","12345678",R.drawable.img1),
            Student("Irvan","23456789",R.drawable.img2),
            Student("Dwika","34567890",R.drawable.img1),
            Student("Malik","45678901",R.drawable.img2),
            Student("Faizal","56789012",R.drawable.img1),
            Student("Dina","67890123",R.drawable.img2),
            Student("Fani","78901234",R.drawable.img1),
            Student("Roisul","89012345",R.drawable.img2),
            Student("Qisthi","90123456",R.drawable.img1),
            Student("Syifa","01234567",R.drawable.img2),
        )
        val rvStudent = findViewById<RecyclerView>(R.id.recyclerView)
        val studentAdapter = StudentAdapter(listStudent)
        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
//        val layoutManager = GridLayoutManager(this,2)
        rvStudent.adapter = studentAdapter
        rvStudent.layoutManager = layoutManager
    }

    fun diffUtilConfig(){
        val listContact = arrayListOf(
            MyContact("Sabrina","081977823093"),
            MyContact("Pak De","0819778231312"),
            MyContact("Pak Le","081977812113"),
            MyContact("Adi","081977881261"),
            MyContact("Budi","0819778231213"),
            MyContact("Caca","08513823113"),
            MyContact("Dedi","0819778231213"),
            MyContact("Eka","0819778231213"),
            MyContact("Fafa","0819778231213"),
            MyContact("Gita","0819778231213"),
            MyContact("Hana","0819778231213"),
            MyContact("Tono","001212112121")
        )

        val adapter = ContactAdapter()
        adapter.submitData(listContact)
        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        val rvContact = findViewById<RecyclerView>(R.id.recyclerView)
        rvContact.layoutManager = layoutManager
        rvContact.adapter = adapter
    }
}