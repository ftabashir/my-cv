package app

import react.*
import react.dom.*

fun RBuilder.header(firstname: String, lastname:String, subtitle: String, avatar: dynamic){
    div("Header"){
        img(alt = "avatar", src = avatar, classes = "Header-avatar") {}
        div("Header-name"){
            span("Header-firstname"){ + firstname }
            span("Header-lastname"){ + lastname }
        }
        div("Header-subtitle"){
            + subtitle
        }
    }
}