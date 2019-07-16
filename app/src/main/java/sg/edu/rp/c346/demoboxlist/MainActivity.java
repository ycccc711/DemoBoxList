package sg.edu.rp.c346.demoboxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView box;
    ArrayList<Box> alBox;
    //Custom Adapter's name
    BoxAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        box = findViewById(R.id.lvBox);

        //arrayList
        alBox = new ArrayList<>();

        //object
        Box bx1 = new Box("Blue");
        Box bx2 = new Box("Orange");
        Box bx3 = new Box("Brown");

        //add to arrayList
        alBox.add(bx1);
        alBox.add(bx2);
        alBox.add(bx3);

        //initialize custom Adapter
        caBox = new BoxAdapter(MainActivity.this,R.layout.row,alBox);

        //connect to listview
        box.setAdapter(caBox);


    }
}
