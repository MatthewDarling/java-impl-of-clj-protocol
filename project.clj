(defproject java-and-protocols "0.1.0-SNAPSHOT"
  :description "A working example of how to implement a Clojure protocol in Java. Written by a total Java dummy."
  :url "https://github.com/MatthewDarling/java-impl-of-clj-protocol"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :source-paths ["src/clj"]
  ;;:java-source-paths ["java/src"] ;;things get compiled in the wrong order when I have this key
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles {:precomp {:source-paths ["src/pre"]
                       :aot [org.example.thing]}})
