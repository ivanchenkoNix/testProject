public class CandySosatelnaya extends BaseCandy implements GetCandy {
    public CandySosatelnaya() {
        super(400,50,"blue");
    }

    public void candyIsAdded(){
        System.out.println(this.toString()+ " is added");
    }


}
