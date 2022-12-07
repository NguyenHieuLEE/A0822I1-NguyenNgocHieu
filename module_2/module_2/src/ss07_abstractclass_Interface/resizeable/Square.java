package ss07_abstractclass_Interface.resizeable;

public class Square {
    double edge;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
    public double setArea3(){
        return edge*edge;
    }
}
