// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReversePersonController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:7
    def addPerson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "person")
    }
  
    // @LINE:8
    def getPersons(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "persons")
    }
  
  }

  // @LINE:11
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:20
  class ReverseCalzadaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def addCalzada(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "calzada/add")
    }
  
    // @LINE:21
    def getCalzadas(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "calzada/getCalzadas")
    }
  
    // @LINE:22
    def updateCalzada(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "calzada/updateCalzada")
    }
  
    // @LINE:23
    def deleteCalzada(id:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "calzada/deleteCalzada/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }

  // @LINE:14
  class ReverseSegmentoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def addSegmento(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "segmento/add")
    }
  
    // @LINE:15
    def getSegmentos(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "segmento/getSegmentos")
    }
  
    // @LINE:16
    def updateSegmento(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "segmento/updateSegmento")
    }
  
    // @LINE:17
    def deleteSegmento(id:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "segmento/deleteSegmento/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }

  // @LINE:26
  class ReverseBordilloController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def addBordillo(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "bordillo/add")
    }
  
    // @LINE:27
    def getBordillos(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "bordillo/getBordillos")
    }
  
    // @LINE:28
    def updateBordillo(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "bordillo/updateBordillo")
    }
  
    // @LINE:29
    def deleteBordillo(id:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "bordillo/deleteBordillo/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }


}
