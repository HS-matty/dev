package com.zend.ide.o;

import com.zend.ide.bc.a;
import com.zend.ide.fb.o;
import com.zend.ide.fb.q;
import com.zend.ide.util.bb;
import com.zend.ide.util.bn;
import com.zend.ide.util.bs;
import java.awt.CardLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

class ub extends JPanel
  implements fl
{
  private CardLayout a;
  private ac b;
  private o c;
  final fp d;

  public ub(fp paramfp)
  {
    this.b = new ac(paramfp);
    a.a(this, "DEBUG_OUTPUT_WINDOW");
    this.a = new CardLayout();
    setLayout(this.a);
    add(this.b, "html_text_view");
    this.a.show(this, "html_text_view");
    paramfp.addChangeListener(new vb(this, paramfp));
    setVisible(true);
  }

  public void f(String paramString)
  {
    if (this.c != null)
      this.c.a(paramString);
  }

  public void a()
  {
    if (this.c != null)
    {
      Document localDocument = this.b.a().getDocument();
      int i = localDocument.getLength();
      int j = 0;
      if (this.d.o())
      {
        j = this.b.l.length();
        if (j > i)
          j = i;
      }
      String str = "";
      try
      {
        str = localDocument.getText(j, localDocument.getLength() - j);
      }
      catch (BadLocationException localBadLocationException)
      {
      }
      this.c.a(str);
    }
  }

  public void a(String paramString)
  {
    this.b.a(paramString);
  }

  public String a()
  {
    return this.b.a();
  }

  public void c(String paramString)
  {
    this.b.c(paramString);
  }

  public void e()
  {
    this.b.e();
    f("");
  }

  public void a(boolean paramBoolean)
  {
    this.b.a(paramBoolean);
  }

  public void f()
  {
    this.b.f();
  }

  public void b(String paramString)
  {
    this.b.b(paramString);
  }

  public String g()
  {
    return this.b.g();
  }

  public void setName(String paramString)
  {
    super.setName(paramString);
    this.b.setName(paramString);
  }

  public boolean d(boolean paramBoolean)
  {
    return this.b.d(paramBoolean);
  }

  public bb q()
  {
    return this.b.q();
  }

  public JComponent c()
  {
    return this;
  }

  public void d(String paramString)
  {
    this.b.d(paramString);
  }

  public String r()
  {
    return this.b.r();
  }

  public String a(int paramInt1, int paramInt2)
  {
    return this.b.a(paramInt1, paramInt2);
  }

  public void a(bn parambn)
  {
    this.b.a(parambn);
  }

  public Object s()
  {
    return this.b.s();
  }

  public void c(Object paramObject)
  {
    this.b.c(paramObject);
  }

  public bs t()
  {
    return this.b.t();
  }

  public void e(String paramString)
  {
    if (paramString == null)
      return;
    if (paramString == "browser_view")
    {
      if (this.c == null)
      {
        this.c = q.b();
        add(this.c.g(), "browser_view");
      }
      a();
    }
    this.a.show(this, paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.ub
 * JD-Core Version:    0.6.0
 */