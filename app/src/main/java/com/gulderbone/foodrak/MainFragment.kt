package com.gulderbone.foodrak

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.gulderbone.foodrak.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private val binding by viewBinding(FragmentMainBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.hehe.text = "hehehe"
    }
}
