package uz.gita.examfinal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.gita.examfinal.ARG_PARAM1
import uz.gita.examfinal.ARG_PARAM2
import uz.gita.examfinal.R
import uz.gita.examfinal.ui.adapters.account.AdapterAccount
import uz.gita.examfinal.ui.adapters.browse.AdapterCategory
import uz.gita.examfinal.ui.data.account.DataAccount
import uz.gita.examfinal.ui.data.browse.DataCategory

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Browse.newInstance] factory method to
 * create an instance of this fragment.
 */
class Account : Fragment() {
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
        return inflater.inflate(R.layout.fragment_account, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val resacl: RecyclerView = view.findViewById(R.id.listOuterAccount)
        val adapter = AdapterAccount(loadData())

        resacl.adapter = adapter
        resacl.layoutManager = LinearLayoutManager(requireContext())
    }

    fun loadData():List<DataAccount>{
        val lists = arrayListOf<DataAccount>()
        lists.add(DataAccount(R.drawable.user,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.google,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.facebook,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.discovery,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.baseline_edit_24,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.home,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.apple,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.document,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.bell,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.user,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.google,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.facebook,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.discovery,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.baseline_edit_24,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.home,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.apple,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.document,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.bell,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.user,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.google,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.facebook,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.discovery,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.baseline_edit_24,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.home,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.apple,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.document,"shgfbsbjhsf"))
        lists.add(DataAccount(R.drawable.bell,"shgfbsbjhsf"))

        lists.shuffle()
        return lists

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Account.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Account().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}