package com.vetoquinol.algerie.adapters;


import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.vetoquinol.algerie.R;

import java.util.HashMap;
import java.util.List;

import static androidx.core.content.ContextCompat.getColor;

public class ProductExpandableListViewAdapter extends BaseExpandableListAdapter {

    LinearLayout lnlay;
    private Context context;

    // group titles
    private List<String> listDataGroup;

    // child data
    private HashMap<String, List<String>> listDataChild;

    int c1,c2,t1,t2;

    public ProductExpandableListViewAdapter(Context context, List<String> listDataGroup,
                                            HashMap<String, List<String>> listChildData,int c1,int c2,int t1,int t2) {




        this.context = context;
        this.listDataGroup = listDataGroup;
        this.listDataChild = listChildData;
        this.c1=c1;
        this.c2=c2;
        this.t1=t1;
        this.t2=t2;

    }

    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return this.listDataChild.get(this.listDataGroup.get(groupPosition))
                .get(childPosititon);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        final String childText = (String) getChild(groupPosition, childPosition);

        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.product_holder_list_row_child, null);
        }

        TextView textViewChild = convertView
                .findViewById(R.id.textViewChild);
        textViewChild.setTextColor(ContextCompat.getColor(context, t2));

        LinearLayout child = convertView
                .findViewById(R.id.childid);

        child.setBackgroundColor(ContextCompat.getColor(context, c2));



        textViewChild.setText(childText);






        return convertView;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this.listDataChild.get(this.listDataGroup.get(groupPosition))
                .size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.listDataGroup.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return this.listDataGroup.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.product_holder_list_row_group, null);
        }



        lnlay = convertView.findViewById(R.id.lnlay);

        lnlay.setBackgroundColor(getColor(context, c1));


        /*
        * if (groupPosition==0)
        {
            lnlay.setBackgroundResource(R.color.color0);


        }
        else if (groupPosition==1)
        {
            lnlay.setBackgroundResource(R.color.color1);

        }
        else if (groupPosition==2)
        {
            lnlay.setBackgroundResource(R.color.color2);

        }else if (groupPosition==3)
        {
            lnlay.setBackgroundResource(R.color.color3);

        }
        else if (groupPosition==4)
        {
            lnlay.setBackgroundResource(R.color.color4);

        }else if (groupPosition==5)
        {
            lnlay.setBackgroundResource(R.color.color5);

        }
        else if (groupPosition==6)
        {
            lnlay.setBackgroundResource(R.color.color6);

        }else if (groupPosition==7)
        {
            lnlay.setBackgroundResource(R.color.color7);

        }
        else if (groupPosition==8)
        {
            lnlay.setBackgroundResource(R.color.color8);

        }

        else {
            lnlay.setBackgroundResource(R.color.purbl);

        }
        * */


        TextView textViewGroup = convertView
                .findViewById(R.id.textViewGroup);
        textViewGroup.setText(headerTitle);

        textViewGroup.setTextColor(ContextCompat.getColor(context, t1));

        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}