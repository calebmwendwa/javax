import com.sun.xml.internal.ws.wsdl.writer.document.Operation;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculateru implements ActionListener {
JFrame num1;
JPanel num2;
JTextField num3;
int edy=0;
int user;

    public static void main(String[] args) {
        /*event que invoke later enables you to do a processing after all GUI processes are finished*/
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new calculateru();
            }
        });
    }
    public calculateru(){
        num1=new JFrame();
        //MAKE SURE PROGRAM EXISTS WHEN FRAME CLOSES
        num1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        num1.setTitle("my calculator");
        num1.setSize(400,600);
        //centre JFrame
        num1.setLocationRelativeTo(null);
        num3=new JTextField();
        num3.setHorizontalAlignment(JTextField.RIGHT);
        num3.setEditable(false);
        num3.add(num3,BorderLayout.NORTH);
        num2=new JPanel();
        //MAKING THE GRID FOR THE CALC
        num2.setLayout(new GridLayout(4,3));
        num1.add(num2,BorderLayout.CENTER);
        //WE ADD BUTTONS
        for (int i=1; i<10; i++){
            addButton(num2, String.valueOf(i));
        }
            JButton addButton= new JButton("+");
            addButton.setActionCommand("+");
            OperatorAction subAction= new OperatorAction(1);

            addButton.addActionListener(subAction);
            JButton subButton=new JButton("-");
            subButton.setActionCommand("-");
            OperatorAction addAction=new OperatorAction(2);
            subButton.addActionListener(addAction);


            JButton equalsButton= new JButton("=");
            equalsButton.setActionCommand("=");
            equalsButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    if (!num3.getText().isEmpty()){
                        int number=Integer.parseInt(num3.getText());
                        if (edy==1){
                            int calculate =user+number;
                            num3.setText(Integer.toString(calculate));

                        } else if (edy== 2) {

                            int calculate=user-number;
                            num3.setText(Integer.toString(calculate));

                        }
                    }
                }
            });
            num1.add(addButton);
            num2.add(subButton);
            num3.add(equalsButton);
            num1.setVisible(true);
        }




private void addButton(Container parent, String name){
        JButton but =new JButton(name);
        but.setActionCommand(name);
        but.addActionListener(this);
        parent.add(but);



}
public void actionPerformed(ActionEvent event){
        //get action command text from the button
        String action= event.getActionCommand();
        //set text using the action command text
        num3.setText(action);


}
        private class OperatorAction implements ActionListener{
        private int operator;
        public OperatorAction(int operation){
            operator= operation;

        }
        public void actionPerformed(ActionEvent event){
            user=Integer.parseInt(num3.getText());
            edy=operator;

        }
}
}
