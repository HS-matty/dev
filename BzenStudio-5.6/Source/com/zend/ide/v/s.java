package com.zend.ide.v;

import com.zend.ide.j.h;
import com.zend.ide.n.bw;
import com.zend.ide.n.ea;
import com.zend.ide.p.d.bl;
import java.io.File;
import javax.swing.Icon;

class s
  implements ea
{
  final e a;

  private s(e parame)
  {
  }

  public void a(String paramString1, String paramString2)
  {
    a(paramString2);
  }

  public void a(String paramString, boolean paramBoolean)
  {
    a(paramString);
  }

  private void a(String paramString)
  {
    paramString = paramString == null ? "" : paramString;
    for (int i = 0; i < this.a.j(); i++)
    {
      bw localbw = e.a(this.a, i);
      if ((localbw == null) || (!localbw.k().equals(paramString)))
        continue;
      e.b(this.a).setToolTipTextAt(i, paramString);
      int j = Math.max(paramString.lastIndexOf("\\"), paramString.lastIndexOf("/")) + 1;
      String str = paramString.substring(j);
      File localFile = h.m.g(paramString);
      Object localObject = e.a(this.a);
      if (localFile.exists())
        localObject = bl.q.getSystemIcon(localFile);
      e.b(this.a).setIconAt(i, (Icon)localObject);
      boolean bool = localbw.l();
      if (bool)
        str = str + '*';
      e.b(this.a).setTitleAt(i, str);
      break;
    }
  }

  s(e parame, q paramq)
  {
    this(parame);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.s
 * JD-Core Version:    0.6.0
 */