package com.zend.ide.h;

import com.zend.ide.j.t;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;

public class z extends AbstractAction
{
  final bf a;

  public z(bf parambf)
  {
    super(bf.A);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bg localbg = (bg)this.a.getLastSelectedPathComponent();
    File localFile = bf.a(this.a, localbg);
    if (localFile == null)
      return;
    try
    {
      this.a.a(true);
      t.a(localFile, this.a);
    }
    finally
    {
      this.a.a(false);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.z
 * JD-Core Version:    0.6.0
 */