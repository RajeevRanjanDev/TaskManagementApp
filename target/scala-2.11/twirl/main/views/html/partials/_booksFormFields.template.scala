
package views.html.partials

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object _booksFormFields_Scope0 {
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

class _booksFormFields extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookFrom : Form[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""

"""),_display_(/*3.2*/helper/*3.8*/.inputText(bookFrom("id"),'class -> "form-control")),format.raw/*3.59*/("""
"""),_display_(/*4.2*/helper/*4.8*/.inputText(bookFrom("title"),'class -> "form-control")),format.raw/*4.62*/("""
"""),_display_(/*5.2*/helper/*5.8*/.inputText(bookFrom("price"),'class -> "form-control")),format.raw/*5.62*/("""
"""),_display_(/*6.2*/helper/*6.8*/.inputText(bookFrom("author"),'class -> "form-control")))
      }
    }
  }

  def render(bookFrom:Form[Book]): play.twirl.api.HtmlFormat.Appendable = apply(bookFrom)

  def f:((Form[Book]) => play.twirl.api.HtmlFormat.Appendable) = (bookFrom) => apply(bookFrom)

  def ref: this.type = this

}


}

/**/
object _booksFormFields extends _booksFormFields_Scope0._booksFormFields
              /*
                  -- GENERATED --
                  DATE: Thu Aug 13 17:45:49 IST 2020
                  SOURCE: D:/BookStore-App-In-Play-master/app/views/partials/_booksFormFields.scala.html
                  HASH: d49b09cf5f36664b1b5cee0a4dca77db27a9ceb5
                  MATRIX: 780->1|898->24|926->27|939->33|1010->84|1037->86|1050->92|1124->146|1151->148|1164->154|1238->208|1265->210|1278->216
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6
                  -- GENERATED --
              */
          