// 4️⃣ Library Book Tracker
// Task: Create a Book class to manage library books.
// Requirements:
// Private fields: title (String), author (String), copiesAvailable (int)
// Getters and setters with validation (copiesAvailable >= 0)
// Method: borrowBook() decreases copies if available
// Method: returnBook() increases copies

class Book {
    private String title;
    private String author;
    private int copiesAvailable;
    
    Book(String title,String author,int copiesAvailable){
        this.title=title;
        this.author=author;
        
        this.copiesAvailable=copiesAvailable;
        if(copiesAvailable>=0){
            this.copiesAvailable=copiesAvailable;
        }else{
            this.copiesAvailable=0;
        }
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
    public int getCopiesAvailable(){
        return copiesAvailable;
    }
    public void setCopiesAvailable(int copiesAvailable){
        if(copiesAvailable>=0){
            this.copiesAvailable=copiesAvailable;
        }else{
            System.out.println("Cannot be Negative");
        }
    }
    public void borrowBook(){
        if(copiesAvailable>0){
            copiesAvailable--;
            System.out.println("Book Borrow Successfully,Remaining Books:"+copiesAvailable);
        }else{
            System.out.println("No Copies available");
        }
    }
    public void returnBook(){
        copiesAvailable++;
        System.out.println("Copies Available:"+copiesAvailable);
    }
    public void displayBookDetails(){
        System.out.println("-------------------------");
        System.out.println("Title of the Book:"+title);
        System.out.println("Author of The book:"+author);
         System.out.println("Copies Available of the Book:"+copiesAvailable);
         System.out.println("_________________________");
    }
}



class LibraryBookTracker {
     public static void main(String []args){
         Book b1=new Book("Atomic Habits", "James Clear", 3);
         
         b1.displayBookDetails();
         b1.borrowBook();
         b1.borrowBook();
         b1.returnBook();
         
         
         b1.setCopiesAvailable(-5);
         b1.displayBookDetails();
     }
}