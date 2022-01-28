import static org.junit.Assert.*;
import java.beans.Transient;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest
{
    @Test
    public void addition() 
    {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void firstFile() throws IOException
    {
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        assertEquals("https://something.com", links.get(0));
        assertEquals("some-page.html", links.get(1));

    }

    @Test
    public void secondFile() throws IOException
    {
        Path fileName = Path.of("test-file2.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        assertEquals("https://something.com", links.get(0));
        assertEquals("some-page.html", links.get(1));

    }


}