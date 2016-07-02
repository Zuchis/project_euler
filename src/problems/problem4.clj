(ns problems.problem4
  (:require [problems.core :refer :all]))

(defn palindrome? [xs]
  (= xs (mkstring (reverse xs))))

(def products
  (for [x (range 100 999)
        y (range 100 999)]
    (* x y)))

(def biggest-palyndrome 
  (apply max (filter (fn [x] (palindrome? (str x))) products)))

(def run2 biggest-palyndrome)

(println run2)
