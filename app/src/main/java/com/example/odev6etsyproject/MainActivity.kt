package com.example.odev6etsyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.odev6etsyproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var recylerViewUrunAdapter: RecylerViewUrunAdapter? = null
    private var urunList = mutableListOf<Urun>()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        urunList = ArrayList()

        recyclerView = findViewById<View>(R.id.rvUrunLists) as RecyclerView
        recylerViewUrunAdapter = RecylerViewUrunAdapter(this@MainActivity, urunList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recylerViewUrunAdapter

        prepareUrunListData()

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        initUI()
    }
    private fun initUI(){
        binding.etsyToolbar.toolbarSearch.setOnClickListener {
            Toast.makeText(this,"Arama tuşuna bastınız.",Toast.LENGTH_SHORT).show()
        }
        binding.etsyToolbar.toolbarCamera.setOnClickListener {
            Toast.makeText(this,"Kamera tuşuna bastınız.",Toast.LENGTH_SHORT).show()
        }
        binding.etsyToolbar.tvsearch.text = "Search for anything on Etsy"
    }
    private fun prepareUrunListData(){
        var urun = Urun("Urun1",R.drawable.etsyimage1)
        urunList.add(urun)
        urun = Urun("Urun2",R.drawable.etsyimage2)
        urunList.add(urun)
        urun = Urun("Urun3",R.drawable.etsyimage3)
        urunList.add(urun)
        urun = Urun("Urun4",R.drawable.etsyimage4)
        urunList.add(urun)
        urun = Urun("Urun5",R.drawable.etsyimage5)
        urunList.add(urun)
        urun = Urun("Urun6",R.drawable.etsyimage6)
        urunList.add(urun)
        urun = Urun("Urun7",R.drawable.etsyimage7)
        urunList.add(urun)
        urun = Urun("Urun8",R.drawable.etsyimage8)
        urunList.add(urun)
        urun = Urun("Urun9",R.drawable.etsyimage9)
        urunList.add(urun)
        urun = Urun("Urun10",R.drawable.etsyimage10)
        urunList.add(urun)
        urun = Urun("Urun11",R.drawable.etsyimage11)
        urunList.add(urun)
        urun = Urun("Urun12",R.drawable.etsyimage12)
        urunList.add(urun)

        recylerViewUrunAdapter!!.notifyDataSetChanged()
    }
}