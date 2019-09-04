package com.zend.ide.util.kc;

import com.zend.ide.y.b;
import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class j extends JPanel
  implements ItemListener, ChangeListener
{
  protected boolean a;
  private Locale b;
  private int c;
  private int d = 0;
  private i e;
  private l f;
  private JComboBox g;
  private JSpinner h;
  private boolean i;
  private boolean j;

  public j()
  {
    this(true);
  }

  public j(boolean paramBoolean)
  {
    this.a = paramBoolean;
    setLayout(new BorderLayout());
    this.g = new JComboBox();
    this.g.addItemListener(this);
    this.b = ((Locale)b.a("desktop.language"));
    a();
    if (paramBoolean)
    {
      this.h = new JSpinner();
      this.h.addChangeListener(this);
      this.g.setBorder(new EmptyBorder(0, 0, 0, 0));
      this.h.setEditor(this.g);
      add(this.h, "West");
    }
    else
    {
      add(this.g, "West");
    }
    this.i = true;
    a(Calendar.getInstance().get(2));
  }

  public void a()
  {
    this.j = true;
    DateFormatSymbols localDateFormatSymbols = new DateFormatSymbols(this.b);
    String[] arrayOfString = localDateFormatSymbols.getMonths();
    if (this.g.getItemCount() == 12)
      this.g.removeAllItems();
    for (int k = 0; k < 12; k++)
      this.g.addItem(arrayOfString[k]);
    this.j = false;
    this.g.setSelectedIndex(this.c);
  }

  public void stateChanged(ChangeEvent paramChangeEvent)
  {
    SpinnerNumberModel localSpinnerNumberModel = (SpinnerNumberModel)((JSpinner)paramChangeEvent.getSource()).getModel();
    int k = localSpinnerNumberModel.getNumber().intValue();
    int m = k > this.d ? 1 : 0;
    this.d = k;
    int n = b();
    int i1;
    if (m != 0)
    {
      n++;
      if (n == 12)
      {
        n = 0;
        if (this.f != null)
        {
          i1 = this.f.b();
          i1++;
          this.f.d(i1);
        }
      }
    }
    else
    {
      n--;
      if (n == -1)
      {
        n = 11;
        if (this.f != null)
        {
          i1 = this.f.b();
          i1--;
          this.f.d(i1);
        }
      }
    }
    a(n);
  }

  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    if (paramItemEvent.getStateChange() == 1)
    {
      int k = this.g.getSelectedIndex();
      if ((k >= 0) && (k != this.c))
        a(k, false);
    }
  }

  private void a(int paramInt, boolean paramBoolean)
  {
    if ((!this.i) || (this.j))
      return;
    int k = this.c;
    this.c = paramInt;
    if (paramBoolean)
      this.g.setSelectedIndex(this.c);
    if (this.e != null)
      this.e.b(this.c);
    firePropertyChange("month", k, this.c);
  }

  public void a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 11))
      return;
    a(paramInt, true);
  }

  public int b()
  {
    return this.c;
  }

  public void a(i parami)
  {
    this.e = parami;
  }

  public void a(l paraml)
  {
    this.f = paraml;
  }

  public Locale getLocale()
  {
    return this.b;
  }

  public void setLocale(Locale paramLocale)
  {
    if (!this.i)
    {
      super.setLocale(paramLocale);
    }
    else
    {
      this.b = paramLocale;
      a();
    }
  }

  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.g.setEnabled(paramBoolean);
    if (this.h != null)
      this.h.setEnabled(paramBoolean);
  }

  public String getName()
  {
    return "ZMonthChooser";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.kc.j
 * JD-Core Version:    0.6.0
 */