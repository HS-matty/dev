package com.zend.ide.g;

import com.zend.ide.d.co;
import com.zend.ide.j.h;
import com.zend.ide.n.gx;
import com.zend.ide.p.cd;
import com.zend.ide.p.d.bp;
import com.zend.ide.util.bb;
import com.zend.ide.util.bn;
import com.zend.ide.util.bs;
import com.zend.ide.util.bt;
import com.zend.ide.util.cl;
import com.zend.ide.y.f;
import com.zend.ide.y.m;
import java.awt.Rectangle;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.plaf.TextUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.EditorKit;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;

public class n extends cd
  implements l
{
  protected gx a = new gx();
  private String b = "outputComponent";
  private bb c;
  private bt d;
  private bp e;
  private String f;
  private com.zend.ide.y.e g;
  private PropertyChangeListener h = new c(this, null);
  private PropertyChangeListener i = new e(this, null);
  private PropertyChangeListener j = new d(this, null);
  private PropertyChangeListener k = new b(this, null);

  public n()
  {
    this.a.a(m.a().c());
    this.c = new g(this);
    ((g)this.c).a();
    this.d = new bt(this);
    this.d.a(this.a);
    this.a.setEditable(false);
    setViewportView(this.a);
    a();
  }

  private void a()
  {
    f localf = new f();
    this.g = new com.zend.ide.y.e(localf);
    localf.a("editing.font", this.h);
    localf.a("editing.tabSize", this.i);
    localf.a("editing.styleManager", this.j);
    localf.a("editing.background", this.k);
    this.g.a("editing.font");
    this.g.a("editing.tabSize");
    this.g.a("editing.styleManager");
    this.g.a("editing.background");
  }

  public JTextComponent a()
  {
    return this.a;
  }

  public bs t()
  {
    return this.d;
  }

  private void b()
  {
    int m = c().showSaveDialog(this);
    if (m != 0)
      return;
    OutputStream localOutputStream = null;
    try
    {
      File localFile = c().getSelectedFile();
      localOutputStream = h.m.b(localFile, true);
      OutputStreamWriter localOutputStreamWriter = new OutputStreamWriter(localOutputStream);
      this.a.write(localOutputStreamWriter);
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

  private bp c()
  {
    if (this.e == null)
      this.e = new bp(false);
    return this.e;
  }

  public void c(String paramString)
  {
    try
    {
      Document localDocument = this.a.getDocument();
      localDocument.insertString(localDocument.getLength(), paramString, null);
      Element localElement = localDocument.getDefaultRootElement();
      int m = localElement.getElement(localElement.getElementCount() - 1).getStartOffset();
      Rectangle localRectangle = this.a.modelToView(m);
      if (localRectangle != null)
        SwingUtilities.invokeLater(new a(this, localRectangle));
    }
    catch (BadLocationException localBadLocationException)
    {
    }
  }

  public void e()
  {
    this.a.setSelectionStart(this.a.getSelectionEnd());
    this.a.setText("");
  }

  public void f()
  {
    FileOutputStream localFileOutputStream = null;
    try
    {
      File localFile = File.createTempFile("temp", ".html");
      localFile.deleteOnExit();
      localFileOutputStream = new FileOutputStream(localFile);
      Document localDocument = this.a.getDocument();
      this.a.getUI().getEditorKit(this.a).write(localFileOutputStream, localDocument, 0, localDocument.getLength());
      localFileOutputStream.close();
      com.zend.ide.bd.c.b().e().a(localFile.getPath(), true);
    }
    catch (Exception localIOException2)
    {
      cl.a(localException);
    }
    finally
    {
      if (localFileOutputStream != null)
        try
        {
          localFileOutputStream.close();
        }
        catch (IOException localIOException3)
        {
        }
    }
  }

  public void b(String paramString)
  {
    this.f = paramString;
  }

  public String g()
  {
    return this.f;
  }

  public void setName(String paramString)
  {
    super.setName(paramString);
    this.a.setName(paramString);
  }

  public boolean d(boolean paramBoolean)
  {
    return this.d.d(paramBoolean);
  }

  public Object s()
  {
    return null;
  }

  public void c(Object paramObject)
  {
  }

  public bb q()
  {
    return this.c;
  }

  public JComponent c()
  {
    return this;
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public String r()
  {
    return this.b;
  }

  public void d(String paramString)
  {
    this.b = paramString;
  }

  public void a(bn parambn)
  {
    this.c.a(parambn.q());
  }

  static void a(n paramn)
  {
    paramn.b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.g.n
 * JD-Core Version:    0.6.0
 */