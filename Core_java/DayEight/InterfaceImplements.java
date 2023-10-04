package DayEight;

interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing a document");
    }
}

public class InterfaceImplements {
    public static void main(String[] args) {
        Printable document = new Document();
        document.print();
    }
}

