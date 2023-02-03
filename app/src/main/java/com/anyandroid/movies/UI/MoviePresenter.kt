package com.anyandroid.movies.UI

import com.anyandroid.movies.Pojo.ModelMovie

class MoviePresenter(private val view: Movieview) {

    fun getMovieFromDB(): ModelMovie {
        return ModelMovie(
            "Spider Man",
            "September 14, 1977",
            "After being bitten by a genetically-modified spider, a shy teenager gains spider-like abilities that he uses to fight injustice as a masked superhero and face a vengeful enemy.",
            1
        )

    }

    fun getMovieTitle() {
        view.onGetMovieTitle(getMovieFromDB().title)
    }

}