package com.zend.ide.cb.a;

import javax.swing.SpinnerNumberModel;

class rd extends SpinnerNumberModel
{
  final v a;

  public rd(v paramv, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public Object getNextValue()
  {
    Integer localInteger1 = (Integer)super.getNextValue();
    if (localInteger1 != null)
    {
      Integer localInteger2 = (Integer)getValue();
      Integer localInteger3 = (Integer)getStepSize();
      int i = localInteger2.intValue() % localInteger3.intValue();
      setValue(new Integer(localInteger1.intValue() - i));
    }
    return getValue();
  }

  public Object getPreviousValue()
  {
    Integer localInteger1 = (Integer)super.getPreviousValue();
    if (localInteger1 != null)
    {
      Integer localInteger2 = (Integer)getStepSize();
      int i = localInteger1.intValue() % localInteger2.intValue();
      if (i != 0)
        i = localInteger2.intValue() - i;
      setValue(new Integer(localInteger1.intValue() + i));
    }
    return getValue();
  }

  public void fireStateChanged()
  {
    super.fireStateChanged();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.rd
 * JD-Core Version:    0.6.0
 */