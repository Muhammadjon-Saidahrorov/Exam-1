package uz.gita.examfinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.gita.examfinal.ui.adapters.home.MyAdapter
import uz.gita.examfinal.ui.data.ItemViewData
import uz.gita.examfinal.ui.data.home.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Home.newInstance] factory method to
 * create an instance of this fragment.
 */
class Home : Fragment() {
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
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rv: RecyclerView = view.findViewById(R.id.listOuterHome)
        val adapter =  MyAdapter(loadData())

        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(requireContext())
    }
    private fun loadData(): List<ItemViewData> {

        val listInner1 = arrayListOf<DataInner1>()
        listInner1.add(DataInner1(R.drawable.pic1, "Rasm1"))
        listInner1.add(DataInner1(R.drawable.pic2, "Rasm2"))
        listInner1.add(DataInner1(R.drawable.pic3, "Rasm3"))
        listInner1.add(DataInner1(R.drawable.pic4, "Rasm4"))
        listInner1.add(DataInner1(R.drawable.pic5, "Rasm5"))
        listInner1.add(DataInner1(R.drawable.pic1, "Rasm1"))
        listInner1.add(DataInner1(R.drawable.pic2, "Rasm2"))
        listInner1.add(DataInner1(R.drawable.pic3, "Rasm3"))
        listInner1.add(DataInner1(R.drawable.pic4, "Rasm4"))
        listInner1.add(DataInner1(R.drawable.pic5, "Rasm5"))

        listInner1.shuffle()

        val listInner2 = arrayListOf<DataInner2>()
        listInner2.add(DataInner2(R.drawable.pic6))
        listInner2.add(DataInner2(R.drawable.pic7))
        listInner2.add(DataInner2(R.drawable.pic8))
        listInner2.add(DataInner2(R.drawable.pic9))
        listInner2.add(DataInner2(R.drawable.pic10))
        listInner2.add(DataInner2(R.drawable.pic6))
        listInner2.add(DataInner2(R.drawable.pic7))
        listInner2.add(DataInner2(R.drawable.pic8))
        listInner2.add(DataInner2(R.drawable.pic9))
        listInner2.add(DataInner2(R.drawable.pic10))

        listInner2.shuffle()

        val listInner3 = arrayListOf<DataInner3>()
        listInner3.add(DataInner3(R.drawable.pic11, "Rasm1","nimadj gdb jhcba"))
        listInner3.add(DataInner3(R.drawable.pic12, "Rasm2","nimadj gdb jhcba"))
        listInner3.add(DataInner3(R.drawable.pic13, "Rasm3","nimadj gdb jhcba"))
        listInner3.add(DataInner3(R.drawable.pic14, "Rasm4","nimadj gdb jhcba"))
        listInner3.add(DataInner3(R.drawable.pic15, "Rasm5","nimadj gdb jhcba"))
        listInner3.add(DataInner3(R.drawable.pic16, "Rasm6","nimadj gdb jhcba"))
        listInner3.add(DataInner3(R.drawable.pic17, "Rasm7","nimadj gdb jhcba"))

        listInner3.shuffle()

        val itemViewData = ArrayList<ItemViewData>()
        itemViewData.add(DataOuter1("Followed Categories",listInner1))
        itemViewData.add(DataOuter2("Followed Channel",listInner2))
        itemViewData.add(DataOuter3("Rasmlar1",listInner3))
        itemViewData.add(DataOuter3("Rasmlar2",listInner3))
        itemViewData.add(DataOuter2("Followed Channel",listInner2))
        itemViewData.add(DataOuter3("Rasmlar3",listInner3))

        return itemViewData
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Home.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Home().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}