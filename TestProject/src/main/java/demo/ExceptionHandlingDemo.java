package demo;

public class ExceptionHandlingDemo {
	
	public static void main(String[] args) {
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("I am inisde main");
	}
	public static void demo() throws Exception{
//		try {
			System.out.println("Hello World");
			throw new ArithmeticException("not valid");
//			int i = 1/0;
			//System.out.println("Completed");
////			}catch(Exception exp) {
//				System.out.println("Inside catch");
////				exp.getCause();
//				exp.getMessage();
//				exp.printStackTrace();
////			}
//			finally {
//				System.out.println("I am inside Finally");
//			}
	} 

}
