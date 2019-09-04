package com.zend.ide.o;

import com.zend.ide.j.h;
import com.zend.ide.n.dz;
import com.zend.ide.v.x;
import java.io.File;
import javax.swing.SwingUtilities;

class dn extends x
{
  final fp b;

  dn(fp paramfp)
  {
  }

  public void a(dz paramdz, boolean paramBoolean)
  {
    if (!paramBoolean)
      return;
    File localFile = h.m.g(paramdz.k());
    fl localfl = (fl)this.b.b(localFile.getName());
    if (localfl != null)
    {
      fp.b(this.b).e();
      SwingUtilities.invokeLater(new xb(this, localfl));
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.dn
 * JD-Core Version:    0.6.0
 */