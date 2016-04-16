enablePlugins(ScalaJSPlugin)

name := "Scala.js ScalaTest Selenium Failure Example"

scalaVersion := "2.11.8"

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.0-M15" % "test"

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.0" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")


jsEnv in Test := new org.scalajs.jsenv.selenium.SeleniumJSEnv(org.scalajs.jsenv.selenium.Firefox)
//jsEnv in Test := new org.scalajs.jsenv.selenium.SeleniumJSEnv(org.scalajs.jsenv.selenium.Chrome)