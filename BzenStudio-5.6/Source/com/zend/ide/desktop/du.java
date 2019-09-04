package com.zend.ide.desktop;

import com.zend.ide.i.n;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import com.zend.ide.util.ds;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

public class du extends n
  implements cu
{
  public du(JFrame paramJFrame)
  {
    super(paramJFrame, ct.a(120), false);
    c();
    a(getRootPane());
    setResizable(false);
    addWindowFocusListener(new j(this));
  }

  private void c()
  {
    dy localdy = new dy(cv.a("zendlogotop.gif"));
    localdy.setBackground(Color.white);
    Dimension localDimension = new Dimension(localdy.getPreferredSize());
    localDimension.height -= 40;
    localdy.setPreferredSize(localDimension);
    JPanel localJPanel = new JPanel(new BorderLayout());
    localJPanel.add(localdy, "North");
    localJPanel.add(e(), "Center");
    localJPanel.add(new er(this, null), "South");
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(localJPanel);
    pack();
    B();
  }

  private static JTextPane e()
  {
    HTMLEditorKit localHTMLEditorKit = new HTMLEditorKit();
    HTMLDocument localHTMLDocument = (HTMLDocument)localHTMLEditorKit.createDefaultDocument();
    JTextPane localJTextPane = new JTextPane();
    localJTextPane.setEditable(false);
    localJTextPane.setDocument(localHTMLDocument);
    localJTextPane.setEditorKit(localHTMLEditorKit);
    localHTMLEditorKit.install(localJTextPane);
    localJTextPane.setText("<html><body><table width='100%' cellpadding='0' cellspacing='0'><tr><td width='245' height='40'>&nbsp;</td><td valign='top' align='left'><font color='#4B5A64' face='Tahoma,Dialog,Arial,Helvetica' size='-2'>" + ct.a(753) + "<a href=#><font color='#336699'>www.zend.com</font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>" + "</tr>" + "</table></body</html>");
    localJTextPane.addHyperlinkListener(new k());
    return localJTextPane;
  }

  private static void a(JComponent paramJComponent)
  {
    KeyStroke localKeyStroke = KeyStroke.getKeyStroke(27, 0);
    ActionMap localActionMap = paramJComponent.getActionMap();
    InputMap localInputMap = paramJComponent.getInputMap();
    localInputMap.put(localKeyStroke, "close");
    localActionMap.put("close", new ds());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.du
 * JD-Core Version:    0.6.0
 */