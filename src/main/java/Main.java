import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        List<Book> book= new ArrayList<>();
        book.add(new Book(1,"lutete","gloire"));
        book.add(new Book(12,"1lutete","32gloire"));
        book.add(new Book(13,"2lutete","323gloire"));

        ObjectMapper om = new ObjectMapper();
        System.out.println(om.writeValueAsString(book));

    }
}
