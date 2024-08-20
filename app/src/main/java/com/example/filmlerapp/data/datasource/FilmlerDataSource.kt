package com.example.filmlerapp.data.datasource

import com.example.filmlerapp.data.entity.Filmler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FilmlerDataSource {
    suspend fun filmleriYukle():List<Filmler> =
        withContext(Dispatchers.IO)
        {
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
            return@withContext filmlerListesi
        }
}