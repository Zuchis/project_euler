(ns problems.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn sum [xs]
  (reduce + xs))

(defn product [xs]
  (reduce * xs))
