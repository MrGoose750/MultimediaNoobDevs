package com.example.multimedia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.multimedia.databinding.FragmentMenuBinding

class menu : Fragment() {

    private lateinit var fbinding: FragmentMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fbinding = FragmentMenuBinding.inflate(layoutInflater)
        iniciar()
        return fbinding.root
    }


    private fun iniciar() {
        fbinding.btnAudio.setOnClickListener{
            Navigation.findNavController(fbinding.root).navigate(R.id.action_menu_to_audio)
        }

        fbinding.btnVideo.setOnClickListener{
            Navigation.findNavController(fbinding.root).navigate(R.id.action_menu_to_video)
        }

        fbinding.btnFoto.setOnClickListener{
            Navigation.findNavController(fbinding.root).navigate(R.id.action_menu_to_foto)
        }

    }
}

