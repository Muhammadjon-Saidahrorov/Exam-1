package uz.gita.examfinal.ui.adapters.discover

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.gita.examfinal.R
import uz.gita.examfinal.ui.data.ItemViewData
import uz.gita.examfinal.ui.data.discover.DataDiscoverOuter1
import uz.gita.examfinal.ui.data.discover.DataDiscoverOuter2
import uz.gita.examfinal.ui.data.discover.DataDiscoverOuter3
import uz.gita.examfinal.ui.data.home.*

class MyDiscoverAdapter(var itemDataList: List<ItemViewData>) :
    RecyclerView.Adapter<MyDiscoverAdapter.MyViewHolder>() {
//    private lateinit var itemDataList: List<ItemViewData>

//    fun setUserListToRV(itemDataList: List<ItemViewData>) {
//        this.itemDataList = itemDataList
//    }

    abstract inner class MyViewHolder constructor(view: View) : RecyclerView.ViewHolder(view) {
        abstract fun bind()
    }


    inner class FirstItemViewHolder(private val view: View) : MyViewHolder(view) {
        val list: RecyclerView = view.findViewById(R.id.listDiscoverInner1)

        override fun bind() {
            val data = itemDataList[adapterPosition] as DataDiscoverOuter1
            val adapter = AdapterDiscoverInner1(data.inner)
            list.adapter = adapter
            list.layoutManager =
                LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
        }
    }

    inner class SecountItemViewHolder(private val view: View) : MyViewHolder(view) {
        val list: RecyclerView = view.findViewById(R.id.listDiscoverInner2)
        private val name: TextView = view.findViewById(R.id.textDiscoverOuter2)

        override fun bind() {
            val data = itemDataList[adapterPosition] as DataDiscoverOuter2
            val adapter = AdapterDiscoverInner2(data.inner)
            list.adapter = adapter
            list.layoutManager =
                LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
            name.text = data.textOuter
        }
    }

    inner class ThirdItemViewHolder(private val view: View) : MyViewHolder(view) {
        private val name: TextView = view.findViewById(R.id.textDiscoverOuter3)
        val list: RecyclerView = view.findViewById(R.id.listDiscoverInner3)

        override fun bind() {
            val data = itemDataList[adapterPosition] as DataDiscoverOuter3
            val adapter = AdapterDiscoverInner3(data.inner)
            list.adapter = adapter
            list.layoutManager =
                LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
            name.text = data.textOuter
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return  when (viewType) {
            1 -> {
                FirstItemViewHolder(
                    LayoutInflater.from(parent.context).inflate(R.layout.discover_outer_item1, parent, false)
                )
            }
            2 -> {
                SecountItemViewHolder(
                    LayoutInflater.from(parent.context).inflate(R.layout.discover_outer_item2, parent, false)
                )
            }
            else -> {
                ThirdItemViewHolder(
                    LayoutInflater.from(parent.context).inflate(R.layout.discover_outer_item3, parent, false)
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