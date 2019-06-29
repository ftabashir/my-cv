package models

data class Person(
    val firstname: String,
    val lastname: String,
    val educations: Group<Education>,
    val experiences: Group<Experience>,
    val teachingAssistantships: Group<Education>,
    val talks: Group<Pair<String, String>>,
    val courses: Group<Pair<String, String>>,
    val skills: Group<String>
)