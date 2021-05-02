package com.example.recyclerviewhomeworkv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //creamos una lista la cual se enviara como parámetro a la clase ListAdapter
    private List<ListElement> listaDatos;
    public static final String EXTRA_MESSAGE = "com.example.prueba.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creamos un array
        listaDatos = new ArrayList<>();
        listaDatos.add(new ListElement("La famosa Tarta Sacher, fue inventada en 1832 " +
                "por Franz Sacher. Este hombre era un ayudante de cocina, que consiguió impresionar " +
                "con su tarta al príncipe Klemens Wenzel Lothar von Metternich.",
                "Tarta Sacher:"));

        listaDatos.add(new ListElement("Si buscas una receta de galletas caseras sencillas," +
                " sin ingredientes extraños y muy rápidas de preparar, esta puede ser la ganadora que " +
                "se quede para siempre en tu repertorio. Son las típicas galletas de avena al estilo " +
                "norteamericano, ligeramente crujientes por fuera y con el corazón más tierno, un " +
                "clásico de la repostería que no necesita más adornos para seguir siendo uno de los " +
                "dulces favoritos de niños y mayores.", "Galletas de avena caseras:"));

        listaDatos.add(new ListElement("A medio camino entre bizcocho, pastel y cookie blanda " +
                "al estilo Tony Roma's, estos vasitos de masa de galleta con chocolate son, ante todo, " +
                "una tentadora delicia para disfrutar en muy pocos minutos. Es una receta que hemos " +
                "adaptado de la británica Nigella Lawson, de quien somos fervientes seguidores, y " +
                "sin duda se ha ganado un puesto fijo en nuestro repertorio de postres exprés.",
                "Vasitos de masa de galleta con chips de chocolate:"));

        listaDatos.add(new ListElement("De origen británico, el banoffee pie o tarta banoffee es " +
                "una combinación de galleta, mantequilla, toffee (o dulce de leche), plátano y nata montada. " +
                "Es una receta que lo tiene todo: 1. es rápida, está lista en menos de 30 minutos, 2. es fácil, no " +
                "requiere de cocción alguna ni de artilugios extraños, y 3. está deliciosa.",
                "Tarta banoffee:"));

        listaDatos.add(new ListElement("Si hay alguien, entre los que hoy leen estas líneas, que no " +
                "haya probado nunca la típica tarta de galletas y chocolate de los cumples de toda la vida, que " +
                "levante la mano. Si eres de los que no lo ha hecho, te recomiendo que pongas solución al tema, " +
                "porque te estás perdiendo algo grande, sublime, maravilloso. Así que no esperes a que sea el " +
                "cumpleaños de nadie y lánzate ya mismo.",
                "Receta de tarta de chocolate y galletas:"));

        ListAdapter listAdapter = new ListAdapter(listaDatos, this);
        RecyclerView recyclerView = findViewById(R.id.recipes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);

    }
}