(ns problems.core
  (:import (java.lang.Math)
           (java.lang.Number)))

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

(defn multiple-rev [x y]
  (if (= (mod y x) 0)
    true
    false))

(def prime-sieve 
  ((fn sieve [xs]
    (lazy-seq (cons (first xs) (sieve (filter (comp not (partial multiple-rev (first xs))) xs))))) infinitePrimes))

(set! *warn-on-reflection* true)

;(defn parse-int [s]
  ;(Integer. (re-find  #"\d+" s )))

(defn run-problem [n]
  (let [solution-function (symbol (str "run" n))]
    (use (vec (list (symbol (str "problems.problem" n))
                    :only (list solution-function))))
    (do 
      (println (str "Now running the solution to problem " n))
      (eval (list solution-function)))))

(defn -main
  "Solution runner"
  [& args]
  (if (and args (= 1 (count args)))
    (println (time (run-problem (Integer/parseInt (first args)))))
    (println "Usage: lein run [number]")))
