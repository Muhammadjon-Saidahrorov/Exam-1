package uz.gita.examfinal.ui.screens

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import uz.gita.examfinal.R
import uz.gita.examfinal.databinding.LoginScreenBinding
import uz.gita.examfinal.sourse.repository.AppRepository
import uz.gita.examfinal.ui.screens.main.MainActivity
import uz.gita.examfinal.utils.closeFragment
import uz.gita.examfinal.utils.myIntent

class LoginScreen : Fragment() {
    private val appRepository: AppRepository? = AppRepository.getInstance()
    private var _binding: LoginScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = LoginScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.backBtn.setOnClickListener {
            closeFragment()
        }

        binding.signUpBtn.setOnClickListener {

            if (appRepository?.getEmail() == binding.editEmail.text.toString() && appRepository.getPassword() == binding.editPassword.text.toString()) {
                appRepository.saveFirst(false)
                myIntent()
            } else {
                binding.editEmail.text.clear()
                binding.editPassword.text.clear()
                Toast.makeText(requireContext(), "ERROR", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}