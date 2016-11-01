(ns org.example.thing)

(defprotocol Extension
  (action1 [this] "Perform action1")
  (action2 [this arg1] "Perform action2"))
