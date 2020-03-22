package codes;

public class Paint {
    protected String colorName;
   protected double sqrFeet;
  protected double totalPrice;

    public Paint(String colorName, double sqrFeet, double totalPrice) {
        this.colorName = colorName;
        this.sqrFeet = sqrFeet;
        this.totalPrice = totalPrice;
    }



    double calPrice(double sqrFeet){
       return (this.sqrFeet/100)*32.99;
    }

    @Override
    public String toString() {
        return "Paint{" +
                "colorName='" + colorName + '\'' +
                ", sqrFeet=" + sqrFeet +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
