package factorymethodpattern;

public class CalicutBiriyaniHut extends BiriyaniHut {
    @Override
    protected Biriyani createBiriyani(String biriyaniType) throws Exception {
        switch (biriyaniType) {
            case "egg" :
                return new CalicutStyleEggBiriyani();
            case "chicken" :
                return new CalicutStyleChickenBiriyani();
            default:
                throw new Exception("invalid biriyani type");
        }
    }
}
