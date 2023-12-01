package br.com.poc

data class Person(val id: Long, val name: String, val age: Int)

data class PersonDto(val id: Long, val fullName: String)

fun mapPersonToDto(person: Person): PersonDto {
    val fullName = "${person.name} (${person.age} years old)"
    return PersonDto(person.id, fullName)
}
fun main() {
    val person = Person(1,"jr", 36)
    println(mapPersonToDto(person))
}