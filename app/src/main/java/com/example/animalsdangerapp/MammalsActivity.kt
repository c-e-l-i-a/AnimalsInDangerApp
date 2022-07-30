package com.example.animalsdangerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MammalsActivity : AppCompatActivity() {

    lateinit var mammalsRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mammals)

        mammalsRecyclerView = findViewById(R.id.mammalsRecyclerView)

        val items = listOf(
            Animals("Le Tigre","Sauvé de justesse de l’extinction il y a quelques années, à l’époque où la chasse aux trophées était à la mode, le tigre est un super-prédateur connu pour être le plus grand félin sauvage.", R.drawable.tiger_icon),
            Animals("L'Orang-Outan","Avec sa fourrure rougeâtre et ses bras puissants, l’orang-outan a notamment élu domicile dans les forêts tropicales indonésiennes où il peut grimper en hauteur à la recherche de nourriture.", R.drawable.orang_outan),
            Animals("Le Renard Polaire","Petites oreilles, poils laineux sous les pattes, le renard polaire s’est adapté pour limiter au maximum les pertes de chaleur. Reconnaissable à son pelage blanc teinté de gris, le petit animal a élu domicile partout à travers l’Arctique. ", R.drawable.renard_polaire),
            Animals("L'ours Polaire","Une peau noire, de petites oreilles, des pattes légèrement palmées, l’ours polaire s’est parfaitement adapté au climat arctique. Aussi à l’aise dans l’eau que sur la neige fraîche, le plus grand carnivore terrestre est pourtant devenu l’un des symboles du réchauffement climatique.", R.drawable.oure_polaire),
            Animals("Le panda roux","Doté d’une fourrure épaisse lui permettant de résister au froid, le panda roux se retrouve en haute altitude entre la Chine, l’Inde et le Népal. Grand amateur de bambou, le mammifère souffre du déclin de sa principale source de nourriture causée par l’expansion humaine.", R.drawable.panda_roux),
        )

        mammalsRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MammalsActivity)
            adapter = AnimalsAdapter(items) }
    }
}