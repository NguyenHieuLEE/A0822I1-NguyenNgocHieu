package ss07_abstractclass_Interface.resizeable;

public class Rectangle {
    double high=0.0;
    double wide=0.0;

    public Rectangle() {
    }

    public Rectangle(double high, double wide) {
        this.high = high;
        this.wide = wide;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }
    public double setArea2(){
        return high*wide;
    }
    public void resize(double percent) {
        this.high *= (1 + percent / 100);
        this.wide *= (1 + percent / 100);
    }
}

