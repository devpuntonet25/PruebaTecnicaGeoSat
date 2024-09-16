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
  Assets_4: controllers.Assets,
  // @LINE:14
  SegmentoController_3: controllers.SegmentoController,
  // @LINE:20
  CalzadaController_1: controllers.CalzadaController,
  // @LINE:26
  BordilloController_2: controllers.BordilloController,
  val prefix: String
) extends GeneratedRouter {

  @javax.inject.Inject()
  def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    PersonController_0: controllers.PersonController,
    // @LINE:11
    Assets_4: controllers.Assets,
    // @LINE:14
    SegmentoController_3: controllers.SegmentoController,
    // @LINE:20
    CalzadaController_1: controllers.CalzadaController,
    // @LINE:26
    BordilloController_2: controllers.BordilloController
  ) = this(errorHandler, PersonController_0, Assets_4, SegmentoController_3, CalzadaController_1, BordilloController_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, PersonController_0, Assets_4, SegmentoController_3, CalzadaController_1, BordilloController_2, prefix)
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
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calzada/deleteCalzada/""" + "$" + """id<[^/]+>""", """controllers.CalzadaController.deleteCalzada(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bordillo/add""", """controllers.BordilloController.addBordillo(req:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bordillo/getBordillos""", """controllers.BordilloController.getBordillos()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bordillo/updateBordillo""", """controllers.BordilloController.updateBordillo(req:Request)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bordillo/deleteBordillo/""" + "$" + """id<[^/]+>""", """controllers.BordilloController.deleteBordillo(id:String)"""),
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
    Assets_4.at(fakeValue[String], fakeValue[String]),
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
      SegmentoController_3.addSegmento(fakeValue[play.mvc.Http.Request]),
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
    SegmentoController_3.getSegmentos(),
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
      SegmentoController_3.updateSegmento(fakeValue[play.mvc.Http.Request]),
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
    SegmentoController_3.deleteSegmento(fakeValue[String]),
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
      CalzadaController_1.addCalzada(fakeValue[play.mvc.Http.Request]),
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
    CalzadaController_1.getCalzadas(),
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
      CalzadaController_1.updateCalzada(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:23
  private lazy val controllers_CalzadaController_deleteCalzada11_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calzada/deleteCalzada/"), DynamicPart("id", """[^/]+""", encodeable=true)))
  )
  private lazy val controllers_CalzadaController_deleteCalzada11_invoker = createInvoker(
    CalzadaController_1.deleteCalzada(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalzadaController",
      "deleteCalzada",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """calzada/deleteCalzada/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private lazy val controllers_BordilloController_addBordillo12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bordillo/add")))
  )
  private lazy val controllers_BordilloController_addBordillo12_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      BordilloController_2.addBordillo(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BordilloController",
      "addBordillo",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """bordillo/add""",
      """ Bordillo endpoints""",
      Seq()
    )
  )

  // @LINE:27
  private lazy val controllers_BordilloController_getBordillos13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bordillo/getBordillos")))
  )
  private lazy val controllers_BordilloController_getBordillos13_invoker = createInvoker(
    BordilloController_2.getBordillos(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BordilloController",
      "getBordillos",
      Nil,
      "GET",
      this.prefix + """bordillo/getBordillos""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private lazy val controllers_BordilloController_updateBordillo14_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bordillo/updateBordillo")))
  )
  private lazy val controllers_BordilloController_updateBordillo14_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      BordilloController_2.updateBordillo(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BordilloController",
      "updateBordillo",
      Seq(classOf[play.mvc.Http.Request]),
      "PUT",
      this.prefix + """bordillo/updateBordillo""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private lazy val controllers_BordilloController_deleteBordillo15_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bordillo/deleteBordillo/"), DynamicPart("id", """[^/]+""", encodeable=true)))
  )
  private lazy val controllers_BordilloController_deleteBordillo15_invoker = createInvoker(
    BordilloController_2.deleteBordillo(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BordilloController",
      "deleteBordillo",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """bordillo/deleteBordillo/""" + "$" + """id<[^/]+>""",
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
        controllers_Assets_at3_invoker.call(Assets_4.at(path, file))
      }
  
    // @LINE:14
    case controllers_SegmentoController_addSegmento4_route(params@_) =>
      call { 
        controllers_SegmentoController_addSegmento4_invoker.call(
          req => SegmentoController_3.addSegmento(req))
      }
  
    // @LINE:15
    case controllers_SegmentoController_getSegmentos5_route(params@_) =>
      call { 
        controllers_SegmentoController_getSegmentos5_invoker.call(SegmentoController_3.getSegmentos())
      }
  
    // @LINE:16
    case controllers_SegmentoController_updateSegmento6_route(params@_) =>
      call { 
        controllers_SegmentoController_updateSegmento6_invoker.call(
          req => SegmentoController_3.updateSegmento(req))
      }
  
    // @LINE:17
    case controllers_SegmentoController_deleteSegmento7_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_SegmentoController_deleteSegmento7_invoker.call(SegmentoController_3.deleteSegmento(id))
      }
  
    // @LINE:20
    case controllers_CalzadaController_addCalzada8_route(params@_) =>
      call { 
        controllers_CalzadaController_addCalzada8_invoker.call(
          req => CalzadaController_1.addCalzada(req))
      }
  
    // @LINE:21
    case controllers_CalzadaController_getCalzadas9_route(params@_) =>
      call { 
        controllers_CalzadaController_getCalzadas9_invoker.call(CalzadaController_1.getCalzadas())
      }
  
    // @LINE:22
    case controllers_CalzadaController_updateCalzada10_route(params@_) =>
      call { 
        controllers_CalzadaController_updateCalzada10_invoker.call(
          req => CalzadaController_1.updateCalzada(req))
      }
  
    // @LINE:23
    case controllers_CalzadaController_deleteCalzada11_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_CalzadaController_deleteCalzada11_invoker.call(CalzadaController_1.deleteCalzada(id))
      }
  
    // @LINE:26
    case controllers_BordilloController_addBordillo12_route(params@_) =>
      call { 
        controllers_BordilloController_addBordillo12_invoker.call(
          req => BordilloController_2.addBordillo(req))
      }
  
    // @LINE:27
    case controllers_BordilloController_getBordillos13_route(params@_) =>
      call { 
        controllers_BordilloController_getBordillos13_invoker.call(BordilloController_2.getBordillos())
      }
  
    // @LINE:28
    case controllers_BordilloController_updateBordillo14_route(params@_) =>
      call { 
        controllers_BordilloController_updateBordillo14_invoker.call(
          req => BordilloController_2.updateBordillo(req))
      }
  
    // @LINE:29
    case controllers_BordilloController_deleteBordillo15_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_BordilloController_deleteBordillo15_invoker.call(BordilloController_2.deleteBordillo(id))
      }
  }
}
