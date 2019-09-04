package com.zend.ide.n;

import java.util.Iterator;
import java.util.Stack;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

class bh
  implements CaretListener
{
  private bi a;
  private Stack b = new Stack();
  private Stack c = new Stack();
  private int d = 200;
  final cc e;

  public bh(cc paramcc)
  {
  }

  public void caretUpdate(CaretEvent paramCaretEvent)
  {
    a(new bi(this.e.b().k(), paramCaretEvent.getDot()));
  }

  public void a(bi parambi)
  {
    if (this.a == null)
      this.a = parambi;
    if (this.a.equals(parambi))
      return;
    boolean bool1 = this.c.isEmpty();
    boolean bool2 = this.b.isEmpty();
    this.b.push(this.a);
    this.a = parambi;
    this.c.clear();
    if (bool2)
      cc.b(this.e).c();
    if (!bool1)
      cc.c(this.e).c();
  }

  public boolean e()
  {
    return !this.b.isEmpty();
  }

  private boolean b(bi parambi)
  {
    String str = parambi.c();
    int i = parambi.b();
    dz localdz = this.e.b().a(str);
    if (localdz != null)
    {
      int j = localdz.getDocument().getLength();
      if (i > j)
        return false;
    }
    try
    {
      this.e.b().a(str, null, i);
    }
    catch (Exception localException)
    {
      return false;
    }
    return true;
  }

  public void b()
  {
    if (!e())
      return;
    boolean bool1 = this.c.isEmpty();
    bi localbi1 = (bi)this.b.pop();
    boolean bool2 = localbi1.equals(this.a);
    bi localbi2 = this.a;
    this.a = localbi1;
    if ((bool2) || (!b(localbi1)))
    {
      this.a = localbi2;
      b();
      cc.b(this.e).c();
      return;
    }
    if ((this.c.isEmpty()) || (!this.c.peek().equals(localbi2)))
      this.c.push(localbi2);
    if (this.c.size() > this.d)
      this.c.removeElementAt(0);
    this.a = localbi1;
    cc.b(this.e).c();
    if (bool1)
      cc.c(this.e).c();
    this.e.b().e().requestFocus();
  }

  public boolean c()
  {
    return !this.c.isEmpty();
  }

  public void d()
  {
    if (!c())
      return;
    boolean bool1 = this.b.isEmpty();
    bi localbi1 = (bi)this.c.pop();
    boolean bool2 = localbi1.equals(this.a);
    bi localbi2 = this.a;
    this.a = localbi1;
    if ((bool2) || (!b(localbi1)))
    {
      this.a = localbi2;
      d();
      cc.c(this.e).c();
      return;
    }
    if ((this.b.isEmpty()) || (!this.b.peek().equals(localbi2)))
      this.b.push(localbi2);
    if (this.b.size() > this.d)
      this.b.removeElementAt(0);
    this.a = localbi1;
    cc.c(this.e).c();
    if (bool1)
      cc.b(this.e).c();
    this.e.b().e().requestFocus();
  }

  public void a(String paramString1, String paramString2)
  {
    Iterator localIterator = this.b.iterator();
    bi localbi;
    while (localIterator.hasNext())
    {
      localbi = (bi)localIterator.next();
      if (localbi.c().equals(paramString1))
        localbi.a(paramString2);
    }
    localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      localbi = (bi)localIterator.next();
      if (localbi.c().equals(paramString1))
        localbi.a(paramString2);
    }
    if ((this.a != null) && (this.a.c().equals(paramString1)))
      this.a.a(paramString2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.bh
 * JD-Core Version:    0.6.0
 */