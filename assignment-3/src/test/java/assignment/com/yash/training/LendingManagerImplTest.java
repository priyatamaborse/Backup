package assignment.com.yash.training;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(value=MockitoJUnitRunner.class)
public class LendingManagerImplTest {

	@InjectMocks
	private LendingManagerImpl lendingManagerImpl;
	
	@Mock
	private LibraryRecordDAO libraryRecordDAO;
	
	private Book book = new Book();
	private Book secondBook = new Book();
	
	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");  

	@Test(expected=IllegalStateException.class)
	public void shouldThrowIllegalStateExceptionWhenLibararyRecordBorrowingDateIsNull() throws ParseException
	{
		List<LibraryRecord> libraryRecords=new ArrayList<LibraryRecord>();
		libraryRecords.add(createLibraryRecord(2L, secondBook, simpleDateFormat.parse("1998/03/03"), null));
		
		when(libraryRecordDAO.findByBook(secondBook)).thenReturn(libraryRecords);
		
		lendingManagerImpl.borrowBook(secondBook);
	}

	@Test(expected=IllegalStateException.class)
	public void shouldThrowIllegalStateExceptionWhenReturningDateCountIsGreaterThanOne() throws ParseException{
		
		List<LibraryRecord> libraryRecords=new ArrayList<LibraryRecord>();
		libraryRecords.add(createLibraryRecord(2L, secondBook,simpleDateFormat.parse("1998/03/03"), null));
		libraryRecords.add(createLibraryRecord(2L, secondBook, simpleDateFormat.parse("1966/ 04/ 04"), null)); 
		
		when(libraryRecordDAO.findByBook(book)).thenReturn(libraryRecords);
		
		lendingManagerImpl.borrowBook(book);
	}
	
	@Test(expected=IllegalStateException.class)
	public void shouldThrowIllegalStateExceptionWhenLibraryRecordNotSavedInDB() throws ParseException
	{
		List<LibraryRecord> libraryRecords=new ArrayList<LibraryRecord>();
		libraryRecords.add(createLibraryRecord(2L, secondBook, simpleDateFormat.parse("1998/03/03"),simpleDateFormat.parse("1998/ 03/ 03")));
		
		when(libraryRecordDAO.findByBook(secondBook)).thenReturn(libraryRecords);
		when(libraryRecordDAO.save((LibraryRecord)anyObject())).thenReturn(false);
		
		lendingManagerImpl.borrowBook(secondBook);
	}
	
	@Test
	public void shouldReturnLibraryRecordWhenLibraryRecordSavedInDB() throws ParseException
	{
		List<LibraryRecord> libraryRecords=new ArrayList<LibraryRecord>();
		libraryRecords.add(createLibraryRecord(2L, secondBook, simpleDateFormat.parse("1998/03/03"),simpleDateFormat.parse("1998/ 03/ 03")));
		
		when(libraryRecordDAO.findByBook(secondBook)).thenReturn(libraryRecords);
		when(libraryRecordDAO.save((LibraryRecord)anyObject())).thenReturn(true);
		
		LibraryRecord actual= lendingManagerImpl.borrowBook(secondBook);
		
		assertNotNull(actual);
	}
	
	@Test(expected=IllegalStateException.class)
	public void shouldThrowIllegalStateExceptionWhenBorrowingDateNull() throws ParseException{
		
		List<LibraryRecord> libraryRecords=new ArrayList<LibraryRecord>();
		libraryRecords.add(createLibraryRecord(1L, book, null, simpleDateFormat.parse("1999/ 02/ 02")));
		
		when(libraryRecordDAO.findByBook(book)).thenReturn(libraryRecords);
		
		lendingManagerImpl.returnBook(book);
	}
	
	@Test
	public void showldReturnLibraryRecordIfReturningDateIsNull() throws ParseException{
		
		List<LibraryRecord> libraryRecords=new ArrayList<LibraryRecord>();
		libraryRecords.add(createLibraryRecord(2L, secondBook, simpleDateFormat.parse("1998/03/03"), null));
		
		when(libraryRecordDAO.findByBook(book)).thenReturn(libraryRecords);
		when(libraryRecordDAO.save((LibraryRecord)anyObject())).thenReturn(true);
		
		lendingManagerImpl.returnBook(book);
	}
	
	@Test(expected=IllegalStateException.class)
	public void shouldThrowIllegalStateExceptionWhenfindByBookReturnEmptyLibraryRecordList()
	{
		List<LibraryRecord> emptyList = new ArrayList<LibraryRecord>();
		
		when(libraryRecordDAO.findByBook(book)).thenReturn(emptyList);
		
		lendingManagerImpl.returnBook(book);
	}
	
	@Test(expected=IllegalStateException.class)
	public void showldThrowIllegalStateExceptionWhenSaveMethodReturnFalse() throws ParseException
	{
		List<LibraryRecord> libraryRecords=new ArrayList<LibraryRecord>();
		libraryRecords.add(createLibraryRecord(2L, secondBook, simpleDateFormat.parse("1998/03/03"), null));
		
		when(libraryRecordDAO.findByBook(book)).thenReturn(libraryRecords);
		when(libraryRecordDAO.save((LibraryRecord)anyObject())).thenReturn(false);
		
		lendingManagerImpl.returnBook(book);
	}
	
	@Test(expected=IllegalStateException.class)
	public void shouldThrowIllegalStateExceptionWhenReturningDateIsNotNull() throws ParseException{
		
		List<LibraryRecord> libraryRecords=new ArrayList<LibraryRecord>();
		libraryRecords.add(createLibraryRecord(2L, secondBook, simpleDateFormat.parse("1998/ 03/ 03"),simpleDateFormat.parse("1998/ 03/ 03")));
		
		when(libraryRecordDAO.findByBook(book)).thenReturn(libraryRecords);
		
		lendingManagerImpl.returnBook(book);
	}
	
	private LibraryRecord createLibraryRecord(Long id, Book book, Date borrowingDate, Date returningDate)
	{
		LibraryRecord libraryRecord=new LibraryRecord();
		libraryRecord.setId(id);
		libraryRecord.setBook(book);
		libraryRecord.setBorrowingDate(borrowingDate);
		libraryRecord.setReturningDate(returningDate);
		return libraryRecord;
	}

}
