package obbexam;

public class Document {
	
	private String author,  title;
	  private int copies;
		
	  
	  public Document(String a, String t) {
	    author = a; title = t; copies = 0;
	  }

	  
	 
	  public String getAuthor() {
	    return author;
	  }
	    
	 
	  public String getTitle() {
	    return title;
	  }
	    
	 
	  public int getCopies() {
	    return copies;
	  }
	  
	
		  public String toString( ) {
		    return "Doc of " + author + " \"" + title + "\" Copies: " + copies;
		  }

		  
		  public void createCopies(int n) {
		    copies += n;
		  }

		 
		  public void sellCopies(int n) {
		    if (n <= copies)
		      copies -= n;
		    else
		      copies = 0;
		  }
	}
	
	





