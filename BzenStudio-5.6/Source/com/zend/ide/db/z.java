package com.zend.ide.db;

import com.zend.ide.j.h;
import com.zend.ide.k.d;
import com.zend.ide.p.cd;
import com.zend.ide.p.d.bp;
import com.zend.ide.util.bb;
import com.zend.ide.util.bn;
import com.zend.ide.util.bs;
import com.zend.ide.util.bt;
import com.zend.ide.util.ch;
import com.zend.ide.util.cl;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.BorderLayout;
import java.awt.Font;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.text.Document;

public class z extends cd
  implements com.zend.ide.k.e, bn
{
  private com.zend.ide.k.f a;
  private JTextArea b;
  private JPanel c;
  private String d = "phpdoc_output";
  private bb e;
  private bt f;
  private JFileChooser g;
  private PropertyChangeListener h;
  private com.zend.ide.y.e i;

  public z()
  {
    d(this.d);
    a();
    setViewportView(this.c);
    getVerticalScrollBar().setBlockIncrement(16);
    getVerticalScrollBar().setUnitIncrement(16);
    this.e = c();
    this.f = new bt(this);
    this.f.a(this.b);
    b();
  }

  private void a()
  {
    this.b = new JTextArea();
    this.c = new JPanel(new BorderLayout());
    this.c.add(this.b, "Center");
    this.b.setEditable(false);
    this.b.setFont((Font)b.a("editing.font").c());
  }

  private void b()
  {
    com.zend.ide.y.f localf = new com.zend.ide.y.f();
    this.i = new com.zend.ide.y.e(localf);
    this.h = new n(this, null);
    localf.a("editing.font", this.h);
    this.i.a("editing.font");
  }

  private bb c()
  {
    q localq = new q(this);
    localq.a();
    return localq;
  }

  private static JFileChooser d()
  {
    bp localbp = new bp(false);
    return localbp;
  }

  public bs t()
  {
    return this.f;
  }

  public void a(String paramString)
  {
    try
    {
      Document localDocument = this.b.getDocument();
      localDocument.insertString(localDocument.getLength(), paramString, null);
      int j = this.b.getLineStartOffset(this.b.getLineCount() - 1);
      this.b.setCaretPosition(j);
      ((d)x()).n();
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  public void b(String paramString)
  {
    this.b.setText(paramString);
  }

  public com.zend.ide.k.f x()
  {
    if (this.a == null)
      this.a = new a(this);
    return this.a;
  }

  public boolean d(boolean paramBoolean)
  {
    return this.f.d(paramBoolean);
  }

  public bb q()
  {
    return this.e;
  }

  public JComponent c()
  {
    return this;
  }

  public void d(String paramString)
  {
    this.d = paramString;
  }

  public String r()
  {
    return this.d;
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public void a(bn parambn)
  {
    this.e.a(parambn.q());
  }

  public Object s()
  {
    return null;
  }

  public void c(Object paramObject)
  {
  }

  private void e()
  {
    this.b.setText("");
  }

  private void f()
  {
    ch.a(this.b);
  }

  private void g()
  {
    String str = this.b.getSelectedText();
    if ((str == null) || (str.equals("")))
      this.b.selectAll();
    this.b.copy();
  }

  private void h()
  {
    if (this.g == null)
      this.g = d();
    int j = this.g.showSaveDialog(this);
    if (j != 0)
      return;
    OutputStream localOutputStream = null;
    try
    {
      localOutputStream = h.m.a(this.g.getSelectedFile().getPath(), true);
      this.b.write(new OutputStreamWriter(localOutputStream));
    }
    catch (Exception localException3)
    {
      cl.a(localException2);
    }
    finally
    {
      if (localOutputStream != null)
        try
        {
          localOutputStream.close();
        }
        catch (Exception localException4)
        {
        }
    }
  }

  static JTextArea a(z paramz)
  {
    return paramz.b;
  }

  static void a(z paramz)
  {
    paramz.e();
  }

  static void b(z paramz)
  {
    paramz.g();
  }

  static void c(z paramz)
  {
    paramz.h();
  }

  static void d(z paramz)
  {
    paramz.f();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.db.z
 * JD-Core Version:    0.6.0
 */