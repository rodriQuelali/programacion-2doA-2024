package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
	private TextView tvH;
	private ListView lvP;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		cargarR();
        estadoListView();
	}
	public void cargarR(){
		tvH = (TextView) findViewById(R.id.tvHabitantes);
		lvP = (ListView) findViewById(R.id.lvPaises);
	}
	public void estadoListView(){
		String[] paises={"Argentina","Chile","Paraguay","Bolivia","Peru",
				"Ecuador","Brasil","Colombia","Venezuela","Uruguay","Brasil","Colombia","Venezuela","Uruguay","Brasil","Colombia","Venezuela","Uruguay"};
		String[] habitantes={"40000000","17000000","6500000","10000000","30000000",
				"14000000","183000000","44000000","29000000","3500000"};
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises);
		lvP.setAdapter(arrayAdapter);

	}
}