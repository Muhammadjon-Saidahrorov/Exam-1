package uz.gita.examfinal.ui.adapters.browse

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.gita.examfinal.R
import uz.gita.examfinal.ui.data.browse.DataCategory
import uz.gita.examfinal.ui.data.browse.DataChannel

class AdapterChannel(private val data: List<DataChannel>) :
    RecyclerView.Adapter<AdapterChannel.Holder>() {

    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.textBrowseChannel2)
        val image1: ImageView = view.findViewById(R.id.picInnerBrawseChannel2)
        val image2: ImageView = view.findViewById(R.id.picInnerBrawseChannel2_2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.browse_item2, parent, false))
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val itemData = data[position]
        holder.name.text = itemData.text
        holder.image1.setImageResource(itemData.image1)
        holder.image2.setImageResource(itemData.image2)
    }

    override fun getItemCount(): Int = data.size

}