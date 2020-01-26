package proxypattern;

public class BooKParser implements IBookParser {

    private Integer noOfCharacters;

    public BooKParser(String book) {
        noOfCharacters = book.length();
        // This is expansive operation

    }

    @Override
    public Integer getNumberOfCharacters() {
        return noOfCharacters; // Book get parsed when initialize, and number is available
    }
}

