package com.example.recyclerviewhomeworkv2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListAdapter  extends
        RecyclerView.Adapter<ListAdapter.WordViewHolder> {
    //arraylist para recibir los elementos o items
    private List<ListElement> listRecipes;
    private LayoutInflater mInflater;
    private Context context;
    private TextView det;
    TextView recipeDesc, titleRecipe, details;
    public static final String EXTRA_MESSAGE = "com.example.prueba.MESSAGE";

    /**
     * Constructor
     * @param listRecipes
     * @param context
     */
    public ListAdapter(List<ListElement> listRecipes, Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.listRecipes = listRecipes;
        this.context = context;
    }//fin del constructor


    /**
     * Método que nos permite enlazarnos con el archivo item_list.xml
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public ListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflamos el view creado el cual vamos a retornar
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null);
        return new ListAdapter.WordViewHolder(view);
    }//fin del método


    @Override
    public void onBindViewHolder(final ListAdapter.WordViewHolder holder, final int position) {
        holder.binData(listRecipes.get(position));

        holder.setOnClickListener();
//        holder.details.setOnClickListener(this);

    }//fin del método


    /**
     * Retornamos la cantidad de lista o items de la recetas
     * @return
     */
    @Override
    public int getItemCount() {
        return listRecipes.size();
    }//fin del método


    /**
     *
     */
    public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        //obtenemos el id de nuestro item_list.xml mediante su id
//        TextView recipeDesc, titleRecipe, details;
        //context
        Context context;
        public WordViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
            //obtenemos el recurso de nuestro item mediante el id
            recipeDesc  = itemView.findViewById(R.id.desc_recipe);
            titleRecipe = itemView.findViewById(R.id.title_recipe);
            //obtenemos la card
            details = itemView.findViewById(R.id.desc_recipe);
        }//fin del método

        public void binData(final ListElement listElement) {
            recipeDesc.setText(listElement.getDescRecipe());
            titleRecipe.setText(listElement.getTitleRecipe());
        }//fin del método

        public void setOnClickListener(){
            details.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.desc_recipe:
                    Intent intent = new Intent(context, DetailsRecipe.class);
                    intent.putExtra(EXTRA_MESSAGE, details.getText());
                    context.startActivity(intent);
                    break;
            }
        }
    }//fin de la clase WordViewHolder

}//fin de la clase ListAdapter
