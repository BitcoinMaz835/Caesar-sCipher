//This is the Front end of the Application

package main;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

public class App extends Caesar {

    //These are the UI components.I used Swing UI because I found it easier to implement than other UI libraries.

    private static Object JFrame;
    private JTextField encrypt_input;
    private JSpinner encrypt_key_shift;
    private JTextField decrypt_output;
    private JSpinner decrypt_key_shift;
    private JButton encryptButton;
    private JButton decryptButton;
    private JPanel caesars_cipher_panel;
    private JLabel caesars_cipher_title;
    private JTextField encrypt_output;

    //Define global variables outside the class.
    String encrypted_text = "";
    Integer encrypt_shift_value;
    Integer decrypt_shift_value;






    private JButton button_msg;
        private JPanel getCaesars_cipher_panel;


    public App()
        {


            encryptButton.addActionListener(new ActionListener()
            {

                @Override
                public void actionPerformed(ActionEvent actionEvent)
                {
                    //Define local variables within the encrypt button event listener

                    String encrypt_text = encrypt_input.getText();
                    String cipher = encrypt(encrypt_text,encrypt_shift_value);
                    JOptionPane.showMessageDialog(null,encrypt_text);
                    encrypt_output.setText(cipher);



                }
            });





            encrypt_key_shift.addChangeListener(new ChangeListener()
            {
                @Override
                public void stateChanged(ChangeEvent changeEvent)
                {

                        Integer encrypt_keyvalue = (Integer) encrypt_key_shift.getValue();
                        JOptionPane.showMessageDialog(null,encrypt_keyvalue);
                        encrypt_shift_value = encrypt_keyvalue;
                }
            });

            decrypt_key_shift.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent changeEvent)
                {
                    Integer decrypt_keyvalue = (Integer) decrypt_key_shift.getValue();
                    JOptionPane.showMessageDialog(null,decrypt_keyvalue);
                    decrypt_shift_value = decrypt_keyvalue;

                }
            });
            decryptButton.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent actionEvent)
                {

                    String decrypt_text = encrypt_output.getText();
                    String decrypted = decrypt(decrypt_text,decrypt_shift_value);
                    JOptionPane.showMessageDialog(null,decrypt_text);
                    decrypt_output.setText(decrypted);




                }
            });
        }



    public static void main (String[]args)

        {
            JFrame frame = new JFrame("CaesarsCipher");
            frame.setContentPane(new App().caesars_cipher_panel);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);


        }
    }
