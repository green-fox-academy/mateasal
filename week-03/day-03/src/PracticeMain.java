import Blog.BlogPost;
import Farm.Animal;
import Sharpies.Sharpie;

public class PracticeMain {

    public static void main(String[] args) {

        PostIt note1 = new PostIt("orange", "Idea1", "blue");
        PostIt note2 = new PostIt("pink", "Awesome", "black");
        PostIt note3 = new PostIt("yellow", "Superb!", "green");

        BlogPost post1 = new BlogPost("John Doe","Lorem Ipsum","2000.05.04.");
        BlogPost post2 = new BlogPost("Tim Urban","2010.10.10.", "Wait but why");
        BlogPost post3 = new BlogPost("William Turton","One Engineer Is Trying to Get IBM to Reckon With Trump",
                                      "2017.03.28.");

        post1.setText("Lorem ipsum dolor sit amet.");

        post2.setText("A popular long-form, stick-figure-illustrated blog about almost everything.");

        post3.setText("Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention." +
                      "When I asked to take his picture outside one of IBM’s New York City offices," +
                      "he told me that he wasn’t really into the whole organizer profile thing.");

        Animal tiger = new Animal();

        System.out.println(tiger.getHunger());
        System.out.println(tiger.getThirst());

        tiger.eat();
        tiger.drink();

        System.out.println(tiger.getHunger());
        System.out.println(tiger.getThirst());

        tiger.play();

        System.out.println(tiger.getHunger());
        System.out.println(tiger.getThirst());

        Sharpie redSharpie = new Sharpie("red", 1.2F);

        redSharpie.use();

        System.out.println(redSharpie.getInkAmount());

    }
}
