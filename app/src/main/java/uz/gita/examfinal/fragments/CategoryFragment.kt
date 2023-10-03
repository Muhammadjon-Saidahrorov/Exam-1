package uz.gita.examfinal.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.gita.examfinal.R
import uz.gita.examfinal.ui.adapters.browse.AdapterCategory
import uz.gita.examfinal.ui.data.browse.DataCategory

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CategoryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CategoryFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val resacl: RecyclerView = view.findViewById(R.id.listCategory)
        val adapter = AdapterCategory(loadData())

        resacl.adapter = adapter
        resacl.layoutManager = LinearLayoutManager(requireContext())
    }

    fun loadData():List<DataCategory>{
        val lists = arrayListOf<DataCategory>()
        lists.add(DataCategory(R.drawable.pic5,"shgfbsbjhsf","hdghsn"))
        lists.add(DataCategory(R.drawable.pic6,"shgfbsbjhsf","hdghsn"))
        lists.add(DataCategory(R.drawable.pic7,"shgfbsbjhsf","hdghsn"))
        lists.add(DataCategory(R.drawable.pic8,"shgfbsbjhsf","hdghsn"))
        lists.add(DataCategory(R.drawable.pic9,"shgfbsbjhsf","hdghsn"))
        lists.add(DataCategory(R.drawable.pic10,"shgfbsbjhsf","hdghsn"))
        lists.add(DataCategory(R.drawable.pic11,"shgfbsbjhsf","hdghsn"))
        lists.add(DataCategory(R.drawable.pic12,"shgfbsbjhsf","hdghsn"))
        lists.add(DataCategory(R.drawable.pic13,"shgfbsbjhsf","hdghsn"))
        lists.add(DataCategory(R.drawable.pic5,"shgfbsbjhsf","hdghsn"))
        lists.add(DataCategory(R.drawable.pic6,"shgfbsbjhsf","hdghsn"))
        lists.add(DataCategory(R.drawable.pic7,"shgfbsbjhsf","hdghsn"))
        lists.add(DataCategory(R.drawable.pic8,"shgfbsbjhsf","hdghsn"))
        lists.add(DataCategory(R.drawable.pic9,"shgfbsbjhsf","hdghsn"))
        lists.add(DataCategory(R.drawable.pic10,"shgfbsbjhsf","hdghsn"))
        lists.add(DataCategory(R.drawable.pic11,"shgfbsbjhsf","hdghsn"))
        lists.add(DataCategory(R.drawable.pic12,"shgfbsbjhsf","hdghsn"))
        lists.add(DataCategory(R.drawable.pic13,"shgfbsbjhsf","hdghsn"))

        lists.shuffle()
        return lists

    }
}