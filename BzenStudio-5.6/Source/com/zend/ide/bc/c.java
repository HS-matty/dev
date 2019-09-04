package com.zend.ide.bc;

import com.zend.ide.i.n;
import com.zend.ide.p.w;
import com.zend.ide.p.x;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import com.zend.ide.y.f;
import com.zend.ide.y.h;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.FocusManager;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JToolTip;
import javax.swing.KeyStroke;
import javax.swing.RootPaneContainer;
import javax.swing.SwingUtilities;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

public class c
  implements cu
{
  private static c a;
  private static HashMap b;
  private static List c;
  private n g;
  private w h;
  private JLayeredPane i;
  private JTextPane j;
  private JPanel k;
  private JScrollPane l;
  private x m;
  private boolean d;
  private com.zend.ide.y.e e;
  private PropertyChangeListener f = new e(this, null);
  private int n;
  private Component o;

  public static c a()
  {
    if (a == null)
      a = new c();
    return a;
  }

  public static boolean b()
  {
    return a != null;
  }

  private c()
  {
    a();
    c();
    d();
    f();
  }

  private void c()
  {
    b = new HashMap();
    b.put("go_to_source", new Integer(1731));
    b.put("add_bookmark", new Integer(1732));
    b.put("add_breakpoint", new Integer(1733));
    b.put("first_debug", new Integer(1734));
    b.put("go_to_file", new Integer(1736));
    b.put("save_file", new Integer(1735));
  }

  private void d()
  {
    f localf = new f();
    this.e = new com.zend.ide.y.e(localf);
    localf.a("desktop.helpAgent", this.f);
    this.e.a("desktop.helpAgent");
  }

  public void a(String paramString)
  {
    a(paramString, -1);
  }

  public void a(String paramString, int paramInt)
  {
    if (!this.d)
      return;
    if (!c.contains(paramString))
    {
      String str1 = paramInt != -1 ? ct.a(paramInt) : b(paramString);
      str1 = str1.replaceAll("\n", "<br>");
      String str2 = new File(cv.b(), "didYouKnow.gif").getPath();
      str2 = str2.replaceAll("[\\\\]", "/");
      URL localURL = ClassLoader.getSystemResource(str2);
      str1 = "<html><body style=\"font: Dialog,Arial,Helvetica;\"><html><img src=\"" + localURL + "\"><br>" + str1 + "</body></html>";
      this.j.setText(str1);
      this.j.setCaretPosition(0);
      Dimension localDimension1 = this.l.getPreferredSize();
      Rectangle localRectangle1 = this.i.getBounds();
      if (localRectangle1.width < localDimension1.width)
        localDimension1.width = localRectangle1.width;
      if (localDimension1.width > 500)
        localDimension1.width = 500;
      if (localDimension1.height > localRectangle1.height)
        localDimension1.height = localRectangle1.height;
      if (localDimension1.height > 500)
        localDimension1.height = 500;
      if (localDimension1.height < 50)
        localDimension1.height = 50;
      if (localDimension1.width < 100)
        localDimension1.width = 100;
      Dimension localDimension2 = new Dimension(localDimension1.width + 20, localDimension1.height + this.n + 20);
      this.k.setSize(localDimension2);
      Rectangle localRectangle2 = this.k.getBounds();
      if (localRectangle2.y < 0)
      {
        localDimension1.height -= Math.abs(localRectangle2.y);
        localDimension1.height += 2;
        this.k.setSize(localDimension2);
      }
      this.g.setSize(this.k.getSize());
      this.g.setLocationRelativeTo(com.zend.ide.bd.c.b().h());
      if (!this.g.isVisible())
      {
        this.o = FocusManager.getCurrentManager().getFocusOwner();
        SwingUtilities.invokeLater(new d(this));
        this.g.setVisible(true);
        this.o.requestFocus();
      }
      if (this.m.isSelected())
        c.add(paramString);
    }
  }

  private void a()
  {
    this.i = com.zend.ide.bd.c.b().h().getLayeredPane();
    HTMLEditorKit localHTMLEditorKit = new HTMLEditorKit();
    HTMLDocument localHTMLDocument = (HTMLDocument)localHTMLEditorKit.createDefaultDocument();
    this.j = new JTextPane();
    this.j.setDocument(localHTMLDocument);
    this.j.setEditorKit(localHTMLEditorKit);
    localHTMLEditorKit.install(this.j);
    this.j.setFocusable(false);
    this.j.setEditable(false);
    this.j.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    this.l = new JScrollPane(this.j);
    this.l.setFocusable(false);
    this.l.setHorizontalScrollBarPolicy(30);
    this.l.setVerticalScrollBarPolicy(20);
    this.l.setBorder(BorderFactory.createEmptyBorder());
    this.k = new JPanel(new BorderLayout());
    this.k.add(this.l, "Center");
    this.k.setFocusable(false);
    JPanel localJPanel = new JPanel(new BorderLayout());
    this.m = new x(ct.b(1754));
    localJPanel.add(this.m, "West");
    this.h = new w(ct.a(116));
    this.h.addActionListener(new g(this));
    localJPanel.add(this.h, "East");
    localJPanel.setFocusable(false);
    JToolTip localJToolTip = new JToolTip();
    this.m.setFocusPainted(false);
    this.m.setSelected(true);
    this.m.setFocusable(false);
    this.h.setFocusPainted(false);
    this.k.add(localJPanel, "South");
    this.k.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    localJPanel.setBackground(localJToolTip.getBackground());
    this.m.setBackground(localJToolTip.getBackground());
    this.j.setBackground(localJToolTip.getBackground());
    this.h.setBackground(localJToolTip.getBackground());
    localJPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK), BorderFactory.createEmptyBorder(5, 5, 5, 10)));
    this.n = localJPanel.getPreferredSize().height;
    this.j.setFont(this.m.getFont());
    this.g = new n(com.zend.ide.bd.c.b().h());
    this.g.setUndecorated(true);
    this.g.setModal(true);
    this.g.add(this.k);
  }

  private String b(String paramString)
  {
    int i1 = ((Integer)b.get(paramString)).intValue();
    if (paramString.equals("go_to_source"))
      return ct.a(i1, a("editor.gotoResource"));
    if (paramString.equals("add_bookmark"))
      return ct.a(i1, a("phpEditorPane.openBookmarksDialog"), a("phpEditorPane.gotoNextBookmark"), a("phpEditorPane.gotoNextProjectBookmark"));
    if (paramString.equals("go_to_file"))
      return ct.a(i1, a("editor.gotoFile"));
    return ct.a(i1);
  }

  public String a(String paramString)
  {
    KeyStroke localKeyStroke = (KeyStroke)com.zend.ide.y.g.a(paramString).d();
    int i1 = localKeyStroke.getModifiers();
    int i2 = localKeyStroke.getKeyCode();
    String str = KeyEvent.getKeyText(i2);
    if (!a(i1, i2))
      str = KeyEvent.getKeyModifiersText(i1) + "-" + str;
    return str;
  }

  private static boolean a(int paramInt1, int paramInt2)
  {
    return (paramInt1 == 0) && (paramInt2 >= 112) && (paramInt2 <= 123);
  }

  public void e()
  {
    File localFile = new File(cv.d(), "helpagent.dat");
    if (!localFile.getParentFile().exists())
      localFile.mkdirs();
    else if (localFile.exists())
      localFile.delete();
    try
    {
      FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
      ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(localFileOutputStream);
      localObjectOutputStream.writeObject(c);
      localObjectOutputStream.flush();
      localObjectOutputStream.close();
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  private void f()
  {
    try
    {
      File localFile = new File(cv.d(), "helpagent.dat");
      FileInputStream localFileInputStream = new FileInputStream(localFile);
      ObjectInputStream localObjectInputStream = new ObjectInputStream(localFileInputStream);
      c = (ArrayList)localObjectInputStream.readObject();
    }
    catch (Exception localException)
    {
      c = new ArrayList();
    }
  }

  static w a(c paramc)
  {
    return paramc.h;
  }

  static n b(c paramc)
  {
    return paramc.g;
  }

  static boolean a(c paramc, boolean paramBoolean)
  {
    return paramc.d = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bc.c
 * JD-Core Version:    0.6.0
 */