
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/layout("All Books")/*1.21*/{_display_(Seq[Any](format.raw/*1.22*/("""

        """),format.raw/*3.9*/("""<div class="jumbotron">
            <h1>Welcome To BookStore App</h1>
            <h3>Build Using Play Framework 2.5</h3>
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Aug 13 17:45:49 IST 2020
                  SOURCE: D:/BookStore-App-In-Play-master/app/views/index.scala.html
                  HASH: 1d4ce09c3853e9ba56d76a6713d9fa299d242047
                  MATRIX: 827->1|854->20|892->21|928->31
                  LINES: 32->1|32->1|32->1|34->3
                  -- GENERATED --
              */
          