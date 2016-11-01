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

# Return types

As explained on the Clojure compilation page, gen-interface can
produce an interface with correctly typed methods. However,
defprotocol will
[always use Object](https://github.com/clojure/clojure/blob/clojure-1.8.0/src/clj/clojure/core_deftype.clj#L647)
for its argument and return types. Presumably that's necessary for protocols
to be as dynamic as they are.

So using defprotocol would mean you have to document the acceptable
return types and the expected argument types. And there would be
runtime errors instead of compile errors for any code not fitting the
assumptions. Or worse - if the return type is wrong but still accepted
by the Clojure code, you might get strange behaviour.

Those limitations are probably why nobody actually does this.
