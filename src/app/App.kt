package app

import react.*
import react.dom.*
import models.person

@JsModule("src/header/avatar.png")
external val avatar: dynamic

val firstname = "Farzad"
val lastname = "Tabashir"
val subtitle = "Software Developer"

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        header(firstname, lastname, subtitle, avatar)
        div("App-columns"){
            div{
                box(person.educations.name, topEmptySpace = 100){
                    person.educations.items.map{ education ->
                        education_box(education)
                    }
                }
                box(person.experiences.name){
                    person.experiences.items.map{ experience ->
                        experience_box(experience)
                    }
                }
                box(person.teachingAssistantships.name){
                    person.teachingAssistantships.items.map{ teachingAssistantship ->
                        education_box(teachingAssistantship)
                    }
                }
            }
            div{
                box(person.talks.name, topEmptySpace = 100){
                    person.talks.items.map{ (talkTitle, talkDesceiption) ->
                        simple_box(talkTitle, talkDesceiption)
                    }
                }
                box(person.courses.name){
                    person.courses.items.map{ (courseTitle, courseDescription)  ->
                        simple_box(courseTitle, courseDescription)
                    }
                }
                box(person.skills.name){
                    person.skills.items.map{ skill  ->
                        simple_box(skill)
                    }
                }
            }
        }
        footer()
    }
}


fun RBuilder.app() = child(App::class) {}
