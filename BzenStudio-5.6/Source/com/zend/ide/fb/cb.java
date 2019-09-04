package com.zend.ide.fb;

import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

class cb
  implements Runnable
{
  final String a;
  final gb b;

  cb(gb paramgb, String paramString)
  {
  }

  public void run()
  {
    try
    {
      ImageIcon localImageIcon = new ImageIcon(new b(this.b.d, this.a).toImage());
      db.b(this.b.d).put(db.b(this.a), localImageIcon);
      gb.a(this.b).setIcon(localImageIcon);
    }
    catch (Exception localException)
    {
      db.b(this.b.d).put(db.b(this.a), db.a());
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.cb
 * JD-Core Version:    0.6.0
 */