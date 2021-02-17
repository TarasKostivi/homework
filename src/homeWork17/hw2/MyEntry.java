package homeWork17.hw2;

public class MyEntry<K, V> {
    private K keys;
    private V val;

    public MyEntry(K keys, V val) {
        this.keys = keys;
        this.val = val;
    }

    public K getKeys() {
        return keys;
    }

    public void setKeys(K keys) {
        this.keys = keys;
    }

    public V getVal() {
        return val;
    }

    public void setVal(V val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return  keys +
                " " + val;
    }
}
