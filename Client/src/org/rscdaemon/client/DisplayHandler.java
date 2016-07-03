package org.rscdaemon.client;

public class DisplayHandler {
   /**
    * @author Yong Min
    */
   public static String insertCommas(String str) {
      String s = String.valueOf(str);
      for(int j = s.length() - 3; j > 0; j -= 3) {
         s = s.substring(0, j) + "," + s.substring(j);
      }
      if(s.length() > 8) {
         s = "@gre@" + s.substring(0, s.length() - 5) + "m";
      } else if(s.length() > 4) {
         s = s.substring(0, s.length() - 4) + "," + s.substring(s.length() - 3, s.length());
      }
      return s;
   }
}