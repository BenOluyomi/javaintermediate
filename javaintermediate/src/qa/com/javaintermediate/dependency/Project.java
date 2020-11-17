package qa.com.javaintermediate.dependency;

import java.util.ArrayList;

public class Project {
    private ArrayList<Developer> developers;

    public Project(ArrayList<Developer> devs) {
        this.developers = devs;
    }

    public void implement() {
        developers.forEach(d->d.develop());
    }
}