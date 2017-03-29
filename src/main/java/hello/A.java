package hello;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ROOT_ENTITY")
public class A {

    @Id
    private String id;

    /*
     * Workaround to fix the issue: just swap this.b and this.c in this class :)
     */
    private B b;

    private C c;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public B getB() {
        return b;
    }

    public void setB(final B b) {
        this.b = b;
    }

    public C getC() {
        return c;
    }

    public void setC(final C c) {
        this.c = c;
    }

}
