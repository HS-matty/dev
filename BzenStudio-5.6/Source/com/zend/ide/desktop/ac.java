package com.zend.ide.desktop;

import com.zend.ide.be.d;
import com.zend.ide.be.l;
import com.zend.ide.util.cv;
import javax.swing.Icon;

class ac
  implements Runnable
{
  final boolean a;
  final boolean b;
  final ez c;

  ac(ez paramez, boolean paramBoolean1, boolean paramBoolean2)
  {
  }

  public void run()
  {
    if (ez.b(this.c) == null)
      ez.a(this.c, new com.zend.ide.fb.fb());
    Object localObject;
    if (this.a)
    {
      localObject = cv.b("browser_icon.gif");
      l locall = (l)fb.a(this.c.d).a("EditorComponent");
      locall.a("Browser", (Icon)localObject, ez.b(this.c), null, "BROWSER");
      locall.a(new qc(this));
      if (this.b)
        locall.b("Browser");
    }
    else
    {
      localObject = (l)fb.a(this.c.d).a("EditorComponent");
      if (localObject != null)
        ((l)localObject).e("Browser");
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.ac
 * JD-Core Version:    0.6.0
 */