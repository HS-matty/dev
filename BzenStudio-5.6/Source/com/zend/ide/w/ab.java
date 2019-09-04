package com.zend.ide.w;

import com.zend.ide.i.n;
import com.zend.ide.util.cu;
import java.awt.Frame;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public abstract class ab extends n
  implements cu
{
  private u b = new u(this);
  private v c = new v(this);
  private int d;

  public ab(Frame paramFrame, String paramString)
  {
    super(paramFrame, paramString);
    JComponent localJComponent = (JComponent)getContentPane();
    ActionMap localActionMap = localJComponent.getActionMap();
    InputMap localInputMap = localJComponent.getInputMap(1);
    localActionMap.put("EnterAction", this.b);
    localActionMap.put("EscAction", this.c);
    localInputMap.put(KeyStroke.getKeyStroke(10, 0), "EnterAction");
    localInputMap.put(KeyStroke.getKeyStroke(27, 0), "EscAction");
  }

  protected void a(int paramInt)
  {
    this.d = paramInt;
  }

  public int a()
  {
    return this.d;
  }

  protected void e()
  {
    a(1);
    dispose();
  }

  public boolean d()
  {
    a(0);
    return super.d();
  }

  public abstract q b();

  public abstract void a(q paramq);

  public abstract void a(boolean paramBoolean);
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.ab
 * JD-Core Version:    0.6.0
 */