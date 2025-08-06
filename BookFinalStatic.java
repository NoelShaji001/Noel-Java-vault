class Book{
	String title;
	String author;
	final int bookID;
	static int bookCounter=1000;
	static final String LIBRARY_NAME="Central Library";
	Book(){
		this.title="title";
		this.author="author";
		this.bookID = bookCounter;
		
	}
	Book(String title,String author ){
		this.title=title;
		this.author=author;
		this.bookID =bookCounter+1;
	}
	
}
public class BookFinalStatic {

}
