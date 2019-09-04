package com.zend.ide.n.b;

import java.awt.event.ActionEvent;
import javax.swing.Action;

public class d
  implements c
{
  private int a = -1;
  private String b = "default-typed";

  public void b(Action paramAction, ActionEvent paramActionEvent)
  {
    this.b = ((String)paramAction.getValue("Name"));
    if (this.b == null)
      return;
    if ((this.b.equals("default-typed")) || (this.b.equals("insert-break")))
      this.a = a(paramActionEvent.getActionCommand().charAt(0));
  }

  public boolean a(Action paramAction, ActionEvent paramActionEvent)
  {
    String str = (String)paramAction.getValue("Name");
    int i = (str == null) || (!str.equals(this.b)) ? 1 : 0;
    int j;
    if (i == 0)
      if (paramActionEvent == null)
      {
        i = 1;
      }
      else
      {
        j = paramActionEvent.getModifiers();
        i = (j & 0xE) != 0 ? 1 : 0;
      }
    if ((i == 0) && ((str.equals("default-typed")) || (str.equals("insert-break"))))
    {
      j = a(paramActionEvent.getActionCommand().charAt(0));
      i = j != this.a ? 1 : 0;
    }
    return i;
  }

  private static int a(char paramChar)
  {
    int i = -1;
    if (((paramChar >= 'a') && (paramChar <= 'z')) || ((paramChar >= 'A') && (paramChar <= 'Z')))
      i = 1;
    else if ((paramChar >= '0') && (paramChar <= '9'))
      i = 2;
    else if ((paramChar >= ')') && (paramChar <= '}'))
      i = 3;
    return i;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.b.d
 * JD-Core Version:    0.6.0
 */