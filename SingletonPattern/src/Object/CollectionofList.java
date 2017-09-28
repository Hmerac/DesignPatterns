package Object;

/**
 *
 * @author Mert Acikportali
 */
public class CollectionofList {

   //Create the object
   private static CollectionofList instance = new CollectionofList();

   //This is to make sure that object cannot be built again
   private CollectionofList(){}

   //Get object
   public static CollectionofList getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("- 1 Egg,\n- 2 Bread,\n- 250 gr. Cheese,\n...");
   }
}
