package com.zend.ide.cb.a;

import com.zend.ide.bc.a;
import com.zend.ide.util.cv;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class u
  implements k
{
  private static final ImageIcon a = cv.b("sql/sql.gif");
  private od b = new od(this, "sqlResults");
  private String c;
  private HashMap d = new HashMap();

  public u()
  {
    a("sqlResults");
    a.a(this.b, "SQL_DATA_DISPLAY");
  }

  public void a(k paramk, boolean paramBoolean)
  {
    if ((paramk != null) && (paramk.a() != null))
    {
      if ((paramBoolean) || (this.d.isEmpty()))
      {
        a(paramk);
        this.b.addTab(paramk.d(), a, paramk.a());
      }
      else
      {
        int i = this.b.getSelectedIndex();
        k localk = (k)this.d.remove(this.b.getTitleAt(i));
        a(paramk);
        this.b.setComponentAt(i, paramk.a());
        this.b.setTitleAt(i, paramk.d());
        if (localk != null)
          localk.c();
      }
      this.b.validate();
    }
    this.d.put(paramk.d(), paramk);
    this.b.a().e();
  }

  private void a(k paramk)
  {
    String str1 = paramk.d();
    String str2 = str1;
    for (int i = 1; this.d.containsKey(str2); i++)
      str2 = str1 + " (" + i + ')';
    paramk.a(str2);
  }

  public void b(String paramString)
  {
    if (paramString != null)
    {
      k localk = (k)this.d.get(paramString);
      if (localk != null)
      {
        localk.c();
        this.d.remove(localk.d());
        this.b.removeTabAt(this.b.a(localk.a()));
      }
    }
  }

  public void a()
  {
    this.b.removeAll();
    Iterator localIterator = this.d.values().iterator();
    while (localIterator.hasNext())
    {
      k localk = (k)localIterator.next();
      localk.c();
    }
    this.d.clear();
  }

  public void c(String paramString)
  {
    if (paramString != null)
    {
      k localk = (k)this.d.get(paramString);
      this.b.setSelectedIndex(this.b.a(localk.a()));
    }
  }

  public JComponent a()
  {
    return this.b;
  }

  public void c()
  {
    a();
  }

  public void a(String paramString)
  {
    this.c = paramString;
  }

  public String d()
  {
    return this.c;
  }

  public boolean e()
  {
    return this.b.requestFocusInWindow();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.u
 * JD-Core Version:    0.6.0
 */