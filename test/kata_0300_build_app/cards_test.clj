(ns kata-0300-build-app.cards-test
  #_{:clj-kondo/ignore [:refer-all]}
  (:require [clojure.test :refer :all]
            [kata-0300-build-app.cards :refer :all]))

(deftest card-test
  (testing "create"
    (is (= (v (->Card :♥K)) 1))))
