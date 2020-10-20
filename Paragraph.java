public class Paragraph implements Element{
    public String text;


    Paragraph(String text){
        this.text=text;
    }



    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }


    public void print(){
        System.out.println(this.text);
    }
}