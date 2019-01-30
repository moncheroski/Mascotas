package com.monos.tllr3c3;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class viewHolder extends ViewHolder implements View.OnClickListener{

    Button btnLike;
    Button btnFav;
    ImageView imagen;
    TextView tituloTV;
    int Position;
    List<FDatos> ListaObjeto;





    public viewHolder(View itemView, List<FDatos> datos) {
        super(itemView);



        btnLike = (Button) itemView.findViewById(R.id.btnLike);
        btnFav = (Button) itemView.findViewById(R.id.btnFav);
        imagen = (ImageView) itemView.findViewById(R.id.imagen);
        tituloTV = (TextView) itemView.findViewById(R.id.btnLike);
        ListaObjeto = datos;


        btnLike.setOnClickListener(this);

        btnFav.setOnClickListener(this);

    }

    private void setContentView(int activity_main) {
    }

    @Override
    public void onClick(View view) {
        int position = getAdapterPosition();
        FDatos objeto = ListaObjeto.get(position);

        if(view.getId() == btnLike.getId()){
            Toast.makeText(btnLike.getContext(), "Diste like a " +objeto.getTitulo(), Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(btnLike.getContext(), " acumulaste like " +objeto.getTitulo(), Toast.LENGTH_SHORT).show();
        }

    }

}
