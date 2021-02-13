package main;

import org.apache.tools.ant.types.selectors.SelectSelector;

import org.junit.*;

import javax.swing.*;

import static org.junit.Assert.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Caesar
{
    //Declare a public static String encrypt
    public static String encrypt(String plainText, int shift)
    {
        if (shift > 26)
        {
            shift = shift % 26;

        } else if (shift < 0) {
            shift = (shift % 26) + 26;
        }
        String cipherText = "";
        int length = plainText.length();

        for (int i = 0; i < length; i++)
        {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    char c = (char) (ch + shift);
                    if (c > 'z') {
                        cipherText += (char) (ch - (26 - shift));
                    } else {

                        cipherText += c;
                    }
                } else if (Character.isUpperCase(ch)) {
                    char c = (char) (ch + shift);
                    if (c > 'Z') {
                        cipherText += (char) (ch - (26 - shift));
                    } else {
                        cipherText += c;
                    }
                }
                else
                    {
                    cipherText += ch;
                }
            }




        }
         return cipherText; 
    }
    public static String decrypt(String plainText, int shift)
    {
        if (shift>26)
        {
            shift = shift % 26;

        } else if (shift < 0) {
            shift = (shift % 26) + 26;
        }
        String cipherText = "";
        int length = plainText.length();

        for (int i = 0; i < length; i++) {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    char c = (char)(ch - shift);
                    if (c < 'a') {
                        cipherText += (char) (ch +(26 - shift));
                    } else {

                        cipherText += c;
                    }
                } else if (Character.isUpperCase(ch)) {
                    char c = (char) (ch - shift);
                    if (c < 'A') {
                        cipherText += (char) (ch + (26 - shift));
                    } else {
                        cipherText += c;
                    }
                }
                else
                {
                    cipherText += ch;
                }
            }




        }
        return cipherText;
    }









}








