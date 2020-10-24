package com.example.avisoclase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Agregar tag para invocarlo en estado de la app
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.i(TAG,"onCreate");

        //Toast.makeText(this,"La aplicación se ha creado", Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text = "La aplicación se ha creado";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.HORIZONTAL_GRAVITY_MASK|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }

    //Estado onStart
    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "onStart");
        // Toast.makeText(this,"La aplicación se ha iniciado", Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text = "La aplicación se ha iniciado";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();

    }


    //Evento onResume

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume");
        //Toast.makeText(this,"La aplicación se encuentra pausada", Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text = "Pagina principal en ejecución";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.HORIZONTAL_GRAVITY_MASK|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();


    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause");
        //Toast.makeText(this,"La aplicación se encuentra pausada", Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text = "La aplicación se encuentra pausada";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.AXIS_CLIP|Gravity.FILL, 0, 0);
        toast.show();

    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "onStop");
        // Toast.makeText(this,"La aplicación se ha detenido", Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text = "La aplicación se ha detenido";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.AXIS_CLIP, 0, 0);
        toast.show();

    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "onDestroy");
        //Toast.makeText(this,"La aplicación se ha finalizado", Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text = "La aplicación se ha finalizado";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.LEFT|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();

    }
}