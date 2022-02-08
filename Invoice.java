public class Invoice
{
    private int iNumber;
    private String iName;
    private int Quantity;
    private int Price;
    private double tCost;
    public int getiNumber()
    {
        return iNumber;
    }
    public void setiNumber(int iNum)
    {
        iNumber = iNum;
    }
    public String getiName()
    {
        return iName;
    }
    public void setiName(String name)
    {
        iName = name;
    }
    public int getQuantity()
    {
        return Quantity;
    }
    public void setQuantity(int Qt)
    {
        Quantity = Qt;
    }
    public int getPrice()
    {
        return Price;
    }
    public void setPrice(int Pr)
    {
        Price = Pr;
    }
    public double gettCost()
    {
        return tCost;
    }
    public void settCost(double TC)
    {
        tCost = Quantity * Price;
    }
}