package obbexam;

public class DocumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Document d1 = new Document("Mario Rossi", "My first document");
	       System.out.println(d1);
	       d1.createCopies(10);
	       d1.sellCopies(5);
	       System.out.println(d1);
	       System.out.println("Information on the document:");
	       System.out.println("Author: " + d1.getAuthor());
	       System.out.println("Title:  " + d1.getTitle());
	       System.out.println("Copies: " + d1.getCopies());
	    }
	

	}


