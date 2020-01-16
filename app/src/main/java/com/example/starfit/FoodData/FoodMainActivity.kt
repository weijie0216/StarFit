package com.example.starfit.FoodData

import android.app.Activity
import android.content.Intent
import android.icu.text.Transliterator
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.AdapterView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Database
import com.example.starfit.FoodData.Database.Food.FoodDBHelper
import com.example.starfit.FoodData.Database.Food.FoodModel
import com.example.starfit.FoodData.FoodAdapter
import com.example.starfit.R
import com.example.starfit.ui.home.HomeFragment
import com.google.android.material.snackbar.Snackbar

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.fragment_home.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


class FoodMainActivity : AppCompatActivity() {


    private  lateinit var foodViewModel: FoodViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.starfit.R.layout.activity_main)
        setSupportActionBar(toolbar)
        lateinit var FoodDBHelper : FoodDBHelper
        FoodDBHelper = FoodDBHelper(this)

        var totalCalories = 0

        val recyclerView : RecyclerView= findViewById<RecyclerView>(com.example.starfit.R.id.recyclerview)
        val adapter = FoodAdapter(this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)



        val itemTouchHelperCallback = object : ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.RIGHT or ItemTouchHelper.RIGHT){
            override fun onMove(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder, target: RecyclerView.ViewHolder): Boolean {
                return false
            }


            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {

                val position = viewHolder.adapterPosition
                val myWord = adapter.removeitem(position)

                // Delete the word
                foodViewModel.deleteFeeling(myWord)
                totalCalories = 0
                Snackbar.make(viewHolder.itemView,"Deleted",Snackbar.LENGTH_LONG).setAction("UNDO"){
                    foodViewModel.insertFeeling(myWord)
                    totalCalories =0
                }.show()


            }

        }




        val itemTouchHelper = ItemTouchHelper(itemTouchHelperCallback)
        itemTouchHelper.attachToRecyclerView(recyclerview)

        recyclerview.setOnClickListener(){
            Toast.makeText(this,"Hi",Toast.LENGTH_SHORT).show()
        }

        //Initialize ViewModel
        foodViewModel = ViewModelProvider(this).get(FoodViewModel::class.java)

        //Initialize Data
        foodViewModel.allFeelings.observe(this, Observer { feelingList : List<Food> ->
            feelingList.let {
                if(it.isNotEmpty()){
                    totalCalories = 0
                    adapter.setFeeling(it)
                    for (i in 0 until it.size) {
                        totalCalories += it.get(i).mode

                    }

                    Toast.makeText(this,"Total Calories : "+totalCalories.toString(),Toast.LENGTH_LONG).show()

                    if(FoodDBHelper.readFood(DATE = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMd")).toString()).isNotEmpty()){
                        FoodDBHelper.update(FoodCalories = totalCalories,DATE = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMd")).toString())

                    }
                    else{
                        FoodDBHelper.insertFood(FoodModel(Date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMd")).toString(), FoodCalories = totalCalories))
                    }


                }
            }
        }
        )



        fab.setOnClickListener(){
            val intent = Intent(this,AddActivity::class.java)

            startActivityForResult(intent,REQUEST_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == REQUEST_CODE)
            if(resultCode == Activity.RESULT_OK){
                val _mode = data?.getIntExtra(AddActivity.EXTRA_MODE,0)
                val _remark = data?.getStringExtra(AddActivity.EXTRA_REMARK)
                val food = Food(
                    id = 0,
                    mode = _mode!!,
                    remaks = _remark!!
                )
                //Insert a new record to the database
                foodViewModel.insertFeeling(food)

            }
        super.onActivityResult(requestCode, resultCode, data)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.food_menu_main, menu)
        return true
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> {
                val intent = Intent(this, com.example.starfit.HomeFragment::class.java)
                startActivityForResult(intent, REQUEST_TOTAL)

                true
            }


            else -> super.onOptionsItemSelected(item)
        }
    }
    companion object{
        const val REQUEST_CODE = 1
         val REQUEST_TOTAL = 0
    }
}

