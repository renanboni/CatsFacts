package com.boni.catsfacts.features.facts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.boni.catsfacts.R
import com.boni.catsfacts.data.model.Fact
import kotlinx.android.synthetic.main.facts_item_list.view.*

class FactsAdapter(private val facts: List<Fact>) : RecyclerView.Adapter<FactsAdapter.FactsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FactsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.facts_item_list,
            parent,
            false
        )

        return FactsViewHolder(view)
    }

    override fun getItemCount() = facts.count()

    override fun onBindViewHolder(holder: FactsViewHolder, position: Int) {
        holder.bind(facts[position])
    }

    inner class FactsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val text: TextView = view.text
        private val likes: TextView = view.likes
        private val author: TextView = view.author

        fun bind(fact: Fact) {
            text.text = fact.text
            likes.text = fact.upvotes.toString()
            author.text = "${fact.user?.name?.last}, ${fact.user?.name?.first}"
        }
    }
}