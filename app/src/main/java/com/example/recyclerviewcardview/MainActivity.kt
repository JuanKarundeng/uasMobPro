package com.example.recyclerviewcardview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recyclerviewcardview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),BookClickListener {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateBooks()

        val mainActivity = this
        binding.recyclerView.apply { layoutManager = GridLayoutManager(applicationContext,3)
        adapter = CardAdapter(bookList,mainActivity)
        }
    }


    override fun onClick(book: Book) {
        val intent = Intent(applicationContext,DetailActivity::class.java)
        intent.putExtra(BOOK_ID_EXTRA,book.id)
        startActivity(intent)
    }



    private fun populateBooks()
    {
        val book1 = Book(
            R.drawable.kelas10, "Bahasa Indonesia Kelas 10", "Bahasa Indonesia kelas 10 edisi revisi 2017",
            "https://static.buku.kemdikbud.go.id/content/pdf/bukuteks/k13/bukusiswa/Kelas%20X%20Bahasa%20Indonesia%20BS%20press.pdf"
        )
        bookList.add(book1)

        val book2 = Book(
            R.drawable.kelas11, "Bahasa Indonesia Kelas 11", "Bahasa Indonesia kelas 11 edisi revisi 2017",
            "https://sman8bpp.sch.id/download/bse/uploads/Kelas_11_SMA_Bahasa_Indonesia_Siswa_2017.pdf"
        )
        bookList.add(book2)
        val book3 = Book(
         R.drawable.kelas12, "Bahasa Indonesia Kelas 12","Bahasa Indonesia kelas 12 edisi revisi 2018",
            "https://static.buku.kemdikbud.go.id/content/pdf/bukuteks/k13/bukusiswa/Kelas%20XII%20Bahasa%20Indonesia%20BS%20press.pdf"
        )
        bookList.add(book3)



    }
}