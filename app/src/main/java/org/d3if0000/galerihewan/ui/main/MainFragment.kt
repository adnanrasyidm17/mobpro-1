package org.d3if0000.galerihewan.ui.main

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.d3if0000.galerihewan.databinding.FragmentMainBinding
import org.d3if0000.galerihewan.network.ApiStatus

class MainFragment : Fragment() {

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    private lateinit var binding: FragmentMainBinding
    private lateinit var myAdapter: MainAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        myAdapter = MainAdapter()
        with(binding.recyclerView) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = myAdapter
            setHasFixedSize(true)
        }

        Log.i("MainActivity", "onCreateView fragment dijalankan")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getData().observe(viewLifecycleOwner) {
            myAdapter.updateData(it)
        }

        viewModel.getStatus().observe(viewLifecycleOwner) {
            updateProgress(it)
        }

        Log.i("MainActivity", "onViewCreated fragment dijalankan")
    }

    private fun updateProgress(status: ApiStatus) {
        when (status) {
            ApiStatus.LOADING -> {
                binding.progressBar.visibility = View.VISIBLE
            }
            ApiStatus.SUCCESS -> {
                binding.progressBar.visibility = View.GONE
            }
            ApiStatus.FAILED -> {
                binding.progressBar.visibility = View.GONE
                binding.networkError.visibility = View.VISIBLE
            }
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("MainActivity", "onAttach fragment dijalankan")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MainActivity", "onCreate fragment dijalankan")
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart fragment dijalankan")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "onResume fragment dijalankan")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "onPause fragment dijalankan")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop fragment dijalankan")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("MainActivity", "onDestroyView fragment dijalankan")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "onDestroy fragment dijalankan")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("MainActivity", "onDetach fragment dijalankan")
    }
}