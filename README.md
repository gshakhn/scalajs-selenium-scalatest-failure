# scalajs-selenium-scalatest-failure

This is a sample project for https://github.com/scala-js/scala-js-env-selenium/issues/44

Running both of the following should return a non-zero error code.

`sbt "testOnly uTest"`

`sbt "testOnly ScalaTest"`

The ScalaTest version fails to fail in the browser. It fails to report an error when running in both Firefox and Chrome. Enable the browser of choice in build.sbt.

See firefox-failure and chrome-failure for sample output.