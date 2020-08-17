
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object layout_Scope0 {
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

class layout extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title : String )(body: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""
"""),format.raw/*2.1*/("""<html>
    <head>
        <title>"""),_display_(/*4.17*/title),format.raw/*4.22*/("""</title>

        <link rel="stylesheet" media="screen" href=""""),_display_(/*6.54*/routes/*6.60*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*6.102*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*7.54*/routes/*7.60*/.Assets.versioned("css/bootstrap-theme.min.css")),format.raw/*7.108*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("css/style.css")),format.raw/*8.94*/("""">

        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("images/favicon.png")),format.raw/*10.104*/("""">


    </head>
    <body>


        <header>
            <div class="navbar navbar-default">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#exnav">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a href=""""),_display_(/*26.35*/routes/*26.41*/.HomeController.index()),format.raw/*26.64*/("""" class="navbar-brand">BookStore App</a>
                    </div>
                    <div class="collapse navbar-collapse"  id="exnav">
                        <ul class="nav navbar-nav navbar-left">
                            <li><a href=""""),_display_(/*30.43*/routes/*30.49*/.HomeController.index()),format.raw/*30.73*/("""">
                                <i class="glyphicon glyphicon-book"></i>
                                All Tasks</a></li>

                        </ul>
                    </div>
                </div>
            </div>
        </header>


        <div class="container">

            """),_display_(/*45.14*/for(key <- Array("danger","info","success","warning")) yield /*45.68*/{_display_(Seq[Any](format.raw/*45.69*/("""
                """),_display_(/*46.18*/if(flash.containsKey(key))/*46.44*/{_display_(Seq[Any](format.raw/*46.45*/("""
                    """),format.raw/*47.21*/("""<div class="alert alert-"""),_display_(/*47.46*/key),format.raw/*47.49*/("""">
                        """),_display_(/*48.26*/flash/*48.31*/.get(key)),format.raw/*48.40*/("""
                        """),format.raw/*49.25*/("""<a href="#" class="close" data-dismiss="alert" aria-label="close"><i class="glyphicon glyphicon-remove"></i></a>
                    </div>
                """)))}),format.raw/*51.18*/("""
            """)))}),format.raw/*52.14*/("""

            """),_display_(/*54.14*/body),format.raw/*54.18*/("""
        """),format.raw/*55.9*/("""</div>

        <script src=""""),_display_(/*57.23*/routes/*57.29*/.Assets.versioned("js/jquery-3.2.1.min.js")),format.raw/*57.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*58.23*/routes/*58.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*58.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*59.23*/routes/*59.29*/.Assets.versioned("js/custom.js")),format.raw/*59.62*/("""" type="text/javascript"></script>
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,body:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(body)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (body) => apply(title)(body)

  def ref: this.type = this

}


}

/**/
object layout extends layout_Scope0.layout
              /*
                  -- GENERATED --
                  DATE: Thu Aug 13 17:45:49 IST 2020
                  SOURCE: D:/BookStore-App-In-Play-master/app/views/layout.scala.html
                  HASH: 4a46fb194e92f7ed321e173199715f5bdf2d3f4c
                  MATRIX: 752->1|876->30|903->31|963->65|988->70|1077->133|1091->139|1154->181|1236->237|1250->243|1319->291|1401->347|1415->353|1469->387|1558->449|1573->455|1634->494|2202->1035|2217->1041|2261->1064|2533->1309|2548->1315|2593->1339|2789->1508|2804->1514|2850->1539|3171->1833|3241->1887|3280->1888|3325->1906|3360->1932|3399->1933|3448->1954|3500->1979|3524->1982|3579->2010|3593->2015|3623->2024|3676->2049|3864->2206|3909->2220|3951->2235|3976->2239|4012->2248|4069->2278|4084->2284|4148->2327|4232->2384|4247->2390|4308->2430|4392->2487|4407->2493|4461->2526
                  LINES: 27->1|32->1|33->2|35->4|35->4|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|41->10|41->10|41->10|57->26|57->26|57->26|61->30|61->30|61->30|64->33|64->33|64->33|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|82->51|83->52|85->54|85->54|86->55|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59
                  -- GENERATED --
              */
          