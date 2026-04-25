/******************************
 *
 * File: Generics_MatthewRivera.java
 * By: Matthew Rivera
 * Date: 04/24/2026
 * Description: This is the driver class for part D of assignment 06, as well as a generic Class and classes it uses
 *
 ******************************/

package Part_D;

//driver class
public class Generics_MatthewRivera {
    public static void main(String[] args){
        Measurement<Inches> inchesMeasurement = new Measurement<>(new Inches());
        System.out.println(inchesMeasurement.getUnits() + "       " + inchesMeasurement.isMetric());
        //Inches       false

        Measurement<Feet> feetMeasurement = new Measurement<>(new Feet());
        System.out.println(feetMeasurement.getUnits() + "       " + feetMeasurement.isMetric());
        //Feet       false

        Measurement<Centimeters> centimetersMeasurement = new Measurement<>(new Centimeters());
        System.out.println(centimetersMeasurement.getUnits() + "       " + centimetersMeasurement.isMetric());
        //Centimeters       true

        Measurement<Meters> metersMeasurement = new Measurement<>(new Meters());
        System.out.println(metersMeasurement.getUnits() + "       " + centimetersMeasurement.isMetric());
        //Meters       true
    }
}

//generic
class Measurement<T extends Units> {
    T units;

    public Measurement(){
        this.units = (T) new Inches();
    }

    public Measurement(T units){
        this.units = units;
    }

    public String getUnits(){
        return this.units.getClass().getSimpleName();
    }

    public boolean isMetric(){
        return this.units.getIsMetric();
    }
}

//classes for generic
class Units{
    protected boolean isMetric;

    public boolean getIsMetric(){
        return isMetric;
    }
}

class Inches extends Units{
    public Inches() {
        isMetric = false;
    }
}

class Feet extends Units{
    public Feet(){
        isMetric = false;
    }
}

class Centimeters extends Units{
    public Centimeters(){
        isMetric = true;
    }
}

class Meters extends Units{
    public Meters(){
        isMetric = true;
    }
}
