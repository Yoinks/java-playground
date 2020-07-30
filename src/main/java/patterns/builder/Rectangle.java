package patterns.builder;

public class Rectangle extends Shape {
    private double height;

    public static class Builder extends Shape.Builder {
        private double height;

        public Builder height(double h) {
            this.height = h;
            return this;
        }

        @Override
        public Rectangle build() {
            return new Rectangle(this);
        }
    }

    protected Rectangle(Builder builder) {
        super(builder);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                '}';
    }
}