package com.example.listmaker.ui.main

import android.icu.lang.UCharacter.VerticalOrientation
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listmaker.ListSelectionRecyclerViewAdaptor
import com.example.listmaker.R
import com.example.listmaker.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,

        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater,container,false)
        binding.listsRecyclerview.layoutManager = GridLayoutManager(requireContext(),2,RecyclerView.VERTICAL,false)
        binding.listsRecyclerview.adapter = ListSelectionRecyclerViewAdaptor()
        return binding.root
    }

}