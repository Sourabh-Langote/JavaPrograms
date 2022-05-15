package Inheritance;

class Brain{
	int iq;
	int weight;
	public Brain(int iq,int weight) {
		this.iq=iq;
		this.weight=weight;
	}
	public int getIq() {
		return iq;
	}
	public int getWeight() {
		return weight;
	}
}

class Heart{
	int beat;
	int weight;
	
	public Heart(int beat,int weight) {
		this.beat=beat;
		this.weight=weight;
	}
	public int getBeat() {
		return beat;
	}
	public int getWeight() {
		return weight;
	}
}
class Bike{
	int speed;
	int price;
	public Bike(int speed,int price) {
		this.price=price;
		this.speed=speed;
	}
	public int getPrice() {
		return price;
	}
	public int getSpeed() {
		return speed;
	}
}
class Book{
	String name;
	String author;
	public Book(String name,String author) {
		this.author=author;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
}
class Human{
	Heart hrt=new Heart(86,130);
	Brain brn=new Brain(55,150);
}
class Student extends Human{
	void hasBook(Book bk) {
		System.out.println("book author  "+bk.getAuthor());
		System.out.println("book name  "+bk.getName());
	}
	void hasBike(Bike bik) {
		System.out.println("bike price  "+bik.getPrice());
		System.out.println("bike speed  "+bik.getSpeed());
	}
}
public class Inherit {
	public static void main(String[] args) {
		Student s1=new Student();
		Book bk=new Book("herry","jk");
		Bike bik=new Bike(258,126);
		
		System.out.println("brain weight  "+s1.brn.getWeight());
		System.out.println("brain iq  "+s1.brn.getIq());
		
		System.out.println("heart beat  "+s1.hrt.getBeat());
		System.out.println("heart weight  "+s1.hrt.getWeight());
		
		s1.hasBike(bik);
		s1.hasBook(bk);
	}

}
