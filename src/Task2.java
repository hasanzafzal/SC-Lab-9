import java.util.*;

public class Task2
{
    public static void main(String args[])
    {
        Box b = new Box(7, 7, 7);
        System.out.println("Volume of box: " + b.getVolume());
    }
}

class Box
{
    private final int length;
    private final int width;
    private final int height;

    Box(int length, int width, int height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getVolume()
    {
        return length * width * height;
    }
}