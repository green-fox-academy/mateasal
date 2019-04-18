public class BlogPost {

    String authorName;
    String title;
    String text;
    String publicationDate;

    @Override
    public String toString() {return title;}

    public BlogPost(String authorName, String title, String publicationDate){
        this.authorName = authorName;
        this.title = title;
        this.publicationDate = publicationDate;
    }

    public void setText(String text) {
        this.text = text;
    }
}
