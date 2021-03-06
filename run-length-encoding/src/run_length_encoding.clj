(ns run-length-encoding)

(defn run-length-encode
  "encodes a string with run-length-encoding"
  [plain-text]
  (->> (partition-by identity plain-text)
       (map (juxt count first))
       (flatten)
       (apply str)))


(defn run-length-decode
  "decodes a run-length-encoded string"
  [cipher-text]
  (->> (re-seq #"(\d+)?([a-zA-Z])" cipher-text)
       (map (partial drop 1))
       (map (fn [[x y]] (repeat (Integer. (or x 1)) y)))
       (flatten)
       (apply str)))
