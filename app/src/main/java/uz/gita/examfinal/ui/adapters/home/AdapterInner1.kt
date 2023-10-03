package uz.gita.examfinal.ui.adapters.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.gita.examfinal.R
import uz.gita.examfinal.ui.data.home.DataInner1

class AdapterInner1(private val data: List<DataInner1>)  : RecyclerView.Adapter<AdapterInner1.Holder>() {

    inner class Holder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.picInner1)
        val text: TextView = view.findViewById(R.id.textinner1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.home_inner_item1, parent, false))
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val item = data[position]
        holder.image.setImageResource(item.imageInner)
        holder.text.text = item.textInner
    }

    override fun getItemCount(): Int = data.size
}