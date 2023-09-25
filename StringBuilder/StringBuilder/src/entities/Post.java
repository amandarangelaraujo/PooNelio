package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> comentarios = new ArrayList<>();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }
    public void addComment(Comment comment){
        comentarios.add(comment);
    }
    public void removeComment(Comment comment){
        comentarios.remove(comment);
    }
    
    public String toString (){
        StringBuilder sd = new 
    }

    
}
