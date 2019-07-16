package sg.edu.rp.c346.demoboxlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BoxAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Box> boxList;

    public BoxAdapter(Context context, int resource,ArrayList<Box> objects){
        super(context,resource,objects);
        parent_context = context;
        layout_id = resource;
        boxList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        ImageView ivBox = rowView.findViewById(R.id.imageBox);
        //to display image View


        // Obtain the Android Version information based on the position
        Box boxClass = boxList.get(position);
        String boxColor = boxClass.getColor();

        // Set values to the TextView to display the corresponding information
        if(boxColor.equalsIgnoreCase("Blue")){
            ivBox.setImageResource(R.drawable.blue_box);
        }
        else if(boxColor.equalsIgnoreCase("Orange")){
            ivBox.setImageResource(R.drawable.orange_box);
        }
        else{
            ivBox.setImageResource(R.drawable.brown_box);
        }
        return rowView;
    }
}
