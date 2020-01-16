package com.example.starfit.FoodData

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.starfit.R
import kotlinx.android.synthetic.main.activity_add.*
import kotlinx.android.synthetic.main.create_new_account_1.*
import kotlinx.android.synthetic.main.nav_header_activity_home_fragment.*
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View


class AddActivity : AppCompatActivity() {
    private var mode: Int = 0
    private var totalCalories : Double = 0.0
    private var Calories : Double = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        textView2FoodName.visibility = View.GONE



        buttonSave.setOnClickListener(){
            if(Calories == 0.0 && editTextnumber.text == null){
                Toast.makeText( applicationContext,"Please select a mode",Toast.LENGTH_SHORT).show()
            }
            val gram = java.lang.Double.parseDouble(editTextnumber.text.toString())
            totalCalories = (Calories*gram)
            mode = totalCalories.toInt()


            val remark = textView2FoodName.text.toString()
            val intent = Intent()
            intent.putExtra(EXTRA_MODE,mode)
            intent.putExtra(EXTRA_REMARK,remark)

            setResult(Activity.RESULT_OK,intent)
            finish()
            totalCalories = 0.0

        }

        CardViewRice.setOnClickListener(){
            Calories = 1.30
            textView2FoodName.text = "Rice"
            it.setBackgroundResource(R.drawable.highlight)
            it.setBackgroundColor(Color.BLACK)
        }


        CardViewEgg.setOnClickListener(){
            Calories = 1.55
            textView2FoodName.text = "Egg"
            it.setBackgroundResource(R.drawable.highlight)
            it.setBackgroundColor(Color.BLACK)
        }

        CardViewNoodles.setOnClickListener(){
            Calories = 1.38
            textView2FoodName.text = "Noodles"
            it.setBackgroundResource(R.drawable.highlight)
            it.setBackgroundColor(Color.BLACK)
        }


    }




    companion object{
        const val EXTRA_MODE = "com.example.happy2.MODE"
        const val EXTRA_REMARK = "com.example.happy2.REMARK"
    }
}
