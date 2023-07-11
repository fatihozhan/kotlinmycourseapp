package com.ozhan.mycourseapp

import androidx.annotation.DrawableRes

data class Courses(
    val rating: Float,
    val title: String,
    @DrawableRes val thumbnail: Int,
    val body: String
)


val course1 =
    Courses(
        4.5f,
        "Pre-Programming: Everything you need to know before you code",
        R.drawable.course1,
        "Increase your chance of success learning to code and communicating with other developers"
    )
val course2 =
    Courses(
        3.5f,
        "Beginning C++ Programming - From Beginner to Beyond",
        R.drawable.course2,
        "Obtain Modern C++ Object-Oriented Programming (OOP) and STL skills. C++14 and C++17 covered. C++20 info see below."
    )
val course3 =
    Courses(
        2.5f,
        "Java Programming Masterclass updated to Java 17",
        R.drawable.course3,
        "Learn Java In This Course And Become a Computer Programmer. Obtain valuable Core Java Skills And Java Certification"
    )
val course4 =
    Courses(
        4.4f,
        "Learn Python Programming Masterclass",
        R.drawable.course4,
        "This Python For Beginners Course Teaches You The Python Language Fast. Includes Python Online Training With Python 3"
    )
val course5 =
    Courses(
        4.6f,
        "Introduction to Computer Programming for Beginners 2023",
        R.drawable.course5,
        "Learn the basic principles of Computer Programming and get started with C#, SQL, Java, C, C++ and Python"
    )
val course6 =
    Courses(
        3.2f,
        "Automate the Boring Stuff with Python Programming",
        R.drawable.course6,
        "A practical programming course for office workers, academics, and administrators who want to improve their productivity."
    )
val course7 =
    Courses(
        1.3f,
        "Complete C# Masterclass",
        R.drawable.course1,
        "Learn C# Programming - WPF, Databases, Linq, Collections, Game Development with Unity. Unit Testing TDD"
    )

val courses = listOf<Courses>(
    course1,
    course2,
    course3,
    course4,
    course5,
    course6,
    course7,
)