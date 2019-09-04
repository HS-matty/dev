package com.zend.ide.desktop;

import com.zend.ide.hb.d;
import com.zend.ide.hb.fb;
import com.zend.ide.n.bw;
import com.zend.ide.util.a.b;
import com.zend.ide.util.cl;
import com.zend.ide.util.dj;
import java.io.File;
import javax.swing.SwingUtilities;

class ca
  implements fb
{
  final co a;

  private ca(co paramco)
  {
  }

  public void a(d paramd)
  {
    int i = paramd.g().length();
    String str = paramd.f().getAbsolutePath();
    try
    {
      if (co.a(this.a).a(str, null, -1))
        SwingUtilities.invokeLater(new hc(this, paramd, i));
    }
    catch (dj localdj)
    {
      b.a(localdj);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    co.a(this.a).grabFocus();
  }

  ca(co paramco, bz parambz)
  {
    this(paramco);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.ca
 * JD-Core Version:    0.6.0
 */