package controllers;

import model.UserStore;
import play.core.j.HttpExecutionContext;
import play.mvc.Controller;
import scala.concurrent.ExecutionContext;

import javax.inject.Inject;

public class UserController extends Controller {
    private HttpExecutionContext ec;
    private UserStore userStore;

    @Inject
    public UserController(HttpExecutionContext ec, UserStore userStore)
    {
        this.ec=ec;
        this.userStore=userStore;
    }
}
