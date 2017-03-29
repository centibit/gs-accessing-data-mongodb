package test;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ROOT_ENTITY")
public class A {

    @Id
    public String id;

    /*
     * Workaround to fix the issue: just swap this.b and this.c here in this class :)
     */
    public B b;

    public C c;

}
