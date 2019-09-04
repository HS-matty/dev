package com.zend.ide.desktop;

import com.zend.ide.be.m;
import com.zend.ide.fb.fb;
import javax.swing.SwingUtilities;

class qc
  implements m
{
  final ac a;

  qc(ac paramac)
  {
  }

  public void a(String paramString)
  {
    if ((paramString.equals("Browser")) && (!ez.b(this.a.c).c()))
      SwingUtilities.invokeLater(new rc(this));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.qc
 * JD-Core Version:    0.6.0
 */