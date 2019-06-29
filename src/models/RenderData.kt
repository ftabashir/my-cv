package models

val person = Person(
    "Farzad",
    "Tabashir",
    Group(
        "Education",
        arrayOf(
            Education(
                "M.S.  Artificial Intelligence",
                "Shiraz University, Shiraz, Iran.",
                "2015-2018"
            ),
            Education(
                "B.S. Computer Science & Engineering ",
                "Shiraz University, Shiraz, Iran.",
                "2010-2015"
            )
        )
    ),
    Group(
        "Experience",
        arrayOf(
            Experience(
                "Otaghak", 
                "Tehran", 
                "Iran", 
                "Android  Developer",
                "We develop high quality softwares at Otaghak to facilitate finding and booking perfect rental places.",
                "January 2019 - Now"
            ),
            Experience(
                "Communere Ltd",
                "London", 
                "UK (Remote)",
                "Full-stack Javascript Developer",
                "Communere is a bespoke software development company. We deliver full-stack web applications with Cutting-edge technologies to our customers.",
                "October 2018 - December 2018"
            ),
            Experience(
                "Dokan (IR-FMCG)", 
                "Tehran", 
                "Iran",
                "Software Developer",
                "Developing mobile (Android) & web (Angular, ASP.NET) applications which provides online supermarket and groceries shop.",
                "June 2017 - September 2018"
            ),
            Experience(
                "Rando",
                "Shiraz", 
                "Iran",
                "Android Developer",
                "Developing android mobile apps for Rando which was an online taxi platform (similar to Uber, Snapp and Tap30)",
                "June 2016 - June 2017"
            ),
            Experience(
                "Raman LTG",
                "Shiraz", 
                "Iran",
                "Android Developer",
                "Developing Augmented Reality (AR) applications for android devices.",
                "March 2015 - September 2015"
            )
        )
    ),
    Group(
        "Teaching Assistantship",
        arrayOf(
            Education(
                "System Programing with ‘C’",
                "Shiraz University, Iran",
                "Fall & Spring 2012"
            ),
            Education(
                "Mathematics of Cryptography",
                "Shiraz University, Iran",
                "Fall & Spring 2015"
            ),
            Education(
                "Operations Research",
                "Shiraz University, Iran",
                "Fall & Spring 2016"
            )
        )
    ),
    Group(
        "Talks",
        arrayOf(
            "Reactive Programming with RxJava" to "an introduction and detailed talk (in persian language) at the 5th session of Logcat android developers group"
        )
    ),
    Group(
        "Courses",
        arrayOf(
            "Introduction to Kotlin Programming" to "By Hadi Hariri",
            "Advanced Kotlin Programming" to "By Hadi Hariri"
        )
    ),
    Group(
        "Skills",
        arrayOf(
            "Git & Git Flow",
            "OOP & Design Patterns",
            "Software Design & Analysis",
            "Familiar with ASP.NET",
            "Experienced in Kotlin and Java",
            "Experienced in ReactiveX (RxJava & RxJS)"
        )
    )
)
