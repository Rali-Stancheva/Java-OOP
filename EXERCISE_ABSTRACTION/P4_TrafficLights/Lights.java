package OOP.EXERCISE_ABSTRACTION.P4_TrafficLights;

public class Lights {
   private Color color;

    public Lights(Color color) {
        this.color = color;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void changeColor(){
        if (getColor() == Color.RED){
            setColor(Color.GREEN);
        }else if (getColor() == Color.GREEN){
            setColor(Color.YELLOW);
        }else {
            setColor(Color.RED);
        }
    }
}
