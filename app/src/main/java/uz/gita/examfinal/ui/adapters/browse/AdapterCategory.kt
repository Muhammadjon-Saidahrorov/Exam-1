package uz.gita.examfinal.ui.adapters.browse

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.gita.examfinal.R
import uz.gita.examfinal.ui.data.browse.DataCategory

class AdapterCategory(private val data: List<DataCategory>) :
    RecyclerView.Adapter<AdapterCategory.Holder>() {

    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        val name1: TextView = view.findViewById(R.id.textInnerBrowseCategory1)
        val name2: TextView = view.findViewById(R.id.textInnerBrawseCategory1_2)
        val image: ImageView = view.findViewById(R.id.picInnerBrowseCategory1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.browse_item1, parent, false))
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val itemData = data[position]
        holder.name1.text = itemData.text1
        holder.name2.text = itemData.text2
        holder.image.setImageResource(itemData.image)
    }

    override fun getItemCount(): Int = data.size

}