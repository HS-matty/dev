package com.zend.ide.n.td;

import com.zend.ide.util.cl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.swing.text.Highlighter;

public class ib
  implements lb
{
  private Highlighter a;
  private Map b;
  private Object c = new Object();

  public ib(Highlighter paramHighlighter)
  {
    this.a = paramHighlighter;
    this.b = new HashMap();
  }

  public void a(ec paramec)
  {
    gb localgb = paramec.a();
    a(localgb);
  }

  public void b(ec paramec)
  {
    List localList = paramec.b();
    for (int i = 0; i < localList.size(); i++)
      a((gb)localList.get(i));
  }

  public void c(ec paramec)
  {
    gb localgb = paramec.a();
    b(localgb);
  }

  public void a(ec paramec, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      h(paramec);
    }
    else
    {
      List localList = paramec.b();
      for (int i = 0; i < localList.size(); i++)
        b((gb)localList.get(i));
    }
  }

  public void d(ec paramec)
  {
    gb localgb = paramec.a();
    b(localgb);
  }

  public void e(ec paramec)
  {
    gb localgb = paramec.a();
    a(localgb);
  }

  public void f(ec paramec)
  {
    List localList = paramec.b();
    for (int i = 0; i < localList.size(); i++)
    {
      gb localgb = (gb)localList.get(i);
      b(localgb);
      a(localgb);
    }
  }

  public void g(ec paramec)
  {
    synchronized (this.c)
    {
      this.a.removeAllHighlights();
    }
  }

  public void h(ec paramec)
  {
    synchronized (this.c)
    {
      this.a.removeAllHighlights();
    }
  }

  private void a(gb paramgb)
  {
    if (!paramgb.c())
      return;
    try
    {
      synchronized (this.c)
      {
        Object localObject1 = this.a.addHighlight(paramgb.d(), paramgb.e(), new DefaultHighlighter.DefaultHighlightPainter(paramgb.i().d()));
        this.b.put(paramgb, localObject1);
      }
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
  }

  private void b(gb paramgb)
  {
    synchronized (this.c)
    {
      Object localObject1 = this.b.get(paramgb);
      if (localObject1 != null)
      {
        this.a.removeHighlight(localObject1);
        this.b.remove(paramgb);
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.ib
 * JD-Core Version:    0.6.0
 */