public class CandyJeleynaya extends BaseCandy implements GetCandy {
    public CandyJeleynaya() {
        super(300, 13, "red");
    }

    public void candyIsAdded(){
        System.out.println(this.toString()+ " is added");
    }
//    public int candyWeight(){
//        return this.getWeight();
//    }
}
