/* This is a stub for the Library class */
import java.util.Hashtable;
public class Library extends Building implements LibraryRequirements{

  Hashtable<String, Boolean> collection = new Hashtable<>();
  public boolean isAvailable;
  public boolean containsTitle;
  String title;

    public Library(String name, String address, int nFloors, Hashtable collection) {

      super(name, address, nFloors);
      this.collection = collection;
      System.out.println("You have built a library: 📖");
    }

    public void addTitle(String title){
      if(!collection.containsKey(title)){
        collection.put(title, isAvailable);
      }
      System.out.println("Titles have been added!");
    }

    public String removeTitle(String title){
      collection.remove(title);
      System.out.println("This title has been removed.");
      return title;
    }

    public void checkOut(String title){
      if(collection.containsKey(title)){
        collection.remove(title, false);
      }
      System.out.println("Here's your book, enjoy!");
    }

    public void returnBook(String title){
      collection.replace(title, true);
      System.out.println("Thanks, have a good day!");
    }

    public boolean containsTitle(String title){
      return containsTitle;
    }

    public boolean isAvailable(String title){
      return isAvailable;
    }

    public void printCollection(){
      System.out.println(collection);
    }

    public static void main(String[] args) {
      Library neilsonLibrary = new Library("Neilson Library", "7 Neilson Drive", 5, null);
      System.out.print(neilsonLibrary);
      neilsonLibrary.addTitle("The Hobbit");
      neilsonLibrary.addTitle("Harry Potter and the Goblet of Fire");
      neilsonLibrary.addTitle("The Seven Husbands of Evelyn Hugo");
      neilsonLibrary.printCollection();
      
      String title = "The Hobbit";
      
      if(neilsonLibrary.containsTitle(title)){
        System.out.println("This title is in this library");
        if(neilsonLibrary.isAvailable(title)){
          System.out.println("This title is available for checkout!");
          neilsonLibrary.checkOut(title);
        } else{
          System.out.println("Sorry, this item is checked out.");
        }
      } else{
        System.out.println("Sorry, try another library.");
      }
    }
  }