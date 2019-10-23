public class Num
{
    private int value; //sets up the new Num object, storing a value
    public Num (int update)
    {
        value = update;
    }//returns the stored int value

    public int getValue()
    {
        return value;
    }//sets the stored value to a newly specified value

    public void setValue(int update)
    {
        value = update;
    }//returns the stored

    public String toString()
    {
        return value + "";
    }
}
