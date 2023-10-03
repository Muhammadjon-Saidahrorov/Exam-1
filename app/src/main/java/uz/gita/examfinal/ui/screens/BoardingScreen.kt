package uz.gita.examfinal.ui.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import uz.gita.examfinal.R
import uz.gita.examfinal.databinding.BoardingScreenBinding
import uz.gita.examfinal.utils.replaceFragmentSaveStack

class BoardingScreen: Fragment() {
    private var _binding: BoardingScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BoardingScreenBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.streamBtn.setOnClickListener{
            replaceFragmentSaveStack(LoginScreen())
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}