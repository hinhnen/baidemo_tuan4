package com.example.demo_tuanbon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<SocialNetwork> socialNetworks = new ArrayList<>();
    SocialNetworkAdapter networkAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        KhoiTao();
        networkAdapter = new SocialNetworkAdapter(MainActivity.this,
                R.layout.item,socialNetworks);
        listView.setAdapter(networkAdapter);
    }

    private void addControls() {
        listView = findViewById(R.id.listView);
    }
    void KhoiTao(){
        socialNetworks.add(new SocialNetwork(R.drawable.fb,"Facebook"));
        socialNetworks.add(new SocialNetwork(R.drawable.linkedin,"Linkedin"));
        socialNetworks.add(new SocialNetwork(R.drawable.msn,"MSN"));
        socialNetworks.add(new SocialNetwork(R.drawable.skype,"Skype"));
        socialNetworks.add(new SocialNetwork(R.drawable.yahoo,"Yahoo"));
    }
}
