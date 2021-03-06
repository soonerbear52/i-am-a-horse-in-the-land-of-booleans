(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond
   (= x false) false
   (= x nil) false
   :else true))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
   (and (= 0 (mod n 3)) (= 0 (mod n 5))) "gotcha!"
   (= 0 (mod n 3)) "fizz"
   (= 0 (mod n 5)) "buzz"
   :else ""))

(defn teen? [age]
  (if (and (>= age 13) (<= age 19))
    true
    false))


(defn not-teen? [age]
  (if (not (teen? age))
  true
  false))

(defn generic-doublificate [x]
  (cond
   (= (number? x) true) (* 2 x)
   (= (empty? x) true) nil
   (= (list? x) true) (* 2 (count x))
   (= (vector? x) true) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (cond
   (= 0 (mod year 400)) true
   (= 0 (mod year 100)) false
   (= 0 (mod year 4)) true
   :else false))

; '_______'
