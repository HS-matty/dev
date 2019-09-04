package com.zend.ide.n.td.a;

import com.zend.ide.util.cl;
import java.awt.Container;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.text.BadLocationException;

class a extends ComponentAdapter
{
  final s a;

  private a(s params)
  {
  }

  public void componentResized(ComponentEvent paramComponentEvent)
  {
    if (this.a.a())
      try
      {
        s.a(this.a);
        Container localContainer = this.a.getContainer();
        if (localContainer != null)
          this.a.getContainer().repaint();
      }
      catch (BadLocationException localBadLocationException)
      {
        cl.a(localBadLocationException);
      }
  }

  a(s params, c paramc)
  {
    this(params);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.a.a
 * JD-Core Version:    0.6.0
 */