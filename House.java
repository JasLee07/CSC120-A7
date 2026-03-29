/* This is a stub for the House class */

import java.util.ArrayList;


public class House extends Building implements HouseRequirements {

  /*
  The <Student> tells Java 
  what kind of data we plan to store IN the ArrayList
   */ 
  private ArrayList<Student> residents;
  public boolean hasDiningRoom;
  public int nResidents;
  
  public House(String name, String address, int nFloors, int nResidents, boolean hasDiningRoom) {
  super(name, address, nFloors);
  this.residents = new  ArrayList<Student>();
  this.hasDiningRoom = hasDiningRoom;;
  
  }

  public int nResidents(){
    return nResidents;
  }

  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
    
  }

  public void moveIn(Student s){
    if(!residents.contains(s)){
    residents.add(s);
    }
  }

  public Student moveOut(Student s){
    residents.remove(s);
    return s;
  }

  public boolean isResident(Student s){
    return this.isResident(s);
  }
  public static void main(String[] args) {
    House jordanHouse = new House("Jordan House", "1 Paradise Rd", 4, 95, false);
    House northropHouse = new House("Northrop House", "49 Elm Street", 4, 70, true);
    
    System.out.println(jordanHouse);
    System.out.println(northropHouse);
  }
}






