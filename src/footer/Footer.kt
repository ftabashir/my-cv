package app

import react.*
import react.dom.*

fun RBuilder.footer(){
    div("Footer"){
        span{ +"Built with" } 
        span("Love"){ +"❤" } 
        span{ +"by Kotlin + React"}
    }
}