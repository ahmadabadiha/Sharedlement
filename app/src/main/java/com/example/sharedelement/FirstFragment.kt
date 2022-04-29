package com.example.sharedelement

import android.os.Bundle
import android.view.View
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.example.sharedelement.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentFirstBinding.bind(view)
        // setting the name is also possible in XML

        ViewCompat.setTransitionName(binding.largeImageView, "fab1")
        val extras = FragmentNavigatorExtras(binding.largeImageView to "fab2")
        binding.fab.setOnClickListener {
            findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(), extras)
        }
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}