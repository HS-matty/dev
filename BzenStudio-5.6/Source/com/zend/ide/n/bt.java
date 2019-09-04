package com.zend.ide.n;

import com.zend.ide.j.bc;
import com.zend.ide.p.ba;
import com.zend.ide.util.ct;
import java.io.File;

class bt extends bc
{
  final ce a;

  private bt(ce paramce)
  {
  }

  public void c(File paramFile, boolean paramBoolean)
  {
    bw localbw = this.a.b();
    String str1 = paramFile.getPath();
    dz localdz = this.a.b().a(str1);
    if (localdz == null)
      return;
    if (paramBoolean)
    {
      String str2 = ct.a(161, str1);
      String str3 = ct.a(160);
      int i = ba.a(localbw.e(), str2, str3, 1, 2, true);
      if (i == 0)
      {
        int j = 0;
        do
        {
          j = 0;
          int k = br.b(localdz);
          if (k == 1)
            return;
          if (k != -1)
            continue;
          j = 1;
        }
        while (j != 0);
      }
      if (i == 2)
      {
        localdz.c(true);
        return;
      }
    }
    localbw.a(str1, false);
  }

  bt(ce paramce, bs parambs)
  {
    this(paramce);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.bt
 * JD-Core Version:    0.6.0
 */