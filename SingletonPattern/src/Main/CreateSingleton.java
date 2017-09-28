package Main;

import Object.CollectionofList;

/**
 *
 * @author Mert Acikportali
 */
public class CreateSingleton {
   public static void main(String[] args) {

      //Illegal construct because we created it private
      //SingleObject object = new SingleObject();

      //Get the only object available
      CollectionofList object = CollectionofList.getInstance();

      object.showMessage();
   }
}