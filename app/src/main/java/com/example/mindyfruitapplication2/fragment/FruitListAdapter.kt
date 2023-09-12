package com.example.mindyfruitapplication2.fragment

/**
 * Created by manyuan.tong on 8/29/23
 * @author manyuan.tong@bytedance.com
 */
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mindyfruitapplication2.R

class FruitListAdapter(private val myDataset: Array<String>) : RecyclerView.Adapter<FruitListAdapter.FruitViewHolder>() {

    class FruitViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val textView = LayoutInflater.from(parent.context)
            .inflate(R.layout.fruit_item, parent, false) as TextView

        return FruitViewHolder(textView)
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        holder.textView.text = myDataset[position]
    }

    override fun getItemCount() = myDataset.size

}