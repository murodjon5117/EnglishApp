package com.project.englishapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_account.*

class AccountFragment : Fragment() {
    private val listGroup: MutableList<String> = mutableListOf()
    private val listChild: HashMap<String,MutableList<String>> = hashMapOf()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_account, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        generateLists(3)
        setUpELV()

    }

    private fun generateLists(i: Int) {
        for(item in 0..i){
        listGroup.add(item, "Group$item")
            val myList = mutableListOf<String>()
            for (j in 0..3)
            {
                myList.add("Item$j")
            }
            listChild[listGroup[item]] = myList
        }
    }

    private fun setUpELV() {
        val adapter:MainAdapter = MainAdapter(requireContext(),listGroup,listChild)
        expandableListView.setAdapter(adapter)
    }
}