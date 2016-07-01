(ns problems.core
  (:import (java.lang.Math)))

(defn sum [xs]
  (reduce + xs))

(defn product [xs]
  (reduce * xs))

(def infiniteList (range))

(def infinitePrimes (drop 2 (range)))
