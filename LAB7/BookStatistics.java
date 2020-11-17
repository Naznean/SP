
public class BookStatistics implements Visitor {
    private int imagesCounter = 0;
    private int tablesCounter = 0;
    private int paragraphsCounter = 0;
    private int sectionCounter=0;
    private int book=0;

    public void visit(Image image){imagesCounter++;}
    public void visit(ImageProxy imageProxy){imagesCounter++;}

    public void visit(Book b) {
        book++;
    }

    public void visit(Section s) { sectionCounter++;}

    public void visit(Paragraph paragraph){paragraphsCounter++;}

    public void visit(Table table){tablesCounter++;}

    public void printStatistics(){
        System.out.println("Book Statistics: ");
        System.out.println("**** number of images: " + imagesCounter);
        System.out.println("**** number of tables: " +tablesCounter);
        System.out.println("*** number of paragraphs: "+ paragraphsCounter);
        System.out.println("*** number of sections:" + sectionCounter);
    }

}