package model;

import akka.actor.typed.ActorSystem;
import play.api.libs.concurrent.CustomExecutionContext;

import javax.inject.Inject;

public class DbExecutionContext extends CustomExecutionContext  {
  //  private static final akka.actor.ActorSystem actorSystems = ;

    @Inject
    public DbExecutionContext(ActorSystem actorSystem)
    {
    super(actorSystem.classicSystem(),"database.dispatcher");
}

}
