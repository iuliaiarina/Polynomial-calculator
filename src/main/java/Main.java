import Controller.Controller;
import Model.Polynomial;
import View.View;

public class Main {
    public static void main(String[] args){
        View view = new View();
        view.setVisible(true);
        Controller controller=new Controller(view);
    }
}
