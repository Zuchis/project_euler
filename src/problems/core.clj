(ns problems.core
  (:import (java.lang.Math)))

(defn sum [xs]
  (reduce + xs))

(defn product [xs]
  (reduce * xs))

(def infiniteList (range))

(def infinitePrimes (drop 2 (range)))

(defn countDigits [x]
  (int (+ 1 (Math/floor (Math/log10 x)))))

(defn mkstring [chars]
  (apply str chars))

(defn multiple [x y]
  (if (= (mod x y) 0)
    true
    false))
