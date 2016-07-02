(ns problems.problem5
  (:require [problems.core :refer :all]))


(defn all-multiple [x]
  (and (for [y (range 1 21))
