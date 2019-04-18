public class BlogTest {

    public static void main(String[] args) {

        Blog myBlog = new Blog();

        BlogPost post1 = new BlogPost("John Doe", "How to Sleep", "2045.01.01");
        BlogPost post2 = new BlogPost("Roger Federer", "How to Win", "2045.03.11");
        BlogPost post3 = new BlogPost("David Guetta", "How to Whatever", "2013.01.01");
        BlogPost post4 = new BlogPost("Tekek Tekekek", "How to Tekektek", "2005.11.01");

        myBlog.add(post1);
        myBlog.add(post2);
        myBlog.add(post3);
        myBlog.add(post4);

        System.out.println(myBlog.getBlogPosts().toString());

        myBlog.delete(1);

        System.out.println(myBlog.getBlogPosts().toString());

        BlogPost post5 = new BlogPost("Mate Sal", "How to Finish a Task", "2019.04.18.");

        myBlog.update(0, post5);

        System.out.println(myBlog.getBlogPosts().toString());
    }
}
