package uz.gita.examfinal.ui.adapters.discover

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.gita.examfinal.R
import uz.gita.examfinal.ui.data.discover.DataDiscoverInner2
import uz.gita.examfinal.ui.data.home.DataInner2

class AdapterDiscoverInner2(private val data: List<DataDiscoverInner2>)  : RecyclerView.Adapter<AdapterDiscoverInner2.Holder>() {

    inner class Holder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.picInnerDiscover2)
        val image2: ImageView = view.findViewById(R.id.picInnerDiscover2_2)
        val text: TextView = view.findViewById(R.id.textDiscover2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.discover_inner_item2, parent, false))
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val item = data[position]
        holder.image.setImageResource(item.imageInner)
        holder.image2.setImageResource(item.imageInner2)
        holder.text.text = item.textInner
    }

    override fun getItemCount(): Int = data.size
}