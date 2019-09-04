package com.zend.ide.n.td;

import com.zend.ide.n.gz;
import com.zend.ide.n.hl;
import com.zend.ide.s.cx;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JToolTip;
import javax.swing.SwingUtilities;
import javax.swing.plaf.TextUI;

public class gc extends gz
{
  private static Color y = new JToolTip().getBackground();
  private f C;
  private e D;

  public gc()
  {
    a();
    f();
  }

  public void a(hl paramhl)
  {
    super.a(paramhl);
    setBackground(y);
  }

  private void a()
  {
    setEditable(false);
    setBackground(y);
  }

  private void f()
  {
    this.C = new f();
    this.C.a("editing.styleManager", new wb(this, null));
    this.D = new e(this.C);
    this.D.a("editing.styleManager");
  }

  public void a(int paramInt)
  {
    SwingUtilities.invokeLater(new vb(this, paramInt));
  }

  private void c(int paramInt)
  {
    try
    {
      Rectangle localRectangle1 = getVisibleRect();
      if (localRectangle1.height == 0)
        return;
      Rectangle localRectangle2 = getUI().modelToView(this, paramInt, null);
      if ((localRectangle2.y + localRectangle2.height >= localRectangle1.y + localRectangle1.height) || (localRectangle1.contains(localRectangle1.x, localRectangle2.y)))
        localRectangle2.y += localRectangle1.height - localRectangle2.height;
      scrollRectToVisible(localRectangle2);
    }
    catch (Exception localException)
    {
    }
  }

  public void setUI(TextUI paramTextUI)
  {
    if ((paramTextUI instanceof ic))
      paramTextUI = new cx();
    super.setUI(paramTextUI);
  }

  static void a(gc paramgc, int paramInt)
  {
    paramgc.c(paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.gc
 * JD-Core Version:    0.6.0
 */