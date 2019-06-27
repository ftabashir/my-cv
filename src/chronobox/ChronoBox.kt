package app

import react.*
import react.dom.*

@JsModule("src/chronobox/rhombus.svg")
external val rhombus: dynamic

fun RBuilder.chrono_box(box: Box, topEmptySpace: Int = 0) {
    div("ChronoBox"){
        div("ChronoBox-col1"){
            if(topEmptySpace > 0)
                div("ChronoBox-line"){
                    attrs.jsStyle.height = topEmptySpace
                    attrs.jsStyle.flexGrow = 0
                }
            div{
                img(alt = "rhombus", src = rhombus, classes = "ChronoBox-rhombus") {}
            }
            div("ChronoBox-line"){}
        }
        div("ChronoBox-col2"){
            if(topEmptySpace > 0)
                div{
                    attrs.jsStyle.height = topEmptySpace
                }
            span{
                + box.title
            }
            box.items.map{
                div("ChronoBox-box-item"){
                    div{
                        + it.header
                    }
                    div{
                        + it.content
                    }
                    div{
                        + it.footer
                    }
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