public class RectangleQ3
{
    private int width;
    private int length;

    public RectangleQ3()
    {
        setWidth(1);
        setLength(1);
    }

    public void setLength(int t_length)
    {
        if (t_length < 40 && t_length > 0)
        {
            length = t_length;
        }
    }

    public int getLength()
    {
        return length;
    }

    public void setWidth(int t_width)
    {
        if (t_width < 40 && t_width > 0)
        {
            width = t_width;
        }
    }

    public int getWidth()
    {
        return width;
    }

    public String toString()
    {
        return "Length = " + getLength() + ", Width = " + getWidth();
    }
    
    public int getArea()
    {
        return (width * length);
    }

    public int getPerimeter()
    {
        return (width * 2 + length * 2);
    }

    /**
     * Makes a rectangle string with it's width and length and 
     * prints the string out
     */
    public void printRectangle()
    {
        String rectangleString = "";
        for (int w = 0; w < width; w++)
        {
            rectangleString += "*";
        }
        rectangleString += "\n";

        for (int l = 2; l < length; l++)
        {
            rectangleString += "*";
            for (int w = 2; w < width; w++)
            {
                rectangleString += " ";
            }
            rectangleString += "*";
            rectangleString += "\n";
        }
        for (int w = 0; w < width; w++)
        {
            rectangleString += "*";
        }
        System.out.println(rectangleString);
    }
}