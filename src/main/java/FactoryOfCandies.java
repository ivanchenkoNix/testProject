public class FactoryOfCandies {

    public GetCandy getCandies(String candyName){


        if (candyName == null){
            return null;
        }
        if ((candyName.equalsIgnoreCase("Chockoladnaya"))) {
            return new CandyChockoladnaya();

        }   if  (candyName.equalsIgnoreCase("Jeleynaya")){
            return new CandyJeleynaya();

        }   if (candyName.equalsIgnoreCase("Sosatelnaya")){
            return new CandySosatelnaya();
        }
        return null;
    }
}
