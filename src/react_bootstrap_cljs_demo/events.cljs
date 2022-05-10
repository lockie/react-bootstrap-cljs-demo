(ns react-bootstrap-cljs-demo.events
  (:require
   [re-frame.core :as re-frame]
   [react-bootstrap-cljs-demo.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
