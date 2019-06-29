package app

import react.*
import react.dom.*
import models.*

fun RBuilder.education_box(education: Education){
    div("EducationBox"){
        div{
            b{ + education.subject }
        }
        div{
            + education.place
        }
        div{
            + education.time
        }
    }
}