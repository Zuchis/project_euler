(ns problems.problem5
  (:require [problems.core :refer :all]))

(defn all-multiple [x rang]
  (every? (fn [y] (multiple x y)) (range 1 rang)))

(defn run5 []
  (first (drop-while (comp not (fn [x] (all-multiple x 21))) (drop 1 infiniteList))))
