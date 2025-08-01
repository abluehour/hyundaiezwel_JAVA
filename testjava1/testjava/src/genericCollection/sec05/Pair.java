package genericCollection.sec05;

public class Pair<k,v>{
    private k key;
    private v value;

    public Pair(k key, v value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(k key) {
        this.key = key;
    }
    public void setValue(v value) {
        this.value = value;
    }
    public k getKey() {
        return this.key;
    }
    public v getValue() {
        return this.value;
    }

}
