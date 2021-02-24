package homeWork21.hW2;

public class Model<T> {
    private T modelX;

    public Model(T modelX) {
        this.modelX = modelX;
    }

    public T getModelX() {
        return modelX;
    }

    public void setModelX(T modelX) {
        this.modelX = modelX;
    }

    @Override
    public String toString() {
        return "" + modelX;

    }
}
