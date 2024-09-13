// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReversePersonController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:7
    def addPerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.addPerson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "person"})
        }
      """
    )
  
    // @LINE:8
    def getPersons: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.getPersons",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "persons"})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseSegmentoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def addSegmento: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SegmentoController.addSegmento",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "segmento/add"})
        }
      """
    )
  
    // @LINE:15
    def getSegmentos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SegmentoController.getSegmentos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "segmento/getSegmentos"})
        }
      """
    )
  
    // @LINE:16
    def updateSegmento: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SegmentoController.updateSegmento",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "segmento/updateSegmento"})
        }
      """
    )
  
    // @LINE:17
    def deleteSegmento: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SegmentoController.deleteSegmento",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "segmento/deleteSegmento/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseCalzadaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def addCalzada: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CalzadaController.addCalzada",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "calzada/add"})
        }
      """
    )
  
    // @LINE:21
    def getCalzadas: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CalzadaController.getCalzadas",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "calzada/getCalzadas"})
        }
      """
    )
  
    // @LINE:22
    def updateCalzada: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CalzadaController.updateCalzada",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "calzada/updateCalzada"})
        }
      """
    )
  
  }


}
