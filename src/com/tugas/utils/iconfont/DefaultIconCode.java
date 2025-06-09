package com.tugas.utils.iconfont;

class DefaultIconCode implements IconCode {
   private final char unicode;
   private final String fontFamily;

   public DefaultIconCode(String fontFamily, char unicode) {
      this.fontFamily = fontFamily;
      this.unicode = unicode;
   }

   public String name() {
      return "[" + this.getUnicode() + "]";
   }

   public char getUnicode() {
      return this.unicode;
   }

   public String getFontFamily() {
      return this.fontFamily;
   }
}
