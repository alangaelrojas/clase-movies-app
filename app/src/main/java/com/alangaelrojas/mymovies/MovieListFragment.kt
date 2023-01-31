package com.alangaelrojas.mymovies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.alangaelrojas.mymovies.databinding.FragmentMovieListBinding


class MovieListFragment : Fragment() {

    // Declaring variables
    private var date: String = "" // Variable mutable
    private val NUM_PAGES = 2 // Variable inmutable

    private var state: Int? = null // Inicializacion nula

    // https://kotlinlang.org/docs/properties.html#late-initialized-properties-and-variables
    private lateinit var sum: String // Inicializacion tardia
    private lateinit var binding: FragmentMovieListBinding

    // https://kotlinlang.org/docs/delegated-properties.html#lazy-properties
    private val name by lazy { "Humberto" } // Inicializacion peresoza

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        state?.let { estado ->
            Toast.makeText(context, (estado + 20).toString(), Toast.LENGTH_SHORT).show()
        }


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_list, container, false)

    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) {
        }
    }
}