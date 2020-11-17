public class Table implements Element{
    public String title;


    Table(String title){
        this.title=title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


    public String toString() {
        return "Table{" +
                "title='" + title + '\'' +
                '}';
    }
    public void print(){
        System.out.println(this.title);
    }
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}