package com.example.sharedelement

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.sharedelement.databinding.FragmentThirdBinding
import com.example.sharedelement.databinding.MotionLayoutBinding

class MotionLayoutFragment: Fragment(R.layout.motion_layout) {

    private var _binding: MotionLayoutBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = MotionLayoutBinding.bind(view)

    }
}