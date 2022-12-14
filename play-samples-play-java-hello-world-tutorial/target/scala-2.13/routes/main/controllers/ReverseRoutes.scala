// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def tutorial: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tutorial")
    }
  
    // @LINE:11
    def deletePost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "deletePost")
    }
  
    // @LINE:7
    def explore: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "explore")
    }
  
    // @LINE:9
    def getPosts(postId:Integer = null): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getPosts" + play.core.routing.queryString(List(if(postId == null) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("postId", postId)))))
    }
  
    // @LINE:6
    def index: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "play")
    }
  
    // @LINE:10
    def createPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "post")
    }
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
