enablePlugins(ScalaJSPlugin)

name := "Scala.js ScalaTest Selenium Failure Example"

scalaVersion := "2.11.8"

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.0-M15" % "test"


jsEnv in Test := new org.scalajs.jsenv.selenium.SeleniumJSEnv(org.scalajs.jsenv.selenium.Firefox)
//jsEnv in Test := new org.scalajs.jsenv.selenium.SeleniumJSEnv(org.scalajs.jsenv.selenium.Chrome)