package com.boni.catsfacts.features.facts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.boni.catsfacts.R
import kotlinx.android.synthetic.main.fragment_facts.*
import org.koin.android.viewmodel.ext.android.viewModel

class FactsFragment : Fragment() {

    private val viewModel by viewModel<FactsViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_facts,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.facts.observe(viewLifecycleOwner, Observer {
            facts.adapter = FactsAdapter(it.facts)
        })
        viewModel.doFactsRequest()
    }
}