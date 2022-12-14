package model;

import play.db.jpa.JPAApi;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.CompletionStage;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class PostRepositoryImpl implements PostRepository{
    private final JPAApi jpaApi;
//    private DbExecutionContext dbExecutionContext;

    @Inject
    public  PostRepositoryImpl(JPAApi jpaApi)
    {
        this.jpaApi=jpaApi;
//        this.dbExecutionContext= dbExecutionContext;
    }
    @Override
    public List<Post> getAll() {
            return jpaApi.withTransaction(entityManager -> { return entityManager.createQuery("select p from Post p", Post.class).getResultList();
    });
    }

    @Override
    public Post getById(int postId) {
        return jpaApi.withTransaction(entityManager -> {
            return entityManager.createQuery("select p from Post p where p.id=:postId ", Post.class).setParameter("postId",postId).getSingleResult();
        });
    }

    @Override
    public void save(Post post) {
         jpaApi.withTransaction(entityManager -> {entityManager.persist(post);});
    }

    @Override
    public void deletePost(String title) {
        jpaApi.withTransaction(entityManager -> {return entityManager.createQuery("delete from Post p where p.title=:title",String.class).setParameter("title",title);});
    }

}
