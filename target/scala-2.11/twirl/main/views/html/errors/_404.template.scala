
package views.html.errors

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object _404_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class _404 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/layout("404 - Page Not Found")/*1.32*/{_display_(Seq[Any](format.raw/*1.33*/("""

    """),format.raw/*3.5*/("""<div class="jumbotron">
        <h1>404</h1>
        <h3>Page Not Found</h3>
    </div>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object _404 extends _404_Scope0._404
              /*
                  -- GENERATED --
                  DATE: Thu Aug 13 17:45:49 IST 2020
                  SOURCE: D:/BookStore-App-In-Play-master/app/views/errors/_404.scala.html
                  HASH: 48f31466b9c8aed228c1ed4657159edb1864ad51
                  MATRIX: 832->1|870->31|908->32|940->38
                  LINES: 32->1|32->1|32->1|34->3
                  -- GENERATED --
              */
          