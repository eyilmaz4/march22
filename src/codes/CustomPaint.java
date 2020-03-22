package codes;

public class CustomPaint extends Paint {
    protected String paintGloss;
    protected String durability;

    public CustomPaint(String colorName, double sqrFeet, double totalPrice, String paintGloss, String durability) {
        super(colorName, sqrFeet, totalPrice);
        this.paintGloss = paintGloss;
        this.durability = durability;
    }

    public void ChangeGloss(String newGloss){
        this.paintGloss=newGloss;
        }
   public void ChangeDurability(String newdurability) {
       this.durability=newdurability;
    }

public double calPrice() {
    double additionalResult = 32.99;
    if (this.paintGloss == "Glossy") {
        additionalResult += 2;
    } else if (this.paintGloss == "Extra Glossy") {
        additionalResult += 3;
    } else {
        System.out.println("not valid");
    }
    if (this.durability.equalsIgnoreCase("durable")){
        additionalResult += 2;
}
    else if(this.durability.equalsIgnoreCase("super durable")){
        additionalResult+=3;
    }
    super.totalPrice=super.sqrFeet/100*additionalResult;

        return super.totalPrice;
}

}
