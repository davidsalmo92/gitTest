import java.awt.*;

/**
 * An abstract class for constructing a car object class.
 * @author Johanna Thall & David Salmo.
 */
public abstract class Car implements Movable{
    protected boolean turboOn;
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double dx;
    private double dy;
    private double x;
    private double y;
    //hello -Daniel
    /**
     * Construct a car with some different properties.
     * @param nrDoors specifies the number of doors the car has.
     * @param color represents the car's color.
     * @param enginePower represents the car's engine power.
     * @param modelName represent the model name of the car.
     */
    public Car(int nrDoors, Color color, double enginePower, String modelName){
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        stopEngine();
    }

    /**
     * Construct a car with some different properties.
     * @param nrDoors pecifies the number of doors the car has
     * @param color represents the car's color.
     * @param enginePower represents the car's engine power.
     * @param modelName represent the model name of the car.
     * @param turboOn checks if the turbo is on or off.
     */
    public Car(int nrDoors, Color color, double enginePower, String modelName, Boolean turboOn){
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.turboOn = turboOn;
        stopEngine();
    }

    /**
     * Access the number of doors the car has.
     * @return nrDoors
     */
    public int getNrDoors(){
        return nrDoors;
    }

    /**
     * Access to a car's engine power.
     * @return enginePower
     */
    public double getEnginePower(){
        return enginePower;
    }

    /**
     * Access a car's current speed.
     * @return currentSpeed
     */
    public double getCurrentSpeed(){ return currentSpeed;}

    /**
     * Access a car's color.
     * @return color
     */
    public Color getColor(){
        return color;
    }

    /**
     * Sets the car's color.
     * @param clr car's color
     */
    public void setColor(Color clr){
        color = clr;
    }

    /**
     * Starts engine and sets the car's current speed.
     */
    public void startEngine(){
        currentSpeed = 0.1;
    }

    /**
     * Stops engine and sets the car's current speed to 0.
     */
    public void stopEngine(){
        currentSpeed = 0;
    }

    /**
     * Turn turbo on.
     */
    public void setTurboOn(){
        turboOn = true;
    }

    /**
     * Turn turbo off.
     */
    public void setTurboOff(){
        turboOn = false;
    }

    /**
     * Moving the car in the x and y-axis
     */
    @Override
    public void move(){
        setX(getX() + dx);
        setDy(getY() + dy);
    }

    /**
     * moving the car to left on the x-axis
     */
    @Override
    public void turnLeft(){
        setX((getX()- dx)*currentSpeed);
        System.out.println("Turning left");
    }

    /**
     * moving the car to the right on the x-axis
     */
    @Override
    public void turnRight(){
        setX((getX() + dx)*currentSpeed);
        System.out.println("Turning right");
    }

    /**
     * Setters for positioning and movement in the x and y-axis
     * @param dy movement in the y-axis
     */
    //Setters
    public void setDy(double dy){this.dy = dy;}

    /**
     * @param dx movement in the x-axis
     */
    public void setDx(double dx){this.dx = dx;}

    /**
     * @param x sets position regarding x-axis
     */
    public void setX(double x){this.x = x;}

    /**
     *
     * @param y sets position reagarding y-axis
     */
    public void setY(double y){this.y = y;}


    /**
     * Getters of the current position in the x and y-axis
     * @return current position in x-axis
     */
    //Getters
    public double getX(){return x;}

    /**
     *
     * @return current position in y-axis
     */
    public double getY(){return y;}

    public void incrementSpeed(double amount){
        if(gas(amount)) {
            currentSpeed = getCurrentSpeed() + speedFactor() * amount;
        }
    }

    /**
     * Accepts value in integral between 0 and 1
     * @param amount decrementing speed-value
     */
    public void decrementSpeed(double amount){
        if(gas(amount)) {
            currentSpeed = getCurrentSpeed() - speedFactor() * amount;
        }
    }


    /**
     * gas only accepts integers between 0-1
     * @param amount
     * @return true
     */

      public boolean gas(double amount) {
      if(amount <= 1 && amount >= 0) ;
          return true;

      }


    /**
     * break only accepts integers between 0-1
     * @param amount
     * @return false
     */


      public boolean brake(double amount) {
       if(amount <= 1 && amount >= 0) return true;
          return false;
      }




}
