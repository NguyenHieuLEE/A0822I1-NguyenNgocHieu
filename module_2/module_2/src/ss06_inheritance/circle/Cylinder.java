package ss06_inheritance.circle;

 public class Cylinder extends Circle {
        private double height ;

     public Cylinder(double height) {
         this.height = height;
     }

     public Cylinder(double r, String color, double height) {
         super(r, color);
         this.height = height;
     }

     public double getHeight() {
         return height;
     }

     public void setHeight(double height) {
         this.height = height;
     }

     public double getVolume(){
            return this.Area()*this.height;
        }

}
