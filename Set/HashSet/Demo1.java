import java.util.*;
class Demo1
{
	public static void main(String arg[])
	{
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(null);
		hs.add("ram");
		hs.add(10);
		hs.add(20);
		System.out.println(hs);
	}
}
/*
Compiled from "HashSet.java"
public class java.util.HashSet<E> extends java.util.AbstractSet<E> implements java.util.Set<E>, java.lang.Cloneable, java.io.Serializable {
  static final long serialVersionUID;
  public java.util.HashSet();
  public java.util.HashSet(java.util.Collection<? extends E>);
  public java.util.HashSet(int, float);
  public java.util.HashSet(int);
  java.util.HashSet(int, float, boolean);
  public java.util.Iterator<E> iterator();
  public int size();
  public boolean isEmpty();
  public boolean contains(java.lang.Object);
  public boolean add(E);
  public boolean remove(java.lang.Object);
  public void clear();
  public java.lang.Object clone();
  public java.util.Spliterator<E> spliterator();
  static {};

*/