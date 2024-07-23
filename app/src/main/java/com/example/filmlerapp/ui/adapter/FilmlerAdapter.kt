package com.example.filmlerapp.ui.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.filmlerapp.data.entity.Filmler
import com.example.filmlerapp.databinding.CardTasarimBinding


class FilmlerAdapter(var mContext:Context,var filmlerListesi:List<Filmler>) :RecyclerView.Adapter<FilmlerAdapter.CardTasarimHolder>( ){
    inner class CardTasarimHolder(var tasarim:CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CardTasarimHolder, position: Int) {
        TODO("Not yet implemented")
    }
}