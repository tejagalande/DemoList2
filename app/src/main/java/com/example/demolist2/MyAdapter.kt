package com.example.demolist2

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(var ctx : Context, var resFile : Int, var items : List<Model>)
    :ArrayAdapter<Model>(ctx, resFile, items) {

    @SuppressLint("ViewHolder", "UseCompatLoadingForDrawables")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater : LayoutInflater = LayoutInflater.from(context)

        val view :View = inflater.inflate(resFile,null)
        val icon = view.findViewById<ImageView>(R.id.ivIcon)
        val title = view.findViewById<TextView>(R.id.tvTitle)
        val subTitle = view.findViewById<TextView>(R.id.tvSubTitle)

        var items : Model = items[position]

        icon.setImageDrawable(context.resources.getDrawable(items.image))
        title.text = items.title
        subTitle.text = items.description


        return view
    }

}