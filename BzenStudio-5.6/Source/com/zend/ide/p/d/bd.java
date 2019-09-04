package com.zend.ide.p.d;

import com.zend.ide.util.cl;
import java.io.File;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.filechooser.FileFilter;

class bd extends FileFilter
{
  private Vector a = new Vector();

  public bd(String paramString)
  {
    a(paramString);
  }

  public void a(String paramString)
  {
    if ((paramString.indexOf(";") != -1) || (paramString.indexOf(",") != -1) || (paramString.indexOf("|") != -1))
    {
      String[] arrayOfString = paramString.split(";|,|[|]");
      for (int j = 0; j < arrayOfString.length; j++)
        b(arrayOfString[j]);
    }
    else
    {
      int i = 1;
      char[] arrayOfChar = paramString.toCharArray();
      for (int k = 0; k < arrayOfChar.length; k++)
      {
        char c = arrayOfChar[k];
        if (Character.isLetterOrDigit(c))
          continue;
        i = 0;
        break;
      }
      b(i != 0 ? "*." + paramString : paramString);
    }
  }

  public void b(String paramString)
  {
    paramString = paramString.trim();
    char[] arrayOfChar1 = paramString.toCharArray();
    char[] arrayOfChar2 = new char[arrayOfChar1.length * 2];
    int i = File.separatorChar == '\\' ? 1 : 0;
    int j = 0;
    int k = 0;
    int m;
    if (i != 0)
    {
      m = arrayOfChar1.length;
      if (paramString.endsWith("*.*"))
        m -= 2;
      for (int n = 0; n < m; n++)
        switch (arrayOfChar1[n])
        {
        case '*':
          arrayOfChar2[(k++)] = '.';
          arrayOfChar2[(k++)] = '*';
          break;
        case '?':
          arrayOfChar2[(k++)] = '.';
          break;
        case '\\':
          arrayOfChar2[(k++)] = '\\';
          arrayOfChar2[(k++)] = '\\';
          break;
        default:
          if ("+()^$.{}[]".indexOf(arrayOfChar1[n]) >= 0)
            arrayOfChar2[(k++)] = '\\';
          arrayOfChar2[(k++)] = arrayOfChar1[n];
        }
    }
    else
    {
      for (m = 0; m < arrayOfChar1.length; m++)
        switch (arrayOfChar1[m])
        {
        case '*':
          if (j == 0)
            arrayOfChar2[(k++)] = '.';
          arrayOfChar2[(k++)] = '*';
          break;
        case '?':
          arrayOfChar2[(k++)] = (j != 0 ? 63 : '.');
          break;
        case '[':
          j = 1;
          arrayOfChar2[(k++)] = arrayOfChar1[m];
          if (m >= arrayOfChar1.length - 1)
            continue;
          switch (arrayOfChar1[(m + 1)])
          {
          case '!':
          case '^':
            arrayOfChar2[(k++)] = '^';
            m++;
            break;
          case ']':
            m++;
            arrayOfChar2[(k++)] = arrayOfChar1[m];
          }
          break;
        case ']':
          arrayOfChar2[(k++)] = arrayOfChar1[m];
          j = 0;
          break;
        case '\\':
          if ((m == 0) && (arrayOfChar1.length > 1) && (arrayOfChar1[1] == '~'))
          {
            m++;
            arrayOfChar2[(k++)] = arrayOfChar1[m];
          }
          else
          {
            arrayOfChar2[(k++)] = '\\';
            if ((m < arrayOfChar1.length - 1) && ("*?[]".indexOf(arrayOfChar1[(m + 1)]) >= 0))
            {
              m++;
              arrayOfChar2[(k++)] = arrayOfChar1[m];
            }
            else
            {
              arrayOfChar2[(k++)] = '\\';
            }
          }
          break;
        default:
          if (!Character.isLetterOrDigit(arrayOfChar1[m]))
            arrayOfChar2[(k++)] = '\\';
          arrayOfChar2[(k++)] = arrayOfChar1[m];
        }
    }
    try
    {
      this.a.add(Pattern.compile(new String(arrayOfChar2, 0, k), 2));
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  public boolean accept(File paramFile)
  {
    if (paramFile == null)
      return false;
    if (paramFile.isDirectory())
      return true;
    for (int i = 0; i < this.a.size(); i++)
      if (((Pattern)this.a.get(i)).matcher(paramFile.getName()).matches())
        return true;
    return false;
  }

  public String getDescription()
  {
    return "";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.bd
 * JD-Core Version:    0.6.0
 */