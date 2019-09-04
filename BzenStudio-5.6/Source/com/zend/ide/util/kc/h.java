package com.zend.ide.util.kc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class h extends JPanel
  implements PropertyChangeListener, b
{
  private Calendar a;
  private i b;
  private boolean c = false;
  private Locale d;
  private j e;
  private JPanel f;
  private l g;
  private m h;

  public h()
  {
    this(null, null, true, false);
  }

  public h(Date paramDate, Locale paramLocale, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.d = paramLocale;
    if (paramLocale == null)
      this.d = Locale.getDefault();
    this.a = Calendar.getInstance();
    setLayout(new BorderLayout());
    this.f = new JPanel();
    this.f.setLayout(new BorderLayout());
    this.e = new j(paramBoolean1);
    this.g = new l();
    this.e.a(this.g);
    this.f.add(this.e, "West");
    this.f.add(this.g, "Center");
    this.f.setBorder(BorderFactory.createEmptyBorder());
    this.b = new i(paramBoolean2);
    this.b.addPropertyChangeListener(this);
    this.e.a(this.b);
    this.e.addPropertyChangeListener(this);
    this.g.a(this.b);
    this.g.addPropertyChangeListener(this);
    this.h = new m();
    this.h.addPropertyChangeListener(this);
    add(this.f, "North");
    add(this.b, "Center");
    add(this.h, "South");
    this.h.setPreferredSize(this.f.getPreferredSize());
    if (paramDate != null)
      this.a.setTime(paramDate);
    this.c = true;
    a(this.a);
    setFont(getFont());
  }

  public Locale getLocale()
  {
    return this.d;
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if (this.a != null)
    {
      Calendar localCalendar = (Calendar)this.a.clone();
      if (paramPropertyChangeEvent.getPropertyName().equals("day"))
      {
        localCalendar.set(5, ((Integer)paramPropertyChangeEvent.getNewValue()).intValue());
        a(localCalendar, false);
      }
      else if (paramPropertyChangeEvent.getPropertyName().equals("month"))
      {
        localCalendar.set(2, ((Integer)paramPropertyChangeEvent.getNewValue()).intValue());
        a(localCalendar, false);
      }
      else if (paramPropertyChangeEvent.getPropertyName().equals("year"))
      {
        localCalendar.set(1, ((Integer)paramPropertyChangeEvent.getNewValue()).intValue());
        a(localCalendar, false);
      }
      else if (paramPropertyChangeEvent.getPropertyName().equals("time"))
      {
        c localc = (c)paramPropertyChangeEvent.getNewValue();
        localCalendar.set(11, localc.a());
        localCalendar.set(12, localc.b());
        localCalendar.set(13, localc.c());
        localCalendar.set(14, localc.d());
        a(localCalendar, false);
      }
      else if (paramPropertyChangeEvent.getPropertyName().equals("date"))
      {
        localCalendar.setTime((Date)paramPropertyChangeEvent.getNewValue());
        a(localCalendar, true);
      }
    }
  }

  public void setBackground(Color paramColor)
  {
    super.setBackground(paramColor);
    if (this.b != null)
      this.b.setBackground(paramColor);
  }

  public void a(Calendar paramCalendar)
  {
    a(paramCalendar, true);
  }

  private void a(Calendar paramCalendar, boolean paramBoolean)
  {
    Calendar localCalendar = this.a;
    this.a = paramCalendar;
    if (paramBoolean)
    {
      this.g.d(paramCalendar.get(1));
      this.e.a(paramCalendar.get(2));
      this.b.a(paramCalendar.get(5));
      this.h.b(this.a.getTime());
    }
    firePropertyChange("calendar", localCalendar, this.a);
  }

  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    if (this.b != null)
    {
      this.b.setEnabled(paramBoolean);
      this.e.setEnabled(paramBoolean);
      this.g.setEnabled(paramBoolean);
      this.h.setEnabled(paramBoolean);
    }
  }

  public boolean isEnabled()
  {
    return super.isEnabled();
  }

  public void setFont(Font paramFont)
  {
    super.setFont(paramFont);
    if (this.b != null)
    {
      this.b.setFont(paramFont);
      this.e.setFont(paramFont);
      this.g.setFont(paramFont);
      this.h.setFont(paramFont);
    }
  }

  public void setForeground(Color paramColor)
  {
    super.setForeground(paramColor);
    if (this.b != null)
    {
      this.b.setForeground(paramColor);
      this.e.setForeground(paramColor);
      this.g.setForeground(paramColor);
      this.h.setForeground(paramColor);
    }
  }

  public void setLocale(Locale paramLocale)
  {
    if (!this.c)
    {
      super.setLocale(paramLocale);
    }
    else
    {
      Locale localLocale = this.d;
      this.d = paramLocale;
      this.b.setLocale(this.d);
      this.e.setLocale(this.d);
      firePropertyChange("locale", localLocale, this.d);
    }
  }

  public Date a()
  {
    return new Date(this.a.getTimeInMillis());
  }

  public void a(Date paramDate)
  {
    Date localDate = this.a.getTime();
    this.a.setTime(paramDate);
    this.g.d(this.a.get(1));
    this.e.a(this.a.get(2));
    this.b.a(this.a.get(5));
    this.h.b(this.a.getTime());
    firePropertyChange("date", localDate, paramDate);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.kc.h
 * JD-Core Version:    0.6.0
 */