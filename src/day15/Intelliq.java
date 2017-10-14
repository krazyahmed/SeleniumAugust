package day15;

public class Intelliq {

	String course;
	int duration;
	public void courseDetails(String course,int duration)
	{
		this.course=course;
		this.duration=duration;
	}
	public static void main(String[] args) {
		Intelliq i=new Intelliq();
		i.courseDetails("Selenium",45);
		System.out.println(i.course);
		System.out.println(i.duration);
	}

}
