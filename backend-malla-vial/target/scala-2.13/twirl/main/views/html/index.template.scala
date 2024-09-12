
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(implicit request: Http.Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
    """),format.raw/*4.5*/("""<script type='text/javascript' src='"""),_display_(/*4.42*/routes/*4.48*/.Assets.at("javascripts/index.js")),format.raw/*4.82*/("""'></script>

    <ul id="persons"></ul>

    <form method="POST" action=""""),_display_(/*8.34*/routes/*8.40*/.PersonController.addPerson()),format.raw/*8.69*/("""">
        """),_display_(/*9.10*/helper/*9.16*/.CSRF.formField),format.raw/*9.31*/("""
        """),format.raw/*10.9*/("""<input type="text" name="name"/>
        <button>Add Person</button>
    </form>
""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(request:Http.Request): play.twirl.api.HtmlFormat.Appendable = apply(request)

  def f:((Http.Request) => play.twirl.api.HtmlFormat.Appendable) = (request) => apply(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 971ca943f6141bfe1db90226018f41babd4384f0
                  MATRIX: 913->1|1039->34|1066->36|1097->59|1136->61|1167->66|1230->103|1244->109|1298->143|1398->217|1412->223|1461->252|1499->264|1513->270|1548->285|1584->294|1696->376
                  LINES: 27->1|32->2|33->3|33->3|33->3|34->4|34->4|34->4|34->4|38->8|38->8|38->8|39->9|39->9|39->9|40->10|43->13
                  -- GENERATED --
              */
          