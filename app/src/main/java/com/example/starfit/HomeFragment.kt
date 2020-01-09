package com.example.starfit

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.Menu
import com.example.starfit.FoodData.FoodMainActivity
import com.example.starfit.Water.RecordWater
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.vivekkaushik.datepicker.OnDateSelectedListener
import kotlinx.android.synthetic.main.activity_home_fragment.*
import kotlinx.android.synthetic.main.content_activity_home_fragment.*
import kotlinx.android.synthetic.main.fragment_home.*
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.CalendarView
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.record_water.*
import java.util.*


class HomeFragment : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_fragment)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)








        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

        bottom_navigation_bar.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_post, R.id.nav_challenges, R.id.nav_reminder, R.id.nav_home,
                R.id.nav_editprofile, R.id.nav_Language, R.id.nav_ContactUs
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)



    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.food_menu_main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }



    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        if(item.itemId == R.id.nav_foodMainActivity){
            findNavController(R.id.nav_host_fragment).navigate(R.id.nav_foodMainActivity)
        }
        else if(item.itemId == R.id.nav_recordWater){
            findNavController(R.id.nav_host_fragment).navigate(R.id.nav_recordWater)
        }
        else if(item.itemId == R.id.nav_home){
            findNavController(R.id.nav_host_fragment).navigate(R.id.nav_home)
        }
        else if(item.itemId == R.id.nav_caloriesBurn){
            findNavController(R.id.nav_host_fragment).navigate(R.id.nav_caloriesBurn)
        }
        else if(item.itemId == R.id.nav_weight){
            findNavController(R.id.nav_host_fragment).navigate(R.id.nav_weight)
        }

        false
    }
}
/// when (item.itemId) {
//             // Set up navigation here
//when (item.itemId) {
//            R.id.navigation_rivers -> findNavController(R.id.nav_host_fragment).navigate(R.id.nav_river)
//        }   R.id.navigation_favorites -> findNavController(R.id.nav_host_fragment).navigate(R.id.nav_favs)
//            R.id.navigation_map -> findNavController(R.id.nav_host_fragment).navigate(R.id.nav_map)
//        }
//        false
