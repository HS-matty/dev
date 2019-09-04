package com.zend.ide.h;

import com.zend.ide.util.bn;
import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.JComponent;
import javax.swing.JPanel;

class bq extends JPanel
{
  final bn b;
  final br a;

  bq(br parambr, LayoutManager paramLayoutManager, bn parambn)
  {
    super(paramLayoutManager);
  }

  public void requestFocus()
  {
    super.requestFocus();
    JComponent localJComponent = this.b.c();
    if (localJComponent != null)
      localJComponent.requestFocus();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.bq
 * JD-Core Version:    0.6.0
 */