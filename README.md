# java-impl-of-clj-protocol
A working example of how to implement a Clojure protocol in
Java. Written by a total Java dummy.

# How to run this example

  1. lein with-profile precomp compile
  2. cd ./java/src/
  3. javac -cp "../../target/classes" ./Point.java
  4. java -cp "../../target/classes:." Point

# Some resources I used while trying to make this work

[Example Java class to remind me of the syntax](http://www.matthewboston.com/blog/implementing-clojure-protocols/)

[Example that told me you need to return Object](http://stackoverflow.com/questions/32297665/creating-a-library-of-protocols-and-defrecords-for-use-from-java)

[Examples for setting the classpath correctly](http://blog.jayfields.com/2011/12/clojure-java-interop.html)

[Another claspath example, at the bottom](http://clojure.org/reference/compilation)

[Official lein docs](https://github.com/technomancy/leiningen/blob/master/doc/MIXED_PROJECTS.md)

  - This is how I set up the precomp thing

# A note about gen-class

You will think that you need :gen-class on your namespace, but you
don't, because the defprotocol automatically creates a class for itelf
when compiled - if you have :gen-class on the namespace, it will clash
with the protocol's naming, and it won't work.

There are some more advanced options to :gen-class that I need to
investigate that may keep them from clashing, and allow for types
other than Object to be used on the method implementations.
