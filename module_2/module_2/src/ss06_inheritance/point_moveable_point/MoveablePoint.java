package ss06_inheritance.point_moveable_point;

public class MoveablePoint extends Point {
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getXYZ() {
        return new float[]{this.getX(), this.getY(), xSpeed,};
    }

    public void setXYZ(float x, float y, float xSpeed,float ySpeed) {
        this.setXY(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] move(float x,float y, float xSpeed,float ySpeed){
        x+=xSpeed;
        y+=ySpeed;
        float[] arr={x,y};
        return arr;
    }
    public String toString() {
        return "(" + this.getX() + ", " + this.getY() +")" +"="+"("+ xSpeed+","+ySpeed +")";
    }
}

