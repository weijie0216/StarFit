package cn.com.liaozp.alarmclock

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var listView = findViewById<ListView>(R.id.listViewReminder)
        var list = mutableListOf<MenuModel>()

        val food_reminder : String = "Food tracking reminders work best when set for 30 min post meal times. Get into the habit of having 5 or more meals daily."
        val water_reminder : String = "Water reminders help you meet your hydration goal of a minimum of 9 glasses a day."
        val exercise_reminder : String ="Workout reminders motivate you to gear up for your workou. Once you\'re done,they enable you to track your exercise."
        val weight_reminder : String = "Weight reminders allow you to track your weight regularly. Keep a watch on your weight goal and celebrate your progress."

        list.add(MenuModel("Track Meal", food_reminder, R.drawable.food, "Edit"))
        list.add(MenuModel("Drink Water", water_reminder, R.drawable.water,"Edit"))
        list.add(MenuModel("Start Workout", exercise_reminder, R.drawable.calories,"Edit"))
        list.add(MenuModel("Log Weight", weight_reminder, R.drawable.weight,"Edit"))

        listView.adapter = MenuAdapter(this, R.layout.row_menu, list)
        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id:Long ->
            if (position == 0) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

            }
            if (position == 1) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            if (position == 2) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            if (position == 3) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
