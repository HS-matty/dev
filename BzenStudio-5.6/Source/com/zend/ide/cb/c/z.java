package com.zend.ide.cb.c;

import com.zend.ide.cb.q;
import com.zend.ide.cb.v;
import com.zend.ide.util.c.d;
import java.sql.SQLException;

class z
  implements d
{
  private String a;
  private q b;
  private v c;
  private boolean d;
  private boolean e;
  final w f;

  z(w paramw, String paramString, q paramq, v paramv, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramString;
    this.b = paramq;
    this.c = paramv;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
  }

  public Object k()
  {
    try
    {
      w.a(this.f, this.a, this.b, this.c, this.d, this.e, false);
    }
    catch (SQLException localSQLException)
    {
    }
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.z
 * JD-Core Version:    0.6.0
 */