package app

import react.*
import react.dom.*
import logo.*
import ticker.*

val box = Box(
    "Education",
    arrayOf(
        BoxItem(
            "M.S.  Artificial Intelligence",
            "Shiraz University, Shiraz, Iran.",
            "2015-2018"
        )
    )
)

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        chrono_box(box)
        div("App-header") {
            
            h2 {
                +"Welcome to React with Kotlin"
            }
        }
        p("App-intro") {
            +"To get started, edit "
            code { +"app/App.kt" }
            +" and save to reload."
        }
        p("App-ticker") {
            ticker()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
