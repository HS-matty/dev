package com.zend.ide.desktop.e;

import com.zend.ide.bd.c;
import com.zend.ide.be.b;
import com.zend.ide.be.d;
import com.zend.ide.be.i;
import com.zend.ide.be.l;
import com.zend.ide.cb.a.k;
import com.zend.ide.cb.a.kb;
import com.zend.ide.cb.c.w;
import com.zend.ide.cb.u;
import com.zend.ide.util.bn;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.Rectangle;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class e
  implements kb
{
  private static final ImageIcon a = cv.b("sql/resultsTab.gif");
  private w b;
  private k c;
  private k d;
  private l e;
  private boolean f;
  private bn g;
  private boolean h;
  private boolean i;

  public e(bn parambn)
  {
    this.g = parambn;
    this.b = new w(this);
    a();
  }

  private void a()
  {
    if (!this.i)
    {
      this.i = true;
      d locald = c.b().c();
      ImageIcon localImageIcon = cv.b("sql/database.gif");
      l locall = (l)locald.a("FileManagerWindowID");
      locall.a("SQL", localImageIcon, b(), null, "SQL_TREE");
    }
  }

  private JComponent b()
  {
    return this.b.g();
  }

  private k c()
  {
    return this.b.e();
  }

  public void a(k paramk)
  {
    this.c = paramk;
  }

  public void b(k paramk)
  {
    this.d = paramk;
  }

  private l d()
  {
    if ((this.e == null) && (this.c != null) && (this.d != null))
    {
      d locald = c.b().c();
      i locali = new i(true, false, 1, 1.0D, 2, new Rectangle(100, 100, 500, 250));
      ImageIcon localImageIcon1 = cv.b("sql/queryEditor.gif");
      ImageIcon localImageIcon2 = cv.b("sql/messages.gif");
      this.e = locald.a("SQL", localImageIcon1, null, false, locali);
      this.e.a("SQL", localImageIcon1, this.c.a(), ct.a(1581), "SQL_QUERY_CONTROL");
      this.e.a(ct.a(1218), localImageIcon2, this.d.a(), ct.a(1580), "SQL_MESSAGES");
      InputMap localInputMap = this.e.b().getInputMap(2);
      ActionMap localActionMap = this.e.b().getActionMap();
      localInputMap.put(KeyStroke.getKeyStroke(10, 2), "switchTab");
      localActionMap.put("switchTab", new g(this, null));
    }
    return this.e;
  }

  public void a(boolean paramBoolean)
  {
    d locald = c.b().c();
    if (paramBoolean)
      synchronized (this)
      {
        if ((locald != null) && (!locald.b("queryControl")))
        {
          l locall = d();
          if (locall != null)
            locald.a("queryControl", locall);
        }
      }
    else
      try
      {
        synchronized (this)
        {
          if ((locald != null) && (locald.b("queryControl")))
            locald.a("queryControl");
        }
      }
      catch (b localb)
      {
      }
  }

  public boolean a()
  {
    d locald = c.b().c();
    if (locald == null)
      return false;
    return locald.b("queryControl");
  }

  public void b(boolean paramBoolean)
  {
    d locald = c.b().c();
    if (locald != null)
      if (locald.b("queryControl"))
        locald.a("queryControl", paramBoolean);
      else if (paramBoolean)
        locald.a("queryControl", d());
  }

  public void b()
  {
    c(this.d);
  }

  public void c()
  {
    c(this.c);
  }

  private void c(k paramk)
  {
    if (paramk == null)
      return;
    d locald = c.b().c();
    l locall = null;
    try
    {
      locall = (l)locald.a("queryControl");
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
    }
    if (locall != null)
      locall.a(paramk.a());
    paramk.a().validate();
    paramk.e();
  }

  public void a(String paramString)
  {
    c(true);
    d locald = c.b().c();
    l locall = (l)locald.a("EditorComponent");
    locall.a(c().a());
    this.b.a(paramString);
  }

  public void c(boolean paramBoolean)
  {
    synchronized (this)
    {
      if (this.h)
        return;
      this.h = true;
    }
    if (paramBoolean == this.f)
    {
      if (!paramBoolean)
      {
        _u_var = c.b().c();
        locall = (l)((d)__x).a("EditorComponent");
        try
        {
          locall.e("SQL");
        }
        catch (Throwable localThrowable)
        {
        }
      }
      synchronized (this)
      {
        this.h = false;
      }
      return;
    }
    __x = c.b().c();
    l locall = (l)((d)__x).a("EditorComponent");
    if (paramBoolean)
    {
      if (!this.f)
        locall.a("SQL", a, c().a(), null, "SQL_DATA_DISPLAY");
    }
    else if (this.f)
    {
      this.b.h();
      try
      {
        locall.a("SQL", 0);
      }
      catch (Throwable localThrowable)
      {
      }
    }
    this.f = paramBoolean;
    synchronized (this)
    {
      this.h = false;
    }
  }

  public void e()
  {
    this.b.l();
    this.b.f().c();
    this.b.c();
  }

  public void d()
  {
    e();
    this.b.f().a();
  }

  public boolean e()
  {
    return this.b.f().b() > 0;
  }

  public bn d()
  {
    return this.g;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.e.e
 * JD-Core Version:    0.6.0
 */