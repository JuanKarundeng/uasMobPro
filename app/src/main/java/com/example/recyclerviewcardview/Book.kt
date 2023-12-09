package com.example.recyclerviewcardview

var bookList = mutableListOf<Book>()

val BOOK_ID_EXTRA ="bookExtra"

class Book (
    var cover : Int,
    var Judul: String,
    var Sinopsis : String,
    var Link :String,
    val id : Int? = bookList.size
)

