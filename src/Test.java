import org.edureka.spring.dao.CourseDAO;
import org.edureka.spring.model.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		CourseDAO courseDAO=(CourseDAO)context.getBean("courseDAO");	
		Course course=new Course("10","Hadoop_DataScience",24000);
		courseDAO.insertCourse(course);
		
		
	}
	
}
