package com.zend.ide.p;

import com.zend.ide.j.h;
import com.zend.ide.p.d.bp;
import com.zend.ide.util.bb;
import com.zend.ide.util.bn;
import com.zend.ide.util.bs;
import com.zend.ide.util.bt;
import com.zend.ide.util.ch;
import com.zend.ide.util.cl;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Enumeration;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.ListCellRenderer;
import javax.swing.text.JTextComponent;

public class bc extends cd
  implements bn
{
  private String a = "debug_messages";
  private bb b;
  private bt c;
  private JFileChooser d;
  protected bw e = null;

  public bc()
  {
    this.e.setModel(n());
    this.e.setCellRenderer(o());
    this.b = m();
    this.c = new bt(this);
    this.c.a(this.e);
    setViewportView(this.e);
    MouseListener localMouseListener = b();
    if (localMouseListener != null)
      this.e.addMouseListener(localMouseListener);
  }

  public bs t()
  {
    return this.c;
  }

  protected MouseListener b()
  {
    return new g(this);
  }

  protected void a(Object paramObject)
  {
  }

  public JList d()
  {
    return this.e;
  }

  protected DefaultListModel e()
  {
    return (DefaultListModel)this.e.getModel();
  }

  public void b(Object paramObject)
  {
    DefaultListModel localDefaultListModel = (DefaultListModel)this.e.getModel();
    localDefaultListModel.addElement(paramObject);
  }

  public void f()
  {
    DefaultListModel localDefaultListModel = (DefaultListModel)this.e.getModel();
    localDefaultListModel.clear();
  }

  public void a(l paraml)
  {
    ((v)this.e.getModel()).a(paraml);
  }

  public void b(l paraml)
  {
    ((v)this.e.getModel()).b(paraml);
  }

  private String a(Object[] paramArrayOfObject)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if ((paramArrayOfObject != null) && (paramArrayOfObject.length > 0))
    {
      for (int i = 0; i < paramArrayOfObject.length; i++)
        localStringBuffer.append(paramArrayOfObject[i].toString() + "\n");
    }
    else
    {
      DefaultListModel localDefaultListModel = (DefaultListModel)this.e.getModel();
      Enumeration localEnumeration = localDefaultListModel.elements();
      while (localEnumeration.hasMoreElements())
        localStringBuffer.append(localEnumeration.nextElement().toString() + "\n");
    }
    return localStringBuffer.toString();
  }

  private JTextComponent b(Object[] paramArrayOfObject)
  {
    JTextArea localJTextArea = new JTextArea();
    localJTextArea.setText(a(paramArrayOfObject));
    return localJTextArea;
  }

  protected JFileChooser i()
  {
    bp localbp = new bp(false);
    return localbp;
  }

  public void B()
  {
    JTextComponent localJTextComponent = b(this.e.getSelectedValues());
    localJTextComponent.selectAll();
    localJTextComponent.copy();
  }

  public void j()
  {
    if (this.d == null)
      this.d = i();
    int i = this.d.showSaveDialog(this);
    if (i != 0)
      return;
    OutputStream localOutputStream = null;
    try
    {
      JTextComponent localJTextComponent = b(null);
      localOutputStream = h.m.a(this.d.getSelectedFile().getPath(), true);
      localJTextComponent.write(new OutputStreamWriter(localOutputStream));
    }
    catch (Exception localIOException2)
    {
      cl.a(localException);
    }
    finally
    {
      if (localOutputStream != null)
        try
        {
          localOutputStream.close();
        }
        catch (IOException localIOException3)
        {
        }
    }
  }

  public void k()
  {
    ch.a(a(null));
  }

  protected bw a()
  {
    return new bw();
  }

  protected bb m()
  {
    o localo = new o(this);
    localo.b();
    return localo;
  }

  protected v n()
  {
    return new v(this);
  }

  protected ListCellRenderer o()
  {
    return new u(this);
  }

  protected k a(Object paramObject, Icon paramIcon)
  {
    return new m(paramObject, paramIcon);
  }

  public Object s()
  {
    return null;
  }

  public void c(Object paramObject)
  {
  }

  public JComponent c()
  {
    return this;
  }

  public void a(bn parambn)
  {
    this.b.a(parambn.q());
  }

  public boolean d(boolean paramBoolean)
  {
    return this.c.d(paramBoolean);
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public String r()
  {
    return this.a;
  }

  public void d(String paramString)
  {
    this.a = paramString;
  }

  public bb q()
  {
    return this.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.bc
 * JD-Core Version:    0.6.0
 */