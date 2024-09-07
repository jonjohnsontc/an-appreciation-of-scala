# Hello World Notes

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