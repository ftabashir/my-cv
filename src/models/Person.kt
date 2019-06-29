package models

data class Person(
    val firstname: String,
    val lastname: String,
    val educations: Group<Education>,
    val experiences: Group<Experience>,
    val teachingAssistantships: Group<Education>
)