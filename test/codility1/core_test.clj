(ns codility1.core-test
  (:require [clojure.test :refer :all]
            [codility1.core :refer :all]))

;Codility input array
(def input
  [3 1 2 4 3]
  )

(deftest solution-test-codility-1
  (testing "Solution should return 7 splitting at position 1"
    (is (= 7 (solution-1 input 1)))))

(deftest solution-test-codility-2
  (testing "Solution should return 5 splitting at position 2"
    (is (= 5 (solution-1 input 2)))))

(deftest solution-test-codility-3
  (testing "Solution should return 1 splitting at position 3"
    (is (= 1 (solution-1 input 3)))))

(deftest solution-test-codility-4
  (testing "Solution should return 7 splitting at position 4"
    (is (= 7 (solution-1 input 4)))))