package factorymethodpattern;

public class Client {
    public static void main(String[] args) throws Exception {

        BiriyaniHut cochinBiriyaniHut = new CochinBiriyaniHut();
        cochinBiriyaniHut.orderBiriyani("egg");

        System.out.println("AT CALICUT -----------------");

        BiriyaniHut calicutBiriyaniHut = new CalicutBiriyaniHut();
        calicutBiriyaniHut.orderBiriyani("chicken");
        
    }
}
