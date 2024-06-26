package OOPS.Methods;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordValidatorGUI {
    private JFrame frame;
    private JPanel panel;
    private JLabel infoLabel;
    private JTextField passwordField;
    private JButton validateButton;

    public PasswordValidatorGUI() {
        frame = new JFrame("Password Validator");
        panel = new JPanel();
        infoLabel = new JLabel("<html>Password should start with a capital letter and only contain alphanumeric values, '@', '_', or '$'.</html>");
        passwordField = new JTextField(20);
        validateButton = new JButton("Validate");

        panel.setLayout(new FlowLayout());
        panel.add(infoLabel);
        panel.add(new JLabel("Enter a password: "));
        panel.add(passwordField);
        panel.add(validateButton);

        validateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = passwordField.getText();
                int result = PasswordValidator.isValid(password);
                if(result == 1){
                    JOptionPane.showMessageDialog(frame, "Valid Password", "Password Validation", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(frame, "Invalid Password", "Password Validation", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PasswordValidatorGUI();
            }
        });
    }
}

