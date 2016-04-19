# scalajs-selenium-scalatest-failure

This is a sample project for https://github.com/scala-js/scala-js-env-selenium/issues/44

Running the following should return a non-zero error code.

`sbt "testOnly ScalaTest"`

The test fails, but it fails to report an error to sbt when running in both Firefox and Chrome. Enable the browser of choice in build.sbt.
