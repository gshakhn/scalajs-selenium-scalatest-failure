# scalajs-selenium-scalatest-failure

Running both of the following should return a non-zero error code.

`sbt "testOnly uTest"`
`sbt "testOnly ScalaTest"`

The ScalaTest version fails to report an error when running in both Firefox and Chrome. Enable the browser of choice in build.sbt.
