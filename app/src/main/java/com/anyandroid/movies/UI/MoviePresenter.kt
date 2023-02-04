package com.anyandroid.movies.UI

import com.anyandroid.movies.Pojo.ModelMovie

class MoviePresenter(private val view: Movieview) {

    private fun getMovieFromDB(): ModelMovie = ModelMovie(
        "Spider Man",
        "September 14, 1977",
        "After being bitten by a genetically-modified spider, a shy teenager gains spider-like abilities that he uses to fight injustice as a masked superhero and face a vengeful enemy.",
        1
    )

    fun getMovieReleaseData() {
        view.onGetMovieReleaseData(getMovieFromDB().releaseDate)
    }
    fun getMovieOverview() {
        view.onGetMovieOverview(getMovieFromDB().overview)
    }
    fun getMovieId() {
        view.onGetMovieId(getMovieFromDB().id)
    }
    fun getMovieTitle() {
        view.onGetMovieTitle(getMovieFromDB().title)
    }

}