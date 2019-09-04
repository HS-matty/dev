package com.zend.ide.j;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class z
  implements Transferable
{
  private List a = new ArrayList(1);
  private static DataFlavor[] b = { DataFlavor.javaFileListFlavor };

  z(File paramFile)
  {
    this.a.add(paramFile);
  }

  z(List paramList)
  {
    this.a.addAll(paramList);
  }

  z(File[] paramArrayOfFile)
  {
    this(Arrays.asList(paramArrayOfFile));
  }

  public Object getTransferData(DataFlavor paramDataFlavor)
    throws UnsupportedFlavorException, IOException
  {
    if (!isDataFlavorSupported(paramDataFlavor))
      throw new UnsupportedFlavorException(paramDataFlavor);
    return this.a;
  }

  public boolean isDataFlavorSupported(DataFlavor paramDataFlavor)
  {
    return paramDataFlavor.equals(DataFlavor.javaFileListFlavor);
  }

  public DataFlavor[] getTransferDataFlavors()
  {
    return b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.z
 * JD-Core Version:    0.6.0
 */