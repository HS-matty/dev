package com.zend.ide.cb.a;

import com.zend.ide.bc.a;
import com.zend.ide.cb.c.w;
import com.zend.ide.n.dm;
import com.zend.ide.util.c.h;
import com.zend.ide.util.cl;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URLEncoder;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.DefaultListModel;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.text.JTextComponent;

public class s
  implements k
{
  private JList a;
  private DefaultListModel b;
  private JScrollPane c;
  private String d;
  private n e;
  private dm f;
  private int g;
  private JPopupMenu h;
  private ob i;
  private KeyStroke j;

  public s(n paramn, dm paramdm)
  {
    this.e = paramn;
    this.f = paramdm;
    this.d = "historyList";
    a();
  }

  public JComponent a()
  {
    if (this.c == null)
      this.c = new JScrollPane(this.a);
    return this.c;
  }

  public void c()
  {
    j();
  }

  public void a(String paramString)
  {
    this.d = paramString;
  }

  public String d()
  {
    return this.d;
  }

  public boolean e()
  {
    return this.a.requestFocusInWindow();
  }

  private void a()
  {
    this.b = new DefaultListModel();
    this.a = new JList(this.b);
    this.j = KeyStroke.getKeyStroke(10, 2);
    g().put(this.j, "Go");
    g().put(KeyStroke.getKeyStroke("ENTER"), "PasteSQL");
    f().put("Go", new ib(this, this.j));
    f().put("PasteSQL", new hb(this, "PasteSQL"));
    this.a.addMouseListener(new f(this));
    k();
    a.a(this.a, "SQL_HISTORY");
  }

  private void a(MouseEvent paramMouseEvent)
  {
    if (paramMouseEvent.isPopupTrigger())
      b(paramMouseEvent);
    else if (paramMouseEvent.getClickCount() > 1)
      e();
  }

  private r b()
  {
    if (this.b.size() == 0)
      return new r();
    return (r)this.b.getElementAt(this.b.size() - 1);
  }

  private r c()
  {
    Object localObject = this.a.getSelectedValue();
    return (r)localObject;
  }

  public void d()
  {
    SwingUtilities.invokeLater(new ab(this));
  }

  public void a(r paramr)
  {
    if (b().a().equalsIgnoreCase(paramr.a()))
      return;
    r localr = c();
    if ((localr != null) && (c().a().equalsIgnoreCase(paramr.a())))
      return;
    this.b.addElement(paramr);
    i();
    d();
  }

  public void e()
  {
    r localr = (r)this.a.getSelectedValue();
    if (localr != null)
      this.f.e().setText(localr.a());
  }

  public ActionMap f()
  {
    return this.a.getActionMap();
  }

  public InputMap g()
  {
    return this.a.getInputMap();
  }

  public void a(Color paramColor)
  {
    this.a.setForeground(paramColor);
  }

  public void b(Color paramColor)
  {
    this.a.setBackground(paramColor);
  }

  Object h()
  {
    return this.a;
  }

  public void a(int paramInt)
  {
    this.g = paramInt;
    i();
  }

  private void i()
  {
    if (this.b.size() > this.g)
      this.b.removeRange(0, this.b.size() - this.g - 1);
  }

  private void j()
  {
    try
    {
      File localFile = new File(w.a, "sql/history.db");
      FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
      BufferedWriter localBufferedWriter = new BufferedWriter(new OutputStreamWriter(localFileOutputStream, "UTF-8"));
      localBufferedWriter.write("<?xml version='1.0' encoding='UTF-8'?>");
      localBufferedWriter.newLine();
      localBufferedWriter.newLine();
      localBufferedWriter.write("<sqlHistory>");
      localBufferedWriter.newLine();
      for (int k = 0; k < this.b.size(); k++)
      {
        localBufferedWriter.write(9);
        localBufferedWriter.write("<query value=\"" + URLEncoder.encode(((r)this.b.get(k)).a(), "UTF-8") + "\" />");
        localBufferedWriter.newLine();
      }
      localBufferedWriter.write("</sqlHistory>");
      localBufferedWriter.flush();
      localBufferedWriter.close();
    }
    catch (IOException localIOException)
    {
      cl.a("Error while writing SQL history: " + localIOException.getMessage());
    }
  }

  private void k()
  {
    h.c().a(new bb(this, null), true);
  }

  private void b(MouseEvent paramMouseEvent)
  {
    if (this.i == null)
    {
      this.i = new ob(3);
      this.i.put("Go", new ib(this, this.j));
      this.i.put("Remove", new jb(this));
      this.i.put("Remove All", new fc(this));
    }
    if (this.h == null)
      this.h = a(this.i);
    boolean bool = this.a.getSelectedIndex() != -1;
    ((AbstractAction)this.i.get("Go")).setEnabled(bool);
    ((AbstractAction)this.i.get("Remove")).setEnabled(bool);
    a(this.h, paramMouseEvent);
  }

  private void a(JPopupMenu paramJPopupMenu, MouseEvent paramMouseEvent)
  {
    if (paramJPopupMenu.isVisible())
      paramJPopupMenu.setVisible(false);
    SwingUtilities.invokeLater(new md(this, paramJPopupMenu, paramMouseEvent));
  }

  private JPopupMenu a(ob paramob)
  {
    JPopupMenu localJPopupMenu = new JPopupMenu();
    Object[] arrayOfObject = paramob.a();
    for (int k = 0; k < arrayOfObject.length; k++)
    {
      if (k == 1)
        localJPopupMenu.addSeparator();
      localJPopupMenu.add((Action)paramob.get(arrayOfObject[k]));
    }
    return localJPopupMenu;
  }

  static void a(s params, MouseEvent paramMouseEvent)
  {
    params.a(paramMouseEvent);
  }

  static DefaultListModel a(s params)
  {
    return params.b;
  }

  static JList b(s params)
  {
    return params.a;
  }

  static n a(s params)
  {
    return params.e;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.s
 * JD-Core Version:    0.6.0
 */