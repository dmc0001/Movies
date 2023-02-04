package com.anyandroid.movies.UI

interface Movieview {
    fun onGetMovieTitle(title: String?)
    fun onGetMovieReleaseData(releaseDate: String?)
    fun onGetMovieOverview(overview: String?)
    fun onGetMovieId(id: Int?)
}