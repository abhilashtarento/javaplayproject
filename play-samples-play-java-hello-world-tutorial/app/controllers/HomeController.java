package controllers;

import akka.http.javadsl.model.HttpRequest;
import form.DeleteForm;
import form.PostForm;
import model.Post;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import services.PostService;
import services.Util;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletionStage;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

//    private final Form<PostForm> postForm;
//
//    @Inject
//    public HomeController(FormFactory formFactory)
//    {
//        this.postForm= formFactory.form(PostForm.class);
//    }
    public Result index() {
        return ok(views.html.index.render());
    }
    
    public Result explore() {
        return ok(views.html.explore.render());
    }
    
    public Result tutorial() {
        return ok(views.html.tutorial.render());
    }

    private final PostService postService;
    public Result getPosts(Integer postId, Http.Request request) {

        if(postId==null) try{
            return ok(views.html.posts.render(postService.getPosts(), postForm, request));
        }
        catch(NullPointerException e)
        {
            return ok(views.html.posts.render(Collections.emptyList(),postForm, request));
        }
        Post post=postService.getPost(postId);
        if(post==null)
        {
            return ok(views.html.posts.render(Collections.emptyList(),postForm, request));
        }
        return  ok(views.html.posts.render(Arrays.asList(post),postForm, request));
    }

    private final Form<PostForm> postForm;
    private final Form<DeleteForm> deleteForm;

    private final Form<String> deleteForms;


    @Inject
    public HomeController(FormFactory formFactory, PostService postService)
    {
        this.postForm= formFactory.form(PostForm.class);
        this.deleteForm= formFactory.form(DeleteForm.class);
        this.postService= postService;
        this.deleteForms= formFactory.form(String.class);
        // this.postService= postService;
    }


    public Result createPost(Http.Request request)
    {
        Form<PostForm> boundForm= postForm.bindFromRequest(request);
        if(boundForm.hasErrors())
        {
            return badRequest(views.html.posts.render(postService.getPosts(), postForm, request ));
        }
        postService.add(boundForm.get());
        return redirect(routes.HomeController.getPosts(null));
    }

    public Result createPostApi(Http.Request request)
    {

        Form<PostForm> boundForm= postForm.bindFromRequest(request);
        if(postForm.hasErrors())
        {
            return badRequest(Util.createResponse((Object)("Not a valid request"), false));
        }

       // Class.forName("Hi");
        try {
            postService.add(boundForm.get());
            return ok(Util.createResponse((Object)("Created"),true));
        }
        catch (Exception e)
        {
            return badRequest(Util.createResponse((Object)("Not a valid request"), false));
        }
    }


    public Result deletePostApi(Http.Request request)
    {
        Form<DeleteForm> boundForm= deleteForm.bindFromRequest(request);
        try {
            postService.deletePost(boundForm.value().get().getTitle());
            return ok(Util.createResponse((Object)"Deleted",true));
        }
        catch
        (Exception e)
        {
            return badRequest(Util.createResponse((Object)"Delete Failed",false));
        }
    }
    public Result deletePost(Http.Request request)
    {
        Form<DeleteForm> boundForm= deleteForm.bindFromRequest(request);
        postService.deletePost(boundForm.value().get().getTitle());
        return  ok(views.html.posts.render(postService.getPosts(), postForm, request));
    }
}

