package com.zend.ide.i;

import java.awt.Dimension;
import javax.swing.ActionMap;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.InputMap;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class m extends JComboBox
{
  final p a;

  public m(p paramp)
  {
    setEditable(true);
    JComponent localJComponent = (JComponent)getEditor().getEditorComponent();
    InputMap localInputMap = localJComponent.getInputMap();
    ActionMap localActionMap = localJComponent.getActionMap();
    KeyStroke localKeyStroke1 = KeyStroke.getKeyStroke(27, 0);
    String str1 = "escapeKey";
    localInputMap.put(localKeyStroke1, str1);
    localActionMap.put(str1, paramp.l);
    KeyStroke localKeyStroke2 = KeyStroke.getKeyStroke(10, 0);
    String str2 = "enterKey";
    localInputMap.put(localKeyStroke2, str2);
    localActionMap.put(str2, paramp.k);
    setMaximumSize(new Dimension(250, getPreferredSize().height));
    setPreferredSize(new Dimension(250, getPreferredSize().height));
  }

  public void setSelectedItem(Object paramObject)
  {
    DefaultComboBoxModel localDefaultComboBoxModel = (DefaultComboBoxModel)getModel();
    if (localDefaultComboBoxModel.getIndexOf(paramObject) == -1)
      localDefaultComboBoxModel.insertElementAt(paramObject, 0);
    super.setSelectedItem(paramObject);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.i.m
 * JD-Core Version:    0.6.0
 */