package com.zend.ide.p.d;

import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

class a extends ComponentAdapter
{
  final bw a;

  a(bw parambw)
  {
  }

  public void componentResized(ComponentEvent paramComponentEvent)
  {
    JScrollPane localJScrollPane = (JScrollPane)paramComponentEvent.getComponent();
    bw.b(this.a, localJScrollPane.getViewport().getSize().width);
    localJScrollPane.removeComponentListener(this);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.a
 * JD-Core Version:    0.6.0
 */