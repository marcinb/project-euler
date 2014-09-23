(ns euler.problem-2)

;; Each new term in the Fibonacci sequence is generated
;; by adding the previous two terms.
;; By starting with 1 and 2, the first 10 terms will be:
;;
;; 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
;;
;; By considering the terms in the Fibonacci sequence
;; whose values do not exceed four million,
;; find the sum of the even-valued terms.

(defn fib-seq [max-value]
  (loop [current-seq [1 2]]
    (let [new-term (reduce + (take-last 2 current-seq))]
      (if (< new-term max-value)
        (recur (conj current-seq new-term))
        current-seq))))

(defn even-fib-sum [max-value]
  (reduce
    + (filter
        even? (fib max-value))))

(even-fib-sum 4000000)
