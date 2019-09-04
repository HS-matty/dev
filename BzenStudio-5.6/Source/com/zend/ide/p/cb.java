package com.zend.ide.p;

import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

public class cb extends y
  implements cu
{
  protected JPanel b;
  protected Border c = BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createRaisedBevelBorder());

  public cb(String paramString1, String paramString2, Border paramBorder)
  {
    a(paramString1, paramString2, paramBorder);
  }

  public cb(String paramString1, String paramString2)
  {
    a(paramString1, paramString2);
  }

  private void a(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, BorderFactory.createCompoundBorder(this.c, BorderFactory.createEmptyBorder(8, 10, 10, 8)));
  }

  private void a(String paramString1, String paramString2, Border paramBorder)
  {
    setIconImage(cv.b("application32.gif").getImage());
    setTitle(paramString1);
    setResizable(false);
    JPanel localJPanel1 = new JPanel(new BorderLayout(0, 0));
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    localJPanel2.add(a(paramString2), "Center");
    localJPanel2.setBorder(paramBorder);
    localJPanel1.add(localJPanel2, "Center");
    localJPanel1.add(c(), "South");
    getContentPane().add(localJPanel1);
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
    localJTextPane.addHyperlinkListener(new bz(this));
    return localJTextPane;
  }

  protected JPanel c()
  {
    this.b = new JPanel(new FlowLayout(2));
    w localw = new w(ct.b(329));
    localw.addActionListener(new ca(this));
    this.b.add(localw);
    return this.b;
  }

  public void setVisible(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      pack();
      Dimension localDimension1 = Toolkit.getDefaultToolkit().getScreenSize();
      Dimension localDimension2 = getSize();
      setLocation((localDimension1.width - localDimension2.width) / 2, (localDimension1.height - localDimension2.height) / 2);
      requestFocus();
    }
    super.setVisible(paramBoolean);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.cb
 * JD-Core Version:    0.6.0
 */