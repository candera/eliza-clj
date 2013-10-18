(ns eliza-clj.engine
  (:require [clojure.java.io :as io]
            [clojure.string :as str]))

(defn create-engine
  []
  (let [script-lines (-> "script.txt" io/resource slurp (str/split #"\n"))
        engine (Eliza.ElizaMain.)]
    (doseq [line script-lines]
      (.collect engine line))
    engine))

(defn process-input
  [engine input]
  (.processInput engine input))

