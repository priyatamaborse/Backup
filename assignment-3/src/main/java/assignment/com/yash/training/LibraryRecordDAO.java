package assignment.com.yash.training;

import java.util.List;

public interface LibraryRecordDAO {
	
	 public List<LibraryRecord> findByBook(Book book);

	 public boolean save(LibraryRecord record);

}
