package io.github.a2kaido.constraint.layout.carousel.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.a2kaido.constraint.layout.R

class CarouselAdapter : RecyclerView.Adapter<CarouselAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.item_carousel, p0, false))
    }

    override fun getItemCount() = 5

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}