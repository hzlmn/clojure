(ns word-count
  (:require [clojure.string :as clj-string]))

(defn word-count [s]
  (->> (re-seq #"[a-zA-Z\d]+" s)
       (map clj-string/lower-case)
       (frequencies)))
