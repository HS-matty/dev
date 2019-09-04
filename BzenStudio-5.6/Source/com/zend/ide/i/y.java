package com.zend.ide.i;

import com.zend.ide.p.w;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

public class y extends n
  implements cu
{
  protected JPanel c;
  private Border d = BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createRaisedBevelBorder());

  public y(Frame paramFrame, String paramString1, String paramString2)
  {
    super(paramFrame);
    a(paramString1, paramString2);
  }

  public y(Dialog paramDialog, String paramString1, String paramString2)
  {
    super(paramDialog);
    a(paramString1, paramString2);
  }

  public y(Frame paramFrame, String paramString1, String paramString2, String paramString3)
  {
    super(paramFrame);
    a(paramString1, paramString2, paramString3);
  }

  private void a(String paramString1, String paramString2)
  {
    setTitle(paramString1);
    setModal(true);
    setResizable(false);
    JPanel localJPanel1 = new JPanel(new BorderLayout(0, 0));
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    localJPanel2.add(a(paramString2), "Center");
    localJPanel2.setBorder(BorderFactory.createCompoundBorder(this.d, BorderFactory.createEmptyBorder(8, 10, 10, 8)));
    localJPanel1.add(localJPanel2, "Center");
    localJPanel1.add(c(), "South");
    getContentPane().add(localJPanel1);
  }

  private void a(String paramString1, String paramString2, String paramString3)
  {
    setTitle(paramString1);
    setModal(true);
    setResizable(false);
    JPanel localJPanel1 = new JPanel(new BorderLayout(0, 3));
    localJPanel1.add(new JLabel(paramString2), "Center");
    localJPanel1.add(a(paramString3), "South");
    localJPanel1.setBorder(BorderFactory.createCompoundBorder(this.d, BorderFactory.createEmptyBorder(20, 10, 5, 10)));
    JPanel localJPanel2 = new JPanel(new BorderLayout(0, 0));
    localJPanel2.add(localJPanel1, "Center");
    localJPanel2.add(c(), "South");
    getContentPane().add(localJPanel2);
  }

  private JTextPane a(String paramString)
  {
    HTMLEditorKit localHTMLEditorKit = new HTMLEditorKit();
    HTMLDocument localHTMLDocument = (HTMLDocument)localHTMLEditorKit.createDefaultDocument();
    JTextPane localJTextPane = new JTextPane();
    localJTextPane.setEditable(false);
    localJTextPane.setOpaque(false);
    localJTextPane.setDocument(localHTMLDocument);
    localJTextPane.setEditorKit(localHTMLEditorKit);
    localHTMLEditorKit.install(localJTextPane);
    String str = "<html><body><font face=\"Dialog,Arial,Helvetica\" size=\"-1\">";
    str = str + paramString;
    str = str + "<br></body</html>";
    localJTextPane.setText(str);
    localJTextPane.setBorder(BorderFactory.createEmptyBorder());
    localJTextPane.addHyperlinkListener(new t(this));
    return localJTextPane;
  }

  protected JPanel c()
  {
    this.c = new JPanel(new FlowLayout(2));
    w localw = new w(ct.b(329));
    localw.addActionListener(new u(this));
    this.c.add(localw);
    return this.c;
  }

  public void e()
  {
    pack();
    B();
    requestFocus();
    super.setVisible(true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.i.y
 * JD-Core Version:    0.6.0
 */