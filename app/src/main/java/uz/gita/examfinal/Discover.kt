package uz.gita.examfinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.gita.examfinal.ui.adapters.discover.MyDiscoverAdapter
import uz.gita.examfinal.ui.adapters.home.MyAdapter
import uz.gita.examfinal.ui.data.ItemViewData
import uz.gita.examfinal.ui.data.discover.*
import uz.gita.examfinal.ui.data.home.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Discover.newInstance] factory method to
 * create an instance of this fragment.
 */
class Discover : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_discover, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rv: RecyclerView = view.findViewById(R.id.listOuterDiscover)
        val adapter = MyDiscoverAdapter(loadData())

        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(requireContext())
    }

    private fun loadData(): List<ItemViewData> {

        val listInner1 = arrayListOf<DataDiscoverInner1>()
        listInner1.add(DataDiscoverInner1(R.drawable.pic1))
        listInner1.add(DataDiscoverInner1(R.drawable.pic2))
        listInner1.add(DataDiscoverInner1(R.drawable.pic3))
        listInner1.add(DataDiscoverInner1(R.drawable.pic4))
        listInner1.add(DataDiscoverInner1(R.drawable.pic5))

        listInner1.shuffle()

        val listInner2 = arrayListOf<DataDiscoverInner2>()
        listInner2.add(DataDiscoverInner2(R.drawable.pic6, R.drawable.pic1,"nimadj gdb jhcba"))
        listInner2.add(DataDiscoverInner2(R.drawable.pic7, R.drawable.pic2,"nimadj gdb jhcba"))
        listInner2.add(DataDiscoverInner2(R.drawable.pic8, R.drawable.pic3,"nimadj gdb jhcba"))
        listInner2.add(DataDiscoverInner2(R.drawable.pic9, R.drawable.pic4,"nimadj gdb jhcba"))
        listInner2.add(DataDiscoverInner2(R.drawable.pic10, R.drawable.pic5,"nimadj gdb jhcba"))

        listInner2.shuffle()

        val listInner3 = arrayListOf<DataDiscoverInner3>()
        listInner3.add(DataDiscoverInner3(R.drawable.pic11, "Rasm1"))
        listInner3.add(DataDiscoverInner3(R.drawable.pic12, "Rasm2"))
        listInner3.add(DataDiscoverInner3(R.drawable.pic13, "Rasm3"))
        listInner3.add(DataDiscoverInner3(R.drawable.pic14, "Rasm4"))
        listInner3.add(DataDiscoverInner3(R.drawable.pic15, "Rasm5"))
        listInner3.add(DataDiscoverInner3(R.drawable.pic16, "Rasm6"))
        listInner3.add(DataDiscoverInner3(R.drawable.pic17, "Rasm7"))

        listInner3.shuffle()

        val itemViewData = ArrayList<ItemViewData>()
        itemViewData.add(DataDiscoverOuter1( listInner1))
        itemViewData.add(DataDiscoverOuter2("Followed Channel", listInner2))
        itemViewData.add(DataDiscoverOuter3("Rasmlar1", listInner3))
        itemViewData.add(DataDiscoverOuter2("Followed Channel", listInner2))
        itemViewData.add(DataDiscoverOuter3("Rasmlar2", listInner3))
        itemViewData.add(DataDiscoverOuter1( listInner1))
        itemViewData.add(DataDiscoverOuter3("Rasmlar3", listInner3))
        itemViewData.add(DataDiscoverOuter3("Rasmlar4", listInner3))

        return itemViewData
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Discover.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Discover().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}