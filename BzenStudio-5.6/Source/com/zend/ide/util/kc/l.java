package com.zend.ide.util.kc;

import com.zend.ide.cb.a.ke;
import java.awt.Font;
import java.util.Calendar;

public class l extends k
{
  protected i f;

  public l()
  {
    Calendar localCalendar = Calendar.getInstance();
    this.f = null;
    b(localCalendar.getMinimum(1));
    c(localCalendar.getMaximum(1));
    a(localCalendar.get(1));
  }

  public void d(int paramInt)
  {
    int i = a();
    super.a(paramInt, true, false);
    if (this.f != null)
      this.f.c(this.e);
    this.a.setValue(new Integer(this.e));
    firePropertyChange("year", i, this.e);
  }

  public void a(int paramInt)
  {
    d(paramInt);
  }

  public int b()
  {
    return super.a();
  }

  public void a(i parami)
  {
    this.f = parami;
  }

  public String getName()
  {
    return "ZYearChooser";
  }

  public void setFont(Font paramFont)
  {
    super.setFont(paramFont);
    if (this.f != null)
      this.f.setFont(paramFont);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.kc.l
 * JD-Core Version:    0.6.0
 */