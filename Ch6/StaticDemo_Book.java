// This is an example for usnderstanding static
// code from http://www.itlife.tw/wordpress/blog/2013/11/18/java%E8%A7%80%E5%BF%B5static-method%E8%88%87non-static-method%E5%91%BC%E5%8F%AB%E6%99%82%E5%B7%AE%E7%95%B0/

class Book {
    //成員變數
    public String name;
    public int price;
    public static int count = 0;
 
    //建構子1
    public Book() {
        System.out.println("建構子1");
        name = "none";
        price = 0;
        count++;
    }
 
    //建構子2
    public Book(String name, int price) {
        System.out.println("建構子2");
        this.name = name;
        this.price = price;
        count++;
    }
 
    //non-static method
    public void showBook() {
        System.out.println(" non-static name:" + name + ",price:" + price);
    }
 
    //static method
    public static void staticShowBook() {
        System.out.println("static method()");
    }
}

class StaticDemo_BookMain {
    public static void main(String[] args) {
        Book b = new Book();
        b.showBook();
 
        Book b2 = new Book("Java", 100);
        b2.showBook();
 
        System.out.println(Book.count);
 
        Book.staticShowBook();

        int i = Book.count;
        
        System.out.println(i);
    }
}

/*
    建構子1
    non-static name:none,price:0
    建構子2
    non-static name:Java,price:100
    2
    static method()
    2
*/

