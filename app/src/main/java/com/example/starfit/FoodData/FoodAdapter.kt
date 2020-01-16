package com.example.starfit.FoodData

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.starfit.R
import java.text.SimpleDateFormat


class  FoodAdapter internal constructor(
    context: Context
) : RecyclerView.Adapter<FoodAdapter.FeelingViewHolder>(){



    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var foods = emptyList<Food>()//Cached copy of feeling records

    inner class FeelingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val TextviewMode: TextView = itemView.findViewById(R.id.textViewMode)
        val TextviewRemarks: TextView = itemView.findViewById(R.id.textViewRemarks)
        val TextViewDate: TextView = itemView.findViewById(R.id.textViewCalories)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeelingViewHolder {
        val itemView = inflater.inflate(R.layout.recycleview_item, parent, false)
        return FeelingViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return foods.size
    }

    override fun onBindViewHolder(holder: FeelingViewHolder, position: Int) {
        val foodRec:Food = foods.get(position)

        holder.TextviewMode.text = foodRec.mode.toString()
        holder.TextviewRemarks.text = foodRec.remaks
        holder.TextViewDate.text = SimpleDateFormat("yyyy.MM.dd.HH:MM").format(foodRec.Created_at)

    }

    fun removeitem(position: Int) : Food {
        return foods.get(position)
    }

    internal fun setFeeling(foods: List<Food>){
        this.foods = foods
        notifyDataSetChanged()
    }








}
