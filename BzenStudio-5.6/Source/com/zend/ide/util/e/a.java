package com.zend.ide.util.e;

import com.zend.ide.util.cl;
import java.awt.Component;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureRecognizer;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetContext;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.InvalidDnDOperationException;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.HashMap;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public class a
  implements c
{
  protected HashMap b = new HashMap(3);
  protected DragSource c = null;
  protected DropTarget d = null;
  DragGestureRecognizer e = this.c.createDefaultDragGestureRecognizer(paramComponent, 3, this);

  public a(Component paramComponent)
  {
  }

  public void dragDropEnd(DragSourceDropEvent paramDragSourceDropEvent)
  {
    boolean bool = paramDragSourceDropEvent.getDropSuccess();
    if (bool)
    {
      int i = paramDragSourceDropEvent.getDropAction();
      if (i == 2)
        b();
    }
  }

  public void dragEnter(DragSourceDragEvent paramDragSourceDragEvent)
  {
  }

  public void dragEnter(DropTargetDragEvent paramDropTargetDragEvent)
  {
    b localb = a(paramDropTargetDragEvent.getCurrentDataFlavors(), a(paramDropTargetDragEvent.getLocation()));
    if (localb != null)
    {
      paramDropTargetDragEvent.acceptDrag(localb.a);
      return;
    }
    paramDropTargetDragEvent.rejectDrag();
  }

  public void dragExit(DragSourceEvent paramDragSourceEvent)
  {
  }

  public void dragExit(DropTargetEvent paramDropTargetEvent)
  {
  }

  public void dragOver(DragSourceDragEvent paramDragSourceDragEvent)
  {
  }

  public void dragOver(DropTargetDragEvent paramDropTargetDragEvent)
  {
    a(paramDropTargetDragEvent);
    b localb = a(paramDropTargetDragEvent.getCurrentDataFlavors(), a(paramDropTargetDragEvent.getLocation()));
    if (localb != null)
    {
      paramDropTargetDragEvent.acceptDrag(localb.a);
      return;
    }
    paramDropTargetDragEvent.rejectDrag();
  }

  public void drop(DropTargetDropEvent paramDropTargetDropEvent)
  {
    Point localPoint = paramDropTargetDropEvent.getLocation();
    String str = a(localPoint);
    b localb = a(paramDropTargetDropEvent.getCurrentDataFlavors(), str);
    if (localb == null)
    {
      paramDropTargetDropEvent.rejectDrop();
      return;
    }
    boolean bool = false;
    try
    {
      Transferable localTransferable = paramDropTargetDropEvent.getTransferable();
      Object localObject = localTransferable.getTransferData(localb.b);
      d locald = (d)this.b.get(localb);
      bool = locald.a(localObject, localPoint);
      if (bool)
        paramDropTargetDropEvent.acceptDrop(localb.a);
    }
    catch (UnsupportedFlavorException localUnsupportedFlavorException)
    {
      cl.a(localUnsupportedFlavorException);
    }
    catch (IOException localIOException)
    {
      cl.a(localIOException);
    }
    paramDropTargetDropEvent.dropComplete(bool);
  }

  public void dropActionChanged(DragSourceDragEvent paramDragSourceDragEvent)
  {
  }

  public void dropActionChanged(DropTargetDragEvent paramDropTargetDragEvent)
  {
  }

  public void a(d paramd, int paramInt, DataFlavor paramDataFlavor, String paramString)
  {
    b localb;
    if ((paramInt & 0x2) != 0)
    {
      localb = new b(2, paramDataFlavor, paramString);
      this.b.put(localb, paramd);
    }
    if ((paramInt & 0x1) != 0)
    {
      localb = new b(1, paramDataFlavor, paramString);
      this.b.put(localb, paramd);
    }
    if ((paramInt & 0x40000000) != 0)
    {
      localb = new b(1073741824, paramDataFlavor, paramString);
      this.b.put(localb, paramd);
    }
  }

  public void b()
  {
  }

  public String a(Point paramPoint)
  {
    return "";
  }

  protected b a(DataFlavor[] paramArrayOfDataFlavor, String paramString)
  {
    for (int i = 0; i < paramArrayOfDataFlavor.length; i++)
    {
      DataFlavor localDataFlavor = paramArrayOfDataFlavor[i];
      b localb = new b(2, localDataFlavor, paramString);
      if (this.b.containsKey(localb))
        return localb;
      localb = new b(1, localDataFlavor, paramString);
      if (this.b.containsKey(localb))
        return localb;
      localb = new b(1073741824, localDataFlavor, paramString);
      if (this.b.containsKey(localb))
        return localb;
    }
    return null;
  }

  public void dragGestureRecognized(DragGestureEvent paramDragGestureEvent)
  {
    InputEvent localInputEvent = paramDragGestureEvent.getTriggerEvent();
    if ((localInputEvent instanceof MouseEvent))
    {
      localObject = (MouseEvent)localInputEvent;
      if (!SwingUtilities.isLeftMouseButton((MouseEvent)localObject))
        return;
    }
    Object localObject = c(paramDragGestureEvent.getDragOrigin());
    if (localObject != null)
    {
      int i = b(paramDragGestureEvent.getDragOrigin());
      this.e.setSourceActions(i);
      try
      {
        this.c.startDrag(paramDragGestureEvent, DragSource.DefaultMoveDrop, (Transferable)localObject, this);
      }
      catch (InvalidDnDOperationException localInvalidDnDOperationException)
      {
      }
    }
  }

  protected int b(Point paramPoint)
  {
    return 1073741827;
  }

  protected Transferable c(Point paramPoint)
  {
    return null;
  }

  private String a(JComponent paramJComponent, Point paramPoint)
  {
    Rectangle localRectangle = paramJComponent.getVisibleRect();
    if (paramPoint.y <= (int)localRectangle.getMinY() + 20)
      return "North";
    if (paramPoint.y >= (int)localRectangle.getMaxY() - 20)
      return "South";
    if (paramPoint.x <= (int)localRectangle.getMinX() + 20)
      return "West";
    if (paramPoint.x >= (int)localRectangle.getMaxX() - 20)
      return "East";
    return "Center";
  }

  protected void a(DropTargetDragEvent paramDropTargetDragEvent)
  {
    Point localPoint = paramDropTargetDragEvent.getLocation();
    JComponent localJComponent = (JComponent)paramDropTargetDragEvent.getDropTargetContext().getComponent();
    String str = a(localJComponent, localPoint);
    Rectangle localRectangle = localJComponent.getVisibleRect();
    if (str.equals("North"))
    {
      localRectangle.y -= 20;
      localJComponent.scrollRectToVisible(localRectangle);
    }
    if (str.equals("South"))
    {
      localRectangle.y += 20;
      localJComponent.scrollRectToVisible(localRectangle);
    }
    if (str.equals("West"))
    {
      localRectangle.x -= 20;
      localJComponent.scrollRectToVisible(localRectangle);
    }
    if (str.equals("East"))
    {
      localRectangle.x += 20;
      localJComponent.scrollRectToVisible(localRectangle);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.e.a
 * JD-Core Version:    0.6.0
 */