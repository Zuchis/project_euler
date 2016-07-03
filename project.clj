(defproject problems "0.1.0-SNAPSHOT"
  :description "Solutions to the Project Euler's problems"
  :url "https://github.com/Zuchis/project_euler"
  :license {:name "BSD3"
            :url "http://opensource.org/licenses/BSD-3-Clause"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot problems.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :jvm-opts ["-Xmx1g" "-server"])
