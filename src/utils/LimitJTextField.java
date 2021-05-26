/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author SONIA
 */
class LimitJTextField extends PlainDocument 
{
   private int max;
   LimitJTextField(int max) {
      super();
      this.max = max;
   }
   public void insertString(int offset, String text, AttributeSet attr) throws BadLocationException {
      if (text == null)
         return;
      if ((getLength() + text.length()) <= max) {
         super.insertString(offset, text, attr);
      }
   }
}