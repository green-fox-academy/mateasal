public class Main {

    public static void main(String[] args) {

        PostIt note1 = new PostIt("orange", "Idea1", "blue");
        PostIt note2 = new PostIt("pink", "Awesome", "black");
        PostIt note3 = new PostIt("yellow", "Superb!", "green");

        BlogPost post1 = new BlogPost();
        BlogPost post2 = new BlogPost();
        BlogPost post3 = new BlogPost();

        post1.setAuthorName("John Doe");
        post1.setPublicationDate("2000.05.04.");
        post1.setTitle("Lorem Ipsum");
        post1.setText("Lorem ipsum dolor sit amet.");

        post2.setAuthorName("Tim Urban");
        post2.setPublicationDate("2010.10.10.");
        post2.setTitle("Wait but why");
        post2.setText("A popular long-form, stick-figure-illustrated blog about almost everything.");

        post3.setAuthorName("William Turton");
        post3.setPublicationDate("2017.03.28.");
        post3.setTitle("One Engineer Is Trying to Get IBM to Reckon With Trump");
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
