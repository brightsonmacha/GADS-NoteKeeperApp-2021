package com.example.notekeeper

import java.util.*

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }
    fun addNote(course: CourseInfo, noteTitle: String, noteText: String):Int{
        val note = NoteInfo(course,noteTitle,noteText)
        notes.add(note)
        return notes.lastIndex
  }
    fun findNote(course: CourseInfo, noteTitle: String, noteText: String) : NoteInfo? {
        for (note in notes)
            if (course == note.course &&
                     noteTitle == note.title &&
                     noteText  == note.text) {
                return note
                    }
        return null
    }


    private fun initializeCourses() {
        var course = CourseInfo( "android_intents", "Android Programming with Intents")
        courses[course.courseId] = course

        course = CourseInfo("android_async", "Android Async Programming and Services")
        courses[course.courseId] = course

        course = CourseInfo("java_lang ",  "Java Fundamentals: The Java Language")
        courses[course.courseId] = course

        course = CourseInfo("java_core","Java Fundamentals: The Core Platform")
        courses[course.courseId] = course
    }

<<<<<<< master
    private fun initializeNotes() {
        var course = courses["android_intents"]
        var note = NoteInfo(
            course,
            "Dynamic intent resolution",
            "Wow, intents allow components to be resolved at runtime"
        )
        notes.add(note)

        note = NoteInfo(
            course,
            "Delegating intents",
            "PendingIntents are powerful; they delegate much more than just a component invocation"
        )
        notes.add(note)

        course = courses["android_async"]
        note = NoteInfo(
            course,
            "Service default threads",
            "Did you know that by default an Android Service will tie up the UI thread?"
        )
        notes.add(note)

        note = NoteInfo(
            course,
            "Long running operations",
            "Foreground Services can be tied to a notification icon"
        )
        notes.add(note)

        course = courses["java_lang"]
        note = NoteInfo(course, "Parameters", "Leverage variable-length parameter lists")
        notes.add(note)

        note = NoteInfo(
            course,
            "Anonymous classes",
            "Anonymous classes simplify implementing one-use types"
        )
        notes.add(note)

        course = courses["java_core"]
        note = NoteInfo(
            course,
            "Compiler options",
            "The -jar option isn't compatible with with the -cp option"
        )
        notes.add(note)

        note = NoteInfo(
            course,
            "Serialization",
            "Remember to include SerialVersionUID to assure version compatibility"
        )
=======
    fun initializeNotes() {

        var course = CourseInfo("android_intents", "Android Programming with Intents")
        var note = NoteInfo(course, "Dynamic intent resolution",
            "Wow, intents allow components to be resolved at runtime")
        notes.add(note)
        note = NoteInfo(course, "Delegating intents",
            "PendingIntents are powerful; they delegate much more than just a component invocation")
        notes.add(note)

        course = CourseInfo(courseId =  "android_sync", title = "Android Sync Programming and services")
        note = NoteInfo(course, "Service default threads",
            "Did you know that by default an Android Service will tie up the UI thread?")
        notes.add(note)
        note = NoteInfo(course, "Long running operations",
            "Foreground Services can be tied to a notification icon")
        notes.add(note)

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseId = "java_lang")
        note = NoteInfo(course, "Parameters",
            "Leverage variable-length parameter lists")
        notes.add(note)
        note = NoteInfo(course, "Anonymous classes",
            "Anonymous classes simplify implementing one-use types")
        notes.add(note)

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        note = NoteInfo(course, "Compiler options",
            "The -jar option isn't compatible with with the -cp option")
        notes.add(note)
        note = NoteInfo(course, "Serialization",
            "Remember to include SerialVersionUID to assure version compatibility")
>>>>>>> master
        notes.add(note)
    }
}