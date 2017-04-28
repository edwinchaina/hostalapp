package com.example.edwin.sistema_hotel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;
public class presentacion extends AppCompatActivity {

    DataModel dataModel;

    TextView id_titulo_des;
    TextView id_descripcion;
    ImageView id_imageView3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);
        dataModel=(DataModel) getIntent().getExtras().get("descripcion");

        id_titulo_des=(TextView) findViewById(R.id.id_titulo_des);
        id_descripcion=(TextView) findViewById(R.id.id_descripcion);
       id_imageView3=(ImageView) findViewById(R.id.id_imageView3);

        id_titulo_des.setText(dataModel.getName());
        id_descripcion.setText(dataModel.getVersion());
       id_imageView3.setImageResource(dataModel.getImage());


    }
}
