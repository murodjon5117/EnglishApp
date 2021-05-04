package com.project.englishapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import kotlinx.android.synthetic.main.item_child_group.view.*
import kotlinx.android.synthetic.main.item_parent_group.view.*

class MainAdapter(
    private val _context: Context,
    private val listGroup: MutableList<String>,
    private val listChild: HashMap<String, MutableList<String>>
) : BaseExpandableListAdapter() {

    override fun getGroupCount(): Int {
        return listGroup.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return listChild.size
    }

    override fun getGroup(groupPosition: Int): Any {
        return listGroup[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): String? {
        return listGroup[groupPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {
        return 0
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return 0
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var convertView = convertView
        val headerTitle = getGroup(groupPosition) as String
        if (convertView == null) {

            convertView = LayoutInflater.from(_context).inflate(R.layout.item_parent_group, null)

        }
        if (convertView != null) {
            convertView.tv_parent_group.text = headerTitle
        }
        return convertView!!
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View? {
        var convertView = convertView
        val childText = getChild(groupPosition,childPosition) as String
        if (convertView == null) {

            convertView = LayoutInflater.from(_context).inflate(R.layout.item_child_group, null)

        }
        if (convertView != null) {
            convertView.tv_child_group.text = childText
        }
        return convertView!!
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }

}
