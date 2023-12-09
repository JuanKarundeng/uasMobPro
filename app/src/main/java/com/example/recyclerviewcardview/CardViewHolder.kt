package com.example.recyclerviewcardview

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewcardview.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding :CardCellBinding,
    private val clickListener: BookClickListener
) :RecyclerView.ViewHolder(cardCellBinding.root)
{
    fun bindBook(book : Book)
    {
        cardCellBinding.cover.setImageResource(book.cover)
        cardCellBinding.judul.text=book.Judul
        cardCellBinding.cardView.setOnClickListener{
            clickListener.onClick(book)
        }
    }
}