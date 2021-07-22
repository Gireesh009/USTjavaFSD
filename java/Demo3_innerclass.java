/**
 * 
 */
package com.ust.examples;

/**
 * car example inner class
 *
 */
 class Carnew 
{
   String carName;
   String carType;
   public Carnew(String name, String type) 
   {
      this.carName = name;
      this.carType = type;
   }
   private String getCarName() 
   {
      return this.carName;
   }
   class Engine 
   {
      String engineType;
      void setEngine() 
      {
         // Accessing carType property of Car
         if(Carnew.this.carType.equals("4WD"))
         {
            // Invoking method getCarName() of Car
            if(Carnew.this.getCarName().equals("Crysler")) 
            {
               this.engineType = "Bigger";
            } else {
               this.engineType = "Smaller";
            }
         }else{
            this.engineType = "Bigger";
         }
      }
      String getEngineType()
      {
         return this.engineType;
      }
   }
}
public class Demo3_innerclass 
{
   public static void main(String[] args) 
   {
	   Carnew car1 = new Carnew("Mazda", "8WD");
	   Carnew.Engine engine = car1.new Engine();
      engine.setEngine();
      System.out.println("Engine Type for 8WD= " + engine.getEngineType());
      Carnew car2 = new Carnew("Crysler", "4WD");
      Carnew.Engine c2engine = car2.new Engine();
      c2engine.setEngine();
      System.out.println("Engine Type for 4WD = " + c2engine.getEngineType());
   }
}