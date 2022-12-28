#_(defproject kata-0300-build-app "0.1.0-SNAPSHOT"
  :description "testing, building and running app"
  :url ""
  :license {}
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :main ^:skip-aot kata-0300-build-app.core  ; do aot only, when uberjar...
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all ; do aot only, when uberjar...
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})

(defproject kata-0300-build-app "0.1.0-SNAPSHOT"
  :description "testing, building and running an app"
  :url ""
  :license {:name "WTFPL"
            :url  "http://www.wtfpl.net/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [com.github.seancorfield/expectations "2.0.160"]
                 [io.github.erdos/erdos.assert "0.2.3"]]
  :main ^:skip-aot kata-0300-build-app.core ; do aot only, when uberjar...
  :target-path "target/%s"

  
  ; running with lein
  ; $ lein run

  ; reload and repeatedly run tests as soon as sourcecode is changed:
  ; $ lein kaocha

  ; see test coverage
  ; $ lein coverage

  ; create one big jar to deploy and run with java
  ; $ lein uberjar

  ; running with java
  ; java -jar target/uberjar/kata-0300-build-app-0.1.0-standalone.jar [args]


  ; see coverage of test (with cloverage)
  :aliases {"kaocha" ["with-profile" "+kaocha" "run" "-m" "kaocha.runner" "--plugin" "notifier" "--watch"]
            "coverage" ["with-profile" "+kaocha" "run" "-m" "kaocha.runner" "--plugin" "cloverage"]}
  :profiles {:uberjar {:aot :all ; do aot only, when uberjar...
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}
             :kaocha {:dependencies [[lambdaisland/kaocha "1.67.1055"]
                                     [lambdaisland/kaocha-cloverage "1.0.75"]]}})

