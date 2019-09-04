package com.zend.ide.o.c;

import com.zend.ide.o.bc;
import com.zend.ide.o.fk;
import com.zend.ide.util.cl;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import javax.swing.JComponent;
import javax.swing.TransferHandler;

class u extends TransferHandler
{
  final bq a;

  u(bq parambq)
  {
  }

  public int getSourceActions(JComponent paramJComponent)
  {
    return 1;
  }

  public boolean importData(JComponent paramJComponent, Transferable paramTransferable)
  {
    if (canImport(paramJComponent, paramTransferable.getTransferDataFlavors()))
      try
      {
        String str = (String)paramTransferable.getTransferData(DataFlavor.stringFlavor);
        str = str.trim();
        if (str.length() > 0)
          this.a.j.u().a(str);
      }
      catch (UnsupportedFlavorException localUnsupportedFlavorException)
      {
      }
      catch (IOException localIOException)
      {
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    return false;
  }

  public boolean canImport(JComponent paramJComponent, DataFlavor[] paramArrayOfDataFlavor)
  {
    for (int i = 0; i < paramArrayOfDataFlavor.length; i++)
      if (DataFlavor.stringFlavor.equals(paramArrayOfDataFlavor[i]))
        return true;
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.u
 * JD-Core Version:    0.6.0
 */