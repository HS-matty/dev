package com.zend.ide.u;

import com.zend.ide.h.e;
import com.zend.ide.util.dr;
import com.zend.ide.util.f.i;
import com.zend.ide.util.s;
import java.util.Map;
import javax.swing.Action;

public class bq extends s
{
  final bs g;

  public bq(bs parambs)
  {
  }

  private void a()
  {
    br localbr = new br(this);
    a(localbr);
    Object localObject = new i(new com.zend.ide.util.a.f(new bx()));
    a("keys.addFTPServer", (Action)localObject, "filesystem", true);
    localObject = new com.zend.ide.util.a.f(new by(this.g));
    a("keys.propertiesActionKey", (Action)localObject, "ftproot", true);
    localObject = new com.zend.ide.util.a.f(new ca(this.g));
    a("keys.removeFTPServer", (Action)localObject, "ftproot", true);
    localObject = new com.zend.ide.util.a.f(new bz(this.g));
    localObject = new dr(this, (Action)localObject, localbr);
    a("keys.FTPRootConnection", (Action)localObject, "ftproot", true);
  }

  public void c(Map paramMap, String paramString)
  {
    if ((paramString.equals("root")) && ((this.g.f().x() instanceof f)))
    {
      Map localMap = f("ftproot");
      paramMap.putAll(localMap);
    }
    super.c(paramMap, paramString);
  }

  static void a(bq parambq)
  {
    parambq.a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.bq
 * JD-Core Version:    0.6.0
 */