package app

import react.*
import react.dom.*
import models.*

fun RBuilder.experience_box(experience: Experience){
    div("ExperienceBox"){
        div{
            b{ + experience.company } 
            span{ + (", " + experience.city + ", " + experience.country) }
            span{ + (" — " + experience.subject) }
        }
        div{
            + experience.description
        }
        div{
            + experience.time
        }
    }
}
