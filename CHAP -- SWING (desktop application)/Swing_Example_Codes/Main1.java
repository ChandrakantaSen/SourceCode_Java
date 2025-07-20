import java.awt.Color;

import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

public class Main1 {
  public static void main(String[] argv) throws Exception {
    JTextArea textComp = new JTextArea();

    Highlighter hilite = textComp.getHighlighter();
    Highlighter.Highlight[] hilites = hilite.getHighlights();

    for (int i = 0; i < hilites.length; i++) {
      if (hilites[i].getPainter() instanceof MyHighlightPainter) {
        hilite.removeHighlight(hilites[i]);
      }
    }
    highlight(textComp);
  }
  public static void highlight(JTextComponent textComp) {
    try {
      Highlighter hilite = textComp.getHighlighter();
      Document doc = textComp.getDocument();
      hilite.addHighlight(3, 5, new MyHighlightPainter(Color.red));
    } catch (BadLocationException e) {
      e.printStackTrace();
    }
  }
}

class MyHighlightPainter extends DefaultHighlighter.DefaultHighlightPainter {
  public MyHighlightPainter(Color color) {
    super(color);
  }
}

