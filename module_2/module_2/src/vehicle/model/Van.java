package vehicle.model;

public class Van extends Vehicle{
    int payload;

    public Van(int payload) {
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Van{" +
                "payload=" + payload +
                '}';
    }
}
