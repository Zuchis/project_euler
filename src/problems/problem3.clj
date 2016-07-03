(ns problems.problem3
  (:require [problems.core :refer :all]))

(defn multiple-rev [x y]
  (if (= (mod y x) 0)
    true
    false))

(def prime-sieve 
  ((fn sieve [xs]
    (lazy-seq (cons (first xs) (sieve (filter (comp not (partial multiple-rev (first xs))) xs))))) infinitePrimes))

(def target 600851475143)

(def delimiter (/ target 2.0))

(defn run3 [] (apply max (take-while (partial > delimiter) (filter (fn [x] (multiple-rev x target)) prime-sieve))))

(run3)
