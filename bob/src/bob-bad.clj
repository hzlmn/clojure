(ns bob)

(defn ends-with? [s substr]
  (= substr
     (subs s
           (- (count s) (count substr)))))

(defn contain-letter? [s]
  (> (count (filter (fn [c] (Character/isLetter c)) (seq s))) 0))

(defn upper? [s]
  (and (contain-letter? s) (= s (.toUpperCase s))))

(defn response-for [s]
  (cond
    (clojure.string/blank? s) "Fine. Be that way!"
    (upper? s) (if (ends-with? s "?") "Calm down, I know what I'm doing!"  "Whoa, chill out!")
    (ends-with? s "?") "Sure."
    :else "Whatever."))