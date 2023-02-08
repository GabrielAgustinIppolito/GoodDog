package GoodDogProject;

import  GoodDogProject.model.GoodDog;
public class GoodDogTestDrive {
   public static void main(String[] args){
      GoodDog one = new GoodDog();
      one.setSize(70);
      GoodDog two = new GoodDog();
      two.setSize(13);
      GoodDog three = new GoodDog();
      three.setSize(one.getSize()-two.getSize());
      System.out.println("Dog one size: " + one.getSize() );
      System.out.println("Dog two size: " + two.getSize() );
      System.out.println("Dog three size: " + three.getSize() );
      one.bark();
      two.bark();
      three.bark();
   }
}
