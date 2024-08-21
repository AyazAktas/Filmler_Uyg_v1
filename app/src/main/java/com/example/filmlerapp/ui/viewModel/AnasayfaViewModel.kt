package com.example.filmlerapp.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.filmlerapp.data.entity.Filmler
import com.example.filmlerapp.data.repo.FilmlerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnasayfaViewModel @Inject constructor(var frepo: FilmlerRepository) : ViewModel(){
    var filmListesi=MutableLiveData<List<Filmler>>()

    init {
        filmleriYukle()
    }

    fun filmleriYukle(){
        CoroutineScope(Dispatchers.Main).launch {
            filmListesi.value=frepo.filmleriYukle()
        }
    }
}