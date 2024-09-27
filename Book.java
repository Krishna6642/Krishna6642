// Source code is decompiled from a .class file using FernFlower decompiler.
class Book {
   private String title;
   private String author;
   private String isbn;

   public Book(String var1, String var2, String var3) {
      this.title = var1;
      this.author = var2;
      this.isbn = var3;
   }

   public String getTitle() {
      return this.title;
   }

   public String getAuthor() {
      return this.author;
   }

   public String getIsbn() {
      return this.isbn;
   }

   public String toString() {
      return "Title: " + this.title + ", Author: " + this.author + ", ISBN: " + this.isbn;
   }
}
