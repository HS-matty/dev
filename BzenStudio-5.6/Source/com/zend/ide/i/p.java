package com.zend.ide.i;

import com.zend.ide.o.n.o;
import com.zend.ide.p.bb;
import com.zend.ide.p.e.d;
import com.zend.ide.p.x;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.ex;
import com.zend.ide.util.f.i;
import com.zend.ide.y.b;
import com.zend.ide.y.e;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxEditor;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.plaf.basic.BasicComboBoxEditor;
import javax.swing.text.Document;

public class p extends n
  implements cu
{
  protected int c = 0;
  protected int d;
  protected JComboBox e;
  protected JComboBox f;
  protected bb g;
  protected bb h;
  protected bb i;
  protected bb p;
  protected bb q;
  protected x j;
  protected Action k;
  protected JButton o;
  protected Action l;
  protected JTextArea b;
  protected e m;
  protected PropertyChangeListener n = new h(this, null);

  public p()
  {
    this(null);
  }

  public p(Frame paramFrame)
  {
    super(paramFrame, true);
    k();
    c();
    a(false);
    pack();
    B();
    setResizable(false);
  }

  protected void c()
  {
    com.zend.ide.y.f localf = new com.zend.ide.y.f();
    this.m = new e(localf);
    localf.a("debugging.serverHost", this.n);
    this.m.a("debugging.serverHost");
  }

  public boolean s()
  {
    return this.p.isSelected();
  }

  protected String q()
  {
    String str = ex.b(this.d);
    str = str + "&send_sess_end=1";
    str = str + "&debug_no_cache=" + System.currentTimeMillis();
    return str;
  }

  public String f()
  {
    String str = ((String)this.e.getSelectedItem()).trim();
    return b(str);
  }

  public String g()
  {
    String str = ((String)this.f.getSelectedItem()).trim();
    return b(str);
  }

  public void a(String paramString)
  {
    String str = b(paramString);
    this.e.setSelectedItem(str);
    this.f.setSelectedItem(str);
  }

  private void c(String paramString)
  {
    a(paramString);
  }

  private static String b(String paramString)
  {
    if ((paramString == null) || (paramString.equals("")))
      return "";
    if (paramString.equals("http://" + ct.a(42) + "/"))
      return "";
    paramString = paramString.replaceAll(" ", "%20");
    if (paramString.indexOf("://") == -1)
      return "http://" + paramString;
    return paramString;
  }

  public void a(int paramInt)
  {
    this.d = paramInt;
  }

  public int h()
  {
    return this.c;
  }

  public boolean i()
  {
    return this.h.isSelected();
  }

  public boolean j()
  {
    return this.i.isSelected();
  }

  protected String r()
  {
    return null;
  }

  private void k()
  {
    this.k = new i(new k(this), ct.a(1544), this);
    this.l = new j(this);
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(l(), "North");
    getContentPane().add(n(), "Center");
    getContentPane().add(m(), "South");
    p();
    pack();
  }

  protected Component l()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    com.zend.ide.p.z localz = new com.zend.ide.p.z(ct.b(713));
    this.e = new m(this);
    localz.setLabelFor(this.e.getEditor().getEditorComponent());
    this.f = new m(this);
    BasicComboBoxEditor localBasicComboBoxEditor = (BasicComboBoxEditor)this.e.getEditor();
    ((JTextField)localBasicComboBoxEditor.getEditorComponent()).getDocument().addDocumentListener(new f(this));
    this.g = new bb(ct.b(714));
    this.h = new bb(ct.b(715));
    this.i = new bb(ct.b(716));
    this.j = new x(ct.b(717));
    ButtonGroup localButtonGroup = new ButtonGroup();
    localButtonGroup.add(this.g);
    localButtonGroup.add(this.h);
    localButtonGroup.add(this.i);
    this.g.setSelected(true);
    o();
    localz.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
    localJPanel1.add(localz, "West");
    localJPanel1.add(this.e, "Center");
    localJPanel2.add(this.i, "West");
    localJPanel2.add(this.f, "Center");
    JPanel localJPanel3 = new JPanel(new GridBagLayout());
    localJPanel3.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createEtchedBorder()));
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.anchor = 17;
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.gridwidth = 0;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.insets = new Insets(5, 5, 0, 5);
    localJPanel3.add(localJPanel1, localGridBagConstraints);
    localGridBagConstraints.insets = new Insets(0, 0, 0, 0);
    localJPanel3.add(this.g, localGridBagConstraints);
    localJPanel3.add(this.h, localGridBagConstraints);
    localGridBagConstraints.insets = new Insets(0, 0, 0, 5);
    localJPanel3.add(localJPanel2, localGridBagConstraints);
    localGridBagConstraints.insets = new Insets(0, 50, 0, 0);
    localJPanel3.add(this.j, localGridBagConstraints);
    localGridBagConstraints.insets = new Insets(10, 0, 0, 5);
    localJPanel3.add(t(), localGridBagConstraints);
    return localJPanel3;
  }

  protected JPanel t()
  {
    JLabel localJLabel = new JLabel(ct.a(1231));
    this.p = new bb(ct.b(1232));
    this.q = new bb(ct.b(1233));
    ButtonGroup localButtonGroup = new ButtonGroup();
    localButtonGroup.add(this.p);
    localButtonGroup.add(this.q);
    JPanel localJPanel = new JPanel(new GridLayout(3, 1));
    localJPanel.add(localJLabel);
    localJPanel.add(this.q);
    localJPanel.add(this.p);
    this.p.setSelected(true);
    return localJPanel;
  }

  protected Component m()
  {
    JPanel localJPanel = new JPanel();
    localJPanel.setLayout(new FlowLayout(2));
    this.o = new JButton(ct.a(116));
    this.o.addActionListener(this.k);
    localJPanel.add(this.o);
    JButton localJButton1 = new JButton(ct.a(117));
    localJButton1.addActionListener(this.l);
    localJPanel.add(localJButton1);
    if (r() != null)
    {
      JButton localJButton2 = new JButton(ct.a(639));
      localJButton2.addActionListener(new z(this));
      localJPanel.add(localJButton2);
      d.b(new JButton[] { this.o, localJButton1, localJButton2 });
    }
    else
    {
      d.b(new JButton[] { this.o, localJButton1 });
    }
    return localJPanel;
  }

  protected Component n()
  {
    JPanel localJPanel = new JPanel();
    localJPanel.setLayout(new BorderLayout());
    localJPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5))));
    this.b = new JTextArea();
    this.b.setBackground(localJPanel.getBackground());
    this.b.setEditable(false);
    this.b.setFocusable(false);
    this.b.setLineWrap(true);
    this.b.setWrapStyleWord(true);
    localJPanel.add(this.b, "Center");
    return localJPanel;
  }

  private void a()
  {
    String str1 = ct.a(1558) + "\n";
    if (o.a().g())
    {
      String str2 = (String)b.a("debugging.tunnelHost");
      str1 = str1 + ct.a(1560, str2) + "\n\n";
    }
    str1 = str1 + ct.a(1559);
    this.b.setText(str1);
  }

  protected void o()
  {
    g localg = new g(this);
    this.g.addActionListener(localg);
    this.h.addActionListener(localg);
    this.i.addActionListener(localg);
  }

  protected void p()
  {
    JRootPane localJRootPane = getRootPane();
    ActionMap localActionMap = localJRootPane.getActionMap();
    InputMap localInputMap = localJRootPane.getInputMap(1);
    KeyStroke localKeyStroke1 = KeyStroke.getKeyStroke(27, 0);
    String str1 = "escapeKey";
    localInputMap.put(localKeyStroke1, str1);
    localActionMap.put(str1, this.l);
    KeyStroke localKeyStroke2 = KeyStroke.getKeyStroke(10, 0);
    String str2 = "enterKey";
    localInputMap.put(localKeyStroke2, str2);
    localActionMap.put(str2, this.k);
  }

  public void u()
  {
    this.e.getEditor().selectAll();
    a();
    pack();
    repaint();
    this.c = 0;
    super.setVisible(true);
  }

  private void a(boolean paramBoolean)
  {
    this.f.setEnabled(paramBoolean);
    this.j.setEnabled(paramBoolean);
  }

  static void a(p paramp, String paramString)
  {
    paramp.c(paramString);
  }

  static void a(p paramp, boolean paramBoolean)
  {
    paramp.a(paramBoolean);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.i.p
 * JD-Core Version:    0.6.0
 */