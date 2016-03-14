package com.wordpress.jonyonandroidcraftsmanship.customlistbaseadapterdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private CustomBaseAdapter customBaseAdapter = null;
    private MyListItemClickListener myListItemClickListener = null;
    private ListView lvCustom = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize() {
        lvCustom = (ListView) findViewById(R.id.lvCustom);
        customBaseAdapter = new CustomBaseAdapter(this);
        myListItemClickListener = new MyListItemClickListener();
        lvCustom.setAdapter(customBaseAdapter);
        lvCustom.setOnItemClickListener(myListItemClickListener);
    }

    private class MyListItemClickListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            TextView tv = (TextView) view.findViewById(R.id.tvTitle);
            Logger.toast(MainActivity.this, tv.getText().toString() + " " + position);
        }
    }


}
