import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class DailyQuoteGUI extends JFrame {
    private String[] quotes = {
        "Keep going, you're doing amazing.",
        "Every day is a fresh start.",
        "Believe in yourself and all that you are.",
        "Be a rainbow in someone else's cloud.",
        "Small steps every day lead to big results.",
        "Happiness blooms from within.",
        "Good things take time, be patient."
    };

    private JLabel quoteLabel;

    public DailyQuoteGUI() {
        // Frame setup
        setTitle("Daily Quote Generator");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10)); // spacing
        getContentPane().setBackground(new Color(245, 245, 245)); // soft background

        // Quote text
        quoteLabel = new JLabel("Click the button to get a quote", SwingConstants.CENTER);
        quoteLabel.setFont(new Font("Serif", Font.PLAIN, 16));
        quoteLabel.setForeground(new Color(40, 40, 40));
        add(quoteLabel, BorderLayout.CENTER);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(245, 245, 245));
        JButton button = new JButton("Get Quote");
        button.setFont(new Font("SansSerif", Font.BOLD, 14));
        button.setFocusPainted(false);
        button.setBackground(new Color(220, 220, 220));
        button.setPreferredSize(new Dimension(120, 35));

        // Button Action
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int index = random.nextInt(quotes.length);
                quoteLabel.setText(quotes[index]);
            }
        });

        buttonPanel.add(button);
        add(buttonPanel, BorderLayout.SOUTH);

        // Center screen
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DailyQuoteGUI().setVisible(true);
        });
    }
}
