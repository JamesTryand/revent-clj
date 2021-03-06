(defproject org.amitayh/revent-clj "0.1.0-SNAPSHOT"
  :description "Tiny event sourcing library for Clojure"
  :url "https://github.com/amitayh/revent-clj"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/core.match "0.3.0-alpha5"]
                 [org.amitayh/either "0.1.0-SNAPSHOT"]]
  :plugins [[lein-cloverage "1.0.10"]])
