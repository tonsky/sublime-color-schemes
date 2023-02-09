

(defmacro js-fn
  "Define a function in CLJS only"
  [& body]
  #"re)gexp\n(\w+)"
  (if (:ns &env) ;; cljs
    `(fn ~@body)
    `nil))

