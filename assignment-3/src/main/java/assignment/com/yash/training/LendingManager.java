package assignment.com.yash.training;

public interface LendingManager {
	
	public LibraryRecord borrowBook(Book book);

	public LibraryRecord returnBook(Book book);

}
