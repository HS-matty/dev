package com.zend.ide.cb.a;

import com.zend.ide.p.a.d;
import java.text.ParseException;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.JSpinner.NumberEditor;
import javax.swing.LookAndFeel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class ke extends JSpinner
{
  private JFormattedTextField a;
  private int b;
  private int c;
  private int d;
  private int e;

  public ke(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    super(new SpinnerNumberModel(paramInt1, paramInt2, paramInt3, paramInt4));
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramInt5;
    b();
  }

  public ke(SpinnerNumberModel paramSpinnerNumberModel, int paramInt)
  {
    super(paramSpinnerNumberModel);
    a(paramSpinnerNumberModel);
    this.e = paramInt;
    b();
  }

  public void commitEdit()
  {
    try
    {
      super.commitEdit();
    }
    catch (ParseException localParseException)
    {
      UIManager.getLookAndFeel().provideErrorFeedback(this);
      int i = Integer.parseInt(this.a.getText());
      SwingUtilities.invokeLater(new wc(this, i));
    }
  }

  public void setModel(SpinnerModel paramSpinnerModel)
  {
    if ((paramSpinnerModel instanceof SpinnerNumberModel))
    {
      a((SpinnerNumberModel)paramSpinnerModel);
      super.setModel(paramSpinnerModel);
    }
    else
    {
      throw new IllegalArgumentException("CustomNumbersSpinner accepts only SpinnerNumberModel.");
    }
  }

  public JFormattedTextField a()
  {
    return this.a;
  }

  private void b()
  {
    setEditor(new JSpinner.NumberEditor(this, "#"));
    this.a = ((JFormattedTextField)getEditor().getComponent(0));
    d locald = new d(this.e);
    try
    {
      locald.insertString(0, this.a.getText(), null);
    }
    catch (BadLocationException localBadLocationException)
    {
    }
    this.a.setDocument(locald);
  }

  private void a(SpinnerNumberModel paramSpinnerNumberModel)
  {
    this.b = ((Integer)paramSpinnerNumberModel.getMinimum()).intValue();
    this.c = ((Integer)paramSpinnerNumberModel.getMinimum()).intValue();
    this.d = ((Integer)paramSpinnerNumberModel.getStepSize()).intValue();
  }

  static JFormattedTextField a(ke paramke)
  {
    return paramke.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.ke
 * JD-Core Version:    0.6.0
 */