package functionalprogramming

import java.time.LocalDate
import java.util.*

enum class TaskType {
    READING, CODING, BLOGGING,WRITING
}

class Task (
    val title: String,
    val description: String,
    val type: TaskType,
    val createdOn: LocalDate
)
{
    //    private val id: String
//    private val title: String
//    private val description: String
//    private val type: TaskType
//    private val createdOn: LocalDate
    private val tags = HashSet<String>()

//    constructor(id: String, title: String, type: TaskType) {
//        this.id = id
//        this.title = title
//        this.description = title
//        this.type = type
//        this.createdOn = LocalDate.now()
//    }

    constructor(title: String, type: TaskType) : this(title, title, type, LocalDate.now()) {}
    constructor(title: String, type: TaskType, createdOn: LocalDate) : this(title, title, type, createdOn) {}

//    constructor(title: String, description: String, type: TaskType, createdOn: LocalDate){
//        this.id = UUID.randomUUID().toString()
//        this.title = title
//        this.description = description
//        this.type = type
//        this.createdOn = createdOn
//    }

    fun addTag(tag: String): Task {
        this.tags.add(tag)
        return this
    }

    fun getTags(): Set<String> {
        return Collections.unmodifiableSet(tags)
    }

    override fun toString(): String {
        return ("Task{" +
                "title='" + title + '\''.toString() +
                ", type=" + type +
                '}'.toString())
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val task = o as Task
        return (title == task.title && type == task.type)
    }

    override fun hashCode(): Int {
        return Objects.hash(title, type)
    }
}