package com.example.superheroview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val superheros: List<SuperHero> = listOf(
        SuperHero("Spiderman", "Peter Parker", "Marvel", "https://cronicaglobal.elespanol.com/uploads/s1/61/11/50/7/main-700b9bff30.jpeg"),
        SuperHero("Iron Man", "Tony Stark", "Marvel", "https://www.dx.com.py/wp-content/uploads/2018/05/iron-man-evolucion-trajes-mcu.jpg"),
        SuperHero("Shang-Chi", "Shang", "Marvel", "https://i.blogs.es/907c0a/shang-chi-rottentomatoes-critica/1366_2000.jpeg"),
        SuperHero("Black panther", "T'Challa", "Marvel", "https://i2.wp.com/hipertextual.com/wp-content/uploads/2020/08/hipertextual-2020103397.jpg?fit=1200%2C676&ssl=1"),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycler()
    }

    fun initRecycler(){
        rvSuperHero.layoutManager = LinearLayoutManager(this);
        val adapter = HeroAdapter(superheros);
        rvSuperHero.adapter = adapter;
    }
}