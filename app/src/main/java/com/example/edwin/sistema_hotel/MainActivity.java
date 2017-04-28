package com.example.edwin.sistema_hotel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    private static ArrayList<DataModel> data;
    static View.OnClickListener myOnClickListener;
    private static ArrayList<Integer> removedItems;
    private Button CrearCuenta;
    private Button Cancelar;

    public boolean log_success = false;

   // @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //VENTANA CREAR CUENTA
        CrearCuenta = (Button) findViewById(R.id.bt_crear_cuenta);
     //login();
        initUI();
    }


      public void initUI( ) {

          Button Login = (Button) findViewById(R.id.btnLogin);
          Login.setOnClickListener(new View.OnClickListener() {

              @Override
              public void onClick(View view) {
                  EditText user = (EditText) findViewById(R.id.text_correo);
                  String usuario = user.getText().toString();
                  EditText pass = (EditText) findViewById(R.id.text_clave);
                  String password = pass.getText().toString();
                  String user_stored = "123";
                  String pass_stored = "123";


                  if (usuario.equals(user_stored) & password.equals(pass_stored)) {
                      // BtnLogin.setMensaje("Login Correcto");
                      log_success = true;
                      findViewById(R.id.badLog).setVisibility(View.INVISIBLE);
                      change_activity();

                  } else {
                      ///BtnLogin.setMensaje("Vuelva a Intentarlo");
                      log_success = false;
                      findViewById(R.id.badLog).setVisibility(View.VISIBLE);

                  }


              }

          });


          CrearCuenta.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  Intent intent = new Intent(
                        MainActivity.this, Crear_Cuenta.class);
                startActivity(intent);


              }
          });


             }
    public void change_activity () {
        Intent myIntent = new Intent(getApplicationContext(), HomeNavegadorActivity.class); // Cambia de pagina
        startActivity(myIntent); // Cambio de aplicación
    }


}
