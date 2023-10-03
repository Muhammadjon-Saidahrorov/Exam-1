package uz.gita.examfinal.ui.adapters.discover

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.gita.examfinal.R
import uz.gita.examfinal.ui.data.discover.DataDiscoverInner1
import uz.gita.examfinal.ui.data.home.DataInner1

class AdapterDiscoverInner1(private val data: List<DataDiscoverInner1>)  : RecyclerView.Adapter<AdapterDiscoverInner1.Holder>() {

    inner class Holder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.picInnerDiscover1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.discover_inner_item1, parent, false))
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val item = data[position]
        holder.image.setImageResource(item.imageInner)
    }

    override fun getItemCount(): Int = data.size
}