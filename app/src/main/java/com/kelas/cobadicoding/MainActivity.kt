package com.kelas.cobadicoding

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem
import layout.ListPondokName
import layout.Pondok
import layout.PondokData


class MainActivity : AppCompatActivity() {

    private lateinit var rvCategory: RecyclerView
    private var list: ArrayList<Pondok> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvCategory = findViewById(R.id.rv_category)
        rvCategory.setHasFixedSize(true)
        list.addAll(PondokData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvCategory.layoutManager = LinearLayoutManager(this)
        val listPondokName = ListPondokName(list,this)
        rvCategory.adapter = listPondokName
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
            }

            R.id.action_grid -> {
            }

            R.id.action_cardview -> {
            }
        }
    }
}




