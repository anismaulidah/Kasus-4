/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anis Maulidah
 */
public class TextBook {
      private String title;  
      private String author; 
      private String publisher;

   public TextBook(String textTitle, String auth,String pub)
   {
      title = textTitle;
      author = auth;
      publisher = pub;
   }

   public void set(String textTitle, String auth, String pub)
   {
      title = textTitle;
      author = auth;
      publisher = pub;
   }

   public String toString()
   {
      String str = "Title: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher;
      return str;
   }
}
