public class TestEncapsulation {  
	public static void main(String[] args) {   
	    Account acc=new Account();  
	    acc.setAcc_no(55923000);  
	    acc.setName("Pavel Bozinovski");  
	    acc.setEmail("pavel.bozinovski@gmail.com");  
	    acc.setAmount(315000);   
	    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
	}  
}