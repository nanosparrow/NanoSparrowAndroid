package com.nanosparrow.nanosparrow.ui.featured

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.nanosparrow.nanosparrow.R

class FeaturedFragment : Fragment() {

    companion object {
        fun newInstance() =
            FeaturedFragment()
    }

    private lateinit var viewModel: FeaturedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.featured_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FeaturedViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
