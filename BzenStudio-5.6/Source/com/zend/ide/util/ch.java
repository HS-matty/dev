package com.zend.ide.util;

import com.zend.ide.bd.c;
import com.zend.ide.be.k;
import com.zend.ide.n.gx;
import com.zend.ide.n.gz;
import com.zend.ide.s.cx;
import java.awt.Font;
import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;
import javax.swing.text.PlainDocument;

public class ch
  implements cu
{
  private static ch a = null;
  private static PrinterJob b;
  private static PageFormat c;
  private static eb d;
  private static pb e;
  private static k f = c.b().d();
  private static String g = new File(cv.d()).getPath();

  public ch()
  {
    a();
    b = PrinterJob.getPrinterJob();
    c = b.defaultPage();
    e = new pb();
  }

  private void a()
  {
    ObjectInputStream localObjectInputStream = null;
    try
    {
      File localFile = new File(g, "print.conf");
      if (localFile.exists())
      {
        localObjectInputStream = new ObjectInputStream(new FileInputStream(localFile));
        d = (eb)localObjectInputStream.readObject();
      }
      else
      {
        d = new eb();
      }
    }
    catch (ClassNotFoundException localException2)
    {
      d = new eb();
    }
    catch (Exception localException4)
    {
      cl.a(localException3);
      d = new eb();
    }
    finally
    {
      if (localObjectInputStream != null)
        try
        {
          localObjectInputStream.close();
        }
        catch (Exception localException5)
        {
        }
    }
  }

  public void b()
  {
    ObjectOutputStream localObjectOutputStream = null;
    try
    {
      File localFile = new File(g, "print.conf");
      if (!localFile.getParentFile().exists())
        localFile.getParentFile().mkdirs();
      localObjectOutputStream = new ObjectOutputStream(new FileOutputStream(localFile));
      localObjectOutputStream.writeObject(d);
      localObjectOutputStream.flush();
    }
    catch (Exception localException3)
    {
      cl.a(localException2);
    }
    finally
    {
      if (localObjectOutputStream != null)
        try
        {
          localObjectOutputStream.close();
        }
        catch (Exception localException4)
        {
        }
    }
  }

  public static void c()
  {
    b().b();
  }

  public static void a(JTextComponent paramJTextComponent)
  {
    b().b(paramJTextComponent);
  }

  public static void a(String paramString)
  {
    b().b(paramString);
  }

  public static void a(gz paramgz)
  {
    b().b(paramgz);
  }

  public static void a(gx paramgx)
  {
    b().b(paramgx);
  }

  public static void h()
  {
    b().d();
  }

  public PageFormat a()
  {
    return c;
  }

  protected static ch b()
  {
    if (a == null)
      a = new ch();
    return a;
  }

  public static boolean d()
  {
    return a != null;
  }

  private void c(JTextComponent paramJTextComponent)
  {
    int i = paramJTextComponent.getSelectionStart();
    int j = paramJTextComponent.getSelectionEnd();
    d.a(i, j);
    d.a(paramJTextComponent.getName());
    d(paramJTextComponent);
  }

  private void a(JTextComponent paramJTextComponent, String paramString)
  {
    c(paramJTextComponent);
    d.a(paramString);
  }

  private void d(JTextComponent paramJTextComponent)
  {
    Font localFont1 = d.i();
    Font localFont2 = paramJTextComponent.getFont();
    if (localFont1 == null)
    {
      if (localFont2.getSize() != 10)
        localFont2 = localFont2.deriveFont(10.0F);
      d.a(localFont2);
    }
  }

  private void b(gz paramgz)
  {
    a(paramgz, paramgz.k());
    e.a(d);
    if (e.a() != 1)
      return;
    gz localgz = new gz();
    localgz.setTabSize(paramgz.getTabSize());
    localgz.setFont(paramgz.getFont());
    localgz.setSize(paramgz.getSize());
    localgz.setUI(new cx());
    localgz.a(false);
    if ((d.c()) && (d.f()))
      localgz.a(paramgz.w());
    else if (d.f())
      localgz.a(new tb(paramgz.w()));
    localgz.setDocument(paramgz.getDocument());
    new Thread(new cj(this, new kb(localgz, c, d))).start();
  }

  private void b(gx paramgx)
  {
    c(paramgx);
    e.a(d);
    if (e.a() != 1)
      return;
    try
    {
      gx localgx = (gx)paramgx.clone();
      localgx.setSize(paramgx.getSize());
      localgx.setUI(new cx());
      localgx.a(false);
      if (d.f())
        localgx.a(new tb(paramgx.w()));
      new Thread(new cj(this, new kb(localgx, c, d))).start();
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      cl.a(localCloneNotSupportedException);
    }
  }

  private void b(JTextComponent paramJTextComponent)
  {
    c(paramJTextComponent);
    e.a(d);
    if (e.a() != 1)
      return;
    JTextArea localJTextArea = new JTextArea();
    localJTextArea.setDocument(paramJTextComponent.getDocument());
    localJTextArea.setFont(paramJTextComponent.getFont());
    localJTextArea.setSize(paramJTextComponent.getSize());
    new Thread(new cj(this, new kb(localJTextArea, c, d))).start();
  }

  private void b(String paramString)
  {
    JTextArea localJTextArea = new JTextArea();
    localJTextArea.setDocument(new PlainDocument());
    localJTextArea.setText(paramString);
    c(localJTextArea);
    e.a(d);
    if (e.a() != 1)
      return;
    new Thread(new cj(this, new kb(localJTextArea, c, d))).start();
  }

  private void d()
  {
    c = b.pageDialog(c);
  }

  static PrinterJob e()
  {
    return b;
  }

  static k b()
  {
    return f;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.ch
 * JD-Core Version:    0.6.0
 */