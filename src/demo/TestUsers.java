package demo;

public class TestUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1=new User("teste","teste");
		System.out.println(u1.toString());
		User u2=new User("teste2","teste2");
		System.out.println(u2.toString());
		StatUser stu1=new StatUser("static 1", "st1");
		System.out.println(stu1.toString());
		StatUser stu2=new StatUser("static 2", "st2");
		System.out.println(stu2.toString());
		StatUser.id=6;
		StatUser stu3=new StatUser("static 3", "st3");
		System.out.print("le id static actuelle est"+ StatUser.id);

	}

}
