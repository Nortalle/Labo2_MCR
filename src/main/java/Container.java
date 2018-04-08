import javax.swing.*;

public class Container extends JFrame {

    public Container(){
        super("My Frame");

        //you can set the content pane of the frame
        //to your custom class.
        Forms forms = new Forms();

        setContentPane(forms);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(Display.getInstance().getWidth(), Display.getInstance().getHeight());

        setVisible(true);

        new Thread(new BounceApp(forms)).start();
    }

    public static void main(String args[]){
        new Container();
    }

}