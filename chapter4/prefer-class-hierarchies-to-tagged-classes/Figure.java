// Tagged class - vastly inferior to a class hierarchy
class figure {
    enum Shape { RECTANGLE, CIRCLE };
    // Tag field - the shape of the figure
    final Shap shape;

    // These fields are used only if shape is RECTANGLE
    double length;
    double width;

    // this field is used only if shape is CIRCLE
    double radius;

    // Constructor for circle
    Figure(double radius) {
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    // Constructor for rectangle
    Figure(double length, double width) {
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    double area() {
        switch(shape) {
            case RECTANGLE:
                return length * width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError();
        }
    }
}
