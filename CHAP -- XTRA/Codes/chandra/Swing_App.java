import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Swing_App {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
                public void run() {
                    JFrame frame = new DesktopAppFrame();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
            });
    }
}

class DesktopAppFrame extends JFrame {
    public DesktopAppFrame() {
        setLayout(new GridBagLayout());
        final JFileChooser chooser = new JFileChooser();
        JButton fileChooserButton = new JButton("...");
        final JTextField fileField = new JTextField(20);
        fileField.setEditable(false);
        JButton openButton = new JButton("Open");
        JButton editButton = new JButton("Edit");
        JButton printButton = new JButton("Print");
        final JTextField browseField = new JTextField();
        JButton browseButton = new JButton("Browse");
        final JTextField toField = new JTextField();
        final JTextField subjectField = new JTextField();
        JButton mailButton = new JButton("Mail");

        openButton.setEnabled(false);
        editButton.setEnabled(false);
        printButton.setEnabled(false);
        browseButton.setEnabled(false);
        mailButton.setEnabled(false);

        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.OPEN))
                openButton.setEnabled(true);
            if (desktop.isSupported(Desktop.Action.EDIT))
                editButton.setEnabled(true);
            if (desktop.isSupported(Desktop.Action.PRINT))
                printButton.setEnabled(true);
            if (desktop.isSupported(Desktop.Action.BROWSE))
                browseButton.setEnabled(true);
            if (desktop.isSupported(Desktop.Action.MAIL))
                mailButton.setEnabled(true);
        }

        fileChooserButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (chooser.showOpenDialog(DesktopAppFrame.this) == JFileChooser.APPROVE_OPTION)
                        fileField.setText(chooser.getSelectedFile().getAbsolutePath());
                }
            });

        openButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        Desktop.getDesktop().open(chooser.getSelectedFile());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            });

        editButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        Desktop.getDesktop().edit(chooser.getSelectedFile());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            });

        printButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        Desktop.getDesktop().print(chooser.getSelectedFile());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            });

        browseButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        Desktop.getDesktop().browse(new URI(browseField.getText()));
                    } catch (URISyntaxException ex) {
                        ex.printStackTrace();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            });

        mailButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        String subject = percentEncode(subjectField.getText());
                        URI uri = new URI("mailto:" + toField.getText() + "?subject=" + subject);

                        System.out.println(uri);
                        Desktop.getDesktop().mail(uri);
                    } catch (URISyntaxException ex) {
                        ex.printStackTrace();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            });

        JPanel buttonPanel = new JPanel();
        ((FlowLayout) buttonPanel.getLayout()).setHgap(2);
        buttonPanel.add(openButton);
        buttonPanel.add(editButton);
        buttonPanel.add(printButton);

        add(fileChooserButton, new GBC(0, 0).setAnchor(GBC.EAST).setInsets(2));
        add(fileField, new GBC(1, 0).setFill(GBC.HORIZONTAL));
        add(buttonPanel, new GBC(2, 0).setAnchor(GBC.WEST).setInsets(0));
        add(browseField, new GBC(1, 1).setFill(GBC.HORIZONTAL));
        add(browseButton, new GBC(2, 1).setAnchor(GBC.WEST).setInsets(2));
        add(new JLabel("To:"), new GBC(0, 2).setAnchor(GBC.EAST).setInsets(5, 2, 5, 2));
        add(toField, new GBC(1, 2).setFill(GBC.HORIZONTAL));
        add(mailButton, new GBC(2, 2).setAnchor(GBC.WEST).setInsets(2));
        add(new JLabel("Subject:"), new GBC(0, 3).setAnchor(GBC.EAST).setInsets(5, 2, 5, 2));
        add(subjectField, new GBC(1, 3).setFill(GBC.HORIZONTAL));

        pack();
    }

    private static String percentEncode(String s) {
        try {
            return URLEncoder.encode(s, "UTF-8").replaceAll("[+]", "%20");
        } catch (UnsupportedEncodingException ex) {
            return null; 
        }
    }
}

class GBC extends GridBagConstraints {
    public GBC(int gridx, int gridy) {
        this.gridx = gridx;
        this.gridy = gridy;
    }

    public GBC(int gridx, int gridy, int gridwidth, int gridheight) {
        this.gridx = gridx;
        this.gridy = gridy;
        this.gridwidth = gridwidth;
        this.gridheight = gridheight;
    }

    public GBC setAnchor(int anchor) {
        this.anchor = anchor;
        return this;
    }

    public GBC setFill(int fill) {
        this.fill = fill;
        return this;
    }

    public GBC setWeight(double weightx, double weighty) {
        this.weightx = weightx;
        this.weighty = weighty;
        return this;
    }

    public GBC setInsets(int distance) {
        this.insets = new Insets(distance, distance, distance, distance);
        return this;
    }

    public GBC setInsets(int top, int left, int bottom, int right) {
        this.insets = new Insets(top, left, bottom, right);
        return this;
    }

    public GBC setIpad(int ipadx, int ipady) {
        this.ipadx = ipadx;
        this.ipady = ipady;
        return this;
    }
}

