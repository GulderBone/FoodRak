package com.gulderbone.foodrak

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.gulderbone.foodrak.databinding.FragmentSecondBinding

class SecondFragment : Fragment(R.layout.fragment_second) {

    private val binding by viewBinding(FragmentSecondBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.heheh.text = "bobeg2"
    }
}
