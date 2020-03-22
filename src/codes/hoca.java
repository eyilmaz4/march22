////package codes;
////
////public class hoca {
////    ackage java_classes;
////​
////    public class Paint {
////        protected String colorName;
////        protected double squareFeet;
////        protected double totalPrice;
////        public Paint(String colorName,double squareFeet){
////            this.colorName=colorName;
////            this.squareFeet=squareFeet;
////            this.totalPrice =0;
////        }
////        double calculatePrice(){
////            double totalPrice= this.squareFeet/100*32.99;
////            this.totalPrice=totalPrice;
////            return this.totalPrice;
////        }
////​
////        @Override
////        public String toString() {
////            return "Paint{" +
////                    "colorName='" + colorName + '\'' +
////                    ", squareFeet=" + squareFeet +
////                    ", totalPrice=" + totalPrice +
////                    '}';
////        }
////package java_classes;
////​
////        public class PaintsTests {
////            public static void main(String[] args) {
////                Paint myPaint = new Paint("zero gravity",2800);
////                System.out.println(myPaint.toString());
////                System.out.println(myPaint.calculatePrice());
////                CustomPaint myCustomPaint = new CustomPaint("moon blue",3200,"durable","extra glossy");
////                System.out.println(myCustomPaint.calculateCustomPrice());
////            }
////​
////        ​
////        }
////        Collapse
////
//package java_classes;
//​
//public class CustomPaint extends Paint{
//    protected String durability;
//    protected String glossiness;
//    public CustomPaint(String colorName,double squareFeet,String durability,String glossiness){
//        super(colorName,squareFeet);
//        this.durability=durability;
//        this.glossiness=glossiness;
//    }
//​
//    public void changeGlossiness(String newGloss){
//        this.glossiness=newGloss;
//    }
//    public void changeDurability(String newDurable){
//        this.durability=newDurable;
//    }
//    public double calculateCustomPrice(){
//        double pricePerGallon=32.99;
//        if(this.glossiness.equalsIgnoreCase("glossy")){
//            pricePerGallon+=2;
//        }
//        else if (this.glossiness.equalsIgnoreCase(("extra glossy"))){
//            pricePerGallon+=3;
//        }
//        else{
//            System.out.println("Not proper value");
//        }
//        if(this.durability.equalsIgnoreCase("durable")){
//            pricePerGallon+=2;
//        }
//        else if(this.durability.equalsIgnoreCase("super durable")){
//            pricePerGallon+=3;
//        }
//        super.totalPrice=super.squareFeet/100*pricePerGallon;
//        return super.totalPrice;
//    }
//
////
////
////
////
////
////
////
////
////    }
