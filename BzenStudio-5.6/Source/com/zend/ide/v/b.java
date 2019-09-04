package com.zend.ide.v;

import com.zend.ide.n.bw;
import com.zend.ide.n.ea;
import java.util.ArrayList;

class b
  implements ea
{
  final d a;

  private b(d paramd)
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
    for (int i = 0; i < d.a(this.a).size(); i++)
    {
      bw localbw = (bw)d.a(this.a).get(i);
      if ((localbw == null) || (!localbw.k().equals(paramString)))
        continue;
      d.c((w)localbw);
    }
  }

  b(d paramd, l paraml)
  {
    this(paramd);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.b
 * JD-Core Version:    0.6.0
 */