package com.temp.folder.rule;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class TemporaryFolderTest {

	@Rule
	public TemporaryFolder folder=new TemporaryFolder();
	
	 @Test
	    public void testCreateFile() throws IOException{
	        File file = folder.newFile("test1.txt");
	        assertTrue(file.exists());
	    }
	 @Test
	    public void testCreateFolder() throws IOException{
	        File file = folder.newFolder("testfolder");
	        assertTrue(file.exists());
	    }
}
