package proxypattern;

public class LazyBookParserProxy implements IBookParser {

    private BooKParser booKParser = null;

    public LazyBookParserProxy(String book) {
        this.booKParser = new BooKParser(book);
    }

    @Override
    public Integer getNumberOfCharacters() {
        return this.booKParser.getNumberOfCharacters();
    }
}
