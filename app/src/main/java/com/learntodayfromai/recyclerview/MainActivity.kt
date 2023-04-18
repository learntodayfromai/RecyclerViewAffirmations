package com.learntodayfromai.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.learntodayfromai.recyclerview.adapter.itemAdapter
import com.learntodayfromai.recyclerview.data.Datasource
import com.learntodayfromai.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listValues: MutableList<Boolean>
        
        /*val data:Datasource=Datasource()
        binding.textview.setText("${data.loadAffirmations().size}")

        val textview = findViewById<TextView>(R.id.textview)
        textview.text="SIZE " +Datasource().loadAffirmations().size.toString()*/

        val data:Datasource=Datasource()
        val myDataSet = data.loadAffirmations()

        val myView = findViewById<RecyclerView>(R.id.recycleview)
        binding.recycleview.adapter=itemAdapter(this,myDataSet)

        myView.setHasFixedSize(true)
    }
}