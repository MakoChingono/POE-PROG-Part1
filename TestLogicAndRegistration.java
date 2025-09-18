/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testlogicandregistration;
// Login and Registration System
  Assisted using ChatGPT (OpenAI, 2025)
  https://chat.openai.com/
  Date of assistance: September 3–18, 2025
/**
 *
 * @author RC_Student_lab
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestLogicAndRegistration{
    
    private JFrame frame;
    private JTextField userField, cellField;
    private JPasswordField passField;
    private JButton registerBtn;
    private JTextArea resultArea;
    private Login registeredUser; // Logic class

    public TestLogicAndRegistration() {
        frame = new JFrame("Registration Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(0, 102, 204));
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        userField = new JTextField();
        passField = new JPasswordField();
        cellField = new JTextField();
        registerBtn = new JButton("Register");
        resultArea = new JTextArea();
        resultArea.setEditable(false);

        // Add components
        frame.add(new JLabel("Username:")); frame.add(userField);
        frame.add(new JLabel("Password:")); frame.add(passField);
        frame.add(new JLabel("Cell Number (+27...):")); frame.add(cellField);
        frame.add(new JLabel()); frame.add(registerBtn);
        frame.add(new JLabel("Result:")); frame.add(resultArea);

        // Handle button click using anonymous inner class
        registerBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());
                String cellNumber = cellField.getText();

                registeredUser = new Login(username, password, cellNumber);
                String result = registeredUser.registerUser();
                resultArea.setText(result);

                if (result.contains("successfully")) {
                    JOptionPane.showMessageDialog(frame, "Registration Complete!");
                }
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TestLogicAndRegistration();

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
        // Registration components
  
    // Login components
    }
    
}

