/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class CharVector extends java.util.AbstractList<Character> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CharVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CharVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_CharVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CharVector(char[] initialElements) {
    this();
    reserve(initialElements.length);

    for (char element : initialElements) {
      add(element);
    }
  }

  public CharVector(Iterable<Character> initialElements) {
    this();
    for (char element : initialElements) {
      add(element);
    }
  }

  public Character get(int index) {
    return doGet(index);
  }

  public Character set(int index, Character e) {
    return doSet(index, e);
  }

  public boolean add(Character e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, Character e) {
    modCount++;
    doAdd(index, e);
  }

  public Character remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public CharVector() {
    this(AdaptiveCardObjectModelJNI.new_CharVector__SWIG_0(), true);
  }

  public CharVector(CharVector other) {
    this(AdaptiveCardObjectModelJNI.new_CharVector__SWIG_1(CharVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return AdaptiveCardObjectModelJNI.CharVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    AdaptiveCardObjectModelJNI.CharVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return AdaptiveCardObjectModelJNI.CharVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    AdaptiveCardObjectModelJNI.CharVector_clear(swigCPtr, this);
  }

  public CharVector(int count, char value) {
    this(AdaptiveCardObjectModelJNI.new_CharVector__SWIG_2(count, value), true);
  }

  private int doSize() {
    return AdaptiveCardObjectModelJNI.CharVector_doSize(swigCPtr, this);
  }

  private void doAdd(char x) {
    AdaptiveCardObjectModelJNI.CharVector_doAdd__SWIG_0(swigCPtr, this, x);
  }

  private void doAdd(int index, char x) {
    AdaptiveCardObjectModelJNI.CharVector_doAdd__SWIG_1(swigCPtr, this, index, x);
  }

  private char doRemove(int index) {
    return AdaptiveCardObjectModelJNI.CharVector_doRemove(swigCPtr, this, index);
  }

  private char doGet(int index) {
    return AdaptiveCardObjectModelJNI.CharVector_doGet(swigCPtr, this, index);
  }

  private char doSet(int index, char val) {
    return AdaptiveCardObjectModelJNI.CharVector_doSet(swigCPtr, this, index, val);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    AdaptiveCardObjectModelJNI.CharVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
