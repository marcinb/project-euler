(ns euler.problem-1)

; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
; The sum of these multiples is 23.
; Find the sum of all the multiples of 3 or 5 below 1000.

(defn multiplies [upper-limit]
  (loop [current-number 3
         valid-multiplies []]
    (if (< current-number upper-limit)
      (if (or
            (= (mod current-number 3) 0)
            (= (mod current-number 5) 0))
        (recur (inc current-number) (conj valid-multiplies current-number))
        (recur (inc current-number) valid-multiplies))
      (reduce + 0 valid-multiplies))))

(println (multiplies 1000))
