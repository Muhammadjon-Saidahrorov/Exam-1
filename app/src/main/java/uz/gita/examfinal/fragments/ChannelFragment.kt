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
import uz.gita.examfinal.ui.adapters.browse.AdapterChannel
import uz.gita.examfinal.ui.data.browse.DataChannel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ChannelFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ChannelFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_channel, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val resacl: RecyclerView = view.findViewById(R.id.listChannel)
        val adapter = AdapterChannel(loadData())

        resacl.adapter = adapter
        resacl.layoutManager = LinearLayoutManager(requireContext())
    }

    fun loadData():List<DataChannel>{
        val lists = arrayListOf<DataChannel>()
        lists.add(DataChannel(R.drawable.pic5,R.drawable.pic1,"hdghsn"))
        lists.add(DataChannel(R.drawable.pic6,R.drawable.pic2,"hdghsn"))
        lists.add(DataChannel(R.drawable.pic7,R.drawable.pic3,"hdghsn"))
        lists.add(DataChannel(R.drawable.pic8,R.drawable.pic4,"hdghsn"))
        lists.add(DataChannel(R.drawable.pic9,R.drawable.pic14,"hdghsn"))
        lists.add(DataChannel(R.drawable.pic10,R.drawable.pic15,"hdghsn"))
        lists.add(DataChannel(R.drawable.pic11,R.drawable.pic16,"hdghsn"))
        lists.add(DataChannel(R.drawable.pic12,R.drawable.pic17,"hdghsn"))
        lists.add(DataChannel(R.drawable.pic13,R.drawable.pic18,"hdghsn"))
        lists.add(DataChannel(R.drawable.pic5,R.drawable.pic1,"hdghsn"))
        lists.add(DataChannel(R.drawable.pic6,R.drawable.pic2,"hdghsn"))
        lists.add(DataChannel(R.drawable.pic7,R.drawable.pic3,"hdghsn"))
        lists.add(DataChannel(R.drawable.pic8,R.drawable.pic4,"hdghsn"))
        lists.add(DataChannel(R.drawable.pic9,R.drawable.pic14,"hdghsn"))
        lists.add(DataChannel(R.drawable.pic10,R.drawable.pic15,"hdghsn"))
        lists.add(DataChannel(R.drawable.pic11,R.drawable.pic16,"hdghsn"))
        lists.add(DataChannel(R.drawable.pic12,R.drawable.pic17,"hdghsn"))
        lists.add(DataChannel(R.drawable.pic13,R.drawable.pic18,"hdghsn"))


        lists.shuffle()
        return lists

    }

}