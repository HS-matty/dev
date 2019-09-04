package com.zend.ide.fb;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.util.Map;
import javax.swing.ComboBoxEditor;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class gb extends JPanel
  implements ComboBoxEditor, ActionListener
{
  private JTextField a = new JTextField();
  private JLabel b;
  private Object c;
  final db d;

  public gb(db paramdb)
  {
    this.a.setVerifyInputWhenFocusTarget(false);
    setBorder(null);
    setLayout(new BorderLayout());
    setBackground(this.a.getBackground());
    this.b = new JLabel(db.a());
    this.b.setPreferredSize(new Dimension(20, 20));
    this.a.setBorder(null);
    this.a.addActionListener(this);
    this.a.addKeyListener(new c(this, paramdb));
    add(this.b, "West");
    add(this.a, "Center");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    a();
  }

  private void a()
  {
    String str1 = this.a.getText();
    String str2 = db.b(str1);
    if (db.b(this.d).containsKey(str2))
    {
      this.b.setIcon((Icon)db.b(this.d).get(str2));
    }
    else
    {
      this.b.setIcon(db.a());
      a(str1);
    }
    db.c(this.d).a.setText(str1);
  }

  private void a(String paramString)
  {
    Thread localThread = new Thread(new cb(this, paramString));
    localThread.start();
  }

  public Component getEditorComponent()
  {
    return this;
  }

  public void setItem(Object paramObject)
  {
    if (paramObject != null)
    {
      this.a.setText(paramObject.toString());
      this.c = paramObject;
    }
    else
    {
      this.a.setText("");
    }
  }

  public Object getItem()
  {
    Object localObject = this.a.getText();
    if ((this.c != null) && (!(this.c instanceof String)))
    {
      if (localObject.equals(this.c.toString()))
        return this.c;
      Class localClass = this.c.getClass();
      try
      {
        Method localMethod = localClass.getMethod("valueOf", new Class[] { String.class });
        localObject = localMethod.invoke(this.c, new Object[] { this.a.getText() });
      }
      catch (Exception localException)
      {
      }
    }
    return localObject;
  }

  public void selectAll()
  {
    this.a.selectAll();
    this.a.requestFocus();
  }

  public void addActionListener(ActionListener paramActionListener)
  {
    this.a.addActionListener(paramActionListener);
  }

  public void removeActionListener(ActionListener paramActionListener)
  {
    this.a.removeActionListener(paramActionListener);
  }

  static JLabel a(gb paramgb)
  {
    return paramgb.b;
  }

  static JTextField b(gb paramgb)
  {
    return paramgb.a;
  }

  static void c(gb paramgb)
  {
    paramgb.a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.gb
 * JD-Core Version:    0.6.0
 */