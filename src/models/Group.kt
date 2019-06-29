package models

data class Group<T>(
    val name: String,
    val items: Array<T> 
)