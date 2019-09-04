package com.zend.ide.p.d;

import java.awt.ComponentOrientation;
import java.awt.Container;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JTextField;

class m
  implements PropertyChangeListener
{
  final bw a;

  m(bw parambw)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    String str = paramPropertyChangeEvent.getPropertyName();
    if (str.equals("SelectedFileChangedProperty"))
    {
      bw.d(this.a, paramPropertyChangeEvent);
    }
    else if (str.equals("SelectedFilesChangedProperty"))
    {
      bw.e(this.a, paramPropertyChangeEvent);
    }
    else if (str.equals("directoryChanged"))
    {
      bw.f(this.a, paramPropertyChangeEvent);
    }
    else if (str.equals("fileFilterChanged"))
    {
      bw.g(this.a, paramPropertyChangeEvent);
    }
    else if (str.equals("fileSelectionChanged"))
    {
      bw.h(this.a, paramPropertyChangeEvent);
    }
    else if (str.equals("MultiSelectionEnabledChangedProperty"))
    {
      bw.i(this.a, paramPropertyChangeEvent);
    }
    else if (str.equals("AccessoryChangedProperty"))
    {
      bw.j(this.a, paramPropertyChangeEvent);
    }
    else if ((str.equals("ApproveButtonTextChangedProperty")) || (str.equals("ApproveButtonToolTipTextChangedProperty")))
    {
      bw.k(this.a, paramPropertyChangeEvent);
    }
    else if (str.equals("DialogTypeChangedProperty"))
    {
      bw.l(this.a, paramPropertyChangeEvent);
    }
    else if (str.equals("ApproveButtonMnemonicChangedProperty"))
    {
      bw.a(this.a, paramPropertyChangeEvent);
    }
    else if (str.equals("ControlButtonsAreShownChangedProperty"))
    {
      bw.b(this.a, paramPropertyChangeEvent);
    }
    else if (str.equals("EncodingPanelsAreShownChangedProperty"))
    {
      bw.c(this.a, paramPropertyChangeEvent);
    }
    else if (str.equals("CancelSelection"))
    {
      bw.a(this.a);
    }
    else if (str.equals("componentOrientation"))
    {
      ComponentOrientation localComponentOrientation = (ComponentOrientation)paramPropertyChangeEvent.getNewValue();
      JFileChooser localJFileChooser = (JFileChooser)paramPropertyChangeEvent.getSource();
      if (localComponentOrientation != (ComponentOrientation)paramPropertyChangeEvent.getOldValue())
        localJFileChooser.applyComponentOrientation(localComponentOrientation);
      if (bw.d(this.a) != null)
      {
        bw.d(this.a).setComponentOrientation(localComponentOrientation);
        bw.d(this.a).getParent().getParent().setComponentOrientation(localComponentOrientation);
      }
    }
    else if ((str.equals("ancestor")) && (paramPropertyChangeEvent.getOldValue() == null) && (paramPropertyChangeEvent.getNewValue() != null))
    {
      bw.h(this.a).selectAll();
      bw.h(this.a).requestFocus();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.m
 * JD-Core Version:    0.6.0
 */