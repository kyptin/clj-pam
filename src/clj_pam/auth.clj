(ns clj-pam.auth
  (:import net.sf.jpam.Pam))

(defn simple-auth
  "Return whether the given username and password (optionally under the given
  service) are valid according to PAM."
  ([username password] (simple-auth username password "login"))
  ([username password service]
   (.authenticateSuccessful (new Pam service) username password)))
