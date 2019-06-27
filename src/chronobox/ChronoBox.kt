package app

import react.*
import react.dom.*

@JsModule("src/chronobox/rhombus.svg")
external val rhombus: dynamic

fun RBuilder.chrono_box(box: Box) {
    div("ChronoBox"){
        div("ChronoBox-col1"){
            div{
                img(alt = "rhombus", src = rhombus, classes = "ChronoBox-rhombus") {}
            }
            div("ChronoBox-line"){}
        }
        div("ChronoBox-col2"){
            span{
                + box.title
            }
            box.items.map{
                span{
                    + it.header
                }
                span{
                    + it.content
                }
                span{
                    + it.footer
                }
            }
        }
    }
}

data class Box(
    val title: String,
    val items: Array<BoxItem>
)

data class BoxItem(
    val header: String,
    val content: String,
    val footer: String
)