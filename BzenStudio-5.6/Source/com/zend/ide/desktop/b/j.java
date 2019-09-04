package com.zend.ide.desktop.b;

import com.zend.ide.t.g;
import com.zend.ide.t.i;
import com.zend.ide.util.cl;
import com.zend.ide.util.d.a;

public class j
  implements i
{
  private a a = new a();

  public j()
  {
    this.a.a(n.d, new n());
    this.a.a(e.e, new e());
    this.a.a(d.e, new d());
    this.a.a(m.d, new m());
  }

  public g a(int paramInt)
  {
    try
    {
      return (g)this.a.b(paramInt).getClass().newInstance();
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.b.j
 * JD-Core Version:    0.6.0
 */