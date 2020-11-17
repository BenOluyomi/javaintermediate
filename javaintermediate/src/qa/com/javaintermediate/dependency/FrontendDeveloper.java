package qa.com.javaintermediate.dependency;

public class FrontendDeveloper implements Developer {
    @Override
    public void develop() {
        writeJavaScript();
    }

    public void writeJavaScript() {
        System.out.println("JavaScript is used everywhere anyway.");
    }

}