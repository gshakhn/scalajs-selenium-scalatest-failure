import org.scalatest.FunSpec

class ScalaTest extends FunSpec {
  describe("ScalaTest failure") {
    it("should blow up") {
      assert(1 == 2)
    }
  }
}
