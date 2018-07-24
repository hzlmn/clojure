(ns rna-transcription
  (:require [clojure.string :refer [split join]]))

(defn to-rna [dna]
  (let [dna-to-rna
        {"G" "C"
         "C" "G"
         "T" "A"
         "A" "U"}
        char-seq  (split dna #"")]
    (assert (every? (partial contains? dna-to-rna) char-seq))
    (-> char-seq
        (#(map (partial get dna-to-rna) %))
        (join))))