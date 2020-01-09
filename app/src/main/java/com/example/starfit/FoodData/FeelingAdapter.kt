package com.example.starfit.FoodData

import android.content.ContentValues
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.contentValuesOf
import androidx.recyclerview.widget.RecyclerView
import androidx.room.InvalidationTracker
import com.example.starfit.FoodData.Feeling
import com.example.starfit.R
import com.example.starfit.RecordActivity
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat

class  FeelingAdapter internal constructor(
    context: Context
) : RecyclerView.Adapter<FeelingAdapter.FeelingViewHolder>(){

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var feelings = emptyList<Feeling>()//Cached copy of feeling records

    inner class FeelingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val TextviewMode: TextView = itemView.findViewById(R.id.textViewMode)
        val TextviewRemarks: TextView = itemView.findViewById(R.id.textViewRemarks)
        val TextViewDate: TextView = itemView.findViewById(R.id.textViewDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeelingViewHolder {
        val itemView = inflater.inflate(R.layout.recycleview_item, parent, false)
        return FeelingViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return feelings.size
    }

    override fun onBindViewHolder(holder: FeelingViewHolder, position: Int) {
        val feelingRec:Feeling = feelings.get(position)

        holder.TextviewMode.text = feelingRec.mode.toString()
        holder.TextviewRemarks.text = feelingRec.remaks
        holder.TextViewDate.text = SimpleDateFormat("yyyy.MM.dd.HH:MM").format(feelingRec.Created_at)
    }



    internal fun setFeeling(feelings: List<Feeling>){
        this.feelings = feelings
        notifyDataSetChanged()
    }



}
