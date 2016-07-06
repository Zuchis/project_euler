(ns problems.problem7
  (:require [problems.core :refer :all]))

(defn run7 []
  (nth prime-sieve 10000))
