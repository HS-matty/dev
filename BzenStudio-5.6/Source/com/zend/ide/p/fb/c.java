package com.zend.ide.p.fb;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public abstract class c extends JTree
{
  public b a()
  {
    LinkedList localLinkedList = new LinkedList();
    DefaultMutableTreeNode localDefaultMutableTreeNode = b();
    if (localDefaultMutableTreeNode != null)
      a(localLinkedList, localDefaultMutableTreeNode, 0);
    b localb = new b(localLinkedList, getVisibleRect());
    return localb;
  }

  private int a(LinkedList paramLinkedList, DefaultMutableTreeNode paramDefaultMutableTreeNode, int paramInt)
  {
    if ((!isExpanded(paramInt)) || (paramDefaultMutableTreeNode.isLeaf()))
      return paramInt;
    paramLinkedList.add(new a(paramDefaultMutableTreeNode.getLevel(), paramDefaultMutableTreeNode.toString()));
    Enumeration localEnumeration = paramDefaultMutableTreeNode.children();
    while (localEnumeration.hasMoreElements())
    {
      DefaultMutableTreeNode localDefaultMutableTreeNode = (DefaultMutableTreeNode)localEnumeration.nextElement();
      paramInt++;
      paramInt = a(paramLinkedList, localDefaultMutableTreeNode, paramInt);
    }
    return paramInt;
  }

  public void a(b paramb)
  {
    if (!paramb.a().isEmpty())
      a(paramb.a().listIterator(1), b(), 0);
    scrollRectToVisible(paramb.b());
  }

  private int a(ListIterator paramListIterator, DefaultMutableTreeNode paramDefaultMutableTreeNode, int paramInt)
  {
    expandRow(paramInt);
    if (!paramListIterator.hasNext())
      return paramInt;
    a locala = (a)paramListIterator.next();
    int i = 0;
    do
    {
      Enumeration localEnumeration = paramDefaultMutableTreeNode.children();
      for (int j = 0; j < i; j++)
        localEnumeration.nextElement();
      j = 0;
      while (localEnumeration.hasMoreElements())
      {
        DefaultMutableTreeNode localDefaultMutableTreeNode = (DefaultMutableTreeNode)localEnumeration.nextElement();
        if (locala.a() <= paramDefaultMutableTreeNode.getLevel())
        {
          paramListIterator.previous();
          return paramInt + paramDefaultMutableTreeNode.getChildCount() - j;
        }
        if (locala.a() > paramDefaultMutableTreeNode.getLevel() + 1)
          if (paramListIterator.hasNext())
            locala = (a)paramListIterator.next();
          else
            return paramInt;
        j++;
        if ((locala.b().equals(localDefaultMutableTreeNode.toString())) && (locala.a() == localDefaultMutableTreeNode.getLevel()))
        {
          i += j;
          paramInt = a(paramListIterator, localDefaultMutableTreeNode, paramInt + j);
          j = 0;
          if (paramListIterator.hasNext())
            locala = (a)paramListIterator.next();
          else
            return paramInt;
        }
      }
      if (paramListIterator.hasNext())
        locala = (a)paramListIterator.next();
      else
        return paramInt;
    }
    while (locala.a() > paramDefaultMutableTreeNode.getLevel());
    paramListIterator.previous();
    return paramInt;
  }

  private DefaultMutableTreeNode b()
  {
    DefaultMutableTreeNode localDefaultMutableTreeNode = (DefaultMutableTreeNode)getModel().getRoot();
    TreePath localTreePath = getPathForRow(0);
    if ((localTreePath == null) || (localTreePath.getPathCount() <= 1))
      return localDefaultMutableTreeNode;
    String str = localTreePath.toString().substring(1);
    str = str.substring(0, str.length() - 1);
    String[] arrayOfString = str.split(",");
    Iterator localIterator = Arrays.asList(arrayOfString).iterator();
    localIterator.next();
    return a(localDefaultMutableTreeNode, localIterator);
  }

  private DefaultMutableTreeNode a(DefaultMutableTreeNode paramDefaultMutableTreeNode, Iterator paramIterator)
  {
    if (!paramIterator.hasNext())
      return null;
    String str = ((String)paramIterator.next()).trim();
    Enumeration localEnumeration = paramDefaultMutableTreeNode.children();
    while (localEnumeration.hasMoreElements())
    {
      DefaultMutableTreeNode localDefaultMutableTreeNode = (DefaultMutableTreeNode)localEnumeration.nextElement();
      if (localDefaultMutableTreeNode.toString().equals(str))
      {
        if (paramIterator.hasNext())
          return a(localDefaultMutableTreeNode, paramIterator);
        return localDefaultMutableTreeNode;
      }
    }
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.fb.c
 * JD-Core Version:    0.6.0
 */