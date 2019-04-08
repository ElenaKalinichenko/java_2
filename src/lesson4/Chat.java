package lesson4;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chat extends JFrame {
    public Chat() throws HeadlessException {
        setTitle("Чат");
        setBounds(300, 300, 500, 600);

        setDefaultCloseOperation(Chat.EXIT_ON_CLOSE);


        JPanel jPanelWindows = new JPanel();
        JPanel jPanelBotton = new JPanel();

        add(jPanelBotton, BorderLayout.SOUTH);
        add(jPanelWindows, BorderLayout.CENTER);

        jPanelBotton.setPreferredSize(new Dimension(1, 40));

        add(jPanelBotton, BorderLayout.SOUTH);
        add(jPanelWindows, BorderLayout.CENTER);

        jPanelWindows.setLayout(new BorderLayout());
        jPanelBotton.setLayout(new FlowLayout());

        JButton jButtonEnter = new JButton("Ответ");

        JTextArea jTextChat = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(jTextChat);
        jPanelWindows.add(jScrollPane, BorderLayout.CENTER);

        JTextField jTextMessage = new JTextField();

        jPanelBotton.add(jTextMessage);
        jPanelBotton.add(jButtonEnter);

        jTextMessage.setPreferredSize(new Dimension(400, 30));
        jTextChat.setEditable(false);


        jButtonEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextChat.append(jTextMessage.getText() + "\n");
                jTextMessage.setText("");
                jTextMessage.grabFocus();
            }
        });

        setVisible(true);
    }
}
