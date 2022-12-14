
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
/*1.2*/import form.PostForm
/*2.2*/import play.mvc.Http.Request

object posts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[model.Post],Form[PostForm],Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(posts: List[model.Post], postForm: Form[PostForm])(implicit request: Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.80*/("""

"""),_display_(/*5.2*/main("Post Page")/*5.19*/{_display_(Seq[Any](format.raw/*5.20*/("""
    """),format.raw/*6.5*/("""<h1>My Posts</h1>


"""),_display_(/*9.2*/for(post<-posts) yield /*9.18*/{_display_(Seq[Any](format.raw/*9.19*/("""
"""),format.raw/*10.1*/("""<div class="container">
    <h3>"""),_display_(/*11.10*/post/*11.14*/.getTitle()),format.raw/*11.25*/("""</h3>
    <span>
        """),_display_(/*13.10*/post/*13.14*/.getContent()),format.raw/*13.27*/("""
    """),format.raw/*14.5*/("""</span>
</div>
""")))}),format.raw/*16.2*/("""



"""),format.raw/*20.1*/("""<div class="col-6" style="border: 2px dotted;">
    """),_display_(/*21.6*/helper/*21.12*/.form(routes.HomeController.createPost)/*21.51*/{_display_(Seq[Any](format.raw/*21.52*/("""
    """),_display_(/*22.6*/helper/*22.12*/.CSRF.formField),format.raw/*22.27*/("""
    """),format.raw/*23.5*/("""<h4>Create New</h4>
    <div class="row">
        <div class="col-6">
            <label>Title</label>
            <input name="title" style="width: 100%"/>
        </div>
        <div class="col-6">
            <label>Content</label>
            <input name="content" style="width: 100%"/>
            <button name="Submit" type="submit" class="btn btn-primary" style="margin-top">Submit</button>
        </div>
    </div>
    """)))}),format.raw/*35.6*/("""
    """),_display_(/*36.6*/if(postForm.hasErrors())/*36.30*/{_display_(Seq[Any](format.raw/*36.31*/("""
    """),format.raw/*37.5*/("""<p>The request is invalid</p>
    """)))}),format.raw/*38.6*/("""
"""),format.raw/*39.1*/("""</div>

<div class="col-6" style="border: 2px dotted;">
    """),_display_(/*42.6*/helper/*42.12*/.form(routes.HomeController.deletePost)/*42.51*/{_display_(Seq[Any](format.raw/*42.52*/("""
    """),_display_(/*43.6*/helper/*43.12*/.CSRF.formField),format.raw/*43.27*/("""
    """),format.raw/*44.5*/("""<h4>Delete Post</h4>
    <div class="row">
        <div class="col-6">
            <label>Post Name</label>
            <input name="title" style="width: 100%"/>
        </div>
        <div class="col-6">
            <button name="Submit" type="submit" class="btn btn-primary" style="margin-top">Submit</button>
        </div>
    </div>
    """)))}),format.raw/*54.6*/("""
    """),_display_(/*55.6*/if(postForm.hasErrors())/*55.30*/{_display_(Seq[Any](format.raw/*55.31*/("""
    """),format.raw/*56.5*/("""<p>The request is invalid</p>
    """)))}),format.raw/*57.6*/("""
"""),format.raw/*58.1*/("""</div>
""")))}),format.raw/*59.2*/("""
"""))
      }
    }
  }

  def render(posts:List[model.Post],postForm:Form[PostForm],request:Request): play.twirl.api.HtmlFormat.Appendable = apply(posts,postForm)(request)

  def f:((List[model.Post],Form[PostForm]) => (Request) => play.twirl.api.HtmlFormat.Appendable) = (posts,postForm) => (request) => apply(posts,postForm)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/posts.scala.html
                  HASH: acac797c4bfa913168ea7c8e5854dfd2b07c5d15
                  MATRIX: 610->1|638->24|1004->55|1177->133|1207->138|1232->155|1270->156|1302->162|1351->186|1382->202|1420->203|1449->205|1510->239|1523->243|1555->254|1610->282|1623->286|1657->299|1690->305|1738->323|1773->331|1853->385|1868->391|1916->430|1955->431|1988->438|2003->444|2039->459|2072->465|2543->906|2576->913|2609->937|2648->938|2681->944|2747->980|2776->982|2866->1046|2881->1052|2929->1091|2968->1092|3001->1099|3016->1105|3052->1120|3085->1126|3468->1479|3501->1486|3534->1510|3573->1511|3606->1517|3672->1553|3701->1555|3740->1564
                  LINES: 23->1|24->2|29->3|34->3|36->5|36->5|36->5|37->6|40->9|40->9|40->9|41->10|42->11|42->11|42->11|44->13|44->13|44->13|45->14|47->16|51->20|52->21|52->21|52->21|52->21|53->22|53->22|53->22|54->23|66->35|67->36|67->36|67->36|68->37|69->38|70->39|73->42|73->42|73->42|73->42|74->43|74->43|74->43|75->44|85->54|86->55|86->55|86->55|87->56|88->57|89->58|90->59
                  -- GENERATED --
              */
          