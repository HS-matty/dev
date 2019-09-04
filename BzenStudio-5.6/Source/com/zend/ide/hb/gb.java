package com.zend.ide.hb;

import com.zend.ide.bd.c;
import com.zend.ide.n.gx;
import com.zend.ide.p.ba;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.Position;

public class gb
  implements cu, p
{
  private static y a = new y();
  private qb b;
  private JTextComponent c = null;
  private e d = new e();
  private e e;
  private boolean f = true;
  private kb g = new kb(this, null);
  private vb h = new vb(this);

  public void a()
  {
    if (!c())
      return;
    b(0);
  }

  public void b()
  {
    if (!c())
      return;
    this.g.b();
    b(1);
  }

  private boolean c()
  {
    if (this.b == null)
    {
      JFrame localJFrame = c.b().h();
      if (localJFrame == null)
        return false;
      this.b = new qb(localJFrame);
      this.b.a(this);
      this.b.pack();
      this.b.B();
    }
    return true;
  }

  private void b(int paramInt)
  {
    if (this.e != null)
      this.b.a(this.e);
    else
      this.b.a(this.d);
    this.e = null;
    this.b.a(paramInt);
    this.b.setVisible(true);
  }

  public void a(String paramString)
  {
    this.e = ((e)this.d.clone());
    if (paramString == null)
    {
      this.e.a = "";
      this.e.f = false;
    }
    else if (paramString.indexOf("\n") >= 0)
    {
      this.e.a = "";
      this.e.f = true;
    }
    else
    {
      this.e.a = paramString;
      this.e.f = false;
    }
  }

  public void a(int paramInt)
  {
    if (paramInt == -1)
    {
      this.g.c();
      this.b.setVisible(false);
      return;
    }
    e locale = this.b.a();
    Object localObject;
    if (locale.g)
    {
      try
      {
        localObject = Pattern.compile(locale.a);
      }
      catch (Exception localException)
      {
        ba.a(this.b.getParent(), ct.a(748), ct.b(132), -1, 2);
        return;
      }
      Matcher localMatcher = ((Pattern)localObject).matcher("");
      if (localMatcher.matches())
      {
        ba.a(this.b.getParent(), ct.a(712), ct.b(132), -1, 2);
        return;
      }
    }
    this.d = locale;
    if (paramInt == 0)
    {
      a(true, true);
      if (this.f)
        this.b.setVisible(false);
      this.f = true;
      return;
    }
    if (paramInt == 3)
    {
      a(true, true);
      return;
    }
    if (paramInt == 1)
    {
      b(this.b.c());
      return;
    }
    if (paramInt == 2)
    {
      localObject = this.b.c();
      c((String)localObject);
      return;
    }
  }

  public void a(JTextComponent paramJTextComponent)
  {
    if ((paramJTextComponent == null) || (paramJTextComponent.equals(this.c)))
      return;
    JTextComponent localJTextComponent = this.c;
    this.c = paramJTextComponent;
    this.g.a(localJTextComponent);
  }

  private db a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return a.a(this.c, this.d.a, paramInt1, paramInt2, this.d.g, this.d.b, this.d.c, paramBoolean);
  }

  private db a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!paramBoolean2)
      this.c.setSelectionStart(this.c.getSelectionEnd());
    db localdb = a.a(this.c, this.d.a, paramInt1, paramInt2, this.d.g, this.d.b, this.d.c, paramBoolean1);
    if ((!paramBoolean2) && (localdb != null))
    {
      this.c.select(localdb.b(), localdb.f());
      this.b.j();
    }
    return localdb;
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.d.a == null)
      return;
    int i = 0;
    if (((this.d.e) && (paramBoolean1)) || ((!this.d.e) && (!paramBoolean1)))
      i = 1;
    boolean bool = (this.c.getSelectionStart() != this.c.getSelectionEnd()) && (this.d.f);
    if (!bool)
      this.d.f = false;
    db localdb;
    if (i != 0)
      localdb = a(bool, -1);
    else
      localdb = b(bool, -1);
    if ((localdb == null) && (paramBoolean2) && (this.d.a.trim().length() > 0))
    {
      this.f = false;
      d();
    }
  }

  private db a(boolean paramBoolean, int paramInt)
  {
    int i = !paramBoolean ? this.c.getCaretPosition() : this.c.getSelectionStart();
    int j = !paramBoolean ? this.c.getDocument().getLength() : this.c.getSelectionEnd();
    if ((paramBoolean) && (this.h.a()) && (this.h.d() == this.c))
      i = this.h.e() + 1;
    if (paramInt != -1)
      i = paramInt;
    db localdb = a(i, j, true, paramBoolean);
    if ((localdb == null) && (this.d.d))
    {
      i = !paramBoolean ? 0 : this.c.getSelectionStart();
      localdb = a(i, j, true, paramBoolean);
    }
    if ((paramBoolean) && (localdb != null))
    {
      this.h.a((gx)this.c, localdb.b(), localdb.f());
      try
      {
        this.c.scrollRectToVisible(this.c.modelToView(localdb.f()));
        this.b.j();
      }
      catch (BadLocationException localBadLocationException)
      {
        cl.a(localBadLocationException);
      }
    }
    return localdb;
  }

  private db b(boolean paramBoolean, int paramInt)
  {
    int i = !paramBoolean ? 0 : this.c.getSelectionStart();
    int j = !paramBoolean ? this.c.getSelectionStart() : this.c.getSelectionEnd();
    if ((paramBoolean) && (this.h.a()) && (this.h.d() == this.c))
      j = this.h.e();
    if (paramInt != -1)
      if (!paramBoolean)
        i = paramInt;
      else
        j = paramInt;
    db localdb = a(i, j, false, paramBoolean);
    if ((localdb == null) && (this.d.d))
    {
      j = !paramBoolean ? this.c.getDocument().getLength() : this.c.getSelectionEnd();
      localdb = a(i, j, false, paramBoolean);
    }
    if ((paramBoolean) && (localdb != null))
    {
      this.h.a((gx)this.c, localdb.b(), localdb.f());
      try
      {
        this.c.scrollRectToVisible(this.c.modelToView(localdb.f()));
      }
      catch (BadLocationException localBadLocationException)
      {
        cl.a(localBadLocationException);
      }
    }
    return localdb;
  }

  private void b(String paramString)
  {
    boolean bool1 = this.h.a();
    boolean bool2 = this.d.e;
    int i;
    int j;
    if (bool1)
    {
      i = this.h.e();
      j = this.h.f() - i;
    }
    else
    {
      i = this.c.getSelectionStart();
      j = this.c.getSelectionEnd() - i;
    }
    int k = 0;
    try
    {
      k = a(i, j, paramString, bool1);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      ba.a(this.b.getParent(), ct.a(1780), ct.b(132), -1, 2);
      return;
    }
    if (bool2)
      a(bool1, i + k);
    else
      b(bool1, i);
  }

  private int a(int paramInt1, int paramInt2, String paramString, boolean paramBoolean)
  {
    Document localDocument = this.c.getDocument();
    int i = this.c.getSelectionStart();
    int j = this.c.getSelectionEnd();
    try
    {
      String str = this.c.getText(paramInt1, paramInt2);
      paramString = y.a(str, this.d.a, paramString, this.d.g, this.d.b);
      if (paramString == null)
        return -1;
      localDocument.remove(paramInt1, paramInt2);
      localDocument.insertString(paramInt1, paramString, null);
      if (paramBoolean)
      {
        j = j - paramInt2 + paramString.length();
        if ((i != this.c.getSelectionStart()) || (j != this.c.getSelectionEnd()))
          this.c.select(i, j);
      }
      return paramString.length();
    }
    catch (BadLocationException localBadLocationException)
    {
    }
    return -1;
  }

  private void c(String paramString)
  {
    if (this.d.a == null)
      return;
    boolean bool = (this.c.getSelectionStart() != this.c.getSelectionEnd()) && (this.d.f);
    if (!bool)
      this.d.f = false;
    int i;
    if (this.d.e)
      i = a(paramString, bool);
    else
      i = b(paramString, bool);
    if (i == -1)
      return;
    if (i == 0)
    {
      d();
      return;
    }
    String str;
    if (i == 1)
      str = ct.a(1305);
    else
      str = ct.a(1306, "" + i);
    JOptionPane.showMessageDialog(this.b, str, ct.a(262), 1);
  }

  private int a(String paramString, boolean paramBoolean)
  {
    int i = 0;
    Document localDocument = this.c.getDocument();
    int j = this.c.getSelectionStart();
    int k = !paramBoolean ? localDocument.getLength() : this.c.getSelectionEnd();
    if ((paramBoolean) && (this.h.a()) && (this.h.d() == this.c))
      j = this.h.e();
    Position localPosition = null;
    try
    {
      localPosition = localDocument.createPosition(j);
    }
    catch (Exception localException)
    {
    }
    db localdb = a(j, k, true);
    try
    {
      while (localdb != null)
      {
        i++;
        j = localdb.b();
        int m = a(j, localdb.f() - j, paramString, paramBoolean);
        j += m;
        k = !paramBoolean ? localDocument.getLength() : this.c.getSelectionEnd();
        localdb = a(j, k, true);
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException1)
    {
      ba.a(this.b.getParent(), ct.a(1780), ct.b(132), -1, 2);
      return -1;
    }
    if (!this.d.d)
      return i;
    j = !paramBoolean ? 0 : this.c.getSelectionStart();
    k = !paramBoolean ? localDocument.getLength() : this.c.getSelectionEnd();
    localdb = a(j, k, true);
    try
    {
      while ((localdb != null) && (localdb.b() < localPosition.getOffset()))
      {
        i++;
        j = localdb.b();
        int n = a(j, localdb.f() - j, paramString, paramBoolean);
        j += n;
        k = !paramBoolean ? localDocument.getLength() : this.c.getSelectionEnd();
        localdb = a(j, k, true);
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException2)
    {
      ba.a(this.b.getParent(), ct.a(1780), ct.b(132), -1, 2);
      return -1;
    }
    return i;
  }

  private int b(String paramString, boolean paramBoolean)
  {
    int i = 0;
    Document localDocument = this.c.getDocument();
    int j = !paramBoolean ? 0 : this.c.getSelectionStart();
    int k = this.c.getSelectionEnd();
    if ((paramBoolean) && (this.h.a()) && (this.h.d() == this.c))
      k = this.h.f();
    Position localPosition = null;
    try
    {
      localPosition = localDocument.createPosition(k);
    }
    catch (Exception localException)
    {
    }
    db localdb = a(j, k, false);
    try
    {
      while (localdb != null)
      {
        i++;
        k = localdb.b();
        a(k, localdb.f() - k, paramString, paramBoolean);
        localdb = a(j, k, false);
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException1)
    {
      ba.a(this.b.getParent(), ct.a(1780), ct.b(132), -1, 2);
      return -1;
    }
    if (!this.d.d)
      return i;
    k = !paramBoolean ? localDocument.getLength() : this.c.getSelectionEnd();
    localdb = a(j, k, false);
    try
    {
      while ((localdb != null) && (localdb.b() > localPosition.getOffset()))
      {
        i++;
        k = localdb.b();
        a(k, localdb.f() - k, paramString, paramBoolean);
        localdb = a(j, k, false);
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException2)
    {
      ba.a(this.b.getParent(), ct.a(1780), ct.b(132), -1, 2);
      return -1;
    }
    return i;
  }

  private void d()
  {
    String str = ct.a(728);
    Object localObject = null;
    if (this.b.isVisible())
      localObject = this.b;
    else
      localObject = c.b().h();
    JOptionPane.showMessageDialog((Component)localObject, str, ct.a(262), 1);
  }

  static JTextComponent a(gb paramgb)
  {
    return paramgb.c;
  }

  static vb b(gb paramgb)
  {
    return paramgb.h;
  }

  static e c(gb paramgb)
  {
    return paramgb.d;
  }

  static y e()
  {
    return a;
  }

  static qb d(gb paramgb)
  {
    return paramgb.b;
  }

  static kb e(gb paramgb)
  {
    return paramgb.g;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.gb
 * JD-Core Version:    0.6.0
 */