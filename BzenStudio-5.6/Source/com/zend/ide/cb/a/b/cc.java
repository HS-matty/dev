package com.zend.ide.cb.a.b;

import com.zend.ide.cb.g;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class cc extends a
  implements Transferable
{
  private static final DataFlavor[] h = { DataFlavor.stringFlavor };

  public cc(g paramg)
  {
    super(paramg);
  }

  public cc(Object paramObject, boolean paramBoolean)
  {
    super(paramObject, paramBoolean);
  }

  public DataFlavor[] getTransferDataFlavors()
  {
    return h;
  }

  public boolean isDataFlavorSupported(DataFlavor paramDataFlavor)
  {
    return paramDataFlavor.equals(h[0]);
  }

  public Object getTransferData(DataFlavor paramDataFlavor)
    throws UnsupportedFlavorException, IOException
  {
    if (!isDataFlavorSupported(paramDataFlavor))
      throw new UnsupportedFlavorException(paramDataFlavor);
    if (getUserObject() != null)
      return getUserObject().toString();
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.cc
 * JD-Core Version:    0.6.0
 */