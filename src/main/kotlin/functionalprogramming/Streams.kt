package functionalprogramming

import java.time.LocalDate
import java.time.Month
import java.util.*
import java.util.stream.Collectors

fun main(args: Array<String>) {
    val task1 =
        Task("Read Version Control with Git book", TaskType.READING, LocalDate.of(2015, Month.JULY, 1)).addTag("git")
            .addTag("reading").addTag("books")
    val task2 = Task("Read Java 8 Lambdas book", TaskType.READING, LocalDate.of(2015, Month.JULY, 2)).addTag("java8")
        .addTag("reading").addTag("books")
    val task3 =
        Task("Write a mobile application to store my tasks", TaskType.CODING, LocalDate.of(2015, Month.JULY, 3)).addTag(
            "coding"
        ).addTag("mobile")
    val task4 =
        Task("Write a blog on Java 8 Streams", TaskType.WRITING, LocalDate.of(2015, Month.JULY, 4)).addTag("blogging")
            .addTag("writing").addTag("streams")
    val task5 =
        Task("Read Domain Driven Design book", TaskType.READING, LocalDate.of(2015, Month.JULY, 5)).addTag("ddd")
            .addTag("books").addTag("reading")
    val tasks = listOf(task1, task2, task3, task4, task5)

    val readingTasks = tasks.filter { task -> task.type == TaskType.READING }
        .sortedBy { task -> task.title.length }
        .map { m -> m.title }

    val createdBook = tasks.filter { task -> task.type == TaskType.READING }
        .sortedWith(compareBy { it.createdOn })
        .map { m -> m.title }

    readingTasks.forEach { x -> println(x) }
    createdBook.forEach { x -> println(x) }

    val distinctTasks = allDistinctTasks(tasks)
    distinctTasks.forEach { x -> println(x) }

    val countReadingBook = countAllReadingTasks(tasks)
    println(countReadingBook)

//    val distinctTags = allDistinctTags(tasks)
//    println(distinctTags)

    val titles = joinAllTaskTitles(tasks)
    println(titles)

    val groupByType = groupTasksByType(tasks)
    println(groupByType)

    val groupTasksByTypeAndCreation = groupTasksByTypeAndCreationDate(tasks)
    println(groupTasksByTypeAndCreation)

    val associateByType = associateByTasksByType(tasks)
    println(associateByType)
}

fun allDistinctTasks(tasks: List<Task>) = tasks.distinct()

fun countAllReadingTasks(tasks: List<Task>) = tasks
    .filter { task -> task.type == TaskType.READING }
    .count()

//fun allDistinctTags(tasks: List<Task>) = tasks.flatMap {
//    it.tags.distinct()
//}

//fun isAllReadingTasksWithTagBooks(tasks: List<Task>) = tasks.filter { task -> task.type == TaskType.READING }
//    .all { task -> task.co }

fun joinAllTaskTitles(tasks: List<Task>) = tasks.map { task -> task.title }
    .reduce { first, second -> "$first *** $second" }

fun groupTasksByType(tasks: List<Task>) = tasks.groupBy { it.type }

fun groupTasksByTypeAndCreationDate(tasks: List<Task>) = tasks.groupBy({ it.type }, { it.createdOn })

fun associateByTasksByType(tasks: List<Task>) = tasks.associateBy { it.type }