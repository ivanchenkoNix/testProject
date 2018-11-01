public class main {
    public static void main (String args []) {


       FactoryOfCandies factoryOfCandies = new FactoryOfCandies();
       CandyChockoladnaya candyChockoladnaya = new CandyChockoladnaya();
       CandyJeleynaya candyJeleynaya = new CandyJeleynaya();
       CandySosatelnaya candySosatelnaya = new CandySosatelnaya();

       int presentWeight = 1900;
       String candyName = "";
       String[] listOfCandies = {"Chockoladnaya","Jeleynaya","Sosatelnaya"};
       GetCandy[] presents = new GetCandy[10];


       for (int i = 0; i<presents.length; i++){
           for ( int j = 0; j<listOfCandies.length; j++ ) {
               if (presentWeight >= candyChockoladnaya.getWeight() && listOfCandies[j].equals("Chockoladnaya")
                       && candyName.equals("")){
                   candyName = listOfCandies[j];
                   presentWeight -= candyChockoladnaya.getWeight();
               }

               else if  (presentWeight >= candyJeleynaya.getWeight() && listOfCandies[j].equals("Jeleynaya")
                       && candyName.equals("")){
                   presentWeight -= candyJeleynaya.getWeight();
                   candyName = listOfCandies[j];
               }
               else if (presentWeight >= candySosatelnaya.getWeight() && listOfCandies[j].equals("Sosatelnaya")
                       && candyName.equals("")){
                   presentWeight -= candySosatelnaya.getWeight();
                   candyName = listOfCandies[j];
               }
           }
           presents[i] = factoryOfCandies.getCandies(candyName);
           candyName = "";
       }
       for (GetCandy items: presents) {
           System.out.println(items);
        }
        System.out.println("weight left: "+ presentWeight);
    }
}
