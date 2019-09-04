package com.zend.ide.util;

import com.zend.ide.bd.c;
import java.awt.Component;
import javax.swing.JFrame;

class ub
  implements Runnable
{
  final cj a;

  ub(cj paramcj)
  {
  }

  public void run()
  {
    try
    {
      c.b().h().getMostRecentFocusOwner().requestFocus();
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.ub
 * JD-Core Version:    0.6.0
 */