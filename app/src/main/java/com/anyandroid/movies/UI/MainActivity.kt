package com.anyandroid.movies.UI

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.anyandroid.movies.Pojo.ModelMovie
import com.anyandroid.movies.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var i: Int = 0
    private var id: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // MVP pattern
        val moviePresenter = MoviePresenter(
            view = object : Movieview {
                override fun onGetMovieTitle(title: String?) {
                    binding.textViewTitle.text = title
                }

                override fun onGetMovieReleaseData(releaseDate: String?) {
                    binding.textViewReleaseData.text = releaseDate
                }

                override fun onGetMovieOverview(overview: String?) {
                    binding.textViewOverview.text = overview
                }

                override fun onGetMovieId(id: Int?) {

                }
            }
        )
        binding.button.setOnClickListener {
            Log.d(TAG, "lolodmc Button Clicked  ${++i} times")
            moviePresenter.getMovieTitle()
            moviePresenter.getMovieReleaseData()
            moviePresenter.getMovieOverview()
        }
    }


}