import java.util.Scanner;

public class Author {
    protected String Name = "yyus";

    public Author() {
    }

    public Author(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public String toString() {
        return "Tên tác giả" + Name;
    }
}
