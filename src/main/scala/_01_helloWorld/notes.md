# A Taste of Scala Notes 

First off, I'm doing this walkthrough in Intellij IDEA. The book asks for the user
to go through examples using the scalac compiler, and I'm having Intellij drive the
compilation experience by using sbt.

There's a lot of moving parts between sbt and scalac, and I'm not sure that I want
to spend the time looking for all of them. But, I'd like to understand what is being
done for me when I invoke sbt (and then sbt through Intellij IDEA)

---

The first thing that I noticed about compiling the project in IDEA, was the presence
of tasty files instead of class files in the 'classes' directory. According to the
documentation, tasty files include type information on top of the information
included in class files. Apparently in Scala 2, the pickle serialization format
only included type information for public classes

If I compile the same file with `scalac`, I see that both class and tasty files
are included. I wonder if there's a setting in either Intellij or sbt that's not
generating the corresponding class files (though class files are retrievable through
tasty files apparently)

---

In addition to running files via compilation through IDEA + sbt, I'm also going to 
install scalac on my debian WSL instance, and see if there's any output differences. 

I installed scalac via coursier per the instructions here: 
https://get-coursier.io/docs/cli-installation 

---

The Scala Docs contains a page on performance characteristics of the different
Collections available in the standard library [here](https://docs.scala-lang.org/overviews/collections-2.13/performance-characteristics.html).

The scala book gives Option, Some & None as well as Try, Success, and Failure as 
functional ways of error handling. The first set seem fairly familiar, from my little
experience with Rust. The latter set are apparently used when you'd like to throw
an error, though I don't believe the book gave examples.

Union types `String | Boolean | Map` are a Scala 3 construct. I wonder what they used before
... turns out they have a page for that too. It looks like you'd have to have a trait
which two case classes could extend. 

Enums can be generalized to be used as Algebraic Data Types...and when dealing with types
in Scala it's important to talk about variance. **Producers** are typically covariant, 
**Consumers** are typically contravariant, and types that are "both are **Invariant**

