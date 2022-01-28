import static org.junit.Assert.*;
import org.junit.*;
import java.beans.Transient;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;

public class MarkdownParseTest
{
    @Test
    public void addition() 
    {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void firstFile()
    {  
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        System.out.println(links);
        assertEquals("https://something.com", "some-page.html"),
        MarkdownParse.getLinks("test-file.md");
        assertEquals("https://something.com", links.get(0));
    }

    
}