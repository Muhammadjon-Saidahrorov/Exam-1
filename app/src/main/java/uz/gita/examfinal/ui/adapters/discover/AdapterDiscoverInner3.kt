package uz.gita.examfinal.ui.adapters.discover

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.gita.examfinal.R
import uz.gita.examfinal.ui.data.discover.DataDiscoverInner3
import uz.gita.examfinal.ui.data.home.DataInner3

class AdapterDiscoverInner3(private val data: List<DataDiscoverInner3>)  : RecyclerView.Adapter<AdapterDiscoverInner3.Holder>() {

    inner class Holder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.picDiscoverInnerz3)
        val text: TextView = view.findViewById(R.id.textInnerDiscover3)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.discover_inner_item3, parent, false))
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val item = data[position]
        holder.image.setImageResource(item.imageInner)
        holder.text.text = item.textInner
    }

    override fun getItemCount(): Int = data.size
}