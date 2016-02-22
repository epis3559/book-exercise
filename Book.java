/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Edward Pisco.)
 * @version (02.22.16)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages){
	author = bookAuthor;
	title = bookTitle;
	pages = bookPages;
	refNumber = "";
    }

   public String getAuthor()
   {
       return author;
    }
    public String getTitle()
   {
       return title;
       
    }
    public int getPages(){
	return pages;
    }		
    public void setRefNumber(String ref){
	if(ref.length() > 2){
		refNumber = ref;
	}
	else {
		System.out.println("Error! The reference number must be at least 3 characters long.");
	}
    }		

    public String getRefNumber(){
	return refNumber;
    }				

    public void printAuthor() 
    {
	System.out.println("Author: " + author);
    }
    public void printTitle(){
	System.out.println("Title: " + title);
    }	
    
    public void borrow() {
	borrowed++;
    }
    public int getBorrowed() {
	return borrowed;
    }

    public void printDetails(){
	System.out.println("Title:  " + title);
	System.out.println("Author: " + author);
	System.out.println("Pages:  " + pages);
	System.out.println("Borrowed: " + borrowed);
	String refNumberString;
	
	if(refNumber.length() > 0 ){
		refNumberString = refNumber;
	}
	else {
		refNumberString = "ZZZ";
	}
	System.out.println("Reference number:  " + refNumberString);
    }
   


   

}
