(ns ono_sendai.core 
  (:require [quil.core :as q]
            [quil.middleware :as m]))


(defn setup[]
  (q/frame-rate 10)
  (q/color-mode :hsb)
  {:init #{[0 0 1440 900]}})

(defn update [state]
  state)

(defn draw [state] 
  (q/background 0)
  (q/stroke 255)
  (q/stroke-weight 10)
  (q/fill 255)
  (q/line 0 0 1440 900))

(q/defsketch ono_sendai
  :title "ono_sendai"
  :size [1440 900]
  :features [:resizeable]
  :setup setup
  :update update
  :draw draw
  :middleware [m/fun-mode])


