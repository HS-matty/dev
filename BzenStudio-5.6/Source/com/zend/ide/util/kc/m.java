package com.zend.ide.util.kc;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DateEditor;
import javax.swing.SpinnerDateModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class m extends JPanel
  implements ChangeListener, b
{
  private JSpinner a;
  private SpinnerDateModel b;
  private c c;

  public m()
  {
    this(new Date());
  }

  public m(Date paramDate)
  {
    this.c = new c(paramDate);
    this.b = new SpinnerDateModel(paramDate, null, null, 5);
    this.a = new JSpinner(this.b);
    this.a.setEditor(new JSpinner.DateEditor(this.a, "HH:mm:ss:SSS"));
    a();
  }

  private void a()
  {
    setLayout(new BorderLayout());
    add(this.a, "North");
    this.b.addChangeListener(this);
  }

  public void setFont(Font paramFont)
  {
    super.setFont(paramFont);
    if (this.a != null)
      this.a.setFont(paramFont);
  }

  public void setPreferredSize(Dimension paramDimension)
  {
    super.setPreferredSize(paramDimension);
    if (this.a != null)
      this.a.setPreferredSize(paramDimension);
  }

  public void b(Date paramDate)
  {
    this.b.setValue(paramDate);
  }

  public Date b()
  {
    return (Date)this.b.getValue();
  }

  public void stateChanged(ChangeEvent paramChangeEvent)
  {
    this.c.a(this.b.getDate());
    firePropertyChange("time", null, this.c);
  }

  public void a(Date paramDate)
  {
    b(paramDate);
  }

  public Date a()
  {
    return b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.kc.m
 * JD-Core Version:    0.6.0
 */