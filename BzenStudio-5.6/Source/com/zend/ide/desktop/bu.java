package com.zend.ide.desktop;

import com.zend.ide.util.dk;
import com.zend.ide.util.dp;
import com.zend.ide.util.n;
import com.zend.ide.util.o;
import com.zend.ide.util.p;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.AbstractButton;
import javax.swing.KeyStroke;

class bu
  implements p
{
  final dz a;

  private bu(dz paramdz)
  {
  }

  public void a(dk paramdk)
  {
    String str1 = paramdk.b();
    Iterator localIterator = dz.a(this.a).iterator();
    while (localIterator.hasNext())
    {
      AbstractButton localAbstractButton = (AbstractButton)localIterator.next();
      String str2 = (String)localAbstractButton.getClientProperty("actionKey");
      if (str2.equals(str1))
      {
        dp localdp = (dp)localAbstractButton.getAction();
        KeyStroke localKeyStroke = n.c().a(str2).f();
        localdp.putValue("AcceleratorKey", localKeyStroke);
        localAbstractButton.setAction(dz.a(this.a));
        localAbstractButton.setAction(localdp);
      }
    }
  }

  bu(dz paramdz, bp parambp)
  {
    this(paramdz);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.bu
 * JD-Core Version:    0.6.0
 */