(ns problems.problem6
  (:require [problems.core :refer :all]))

(defn sum-of-squares [xs]
  (sum (map (fn [x] (Math/pow x 2)) xs)))

(defn square-of-the-sum [xs]
  (Math/pow (sum xs) 2))

(def numbers (range 1 101))

(defn run6 []
  (- (square-of-the-sum numbers) (sum-of-squares numbers)))
