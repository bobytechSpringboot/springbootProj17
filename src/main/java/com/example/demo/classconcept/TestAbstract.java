package com.example.demo.classconcept;

public class TestAbstract {
   public abstract class OverrideToString extends Object {
      public abstract String toString();
   }

   public class TestBothInterfaceAbstractClassHaveSameMethodSignature {

      interface InterF {default String method1() {return "InterF";}}

      static class Sup { public String method1() {return "Sup";}}

      static class Sub extends Sup implements InterF {
         public static void main(String[] args) {
            Sub obj = new Sub();
            System.out.println (obj.method1());
         }
      }
   }

}
