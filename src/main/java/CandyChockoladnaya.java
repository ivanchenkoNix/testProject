public class CandyChockoladnaya extends BaseCandy implements GetCandy {
    public CandyChockoladnaya() {
        super(500, 50, "yellow");
    }

    public void candyIsAdded(){
        System.out.println(this.toString()+ " is added");

    }
//    public int candyWeight(){
//        return this.getWeight();
//    }
}
