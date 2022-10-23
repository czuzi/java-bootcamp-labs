package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

	Books books = new Books();

	@TempDir
	File tempDir;

	@Test
	void testMakeReadableFile() throws IOException {
		Path path = tempDir.toPath().resolve("books.txt");
		books.makeReadableFile(path);
		List<String> expected = Files.readAllLines(path);

		assertEquals(4, expected.size());
		assertEquals("Fekete Istvan: Tuskevar", expected.get(2));
	}
}