package com.zend.ide.util.kc;

import com.zend.ide.y.b;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

public class i extends JPanel
  implements ActionListener, KeyListener, FocusListener
{
  protected JButton[] a;
  protected JButton[] b;
  protected JButton c;
  protected JToolBar d;
  protected int e;
  protected Color f;
  protected Color g;
  protected Color h;
  protected Color i;
  protected String[] j;
  protected Calendar k;
  protected Calendar l;
  protected Locale m;
  protected boolean n;
  protected boolean o;
  protected boolean p = true;
  protected boolean q;
  private boolean r;
  private Dimension s;

  public i()
  {
    this(false);
  }

  public i(boolean paramBoolean)
  {
    setBackground(Color.blue);
    this.s = new Dimension(24, 24);
    this.o = paramBoolean;
    this.m = ((Locale)b.a("desktop.language"));
    this.a = new JButton[49];
    this.c = null;
    this.k = Calendar.getInstance(this.m);
    this.l = ((Calendar)this.k.clone());
    setLayout(new BorderLayout());
    this.d = new JToolBar();
    this.d.setFloatable(false);
    this.d.setRollover(true);
    this.d.setLayout(new GridLayout(7, 7, 1, 1));
    this.d.setBackground(Color.lightGray);
    this.h = new Color(0, 90, 164);
    this.i = new Color(207, 206, 251);
    for (int i1 = 0; i1 < 7; i1++)
      for (int i2 = 0; i2 < 7; i2++)
      {
        int i3 = i2 + 7 * i1;
        if (i1 == 0)
        {
          this.a[i3] = new f(this);
          this.a[i3].setContentAreaFilled(this.p);
          this.a[i3].setBorderPainted(this.q);
          this.a[i3].setBackground(this.i);
        }
        else
        {
          this.a[i3] = new JButton("x");
          this.a[i3].addActionListener(this);
          this.a[i3].addKeyListener(this);
          this.a[i3].addFocusListener(this);
        }
        this.a[i3].setMargin(new Insets(0, 0, 0, 0));
        this.a[i3].setFocusPainted(false);
        this.d.add(this.a[i3]);
      }
    a();
    a(Calendar.getInstance().get(5));
    add(this.d, "Center");
    this.n = true;
  }

  protected void a()
  {
    JButton localJButton = new JButton();
    this.f = localJButton.getBackground();
    this.g = new Color(170, 170, 170);
    Date localDate = this.k.getTime();
    this.k = Calendar.getInstance(this.m);
    this.k.setTime(localDate);
    b();
    c();
  }

  private void b()
  {
    int i1 = this.k.getFirstDayOfWeek();
    DateFormatSymbols localDateFormatSymbols = new DateFormatSymbols(this.m);
    this.j = localDateFormatSymbols.getShortWeekdays();
    Dimension localDimension = a(this.j);
    int i2 = i1;
    for (int i3 = 0; i3 < 7; i3++)
    {
      this.a[i3].setText(this.j[i2]);
      this.a[i3].setForeground(this.h);
      this.a[i3].setPreferredSize(localDimension);
      if (i2 < 7)
        i2++;
      else
        i2 -= 6;
    }
  }

  private Dimension a(String[] paramArrayOfString)
  {
    Dimension localDimension = this.s;
    FontMetrics localFontMetrics = this.a[0].getFontMetrics(this.a[0].getFont());
    Insets localInsets = this.a[0].getInsets();
    int i1 = localInsets.left + localInsets.right + 2;
    int i2 = localDimension.width;
    for (int i3 = 0; i3 < paramArrayOfString.length; i3++)
      i2 = Math.max(i2, i1 + SwingUtilities.computeStringWidth(localFontMetrics, paramArrayOfString[i3]));
    localDimension.width = i2;
    return localDimension;
  }

  protected void c()
  {
    Calendar localCalendar = (Calendar)this.k.clone();
    int i1 = localCalendar.getFirstDayOfWeek();
    localCalendar.set(5, 1);
    int i2 = localCalendar.get(7) - i1;
    if (i2 < 0)
      i2 += 7;
    for (int i3 = 0; i3 < i2; i3++)
    {
      this.a[(i3 + 7)].setVisible(false);
      this.a[(i3 + 7)].setText("");
    }
    localCalendar.add(2, 1);
    Date localDate1 = localCalendar.getTime();
    localCalendar.add(2, -1);
    Date localDate2 = localCalendar.getTime();
    int i4 = 0;
    Color localColor = getForeground();
    while (localDate2.before(localDate1))
    {
      this.a[(i3 + i4 + 7)].setText(Integer.toString(i4 + 1));
      this.a[(i3 + i4 + 7)].setVisible(true);
      this.a[(i3 + i4 + 7)].setForeground(localColor);
      if (i4 + 1 == this.e)
      {
        this.a[(i3 + i4 + 7)].setBackground(this.g);
        this.c = this.a[(i3 + i4 + 7)];
      }
      else
      {
        this.a[(i3 + i4 + 7)].setBackground(this.f);
      }
      i4++;
      localCalendar.add(5, 1);
      localDate2 = localCalendar.getTime();
    }
    for (int i5 = i4 + i3 + 7; i5 < 49; i5++)
    {
      this.a[i5].setVisible(false);
      this.a[i5].setText("");
    }
  }

  public Locale getLocale()
  {
    return this.m;
  }

  public void setLocale(Locale paramLocale)
  {
    if (!this.n)
    {
      super.setLocale(paramLocale);
    }
    else
    {
      this.m = paramLocale;
      super.setLocale(paramLocale);
      a();
    }
  }

  public void a(int paramInt)
  {
    if (paramInt < 1)
      paramInt = 1;
    Calendar localCalendar = (Calendar)this.k.clone();
    localCalendar.set(5, 1);
    localCalendar.add(2, 1);
    localCalendar.add(5, -1);
    int i1 = localCalendar.get(5);
    if (paramInt > i1)
      paramInt = i1;
    int i2 = this.e;
    this.e = paramInt;
    if (this.c != null)
    {
      this.c.setBackground(this.f);
      this.c.repaint();
    }
    for (int i3 = 7; i3 < 49; i3++)
    {
      if (!this.a[i3].getText().equals(Integer.toString(this.e)))
        continue;
      this.c = this.a[i3];
      this.c.setBackground(this.g);
      break;
    }
    if (this.r)
      firePropertyChange("day", 0, this.e);
    else
      firePropertyChange("day", i2, this.e);
  }

  public int d()
  {
    return this.e;
  }

  public void b(int paramInt)
  {
    this.k.set(2, paramInt);
    boolean bool = this.r;
    this.r = false;
    a(this.e);
    this.r = bool;
    c();
  }

  public void c(int paramInt)
  {
    this.k.set(1, paramInt);
    c();
  }

  public void setFont(Font paramFont)
  {
    if (this.a != null)
      for (int i1 = 0; i1 < 49; i1++)
        this.a[i1].setFont(paramFont);
  }

  public void setForeground(Color paramColor)
  {
    super.setForeground(paramColor);
    if (this.a != null)
    {
      for (int i1 = 7; i1 < 49; i1++)
        this.a[i1].setForeground(paramColor);
      c();
    }
  }

  public String getName()
  {
    return "ZDayChooser";
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JButton localJButton = (JButton)paramActionEvent.getSource();
    String str = localJButton.getText();
    int i1 = new Integer(str).intValue();
    a(i1);
  }

  public void focusGained(FocusEvent paramFocusEvent)
  {
  }

  public void focusLost(FocusEvent paramFocusEvent)
  {
  }

  public void keyPressed(KeyEvent paramKeyEvent)
  {
    int i1 = paramKeyEvent.getKeyCode() == 39 ? 1 : paramKeyEvent.getKeyCode() == 37 ? -1 : paramKeyEvent.getKeyCode() == 40 ? 7 : paramKeyEvent.getKeyCode() == 38 ? -7 : 0;
    int i2 = d() + i1;
    if ((i2 >= 1) && (i2 <= this.k.getMaximum(5)))
      a(i2);
  }

  public void keyTyped(KeyEvent paramKeyEvent)
  {
  }

  public void keyReleased(KeyEvent paramKeyEvent)
  {
  }

  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    for (int i1 = 0; i1 < this.a.length; i1 = (short)(i1 + 1))
    {
      if (this.a[i1] == null)
        continue;
      this.a[i1].setEnabled(paramBoolean);
    }
    for (i1 = 0; i1 < this.b.length; i1 = (short)(i1 + 1))
    {
      if (this.b[i1] == null)
        continue;
      this.b[i1].setEnabled(paramBoolean);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.kc.i
 * JD-Core Version:    0.6.0
 */