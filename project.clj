(defproject org.clojars.earthlingzephyr/devcards "0.2.8-SNAPSHOT"
  :description "Devcards is a ClojureScript library that provides a lab space in which you can develop your UI components independently and interactively."
  :url "http://github.com/bhauman/devcards"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.11.4"]
                 [org.clojure/clojurescript "1.11.60"]
                 [org.clojure/core.async  "1.6.681"]
                 [cljsjs/react "18.2.0-1"]
                 [cljsjs/react-dom "18.2.0-1"]
                 [sablono "0.9.0-SNAPSHOT"]]

  :source-paths ["src"]

  :clean-targets ^{:protect false} ["example-resources/public/devcards/js/compiled"
                                    :target-path]

  :scm { :name "git"
         :url "https://github.com/bhauman/devcards" }

  :figwheel {:css-dirs ["resources/public/devcards/css"]
             :open-file-command "emacsclient"
             ;;:nrepl-port 7888
             }

  :profiles {
   :repl { ;:plugins [[cider/cider-nrepl "0.11.1"]]
           :repl-options {:init (set! *print-length* 50)}}
   :dev {
      :dependencies [[reagent "1.2.0"]
                     [com.bhauman/figwheel-main "0.2.18"]
                     [com.cemerick/piggieback "0.2.1"]
                     [binaryage/devtools "1.0.7"]
                     [org.clojure/tools.nrepl "0.2.13"]]
      :source-paths ["example_src"]
      :resource-paths ["resources" "example-resources"]
         }}
  :aliases {"fig"       ["trampoline" "run" "-m" "figwheel.main"]})
