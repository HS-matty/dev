package com.zend.ide.desktop.a;

import com.zend.ide.a.b;
import com.zend.ide.l.k;
import com.zend.ide.n.bw;
import com.zend.ide.n.cb;
import com.zend.ide.n.u;

public class a
  implements k
{
  private bw a;

  public a(bw parambw)
  {
    this.a = parambw;
  }

  public Object m()
  {
    return ((cb)b.a(this.a, "BookmarksTool")).e();
  }

  public void a(Object paramObject)
  {
    ((cb)b.a(this.a, "BookmarksTool")).b(paramObject);
  }

  public boolean b(Object paramObject)
  {
    return false;
  }

  public Object b()
  {
    return "bookmarks";
  }

  public Object d()
  {
    return new u();
  }

  public boolean a(boolean paramBoolean)
  {
    return true;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.a.a
 * JD-Core Version:    0.6.0
 */