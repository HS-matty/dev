package com.zend.ide.f;

import com.zend.ide.b.m;
import com.zend.ide.f.b.c;
import com.zend.ide.j.h;
import com.zend.ide.m.t;
import com.zend.ide.n.dz;
import com.zend.ide.p.a.a;
import com.zend.ide.util.bh;
import com.zend.ide.y.b;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.AbstractAction;
import javax.swing.text.Document;

public class fe extends AbstractAction
{
  final db a;

  public fe(db paramdb)
  {
    super("RefreshSoapClientAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    Object localObject1 = this.a.getLastSelectedPathComponent();
    if ((localObject1 instanceof c))
    {
      t localt = (t)((c)localObject1).getUserObject();
      com.zend.ide.f.yb.d.a().a(localt);
      String str = localt.f().c();
      File localFile = h.m.g(str);
      dz localdz = com.zend.ide.v.d.y().a(str);
      try
      {
        if (localdz != null)
        {
          localObject2 = localdz.getDocument();
          bp.d().a(new a((Document)localObject2), str);
          return;
        }
        Object localObject2 = h.m.f(localFile);
        bh localbh = (bh)b.a("editing.encoding");
        InputStreamReader localInputStreamReader;
        if ((localbh == null) || (localbh.equals(bh.a)))
          localInputStreamReader = new InputStreamReader((InputStream)localObject2);
        else
          localInputStreamReader = new InputStreamReader((InputStream)localObject2, localbh.c());
        bp.d().a(localInputStreamReader, localFile.getPath());
      }
      catch (Exception localException)
      {
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.fe
 * JD-Core Version:    0.6.0
 */