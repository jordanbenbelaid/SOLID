import java.util.ArrayList;
import java.util.List;

import com.qa.devs.BackendDev;
import com.qa.devs.FrontendDev;
import com.qa.interfaces.Developer;
import com.qa.proj.Project;

public class Runner {
	
	public static void main(String[] args) {
		//single
		BackendDev backend = new BackendDev();
		FrontendDev frontend= new FrontendDev();
		
		Project proj = new Project();
		
		proj.implement(frontend);
		proj.implement(backend);
		
		//List of devs
		List<Developer> devs = new ArrayList<Developer>();
		
		devs.add(frontend);
		devs.add(backend);
		
		Project multiProj = new Project(devs);
		multiProj.implementList();
		
		//less lines for list of developers
		Project quickProj = new Project();
		quickProj.implementListVersionTwo(devs);
		
		
	}
}
