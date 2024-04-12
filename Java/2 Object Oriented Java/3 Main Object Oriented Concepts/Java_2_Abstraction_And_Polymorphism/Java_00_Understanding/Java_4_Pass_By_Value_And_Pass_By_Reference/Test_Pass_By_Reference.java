package Java_2_Abstraction_And_Polymorphism.Java_00_Understanding.Java_4_Pass_By_Value_And_Pass_By_Reference;

class Test_Pass_By_Reference
{
    public static void main(String[] args)
    {
        Point first = new Point(4,8);
        System.out.println("First : " + first);

        move(first);
        System.out.println("First : " + first);
    }

    public static void move( Point point )
    {
        point.x ++;
        point.y ++;
        System.out.println(point);
    }

    public static class Point
    {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Point{ ");
            sb.append("x = ").append(x);
            sb.append(", y = ").append(y);
            sb.append(" }");
            return sb.toString();
        }
    }
}
