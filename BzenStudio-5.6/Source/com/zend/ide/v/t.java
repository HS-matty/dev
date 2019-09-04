package com.zend.ide.v;

import com.zend.ide.util.cl;
import com.zend.ide.util.e.f;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DropTargetDropEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public abstract class t extends f
{
  public void drop(DropTargetDropEvent paramDropTargetDropEvent)
  {
    Transferable localTransferable = paramDropTargetDropEvent.getTransferable();
    if (paramDropTargetDropEvent.isDataFlavorSupported(DataFlavor.javaFileListFlavor))
      try
      {
        paramDropTargetDropEvent.acceptDrop(1);
        List localList = (List)localTransferable.getTransferData(DataFlavor.javaFileListFlavor);
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext())
        {
          File localFile = (File)localIterator.next();
          a(localFile.getAbsolutePath());
        }
        paramDropTargetDropEvent.dropComplete(true);
      }
      catch (IOException localIOException)
      {
        cl.a(localIOException);
      }
      catch (UnsupportedFlavorException localUnsupportedFlavorException)
      {
        cl.a(localUnsupportedFlavorException);
      }
  }

  protected abstract void a(String paramString);
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.t
 * JD-Core Version:    0.6.0
 */