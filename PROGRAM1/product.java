class product{
    String name;
    double price;
  product (String n,double p){
    name=n;
    price=p;
    }
  public static void main(String[]args){
    product p1=new product("pen",10);
    product p2=new product("book",20);
    product p3=new product("pencil",5);
    product lowest=p2;
    if(p2.price<lowest.price){
    	lowest=p2;
    	}
    if(p3.price<lowest.price){
    	lowest=p3;
    	}
    System.out.println("lowest price product:Name:price:"+lowest.name+lowest.price);
    }
    }
  
