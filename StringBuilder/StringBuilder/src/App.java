import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

import entities.Comment;
import entities.Post;

public class App {
        public static void main(String[] args) throws Exception {

       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
       Comment c1 = new Comment("have a nice trip");
       Comment c2 = new Comment("have fun");
       Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"), 
                    "to indo para a tailandia",
                    "vai ser 10/10", 12);
    
    }
}