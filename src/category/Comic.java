package category;

public class Comic extends book{
    
    public Comic(String productCode,String name,int price,int numOfBooks){
        this.name = name;
        this.productCode = productCode;
        this.price = price;
        this.numOfBooks = numOfBooks;
    }
    
    //Add book to the dictionary
    public static void addComic(String productCode,String name,int price,int numOfBooks)
    { 
        Data.CmBook[bookType.getCM()] = new Comic( productCode,name, price,numOfBooks);           //Creat object book
        dic.putDictionaryData(Data.CmBook[bookType.getCM()].getProductCode(), Data.CmBook[bookType.getCM()]); //set key = product code 
                                                                                                                  //value = book
        bookType.plusCM(); // increase 1 Comic Book in data 
    }
        

}
