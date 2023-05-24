// This is a class file that works like a container to store conversion methods. 
// Feel free to add more conversion methods into this class. Paired with "TempConvertTable.java"  
public class UnitConversion {
  public static double tempC2F(double c) {
    return (9.0 / 5) * c + 32;
  }

  public static double tempF2C(double f) {
    return (5.0 / 9) * (f - 32);
  }
  
  public static double massKg2Lb(double kg){
    return kg * 0.45359237;
  }
  
  public static double massLb2Kg(double lb){
    return lb * 2.20462262; 
  }
}
