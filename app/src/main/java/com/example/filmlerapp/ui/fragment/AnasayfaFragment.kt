package com.example.filmlerapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.filmlerapp.R
import com.example.filmlerapp.data.entity.Filmler
import com.example.filmlerapp.databinding.FragmentAnasayfaBinding
import com.example.filmlerapp.ui.adapter.FilmlerAdapter
import com.example.filmlerapp.ui.viewModel.AnasayfaViewModel
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    private lateinit var viewModel: AnasayfaViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa ,container, false)

        binding.anasayfaToolbarBaslik="Filmler"

        viewModel.filmListesi.observe(viewLifecycleOwner){
            val filmlerAdapter=FilmlerAdapter(requireContext(),it)
            binding.filmlerAdapter=filmlerAdapter
        }


        val db=Firebase.firestore
        val collectionFilmler=db.collection("Filmler")

        val f1=Filmler("1","Pulp Fiction","pulp",24)
        val f2=Filmler("2","Sil Baştan","eternal",28)
        val f3=Filmler("3","LOTR","lotr",32)
        val f4=Filmler("4","Forrest Gump","forrest",36)
        val f5=Filmler("5","American Pyscho","american",20)
        val f6=Filmler("6","Saksı Olmanın","perks",16)
        collectionFilmler.document().set(f1)
        collectionFilmler.document().set(f2)
        collectionFilmler.document().set(f3)
        collectionFilmler.document().set(f4)
        collectionFilmler.document().set(f5)
        collectionFilmler.document().set(f6)


        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val temp:AnasayfaViewModel by viewModels()
        viewModel=temp
    }
}