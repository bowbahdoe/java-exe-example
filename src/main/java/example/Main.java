package example;

import org.apache.commons.text.WordUtils;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        var label = new JLabel("Hello, World!");
        label.setFont(new Font("Serif", Font.PLAIN,72));

        var uppercaseButton = new JButton("Uppercase");
        uppercaseButton.addActionListener(e -> {
            label.setText(WordUtils.capitalize(label.getText()));
        });

        var lowercaseButton = new JButton("lowercase");
        lowercaseButton.addActionListener(e -> {
            label.setText(WordUtils.uncapitalize(label.getText()));
        });

        var panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(label);
        panel.add(uppercaseButton);
        panel.add(lowercaseButton);

        var frame = new JFrame("Basic Program");
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}