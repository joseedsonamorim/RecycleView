package com.app.recycleviewJose

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: RecyclerViewAdapter
    var dataList:ArrayList<String> = ArrayList();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inicializando o RecyclerView
        recyclerView=findViewById(R.id.recycler_view)


        adapter= RecyclerViewAdapter(this,dataList)

        //Configura a visualização da recycle com o Vertical LayoutManager e o adaptador

        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter=adapter

        //Adiciona Comidas
        addAndroids();

        //Notifica mudanças
        adapter.notifyDataSetChanged()

    }

    private fun addAndroids() {
        dataList.add("Eclair (Android 2.0)")
        dataList.add("Froyo (Android 2.2)")
        dataList.add("Gingerbread (Android 2.3)")
        dataList.add("Honeycomb (Android 3.0)")
        dataList.add("Ice Cream Sandwich (Android 4.0)")
        dataList.add("Jelly Bean (Android 4.1)")
        dataList.add("KitKat (Android 4.4)")
        dataList.add("Lollipop (Android 5.0)")
        dataList.add("Marshmallow (Android 6.0)")
        dataList.add("Nougat (Android 7.0)")
        dataList.add("Oreo (8.0)")
        dataList.add("Pie (Android 9.0)")

    }
}
