package proxypattern;

public class Client {
    public static void main(String[] args) {
        IBookParser bookParser = new LazyBookParserProxy("Hello World");
        Integer numberOfCharacters = bookParser.getNumberOfCharacters();

        System.out.println("No of Characters :- " + numberOfCharacters);
    }
}
