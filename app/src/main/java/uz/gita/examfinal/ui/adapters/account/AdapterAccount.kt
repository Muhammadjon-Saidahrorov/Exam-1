package uz.gita.examfinal.ui.adapters.account

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.gita.examfinal.R
import uz.gita.examfinal.ui.adapters.browse.AdapterCategory
import uz.gita.examfinal.ui.data.account.DataAccount
import uz.gita.examfinal.ui.data.browse.DataCategory

class AdapterAccount(private val data: List<DataAccount>) :
    RecyclerView.Adapter<AdapterAccount.Holder>() {

    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.iconAccount)
        val name: TextView = view.findViewById(R.id.textAccount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.account_item, parent, false))
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val itemData = data[position]
        holder.image.setImageResource(itemData.image)
        holder.name.text = itemData.text
    }

    override fun getItemCount(): Int = data.size

}