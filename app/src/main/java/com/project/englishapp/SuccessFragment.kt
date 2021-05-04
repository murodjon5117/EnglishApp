package com.project.englishapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_success.*


class SuccessFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_success, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnOTPEnter.setOnClickListener {
            val intent= Intent(requireActivity(),MainActivity::class.java)
            startActivity(intent)
            activity?.finish()

        }
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            SuccessFragment()
    }
}