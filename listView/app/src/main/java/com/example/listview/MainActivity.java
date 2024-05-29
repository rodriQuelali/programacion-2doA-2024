package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
	private TextView tvH;
	private ListView lvP;
	private EditText txtA;
	private Button btnA;
	ArrayList paises = new ArrayList();
	ArrayAdapter<String> arrayAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		cargarR();
        estadoListView();
		agragrPaises();
	}
	public void cargarR(){
		tvH = (TextView) findViewById(R.id.tvHabitantes);
		lvP = (ListView) findViewById(R.id.lvPaises);
		txtA = (EditText) findViewById(R.id.txtAgregar);
		btnA = (Button) findViewById(R.id.btnAgregar);
	}
	public void estadoListView(){

		paises.add("Argentina");
		String[] habitantes={"40000000","17000000","6500000","10000000","30000000",
				"14000000","183000000","44000000","29000000","3500000"};
		arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises);
		lvP.setAdapter(arrayAdapter);
		lvP.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				tvH.setText("Poblacion de " + lvP.getItemAtPosition(position) + "es habotantes: "+habitantes[position]);

			}
		});

	}

	//estado de boton de agregar
	public void agragrPaises(){
		btnA.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				paises.add(txtA.getText().toString());
				lvP.setAdapter(arrayAdapter);
			}
		});
	}
}