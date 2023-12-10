package com.example.skptemp.feature.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.skptemp.R
import com.example.skptemp.databinding.FragmentSignUpTermsBinding


class SignUpTermsFragment : Fragment() {

    private var _binding: FragmentSignUpTermsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignUpTermsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        (requireActivity() as SignUpActivity)
            .setToolbarTitleText(resources.getString(R.string.terms_agreement))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}