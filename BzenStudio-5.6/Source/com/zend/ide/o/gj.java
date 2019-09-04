package com.zend.ide.o;

import com.zend.ide.bd.c;
import com.zend.ide.p.ba;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.io.InputStream;

public class gj extends ci
  implements cu, ge
{
  private de a;
  private fk b;

  public gj(fk paramfk, de paramde)
  {
    this.a = paramde;
    this.b = paramfk;
  }

  public void a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.a.l();
    this.b.bl().setVisible(false);
    ba.a(c.b().h(), ct.a(988), ct.a(986), 1);
  }

  public InputStream c(String paramString)
  {
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.gj
 * JD-Core Version:    0.6.0
 */