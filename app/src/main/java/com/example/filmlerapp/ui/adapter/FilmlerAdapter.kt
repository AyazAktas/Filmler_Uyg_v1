package com.example.filmlerapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.filmlerapp.data.entity.Filmler
import com.example.filmlerapp.databinding.CardTasarimBinding
import com.example.filmlerapp.ui.fragment.AnasayfaFragmentDirections
import com.google.android.material.snackbar.Snackbar


class FilmlerAdapter(var mContext:Context,var filmlerListesi:List<Filmler>) :RecyclerView.Adapter<FilmlerAdapter.CardTasarimHolder>( ){
    inner class CardTasarimHolder(var tasarim:CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimHolder {
        val binding=CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimHolder(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimHolder, position: Int) {
        val film=filmlerListesi.get(position)
        val t=holder.tasarim

        t.imageView.setImageResource(mContext.resources.getIdentifier(film.resim,"drawable",mContext.packageName))
        t.textViewFiyat.text="${film.fiyat} ₺"
        t.textViewFilmAdi.text="${film.ad}"
        t.cardViewFilm.setOnClickListener{
            val gecis=AnasayfaFragmentDirections.detayGecis(film=film)
            Navigation.findNavController(it).navigate(gecis)

        }

        t.buttonSepet.setOnClickListener {
            Snackbar.make(it,"${film.ad} sepete eklendi.",Snackbar.LENGTH_SHORT)
                .show()
        }
    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }

}