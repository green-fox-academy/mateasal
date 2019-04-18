import java.util.ArrayList;
import java.util.List;

public class Blog {

    List<BlogPost> blogPosts;

    public Blog(){
        this.blogPosts = new ArrayList<>();
    }

    public void add(BlogPost blogPost){
        this.blogPosts.add(blogPost);
    }

    public void delete(int index){
        this.blogPosts.remove(index);
    }

    public void update(int index, BlogPost blogpost){
        this.blogPosts.set(index, blogpost);
    }

    public List<BlogPost> getBlogPosts() {
        return blogPosts;
    }
}
