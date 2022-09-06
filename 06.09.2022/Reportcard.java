/* Interface exam(percentcall())    ClassStudent(neme,roll_no,marks1,marks2)
 *                       ClassResult(Per,Display())
 *   */
package oopjava.java;

public class Reportcard {
	public static void main(String args[]) {
		Result obj=new Result("misbah",18,40,80); 
		obj.percentCall(); 
		System.out.println(obj.show()); 
		System.out.println(obj.display());
		}
}
