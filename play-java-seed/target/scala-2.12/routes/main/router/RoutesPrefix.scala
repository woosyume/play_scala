// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/woohyeok.kim/Desktop/study/play_scala/play-java-seed/conf/routes
// @DATE:Sun Apr 08 17:36:16 JST 2018


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
