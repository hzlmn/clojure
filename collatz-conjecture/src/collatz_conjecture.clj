(ns collatz-conjecture)

(defn collatz [num] ;; <- arglist goes here
  (loop [x num]
    (when (even? x)
      (println x)
      (recur (/ x 2)))
    (when (odd? x)
      (recur (inc (* x 3))))))
