package edelafa.transportec.Transportec.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

import edelafa.transportec.R;

public class ListAdapter extends BaseExpandableListAdapter {

    private Activity context;
    private Map<String, List<String>> ParentListItems;
    private List<String> Items;

    public ListAdapter (Activity context, List<String> Items, Map<String, List<String>> ParentListItems){
        this.context = context;
        this.ParentListItems = ParentListItems;
        this.Items = Items;
    }

    public Object getChild (int groupPosition, int childPosition){
        return ParentListItems.get(Items.get(groupPosition)).get(childPosition);
    }

    public long getChildId (int groupPosition, int childPosition){
        return childPosition;
    }

    public View getChildView (final int groupPosition, final int childPosition, boolean isLastChild, View ListView, ViewGroup parent){
        final String ChildsName = (String) getChild(groupPosition, childPosition);
        LayoutInflater inflater = context.getLayoutInflater();

        if (ListView == null){
            ListView = inflater.inflate(R.layout.child_list_item, null);
        }

        TextView item = (TextView) ListView.findViewById(R.id.txtView);

        item.setText(ChildsName);
        return ListView;
    }

    public int getChildrenCount (int groupPosition){
        return ParentListItems.get(Items.get(groupPosition)).size();
    }

    public Object getGroup(int groupPosition){
        return Items.get(groupPosition);
    }

    public int getGroupCount(){
        return Items.size();
    }

    public long getGroupId (int groupPosition){
        return groupPosition;
    }

    public View getGroupView (int groupPosition, boolean isExpanded, View ListView, ViewGroup parent){
        String ChildsFull = (String) getGroup(groupPosition);
        if (ListView == null){
            LayoutInflater infalInflater = (LayoutInflater) context.getSystemService (Context.LAYOUT_INFLATER_SERVICE);
            ListView = infalInflater.inflate(R.layout.parent_list_item, null);
        }
        TextView item = (TextView) ListView.findViewById(R.id.txtView);
        item.setText(ChildsFull);
        return ListView;
    }

    public boolean hasStableIds(){
        return true;
    }

    public boolean isChildSelectable (int groupPosition, int childPosition){
        return true;
    }

}
