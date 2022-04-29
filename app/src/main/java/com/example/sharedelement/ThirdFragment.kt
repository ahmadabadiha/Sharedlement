package com.example.sharedelement

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.transition.Scene
import androidx.transition.Transition
import androidx.transition.TransitionInflater
import androidx.transition.TransitionManager
import com.example.sharedelement.databinding.FragmentThirdBinding

class ThirdFragment : Fragment(R.layout.fragment_third) {

    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentThirdBinding.bind(view)

        val x = TransitionInflater.from(requireActivity().applicationContext).inflateTransition(R.transition.shared_image)
        val scene1 = Scene.getSceneForLayout(binding.sceneRoot, R.layout.scene1, requireContext())
        val scene2 = Scene.getSceneForLayout(binding.sceneRoot, R.layout.scene2, requireContext())

        binding.button1.setOnClickListener {
            TransitionManager.go(scene1,x)
        }

        binding.button2.setOnClickListener {

            TransitionManager.go(scene2,x)

        }


        binding.sceneRoot.findViewById<Button>(R.id.b1).setOnClickListener {
            findNavController().navigate(ThirdFragmentDirections.actionThirdFragmentToMotionLayoutFragment())
        }
    }
}