package factorymethodpattern;

public abstract class BiriyaniHut {

    public Biriyani orderBiriyani(String biriyaniType) throws Exception {
        Biriyani biriyani = createBiriyani(biriyaniType);
        biriyani.prepare();
        biriyani.box();
        biriyani.deliver();

        return biriyani;
    }

    protected abstract Biriyani createBiriyani(String biriyaniType) throws Exception;
}
