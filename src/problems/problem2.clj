(ns problems.problem2
  (:require [problems.core :refer :all]))

(def fib-seq
 ((fn fibonacci [a b]
  (lazy-seq (cons a (fibonacci b (+ a b))))) 0 1))

(println (reduce + (take-while (partial > 4000000) (filter even? fib-seq))))
