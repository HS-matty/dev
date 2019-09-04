package com.zend.ide.w.b;

import java.util.ArrayList;
import java.util.List;

class eb
{
  int a = -1;
  int b = -1;
  int c = -1;
  int d = -1;
  List e;
  final cb f;

  public eb(cb paramcb, String paramString)
  {
    a(paramString);
    this.e = new ArrayList();
  }

  private void a(String paramString)
  {
    int i = paramString.indexOf(' ');
    paramString = paramString.substring(i + 2);
    int j = paramString.indexOf(' ');
    int k = paramString.indexOf(',');
    if ((k < j) && (k != -1))
    {
      this.c = Integer.parseInt(paramString.substring(0, k));
      this.d = Integer.parseInt(paramString.substring(k + 1, j));
    }
    else
    {
      this.c = Integer.parseInt(paramString.substring(0, j));
      this.d = this.c;
    }
    i = j;
    paramString = paramString.substring(i + 2);
    j = paramString.indexOf(' ');
    k = paramString.indexOf(',');
    if (k != -1)
    {
      this.a = Integer.parseInt(paramString.substring(0, k));
      this.b = Integer.parseInt(paramString.substring(k + 1, j));
    }
    else
    {
      this.a = Integer.parseInt(paramString.substring(0, j));
      this.b = this.a;
    }
  }

  public void b(String paramString)
  {
    this.e.add(paramString);
  }

  public List a()
  {
    return this.e;
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer("UnifiedDiffRange [From: ");
    localStringBuffer.append(this.c);
    localStringBuffer.append(',');
    localStringBuffer.append(this.d);
    localStringBuffer.append("] [To: ");
    localStringBuffer.append(this.a);
    localStringBuffer.append(',');
    localStringBuffer.append(this.b);
    localStringBuffer.append(']');
    localStringBuffer.append("\n Lines: \n");
    for (int i = 0; i < this.e.size(); i++)
      localStringBuffer.append(this.e.get(i) + "\n");
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.eb
 * JD-Core Version:    0.6.0
 */