package com.zend.ide.util.kc;

import com.zend.ide.cb.a.ke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class k extends JPanel
  implements ChangeListener
{
  protected ke a;
  protected JTextField b;
  protected int c;
  protected int d;
  protected int e;

  public k()
  {
    this(0, 2147483647);
  }

  public k(int paramInt1, int paramInt2)
  {
    this.c = paramInt1;
    if (paramInt2 < paramInt1)
      paramInt2 = paramInt1;
    this.d = paramInt2;
    this.e = 0;
    if (this.e < paramInt1)
      this.e = paramInt1;
    if (this.e > paramInt2)
      this.e = paramInt2;
    setLayout(new BorderLayout());
    this.a = new ke(0, paramInt1, paramInt2, 1, 4);
    this.b = this.a.a();
    this.a.addChangeListener(this);
    add(this.a, "Center");
  }

  public void stateChanged(ChangeEvent paramChangeEvent)
  {
    SpinnerNumberModel localSpinnerNumberModel = (SpinnerNumberModel)this.a.getModel();
    int i = localSpinnerNumberModel.getNumber().intValue();
    a(i);
  }

  protected void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = this.e;
    if (paramInt < this.c)
      this.e = this.c;
    else if (paramInt > this.d)
      this.e = this.d;
    else
      this.e = paramInt;
    if (paramBoolean1)
    {
      this.b.setText(Integer.toString(this.e));
      this.b.setForeground(Color.black);
    }
    if (paramBoolean2)
      firePropertyChange("value", i, this.e);
  }

  public void a(int paramInt)
  {
    a(paramInt, true, true);
    this.a.setValue(new Integer(this.e));
  }

  public int a()
  {
    return this.e;
  }

  public void b(int paramInt)
  {
    this.c = paramInt;
  }

  public void c(int paramInt)
  {
    this.d = paramInt;
  }

  public void setFont(Font paramFont)
  {
    if (this.b != null)
      this.b.setFont(paramFont);
  }

  public void setForeground(Color paramColor)
  {
    if (this.b != null)
      this.b.setForeground(paramColor);
  }

  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.b.setEnabled(paramBoolean);
    this.a.setEnabled(paramBoolean);
  }

  public String getName()
  {
    return "ZSpinField";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.kc.k
 * JD-Core Version:    0.6.0
 */