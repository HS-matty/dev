package com.zend.ide.p;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class y extends JFrame
{
  boolean a;

  public void setVisible(boolean paramBoolean)
  {
    super.setVisible(paramBoolean);
    if (paramBoolean)
    {
      this.a = true;
      synchronized (getTreeLock())
      {
        while (true)
          if (this.a)
            try
            {
              getTreeLock().wait();
            }
            catch (InterruptedException localInterruptedException)
            {
            }
      }
    }
    else
    {
      b();
    }
  }

  private void b()
  {
    if (this.a)
      synchronized (getTreeLock())
      {
        this.a = false;
        EventQueue.invokeLater(new j());
        getTreeLock().notifyAll();
      }
  }

  public void dispose()
  {
    super.dispose();
    b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.y
 * JD-Core Version:    0.6.0
 */