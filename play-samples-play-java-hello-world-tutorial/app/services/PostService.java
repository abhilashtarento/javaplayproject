package services;

import form.PostForm;
import model.Post;
import model.PostRepository;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletionStage;

public class PostService {
    private List<Post> posts= new ArrayList<>();

    private final PostRepository postRepository;

    @Inject
    public PostService(PostRepository postRepository)
    {
       this.postRepository=postRepository;
    }

    public List<Post> getPosts()
    {
        return postRepository.getAll();
    }

    public Post getPost(Integer postId)
    {
       Optional<Post> post= posts.stream().filter(myPost-> myPost.getId()==postId)
                .findAny();
       if(post.isPresent())
       {
           return post.get();
       }
       return null;
    }

    public void deletePost(String postTitle)
    {
        postRepository.deletePost(postTitle);
    }
    public void add(PostForm postForm)
    {
        postRepository.save(new Post(postForm.getTitle(),postForm.getContent()));
    }


}
