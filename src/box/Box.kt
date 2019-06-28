package app

import react.*
import react.dom.*

@JsModule("src/box/rhombus.svg")
external val rhombus: dynamic

fun RBuilder.box(box: Box, topEmptySpace: Int = 0) {
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
                + box.title
            }
            box.items.map{
                div("Box-box-item"){
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