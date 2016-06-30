(ns problems.problem1
  (:require [problems.core :refer :all]))

(defn multiples [x]
  (if (or (= (mod x 3) 0) (= (mod x 5) 0))
    true
    false))

(multiples 9) ;;test

(println (sum (filter multiples (range 1000))))
