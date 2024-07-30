public class ProxyPattern {
    public static void main(String[] args) {

        Image image1 = new ProxyImage("https://via.placeholder.com/150");
        Image image2 = new ProxyImage("https://www.w3schools.com/w3images/fjords.jpg");

        image1.display();
        System.out.println("");

        image1.display();
        System.out.println("");

        image2.display();
        System.out.println("");

        image2.display();
    }
}
