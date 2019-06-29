package app

import react.*
import react.dom.*
import models.*

fun RBuilder.simple_box(title: String, subtitle: String? = null){
    div("SimpleBox"){
        div{
            b{ + title }
        }
        subtitle?.let{
            div{ + it }
        }
    }
}