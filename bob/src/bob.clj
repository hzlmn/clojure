(ns bob
  (:require [clojure.string :as ss]))

(defn shout? [s]
  (and (re-find #"[a-zA-Z]" s) (= s (.toUpperCase s))))

(defn question? [s] (ss/ends-with? s "?"))

(defn response-for [s]
  (cond
    (clojure.string/blank? s) "Fine. Be that way!"
    (shout? s) (if (question? s) "Calm down, I know what I'm doing!"  "Whoa, chill out!")
    (question? s) "Sure."
    :else "Whatever."))