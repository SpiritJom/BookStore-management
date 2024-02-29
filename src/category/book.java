package category;

public abstract class book {

    protected String productCode; 
    protected String name;
    protected int price;
    protected int numOfBooks;  
    
    public String getProductCode() {
        return this.productCode;
    }

    public void setProductCode(String productCode){
        this.productCode = productCode;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void addBook(int add){
        numOfBooks+=add;
    }

    public void sellBook(int sell){
        if(numOfBooks>0){
            if(numOfBooks-sell>=0){
                numOfBooks-=sell;
            }else{System.out.println("Not enough products in stock");}
        }else{System.out.println("Out of stock");}
    }

    public int getNumOfBooks() {
        return this.numOfBooks;
    }

}
    