(ns codility1.core)

(defn abs [n] (max n (- n)))

;TapeEquilibrium Codility Exercise
(defn solution-1
  [array pos]
  (let
    [left (reduce + (nth (split-at pos array) 0))
    right (reduce + (nth (split-at pos array) 1))]
    (abs (- left right)))
  )

(defn -main
  [& args]
  )