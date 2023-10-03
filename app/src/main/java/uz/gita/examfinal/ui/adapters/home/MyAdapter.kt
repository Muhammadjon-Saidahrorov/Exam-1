package uz.gita.examfinal.ui.adapters.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.gita.examfinal.R
import uz.gita.examfinal.ui.data.ItemViewData
import uz.gita.examfinal.ui.data.home.*

class MyAdapter(var itemDataList: List<ItemViewData>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
//    private lateinit var itemDataList: List<ItemViewData>

//    fun setUserListToRV(itemDataList: List<ItemViewData>) {
//        this.itemDataList = itemDataList
//    }

    abstract inner class MyViewHolder constructor(view: View) : RecyclerView.ViewHolder(view) {
        abstract fun bind()
    }


    inner class FirstItemViewHolder(private val view: View) : MyViewHolder(view) {
        private val name: TextView = view.findViewById(R.id.text1)
        val list: RecyclerView = view.findViewById(R.id.listHomeInner1)

        override fun bind() {
            val data = itemDataList[adapterPosition] as DataOuter1
            val adapter = AdapterInner1(data.inner)
            list.adapter = adapter
            list.layoutManager =
                LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
            name.text = data.textOuter
        }
    }

    inner class SecountItemViewHolder(private val view: View) : MyViewHolder(view) {
        val list: RecyclerView = view.findViewById(R.id.listHomeInner2)
        private val name: TextView = view.findViewById(R.id.text2)

        override fun bind() {
            val data = itemDataList[adapterPosition] as DataOuter2
            val adapter = AdapterInner2(data.inner)
            list.adapter = adapter
            list.layoutManager =
                LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
            name.text = data.textOuter
        }
    }

    inner class ThirdItemViewHolder(private val view: View) : MyViewHolder(view) {
        private val name: TextView = view.findViewById(R.id.text3)
        val list: RecyclerView = view.findViewById(R.id.listHomeInner3)

        override fun bind() {
            val data = itemDataList[adapterPosition] as DataOuter3
            val adapter = AdapterInner3(data.inner)
            list.adapter = adapter
            list.layoutManager =
                LinearLayoutManager(view.context)
            name.text = data.textOuter
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return  when (viewType) {
            1 -> {
                FirstItemViewHolder(
                    LayoutInflater.from(parent.context).inflate(R.layout.home_outer_item1, parent, false)
                )
            }
            2 -> {
                SecountItemViewHolder(
                    LayoutInflater.from(parent.context).inflate(R.layout.home_outer_item2, parent, false)
                )
            }
            else -> {
                ThirdItemViewHolder(
                    LayoutInflater.from(parent.context).inflate(R.layout.home_outer_item3, parent, false)
                )
            }
    }

    }

    override fun getItemCount(): Int {
        return itemDataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemViewType(position: Int): Int {
        return itemDataList[position].getItemType()
    }
}