; How to create a "standard app" with lein?
; $ lein new app kata-0310-my-own
; This generates an "clojure app skeleton"
; try 
; $ lein help
; There are plenty of leiningen templates.

(ns kata-0300-build-app.core
   ; do aot only, when uberjar... see project.clj and the AOT-commands
  (:gen-class)); LATER: try and remove that and then try lein uberjar...

; do 
; $ lein run
; $ lein test
; $ lein coverage
; $ lein uberjar
; then
; java -jar target/uberjar/kata-0300-build-app-0.1.0-standalone.jar [args]

(defn -main
  "This is the entry point of the app."
  [& args]
  (println "Hello, Armin!")
  (println (or 
            (pr-str args) 
            "there are no command line args... :-("))
  args)


