(ns react-bootstrap-cljs-demo.views
  (:require
   [re-frame.core :as re-frame]
   [react-bootstrap-cljs-demo.subs :as subs]
   ["react-bootstrap/Button" :as Button]
   ["react-bootstrap/Dropdown" :as Dropdown]
   ["react-bootstrap/DropdownItem" :as DropdownItem]
   ["react-bootstrap/DropdownMenu" :as DropdownMenu]
   ["react-bootstrap/DropdownToggle" :as DropdownToggle]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1
      "Hello from " @name]
     [:> Button "Hit me"] ;; NOTE: this works
     [:> Dropdown
      [:> DropdownToggle "button"]
      [:> DropdownMenu {:variant :dark}  ;; NOTE: this does not
       [:> DropdownItem "action1"]
       [:> DropdownItem "action2"]
       [:> DropdownItem "action3"]]]
     ]))
