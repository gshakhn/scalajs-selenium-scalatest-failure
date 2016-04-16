import org.scalatest.FunSpec

class Test extends FunSpec {
  describe("A failing test") {
    it("should blow up") {
      assert(1 == 2)
    }
  }
}
