package Junit_and_generics.task2;

public class Vector3 implements Summable {
    float x = 0f, y = 0f, z = 0f;

    @Override
    public void addValue(Summable value) {
        this.x += ((Vector3) value).x;
        this.y += ((Vector3) value).y;
        this.z += ((Vector3) value).z;
    }

    public Vector3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector3{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
