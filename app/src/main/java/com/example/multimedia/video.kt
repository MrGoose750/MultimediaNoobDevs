package com.example.multimedia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import androidx.navigation.fragment.findNavController
import com.example.multimedia.databinding.FragmentMenuBinding


/**
 * A simple [Fragment] subclass.
 * Use the [video.newInstance] factory method to
 * create an instance of this fragment.
 */
class video : Fragment() {

    private lateinit var fbinding: FragmentMenuBinding
    var videoView: VideoView? = null
    var mediaController: MediaController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fbinding = FragmentMenuBinding.inflate(layoutInflater)
        repro()
        return fbinding.root
    }

    private fun repro(){


    }
}