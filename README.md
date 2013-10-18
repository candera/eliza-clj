# eliza-clj

A Clojure library that provides a very simple wrapper around a Java
implementation of [Eliza](http://en.wikipedia.org/wiki/ELIZA).

## Usage

Add a dependency on `[org.craigandera/eliza-clj "0.1.0"]` and write
code like the following:

```clojure
(require '[eliza-clj.engine :refer :all])

(def e (create-engine))

(process-input e "Hello")

;; => "How do you do.  Please state your problem."

(process-input e "I love Clojure.")

;; => "You say you love clojure  ?"

(process-input e "Yes, but it's platonic. For now.")

;; => "You seem to be quite positive."
```

Etc. etc.

## Credits

Java source taken from http://www.chayden.net/eliza/Eliza.html.

## License

Copyright © 2013 Craig Andera

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
