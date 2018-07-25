(ns run-length-encoding)

(defn run-length-encode
  "encodes a string with run-length-encoding"
  [plain-text]
  (->> (partition-by identity plain-text)
       (mapcat (juxt count first))
       (apply str)))

(defn run-length-decode
  "decodes a run-length-encoded string"
  [cipher-text])
