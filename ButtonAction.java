import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;//will be needed for JFrame

class Demo extends JFrame{
    private JPanel panel;
    private JButton button;
    private JLabel messageLable;
    private JTextField textingField;
    private final int WIDTH =300;
    private final int HEIGHT = 400;


public Demo(){

    setTitle("ActionListers Trial");
    setSize(WIDTH, HEIGHT);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    //call the build method
    buildPanel();


    //add the panel
    add(panel);


    //Window visibility
    setVisible(true);

}



public void buildPanel(){
    button = new JButton("Submit");
    messageLable = new JLabel("Enter your name");
    textingField = new JTextField(12);//the text field will have 12 columns
    messageLable.setForeground(Color.yellow);
    button.setBackground(Color.yellow);
    button.setForeground(Color.BLACK);
    panel = new JPanel();


    panel.add(messageLable);
    panel.add(textingField);
    panel.add(button);
    panel.setBackground(Color.BLACK);
}

public void setbuttonActionListers(){
    ActionListener buttonListener = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "Submitted");
        }
        
    };

    button.addActionListener(buttonListener);
}

}




public class ButtonAction {
    public static void main(String []args){

        Demo obj = new Demo();
        

        obj.setbuttonActionListers();
    }
       

    }
    

