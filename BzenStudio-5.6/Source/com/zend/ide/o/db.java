package com.zend.ide.o;

import com.zend.ide.n.el;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;

public class db
  implements el, cu
{
  private fk a = null;
  private e b;
  private PropertyChangeListener c = new dd(this, null);
  private boolean d;
  private Pattern e = Pattern.compile("\t");

  public db(fk paramfk)
  {
    this.a = paramfk;
    this.d = false;
    b();
  }

  private void b()
  {
    f localf = new f();
    this.b = new e(localf);
    localf.a("debugging.variableDisplay", this.c);
    this.b.a("debugging.variableDisplay");
  }

  public String a(MouseEvent paramMouseEvent)
  {
    if (!this.a.d())
      return null;
    JTextComponent localJTextComponent = (JTextComponent)paramMouseEvent.getComponent();
    int i = localJTextComponent.viewToModel(paramMouseEvent.getPoint());
    String str1 = a(localJTextComponent, i);
    if (str1 != null)
      return this.e.matcher(str1).replaceAll("    ");
    Document localDocument = localJTextComponent.getDocument();
    Element localElement1 = localDocument.getDefaultRootElement();
    Element localElement2 = localElement1.getElement(localElement1.getElementIndex(i));
    int j = localElement2.getStartOffset();
    int k = localElement2.getEndOffset();
    try
    {
      String str2 = localDocument.getText(j, k - j);
      int m = i - j;
      int n = m;
      int i1 = m;
      while (i1 >= 0)
      {
        if (a(str2.charAt(i1)))
        {
          n = i1;
          if (c(str2.charAt(i1)))
            break;
          i1--;
          continue;
        }
        if ((i1 < 2) || (str2.charAt(i1 - 1) != '-') || (str2.charAt(i1) != '>') || (!a(str2.charAt(i1 - 2))))
          break;
        n = i1 - 2;
        i1 -= 3;
      }
      int i2 = m;
      m++;
      for (i1 = m; (i1 < str2.length()) && (b(str2.charAt(i1))); i1++)
        i2 = i1;
      String str3 = str2.substring(n, i2 + 1).trim();
      if ((str3.length() > 0) && (str3.charAt(0) == '$'))
        return this.e.matcher(a(str3)).replaceAll("    ");
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return null;
  }

  private String a(JTextComponent paramJTextComponent, int paramInt)
  {
    int i = paramJTextComponent.getSelectionStart();
    int j = paramJTextComponent.getSelectionEnd();
    if ((j != i) && (paramInt >= i) && (paramInt <= j))
    {
      String str = paramJTextComponent.getSelectedText();
      return a(str);
    }
    return null;
  }

  private String a(String paramString)
  {
    ab localab = this.a.a();
    a locala = localab.a(paramString);
    if (this.d)
      return localab.a(locala, 1);
    localab.b(locala, 1);
    String str = locala.d().c();
    if ((str != null) && (str.length() == 0))
      str = ct.a(103);
    return str;
  }

  private static boolean a(char paramChar)
  {
    return (Character.isLetterOrDigit(paramChar)) || (paramChar == '$') || (paramChar == '_');
  }

  private static boolean b(char paramChar)
  {
    return (Character.isLetterOrDigit(paramChar)) || (paramChar == '_');
  }

  private static boolean c(char paramChar)
  {
    return paramChar == '$';
  }

  static boolean a(db paramdb, boolean paramBoolean)
  {
    return paramdb.d = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.db
 * JD-Core Version:    0.6.0
 */