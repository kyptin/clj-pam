# clj-pam

clj-pam is a Clojure wrapper for the JPam library, providing Linux PAM
authentication for Clojure apps.

## Usage

The most basic usage is simply:

```clojure
(use 'clj-pam.auth)

(simple-auth "username" "password")
```

More examples to follow.

## Credits

Original author: Jason Lewis
([@canweriotnow](https://github.com/canweriotnow)), from [this upstream
repo](https://github.com/canweriotnow/clj-pam) at commit dd1d371, which is
copyright © 2013 Jason Lewis.

## License

Distributed under the Eclipse Public License, the same as Clojure.
