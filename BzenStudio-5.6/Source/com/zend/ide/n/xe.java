package com.zend.ide.n;

import java.awt.Rectangle;
import javax.swing.plaf.TextUI;

class xe
  implements Runnable
{
  final we a;

  xe(we paramwe)
  {
  }

  public void run()
  {
    try
    {
      Rectangle localRectangle1 = this.a.b.getVisibleRect();
      Rectangle localRectangle2 = this.a.b.getUI().modelToView(this.a.b, this.a.a, null);
      if (localRectangle2.y < localRectangle1.y)
        localRectangle2.y = Math.max(0, localRectangle2.y - localRectangle1.height / 4);
      if ((localRectangle2.y + localRectangle2.height >= localRectangle1.y + localRectangle1.height) || (localRectangle1.contains(localRectangle1.x, localRectangle2.y)))
        localRectangle2.y += localRectangle1.height / 4 * 3 - localRectangle2.height;
      this.a.b.scrollRectToVisible(localRectangle2);
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.xe
 * JD-Core Version:    0.6.0
 */