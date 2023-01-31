package com.alangaelrojas.mymovies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * TODO Usando view binding, validar que el usuario y contraseña no esten vacios al presionar
 * sobre el boton Iniciar sesion
 * **/
class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

}