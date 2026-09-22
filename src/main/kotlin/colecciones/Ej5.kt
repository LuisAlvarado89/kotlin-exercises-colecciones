package org.ies.tierno.colecciones

//Un método mapToEmails(students: List<Student>):List<String> que dada una lista de estudiantes//
// devuelva una lista de los emails de los estudiantes en el mismo orden//

data class Student(
    val name: String,
    val surname: String,
    val email: String,
    val zipCode: Int
)

fun mapToEmails(students: List<Student>): List<String> {
    val list = students.map { it.email }
    return list
}


//Un método  filterByZipCode(students: List<Student>,  zipCode: Int): List<Student> //
//que dada una lista de estudiantes y un código postal, devuelva una lista con los estudiantes que vivan en ese código postal//

fun filterByZipCode(students: List<Student>, zipCode: Int): List<Student> {
    val listFilter = students.filter { it.zipCode == zipCode }

    return listFilter
}

fun main() {
    val StudentList = listOf(
        Student("Miguel", "Lopez", "miguel@gmail.com", 28045),
        Student("Carla", "Rodriguez", "carla@gmail.com", 25874),
        Student("Erick", "Velasquez", "erick@gmail.com", 24157),
        Student("Juan", "Perez", "juan@gmail.com", 24157)

    )
    println(mapToEmails(StudentList))
    println(filterByZipCode(StudentList, zipCode = 24157))
}