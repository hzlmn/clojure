(ns armstrong-numbers)

(defn pow
  [x y]
  (Math/round (Math/pow y x)))

(defn armstrong? [num] ;; <- arglist goes here
  (let [nums (map read-string (.split (str num) ""))
        digits (count nums)]
    (= num (reduce + (map (partial pow digits) nums)))))