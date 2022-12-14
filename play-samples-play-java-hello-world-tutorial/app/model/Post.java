package model;

import org.checkerframework.checker.signature.qual.Identifier;

import javax.persistence.*;

@Entity
@Table(name="posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String content;

    public Post()
    {

    }

    public Post(String title, String content)
    {
        this.id=id;
        this.title=title;
        this.content=content;
    }
    public int getId()
    {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public void setId(int id)
    {
        this.id=id;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
