class Book{
	String title;
	String author;
	final int bookID;
	static int bookCounter=1000;
	static final String LIBRARY_NAME="Central Library";
	static int totalbook=0;
	Book(){
		this.title="title";
		this.author="author";
		bookID = bookCounter;
		
	}
	Book(String title,String author ){
		this.title=title;
		this.author=author;
		this.bookID =++bookCounter;
		this.totalbook++;
	}
	public void displayInfo() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("BookID: "+bookID);
		
	}
	static void displayInfo(boolean showLibrary){
	System.out.println("Library Name: "+LIBRARY_NAME);
		
		
	}
	static void displayTotalBooks() {
		System.out.println("Total Books Added: "+totalbook);
	}
	
}
public class BookFinalStatic {
	public static void main(String args[]) {
		Book.displayInfo(true);
		Book b1=new Book("Odyssey","H.H Haroldson");
		b1.displayInfo();
		Book b2=new Book("Yoshiwara in Flames","Hideaki Sorachi");
		b2.displayInfo();
		Book.displayTotalBooks();
		
		
		
	}

}
