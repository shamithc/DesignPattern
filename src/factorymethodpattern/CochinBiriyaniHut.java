package factorymethodpattern;

public class CochinBiriyaniHut extends BiriyaniHut {
    @Override
    public Biriyani createBiriyani(String biriyaniType) throws Exception {
        switch (biriyaniType){
            case "chicken":
                return new CochinStyleChickenBiriyani();
            case "egg":
                return new CochinStyleEggBiriyani();
            default:
                throw new Exception("Invalid biriyani type");
        }
    }
}
