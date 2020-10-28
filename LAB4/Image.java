import java.util.concurrent.TimeUnit;

public class Image implements Element {
    String imageName;



    public void Image(String imageName){
        this.imageName=imageName;
    }

    public String getImageNameName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
    Image(String Name) {
        imageName = Name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print(){
        System.out.println(this.imageName);
    }
}