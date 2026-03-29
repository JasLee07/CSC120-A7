/* This is a stub for the Library class */
import java.util.Hashtable;
public class Library extends Building implements LibraryRequirements {

    Hashtable<String, Boolean> collection = new Hashtable<>();
    public boolean isAvailable;
    public boolean containsTitle;

    public Library(String name, String address, int nFloors, Hashtable collection) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    public void addTitle(String title){
      if(!collection.containsKey(title)){
        collection.put(title, true);
        System.out.println("Title added to system.");
      } else{
        System.out.println("This book is already in our system.");
      }
      }

      public String removeTitle(String title){
        if(collection.containsKey(title)){
          collection.remove(title);
          return title;
        }
      }
    }
  




















    public static void main(String[] args) {
    // 1. Create the Library instance
    Library neilsonLibrary = new Library("Neilson Library", "7 Neilson Drive", 5);

    // 2. Add titles to the collection
    neilsonLibrary.addTitle("The Hobbit");
    neilsonLibrary.addTitle("Harry Potter and the Goblet of Fire");
    neilsonLibrary.addTitle("The Seven Husbands of Evelyn Hugo");

    // 3. Define the book title you want to check out
    String title = "The Hobbit"; 

    // 4. Run the checkout process
    if (neilsonLibrary.containsTitle(title)) {
        if (neilsonLibrary.isAvailable(title)) {
            neilsonLibrary.checkOut(title);
            System.out.println("Success! You checked out: " + title);
        } else {
            System.out.println("Sorry, this item is already checked out.");
        }
    } else {
        System.out.println("Sorry, we do not have " + title + " in this library.");
    }
}
  
  }