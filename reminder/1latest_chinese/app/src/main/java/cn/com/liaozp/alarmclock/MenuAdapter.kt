package cn.com.liaozp.alarmclock

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MenuAdapter(var mCtx: Context, var resources:Int, var items:List<MenuModel>): ArrayAdapter<MenuModel>(mCtx, resources, items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)
        val view:View = layoutInflater.inflate(resources, null)

        val imageView: ImageView = view.findViewById(R.id.image)
        val titleTextView: TextView = view.findViewById(R.id.textViewType)
        val descriptionTextView: TextView = view.findViewById(R.id.textViewDescription)
        val editTextView: TextView = view.findViewById(R.id.textViewEdit)

        var mItem:MenuModel = items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItem.img))
        titleTextView.text = mItem.title
        descriptionTextView.text = mItem.description
        editTextView.text = mItem.edit

        return view
    }
}