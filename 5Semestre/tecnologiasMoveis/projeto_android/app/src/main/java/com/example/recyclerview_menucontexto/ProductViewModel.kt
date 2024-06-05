package com.example.recyclerview_menucontexto

import androidx.lifecycle.ViewModel

class ProductViewModel : ViewModel() {

    fun getProducts() = mutableListOf(
        Product(
            urlImage = "https://www.quitandatomio.com.br/upload/24003020-beneficios-da-laranja-bahia-para-a-saude.jpg",
            name = "Laranja",
            price = "9.90 kg"
        ),
        Product(
            urlImage = "https://mercadoorganico.com/6314-home_default/maca-gala-organica-400g-a-500g-osm.jpg",
            name = "Maçã",
            price = "7.90 kg"
        ),
        Product(
            urlImage = "https://www.hortifrutiorganico.com.br/121-large_default/banana-organica-prata-1-kg.jpg",
            name = "Banana",
            price = "5.90 kg"
        ),
        Product(
            urlImage = "https://cdn.awsli.com.br/2500x2500/2551/2551115/produto/209178313/uva-verde-min-gtfgiv.jpg",
            name = "Uva",
            price = "12.90 kg"
        ),
        Product(
            urlImage = "https://www.varanda.com.br/media/catalog/product/cache/1/image/1200x/9df78eab33525d08d6e5fb8d27136e95/k/i/kiwi.jpg",
            name = "Kiwi",
            price = "9.50 kg"
        ),
    )
}