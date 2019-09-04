package com.zend.ide.p;

import com.zend.ide.util.cl;
import javax.swing.SwingUtilities;

public class bx
{
  public static void a(Runnable paramRunnable)
  {
    if (paramRunnable == null)
      return;
    try
    {
      if (SwingUtilities.isEventDispatchThread())
        paramRunnable.run();
      else
        SwingUtilities.invokeAndWait(paramRunnable);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.bx
 * JD-Core Version:    0.6.0
 */