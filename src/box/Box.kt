package app

import react.*
import react.dom.*

@JsModule("src/box/rhombus.svg")
external val rhombus: dynamic

fun RBuilder.box(title: String, topEmptySpace: Int = 0, body: RDOMBuilder<*>.() -> Unit) =
    div("Box"){
        div("Box-col1"){
            if(topEmptySpace > 0)
                div("Box-line"){
                    attrs.jsStyle.height = topEmptySpace
                    attrs.jsStyle.flexGrow = 0
                }
            div{
                img(alt = "rhombus", src = rhombus, classes = "Box-rhombus") {}
            }
            div("Box-line"){}
        }
        div("Box-col2"){
            if(topEmptySpace > 0)
                div{
                    attrs.jsStyle.height = topEmptySpace
                }
            span{
                + title
            }
            div("Box-body", body)
        }
    }
