package com.zend.ide.h;

import com.zend.ide.j.t;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.File;

public class q extends o
{
  final i d;

  protected q(i parami)
  {
    super(parami);
  }

  public boolean b()
  {
    Transferable localTransferable = null;
    try
    {
      localTransferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(this.d.i);
    }
    catch (IllegalStateException localIllegalStateException)
    {
      return false;
    }
    if (!localTransferable.isDataFlavorSupported(DataFlavor.javaFileListFlavor))
      return false;
    if ((t.c() & 0x3) == 0)
      return false;
    bg localbg = (bg)this.d.i.getLastSelectedPathComponent();
    File localFile = bf.a(this.d.i, localbg);
    if (localFile == null)
      return false;
    return super.b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.q
 * JD-Core Version:    0.6.0
 */