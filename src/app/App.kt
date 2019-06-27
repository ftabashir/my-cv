package app

import react.*
import react.dom.*
import logo.*
import ticker.*

val boxes = arrayOf(
    Box(
        "Education",
        arrayOf(
            BoxItem(
                "M.S.  Artificial Intelligence",
                "Shiraz University, Shiraz, Iran.",
                "2015-2018"
            ),
            BoxItem(
                "B.S. Computer Science & Engineering ",
                "Shiraz University, Shiraz, Iran.",
                "2010-2015"
            )
        )
    ),
    Box(
        "Experience",
        arrayOf(
            BoxItem(
                "Otaghak, Tehran, Iran — Android  Developer",
                "We develop high quality softwares at Otaghak to facilitate finding and booking perfect rental places.",
                "January 2019 - Now"
            ),
            BoxItem(
                "Communere Ltd, London, UK (Remote) — Full-stack Javascript Developer",
                "Communere is a bespoke software development company. We deliver full-stack web applications with Cutting-edge technologies to our customers.",
                "October 2018 - December 2018"
            ),
            BoxItem(
                "Dokan (IR-FMCG), Tehran, Iran — Software Developer",
                "Developing mobile (Android) & web (Angular, ASP.NET) applications which provides online supermarket and groceries shop.",
                "June 2017 - September 2018"
            ),
            BoxItem(
                "Rando,  Shiraz, Iran — Android Developer",
                "Developing android mobile apps for Rando which was an online taxi platform (similar to Uber, Snapp and Tap30)",
                "June 2016 - June 2017"
            ),
            BoxItem(
                "Raman LTG, Shiraz, Iran — Android Developer",
                "Developing Augmented Reality (AR) applications for android devices.",
                "March 2015 - September 2015"
            )

        )
    )
)

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        boxes.mapIndexed{ index, box ->
            val topEmptySpace = if(index==0) 100 else 0
            chrono_box(box, topEmptySpace)
        }
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
