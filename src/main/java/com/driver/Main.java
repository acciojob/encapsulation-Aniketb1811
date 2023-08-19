package com.driver;

public class Main {
  public static void main(String[] args){
      RWOnly rwOnly = new RWOnly();
//      rwOnly.name = "Aniket";
      //name variable is private

      rwOnly.setName("Aniket");
      System.out.println(rwOnly.getName());
    }
}