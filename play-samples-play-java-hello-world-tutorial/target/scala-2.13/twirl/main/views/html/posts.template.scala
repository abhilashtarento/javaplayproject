
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
    <h3>"""),_display_(/*11.10*/post/*11.14*/.getTitle()),format.raw/*11.25*/(""" """),format.raw/*11.26*/("""- """),_display_(/*11.29*/post/*11.33*/.getContent()),format.raw/*11.46*/("""</h3>
</div>
""")))}),format.raw/*13.2*/("""



"""),format.raw/*17.1*/("""<div class="col-6" style="border: 2px dotted;">
    """),_display_(/*18.6*/helper/*18.12*/.form(routes.HomeController.createPost)/*18.51*/{_display_(Seq[Any](format.raw/*18.52*/("""
    """),_display_(/*19.6*/helper/*19.12*/.CSRF.formField),format.raw/*19.27*/("""
    """),format.raw/*20.5*/("""<h4>Create New</h4>
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
    """)))}),format.raw/*32.6*/("""
    """),_display_(/*33.6*/if(postForm.hasErrors())/*33.30*/{_display_(Seq[Any](format.raw/*33.31*/("""
    """),format.raw/*34.5*/("""<p>The request is invalid</p>
    """)))}),format.raw/*35.6*/("""
"""),format.raw/*36.1*/("""</div>

<div class="col-6" style="border: 2px dotted;">
    """),_display_(/*39.6*/helper/*39.12*/.form(routes.HomeController.deletePost)/*39.51*/{_display_(Seq[Any](format.raw/*39.52*/("""
    """),_display_(/*40.6*/helper/*40.12*/.CSRF.formField),format.raw/*40.27*/("""
    """),format.raw/*41.5*/("""<h4>Delete Post</h4>
    <div class="row">
        <div class="col-6">
            <label>Post Name</label>
            <input name="title" style="width: 100%"/>
        </div>
        <div class="col-6">
            <button name="Submit" type="submit" class="btn btn-primary" style="margin-top">Submit</button>
        </div>
    </div>
    """)))}),format.raw/*51.6*/("""
    """),_display_(/*52.6*/if(postForm.hasErrors())/*52.30*/{_display_(Seq[Any](format.raw/*52.31*/("""
    """),format.raw/*53.5*/("""<p>The request is invalid</p>
    """)))}),format.raw/*54.6*/("""
"""),format.raw/*55.1*/("""</div>
""")))}),format.raw/*56.2*/("""
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
                  HASH: 7d5d7f032cdaaaafe451d8b9fbe703d8139d5374
                  MATRIX: 610->1|638->24|1004->55|1177->133|1207->138|1232->155|1270->156|1302->162|1351->186|1382->202|1420->203|1449->205|1510->239|1523->243|1555->254|1584->255|1614->258|1627->262|1661->275|1707->291|1742->299|1822->353|1837->359|1885->398|1924->399|1957->406|1972->412|2008->427|2041->433|2512->874|2545->881|2578->905|2617->906|2650->912|2716->948|2745->950|2835->1014|2850->1020|2898->1059|2937->1060|2970->1067|2985->1073|3021->1088|3054->1094|3437->1447|3470->1454|3503->1478|3542->1479|3575->1485|3641->1521|3670->1523|3709->1532
                  LINES: 23->1|24->2|29->3|34->3|36->5|36->5|36->5|37->6|40->9|40->9|40->9|41->10|42->11|42->11|42->11|42->11|42->11|42->11|42->11|44->13|48->17|49->18|49->18|49->18|49->18|50->19|50->19|50->19|51->20|63->32|64->33|64->33|64->33|65->34|66->35|67->36|70->39|70->39|70->39|70->39|71->40|71->40|71->40|72->41|82->51|83->52|83->52|83->52|84->53|85->54|86->55|87->56
                  -- GENERATED --
              */
          