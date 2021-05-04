package com.project.englishapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_enter_o_t_p.*

class EnterOTPFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_enter_o_t_p, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //for test purposes only
        btnOTPEnter.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_enterOTPFragment_to_navigation2)
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            EnterOTPFragment()
    }
}