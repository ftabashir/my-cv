package app

import react.*
import react.dom.*
import models.person

@JsModule("src/header/avatar.png")
external val avatar: dynamic

@JsModule("src/header/avatar.png")
external val stackoverflow: dynamic
@JsModule("src/header/avatar.png")
external val github: dynamic
@JsModule("src/header/avatar.png")
external val linkedIn: dynamic

val firstname = "Farzad"
val lastname = "Tabashir"
val subtitle = "Software Developer"

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        header(firstname, lastname, subtitle, avatar)
        div("App-columns"){
            div("App-column"){
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
            div("App-column"){
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
                box("Social Media"){
                    val iconWithLink = { icon: dynamic, link: RDOMBuilder<*>.()->Unit -> 
                        
                    }
                    person.socialMedia.stackoverflow?.let{ 
                        div("SocialMedia"){
                            img(alt = "stackoverflow", src = "https://cdn.sstatic.net/Sites/stackoverflow/company/img/logos/so/so-icon.svg?v=f13ebeedfa9e") {}
                            a("https://stackoverflow.com/$it"){ +it }
                        }
                    }  
                    person.socialMedia.github?.let{ 
                        div("SocialMedia"){
                            img(alt = "github", src = "https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png") {}
                            a("https://github.com/$it"){ +it }
                        }
                    }
                    person.socialMedia.linkedIn?.let{ 
                        div("SocialMedia"){
                            img(alt = "linkedIn", src = "https://content.linkedin.com/content/dam/me/business/en-us/amp/brand-site/v2/bg/LI-Bug.svg.original.svg") {}
                            a("https://linkedIn.com/$it"){ +it }
                        }
                    }
                    person.socialMedia.twitter?.let{ 
                        div("SocialMedia"){
                            img(alt = "twitter", src = "https://upload.wikimedia.org/wikipedia/fr/thumb/c/c8/Twitter_Bird.svg/600px-Twitter_Bird.svg.png") {}
                            a("https://twitter.com/$it"){ +it }
                        }
                    }  
                }
            }
        }
        footer()
    }
}


fun RBuilder.app() = child(App::class) {}
