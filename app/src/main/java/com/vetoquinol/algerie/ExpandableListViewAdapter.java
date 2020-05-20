package com.vetoquinol.algerie;


import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListViewAdapter extends BaseExpandableListAdapter {
    public List<Integer> groupImages;


    private Context context;

    // group titles
    private List<String> listDataGroup;

    // child data
    private HashMap<String, List<String>> listDataChild;



    public ExpandableListViewAdapter(Context context, List<String> listDataGroup,
                                     HashMap<String, List<String>> listChildData) {

        //for images :
        groupImages= new ArrayList<Integer>();
        groupImages.add(R.drawable.equins);
        groupImages.add(R.drawable.bovins);
        groupImages.add(R.drawable.ovins);
        groupImages.add(R.drawable.caprins);
        groupImages.add(R.drawable.chiens);
        groupImages.add(R.drawable.chats);
        groupImages.add(R.drawable.volailles);
        groupImages.add(R.drawable.lapins);
        groupImages.add(R.drawable.empty);



        this.context = context;
        this.listDataGroup = listDataGroup;
        this.listDataChild = listChildData;

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

    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        final String childText = (String) getChild(groupPosition, childPosition);



        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.z_holder_list_row_child, null);
        }

        TextView textViewChild = convertView
                .findViewById(R.id.textViewChild);

        textViewChild.setText(childText);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.animals);


        if (groupPosition==0)
        {
            if (childPosition==0){
                imageView.setImageResource(groupImages.get(0));

            }
            else if (childPosition==1)
            {
                imageView.setImageResource(groupImages.get(1));

            }
            else if (childPosition==2)
            {
                imageView.setImageResource(groupImages.get(2));

            }else if (childPosition==3)
            {
                imageView.setImageResource(groupImages.get(3));

            }
            else if (childPosition==4)
            {
                imageView.setImageResource(groupImages.get(4));

            }else if (childPosition==5)
            {
                imageView.setImageResource(groupImages.get(5));

            }
            else if (childPosition==6)
            {
                imageView.setImageResource(groupImages.get(6));

            }else {
                imageView.setImageResource(groupImages.get(7));

            }
        }

        else {
            imageView.setImageResource(groupImages.get(8));

        }


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

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.z_holder_list_row_group, null);
        }



        TextView textViewGroup = convertView
                .findViewById(R.id.textViewGroup);
        textViewGroup.setTypeface(null, Typeface.BOLD);
        textViewGroup.setText(headerTitle);






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