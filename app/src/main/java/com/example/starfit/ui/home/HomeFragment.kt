@file:Suppress("DEPRECATION")

package com.example.starfit.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import android.widget.TextView
import androidx.core.content.contentValuesOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.starfit.FoodData.FoodMainActivity
import com.example.starfit.MapsActivity
import com.example.starfit.R
import com.example.starfit.RecordActivity
import com.example.starfit.Water.RecordWater
import com.example.starfit.ui.home.HomeViewModel
import kotlinx.android.synthetic.main.content_activity_home_fragment.view.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.fragment_language.view.*
import kotlinx.android.synthetic.main.record_water.*
import kotlinx.android.synthetic.main.record_water.view.*
import java.util.*


import com.vivekkaushik.datepicker.OnDateSelectedListener

import com.vivekkaushik.datepicker.DatePickerTimeline
import kotlinx.android.synthetic.main.nav_header_activity_home_fragment.*
import kotlinx.android.synthetic.main.recycleview_item.*
import java.time.DayOfWeek
import java.time.LocalDateTime
import java.time.Month
import java.time.Year
import java.time.format.DateTimeFormatter


class HomeFragment : Fragment() {

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        viewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(com.example.starfit.R.layout.fragment_home, container, false)


        val datePickerTimeline = root.datePickerTimeline
// Set a Start date (Default, 1 Jan 1970)
        datePickerTimeline.setInitialDate(2020, 0, 1)
// Set a date Selected Listener
        datePickerTimeline.setOnDateSelectedListener(object : OnDateSelectedListener {

            override fun onDateSelected(year: Int, month: Int, day: Int, dayOfWeek: Int) {
                val test : String = year.toString() + (month+1).toString() + day.toString()

               if(test == LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMd")).toString()){
                  root.textViewdisplayToday.text = "Today"
                   root.textViewdisplayToday.visibility = View.VISIBLE
                    root.textViewdisplayDate.visibility = View.GONE
                }
                else {
                    root.textViewdisplayDate.text =  "Year : " + year.toString() + " Month : " + (month+1).toString() + " Day : " +day.toString()
                  root.textViewdisplayToday.visibility = View.GONE
                    root.textViewdisplayDate.visibility = View.VISIBLE
                }


            }


        })







        root.textViewCalories.setOnClickListener(){
            val intent = Intent(activity,FoodMainActivity::class.java)
            root.context.startActivity(intent)
        }
        root.textViewWater.setOnClickListener(){
            val intent = Intent(activity,RecordWater::class.java)
            root.context.startActivity(intent)
        }
        root.textViewCaloriesBurnt.setOnClickListener(){
            val intent = Intent(activity,RecordActivity::class.java)
            root.context.startActivity(intent)
        }
        root.textViewWeight.setOnClickListener(){

        }


        return root
    }

}