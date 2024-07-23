package com.example.filmlerapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.filmlerapp.R
import com.example.filmlerapp.data.entity.Filmler
import com.example.filmlerapp.databinding.FragmentAnasayfaBinding
import com.example.filmlerapp.ui.adapter.FilmlerAdapter


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.toolbarAnasayfa.title="Filmler"
        binding.filmrv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val filmlerListesi=ArrayList<Filmler>()
        val f1=Filmler(1,"Pulp Fiction","pulp",24)
        val f2=Filmler(2,"Sil Baştan","eternal",28)
        val f3=Filmler(3,"LOTR","lotr",32)
        val f4=Filmler(4,"Forrest Gump","forrest",36)
        val f5=Filmler(5,"American Pyscho","american",20)
        val f6=Filmler(6,"Saksı Olmanın","perks",16)
        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f4)
        filmlerListesi.add(f5)
        filmlerListesi.add(f6)

        val filmlerAdapter=FilmlerAdapter(requireContext(),filmlerListesi)
        binding.filmrv.adapter=filmlerAdapter



        return binding.root
    }
}