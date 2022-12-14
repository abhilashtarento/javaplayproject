package model;

import com.google.inject.ImplementedBy;

import java.util.List;
import java.util.concurrent.CompletionStage;

@ImplementedBy(PostRepositoryImpl.class)
public interface PostRepository {

    List<Post> getAll();

    Post getById(int postid);

    void save(Post post);

    void deletePost(String id);

}
