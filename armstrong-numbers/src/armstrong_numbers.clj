(ns armstrong-numbers)

(defn armstrong? [num]
  (let [nums (map (fn [v] (-> v (str) (read-string))) (seq (str num)))]
    (= num
       (int
        (reduce + (map (fn [v] (Math/pow v (count nums))) nums))))))