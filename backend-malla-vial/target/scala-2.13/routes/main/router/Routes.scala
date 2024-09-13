// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  PersonController_0: controllers.PersonController,
  // @LINE:11
  Assets_1: controllers.Assets,
  // @LINE:14
  SegmentoController_2: controllers.SegmentoController,
  // @LINE:20
  CalzadaController_3: controllers.CalzadaController,
  val prefix: String
) extends GeneratedRouter {

  @javax.inject.Inject()
  def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    PersonController_0: controllers.PersonController,
    // @LINE:11
    Assets_1: controllers.Assets,
    // @LINE:14
    SegmentoController_2: controllers.SegmentoController,
    // @LINE:20
    CalzadaController_3: controllers.CalzadaController
  ) = this(errorHandler, PersonController_0, Assets_1, SegmentoController_2, CalzadaController_3, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, PersonController_0, Assets_1, SegmentoController_2, CalzadaController_3, prefix)
  }

  private val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.PersonController.index(req:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person""", """controllers.PersonController.addPerson(req:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """persons""", """controllers.PersonController.getPersons()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """segmento/add""", """controllers.SegmentoController.addSegmento(req:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """segmento/getSegmentos""", """controllers.SegmentoController.getSegmentos()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """segmento/updateSegmento""", """controllers.SegmentoController.updateSegmento(req:Request)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """segmento/deleteSegmento/""" + "$" + """id<[^/]+>""", """controllers.SegmentoController.deleteSegmento(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calzada/add""", """controllers.CalzadaController.addCalzada(req:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calzada/getCalzadas""", """controllers.CalzadaController.getCalzadas()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calzada/updateCalzada""", """controllers.CalzadaController.updateCalzada(req:Request)"""),
    Nil
  ).foldLeft(Seq.empty[(String, String, String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String, String, String)]
    case l => s ++ l.asInstanceOf[List[(String, String, String)]]
  }}


  // @LINE:6
  private lazy val controllers_PersonController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private lazy val controllers_PersonController_index0_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      PersonController_0.index(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "index",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:7
  private lazy val controllers_PersonController_addPerson1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person")))
  )
  private lazy val controllers_PersonController_addPerson1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      PersonController_0.addPerson(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "addPerson",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """person""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private lazy val controllers_PersonController_getPersons2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("persons")))
  )
  private lazy val controllers_PersonController_getPersons2_invoker = createInvoker(
    PersonController_0.getPersons(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "getPersons",
      Nil,
      "GET",
      this.prefix + """persons""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private lazy val controllers_Assets_at3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""", encodeable=false)))
  )
  private lazy val controllers_Assets_at3_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:14
  private lazy val controllers_SegmentoController_addSegmento4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("segmento/add")))
  )
  private lazy val controllers_SegmentoController_addSegmento4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      SegmentoController_2.addSegmento(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SegmentoController",
      "addSegmento",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """segmento/add""",
      """ Segmento endpoints""",
      Seq()
    )
  )

  // @LINE:15
  private lazy val controllers_SegmentoController_getSegmentos5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("segmento/getSegmentos")))
  )
  private lazy val controllers_SegmentoController_getSegmentos5_invoker = createInvoker(
    SegmentoController_2.getSegmentos(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SegmentoController",
      "getSegmentos",
      Nil,
      "GET",
      this.prefix + """segmento/getSegmentos""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private lazy val controllers_SegmentoController_updateSegmento6_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("segmento/updateSegmento")))
  )
  private lazy val controllers_SegmentoController_updateSegmento6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      SegmentoController_2.updateSegmento(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SegmentoController",
      "updateSegmento",
      Seq(classOf[play.mvc.Http.Request]),
      "PUT",
      this.prefix + """segmento/updateSegmento""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private lazy val controllers_SegmentoController_deleteSegmento7_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("segmento/deleteSegmento/"), DynamicPart("id", """[^/]+""", encodeable=true)))
  )
  private lazy val controllers_SegmentoController_deleteSegmento7_invoker = createInvoker(
    SegmentoController_2.deleteSegmento(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SegmentoController",
      "deleteSegmento",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """segmento/deleteSegmento/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private lazy val controllers_CalzadaController_addCalzada8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calzada/add")))
  )
  private lazy val controllers_CalzadaController_addCalzada8_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      CalzadaController_3.addCalzada(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalzadaController",
      "addCalzada",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """calzada/add""",
      """ Calzada endpoints""",
      Seq()
    )
  )

  // @LINE:21
  private lazy val controllers_CalzadaController_getCalzadas9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calzada/getCalzadas")))
  )
  private lazy val controllers_CalzadaController_getCalzadas9_invoker = createInvoker(
    CalzadaController_3.getCalzadas(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalzadaController",
      "getCalzadas",
      Nil,
      "GET",
      this.prefix + """calzada/getCalzadas""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private lazy val controllers_CalzadaController_updateCalzada10_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calzada/updateCalzada")))
  )
  private lazy val controllers_CalzadaController_updateCalzada10_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      CalzadaController_3.updateCalzada(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalzadaController",
      "updateCalzada",
      Seq(classOf[play.mvc.Http.Request]),
      "PUT",
      this.prefix + """calzada/updateCalzada""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_PersonController_index0_route(params@_) =>
      call { 
        controllers_PersonController_index0_invoker.call(
          req => PersonController_0.index(req))
      }
  
    // @LINE:7
    case controllers_PersonController_addPerson1_route(params@_) =>
      call { 
        controllers_PersonController_addPerson1_invoker.call(
          req => PersonController_0.addPerson(req))
      }
  
    // @LINE:8
    case controllers_PersonController_getPersons2_route(params@_) =>
      call { 
        controllers_PersonController_getPersons2_invoker.call(PersonController_0.getPersons())
      }
  
    // @LINE:11
    case controllers_Assets_at3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at3_invoker.call(Assets_1.at(path, file))
      }
  
    // @LINE:14
    case controllers_SegmentoController_addSegmento4_route(params@_) =>
      call { 
        controllers_SegmentoController_addSegmento4_invoker.call(
          req => SegmentoController_2.addSegmento(req))
      }
  
    // @LINE:15
    case controllers_SegmentoController_getSegmentos5_route(params@_) =>
      call { 
        controllers_SegmentoController_getSegmentos5_invoker.call(SegmentoController_2.getSegmentos())
      }
  
    // @LINE:16
    case controllers_SegmentoController_updateSegmento6_route(params@_) =>
      call { 
        controllers_SegmentoController_updateSegmento6_invoker.call(
          req => SegmentoController_2.updateSegmento(req))
      }
  
    // @LINE:17
    case controllers_SegmentoController_deleteSegmento7_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_SegmentoController_deleteSegmento7_invoker.call(SegmentoController_2.deleteSegmento(id))
      }
  
    // @LINE:20
    case controllers_CalzadaController_addCalzada8_route(params@_) =>
      call { 
        controllers_CalzadaController_addCalzada8_invoker.call(
          req => CalzadaController_3.addCalzada(req))
      }
  
    // @LINE:21
    case controllers_CalzadaController_getCalzadas9_route(params@_) =>
      call { 
        controllers_CalzadaController_getCalzadas9_invoker.call(CalzadaController_3.getCalzadas())
      }
  
    // @LINE:22
    case controllers_CalzadaController_updateCalzada10_route(params@_) =>
      call { 
        controllers_CalzadaController_updateCalzada10_invoker.call(
          req => CalzadaController_3.updateCalzada(req))
      }
  }
}
