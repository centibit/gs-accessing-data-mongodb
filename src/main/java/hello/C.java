package hello;

import java.io.Serializable;
import java.util.List;

public class C implements Serializable {

    private D d;

    private List<B> bs;

    private B b;

    public D getD() {
        return d;
    }

    public void setD(final D d) {
        this.d = d;
    }

    public B getB() {
        return b;
    }

    public void setB(final B b) {
        this.b = b;
    }

    public List<B> getBs() {
        return bs;
    }

    public void setBs(final List<B> bs) {
        this.bs = bs;
    }

}
