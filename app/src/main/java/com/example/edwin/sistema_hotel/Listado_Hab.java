package com.example.edwin.sistema_hotel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ListActivity;
import android.database.MatrixCursor;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.View;


public class Listado_Hab extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Simulamos que extraemos los datos de la base de datos a un cursor
        String[] columnasBD = new String[] {"_id", "imagen", "textoSuperior", "textoInferior"};
        MatrixCursor cursor = new MatrixCursor(columnasBD);
        cursor.addRow(new Object[] {"0", R.mipmap.ic_habitacion_simple, "HABITACIÓN SIMPLE", "Equipadas con cama twin (1.35 x 1.90), televisión de pantalla plana, tvcable, teléfono con discado directo nacional e internacional y servicio de internet WIFI. Los baños estan equipados amenities, secador de cabello, espejo de doble cara."});
        cursor.addRow(new Object[] {"1", R.mipmap.ic_habitacion_doble, "HABITACIÓN DOBLE", "Equipadas con dos camas twin (1.35 x 1.90) o una twin y una sencilla (1.05 x 1.90), televisión de pantalla plana, Directv, radio despertador, teléfono con discado directo nacional e internacional y servicio de internet WIFI. Los baños estan equipados amenities y secador de cabello, espejo de doble cara."});

//Añadimos los datos al Adapter y le indicamos donde dibujar cada dato en la fila del Layout
        String[] desdeEstasColumnas = {"imagen", "textoSuperior", "textoInferior"};
        int[] aEstasViews = {R.id.sdvImagen, R.id.tvTextSuperior, R.id.tvTextInferior};
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, R.layout.activity_p__bienvenida, cursor, desdeEstasColumnas, aEstasViews, 0);

        ListView listado = getListView();
        listado.setAdapter(adapter);

    }

    @Override
    public void onListItemClick(ListView lista, View view, int posicion, long id) {
        // Hacer algo cuando un elemento de la lista es seleccionado
        TextView textoTitulo = (TextView) view.findViewById(R.id.tvTextSuperior);

        CharSequence texto = "Seleccionado: " + textoTitulo.getText();
        Toast.makeText(getApplicationContext(), texto, Toast.LENGTH_LONG).show();
    }

}
