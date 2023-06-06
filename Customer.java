package Market;

public class Customer {
    protected String name;
    protected boolean isMakeOrderClass;
    protected boolean isTakeOrderClass;

    public String getName() {
        return name;
    }


    public void setMakeOrder() {
        
        isMakeOrderClass = true; 
    }


    public void setTakeOrder() {
        isTakeOrderClass = true;
    }


    public boolean isMakeOrder() {
        return isMakeOrderClass;
    }


    public boolean isTakeOrder() {
        return isTakeOrderClass;
    } 
}
