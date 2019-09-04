package com.zend.ide.db;

import com.zend.ide.util.cl;
import com.zend.ide.util.cv;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class cb
  implements ItemListener
{
  final x a;

  cb(x paramx)
  {
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    String str = "phpdocumentor/" + x.x()[x.i(this.a).getSelectedIndex()];
    try
    {
      x.j(this.a).a(cv.b(str));
      x.j(this.a).repaint();
    }
    catch (Exception localException)
    {
      cl.a("Could not load image: " + str);
      cl.a(localException);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.db.cb
 * JD-Core Version:    0.6.0
 */