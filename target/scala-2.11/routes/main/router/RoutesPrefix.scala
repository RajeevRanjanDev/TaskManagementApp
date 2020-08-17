
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/TaskManagement/conf/routes
// @DATE:Mon Aug 17 09:42:58 IST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
