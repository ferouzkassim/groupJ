/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package groupjoop.studentsregitsration;

import java.lang.reflect.InvocationTargetException;


/**
 *
 * @author DROID
 */
public class StudentsRegitsration {

    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
      var qs = new question2();
      javax.swing.SwingUtilities.invokeAndWait(()->{
        qs.setVisible(true);
      });
     
    }
}
