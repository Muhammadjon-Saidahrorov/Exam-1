package uz.gita.examfinal.ui.adapters.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.gita.examfinal.R
import uz.gita.examfinal.ui.data.home.DataInner1
import uz.gita.examfinal.ui.data.home.DataInner3

class AdapterInner3(private val data: List<DataInner3>)  : RecyclerView.Adapter<AdapterInner3.Holder>() {

    inner class Holder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.picInner3)
        val text: TextView = view.findViewById(R.id.textinner3)
        val text2: TextView = view.findViewById(R.id.textinner3_2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.home_inner_item3, parent, false))
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val item = data[position]
        holder.image.setImageResource(item.imageInner)
        holder.text.text = item.textInner
        holder.text2.text = item.textInner2
    }

    override fun getItemCount(): Int = data.size
}