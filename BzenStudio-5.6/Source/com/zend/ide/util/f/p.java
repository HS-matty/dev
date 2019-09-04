package com.zend.ide.util.f;

import com.zend.ide.p.bd;
import com.zend.ide.p.e.d;
import com.zend.ide.p.w;
import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

class p extends JPanel
{
  private Action a = new m(this);
  private Action b = new l(this);
  public JTextField c;
  public JTextField d;
  final g e;

  public p(g paramg)
  {
    setLayout(new BorderLayout());
    add(f(), "Center");
    add(b(), "South");
    d();
  }

  protected Component f()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    JPanel localJPanel2 = new JPanel();
    localJPanel1.setBorder(BorderFactory.createBevelBorder(1));
    localJPanel2.setLayout(new GridBagLayout());
    z localz1 = new z(ct.a(470));
    localz1.setFont(localz1.getFont().deriveFont(1));
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.insets = new Insets(0, 10, 10, 10);
    localGridBagConstraints.anchor = 17;
    localJPanel2.add(localz1, localGridBagConstraints);
    this.c = new bd(45);
    localGridBagConstraints.gridwidth = 0;
    localGridBagConstraints.insets = new Insets(0, 10, 10, 10);
    localJPanel2.add(this.c, localGridBagConstraints);
    z localz2 = new z(ct.a(471));
    localz2.setFont(localz2.getFont().deriveFont(1));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.insets = new Insets(10, 10, 3, 10);
    localGridBagConstraints.anchor = 17;
    localJPanel2.add(localz2, localGridBagConstraints);
    this.d = new bd(45);
    localGridBagConstraints.gridwidth = 0;
    localGridBagConstraints.insets = new Insets(10, 10, 3, 10);
    localJPanel2.add(this.d, localGridBagConstraints);
    localJPanel1.add(c(), "North");
    localJPanel1.add(localJPanel2, "Center");
    localJPanel1.add(e(), "South");
    return localJPanel1;
  }

  public void requestFocus()
  {
    this.c.requestFocus();
  }

  protected Component b()
  {
    JPanel localJPanel = new JPanel();
    localJPanel.setLayout(new FlowLayout(2));
    localJPanel.setBorder(new EmptyBorder(10, 0, 10, 0));
    JButton localJButton1 = new JButton(ct.a(116));
    localJButton1.addActionListener(this.a);
    localJPanel.add(localJButton1);
    w localw1 = new w(ct.b(480));
    Dimension localDimension = (Dimension)com.zend.ide.p.e.b.d.clone();
    localDimension.width = 150;
    localw1.setPreferredSize(localDimension);
    localw1.addActionListener(new u(this));
    w localw2 = new w(ct.b(495));
    localw2.addActionListener(new v(this));
    localJPanel.add(localw2);
    JButton localJButton2 = new JButton(ct.a(117));
    localJButton2.addActionListener(this.b);
    localJPanel.add(localJButton2);
    d.b(new JButton[] { localw2, localJButton1, localJButton2 });
    return localJPanel;
  }

  protected Component c()
  {
    return a(ct.a(884), -1, false);
  }

  protected Component e()
  {
    JPanel localJPanel = new JPanel(new BorderLayout());
    localJPanel.add(a(ct.a(880), -2, false), "North");
    return localJPanel;
  }

  protected void d()
  {
    ActionMap localActionMap = getActionMap();
    InputMap localInputMap = getInputMap(1);
    KeyStroke localKeyStroke1 = KeyStroke.getKeyStroke(27, 0);
    String str1 = "escapeKey.close";
    localInputMap.put(localKeyStroke1, str1);
    localActionMap.put(str1, this.b);
    KeyStroke localKeyStroke2 = KeyStroke.getKeyStroke(10, 0);
    String str2 = "enterKey.enter";
    localInputMap.put(localKeyStroke2, str2);
    localActionMap.put(str2, this.a);
  }

  private JPanel a(String paramString, int paramInt, boolean paramBoolean)
  {
    HTMLEditorKit localHTMLEditorKit = new HTMLEditorKit();
    HTMLDocument localHTMLDocument = (HTMLDocument)localHTMLEditorKit.createDefaultDocument();
    JTextPane localJTextPane = new JTextPane();
    if (!paramBoolean)
      localJTextPane.setFocusable(false);
    localJTextPane.addMouseListener(new c(this, localJTextPane));
    localJTextPane.addFocusListener(new b(this, localJTextPane));
    JPanel localJPanel = new JPanel(new BorderLayout(0, 0));
    localJPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
    localJTextPane.setEditable(false);
    localJTextPane.setOpaque(false);
    localJTextPane.setDocument(localHTMLDocument);
    localJTextPane.setEditorKit(localHTMLEditorKit);
    localHTMLEditorKit.install(localJTextPane);
    String str1 = "size=\"" + paramInt + "\"";
    String str2 = "<html><body><font face=\"Dialog,Arial,Helvetica\"" + str1 + ">";
    str2 = str2 + paramString;
    str2 = str2 + "<br></body></html>";
    localJTextPane.setText(str2);
    localJTextPane.setBorder(BorderFactory.createEmptyBorder());
    localJTextPane.addHyperlinkListener(new s(this));
    localJPanel.add(localJTextPane, "Center");
    return localJPanel;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.f.p
 * JD-Core Version:    0.6.0
 */