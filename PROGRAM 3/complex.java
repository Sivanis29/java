class complex {
  int real;
  int img;
  complex(int r,int i) {
    real = r;
    img = i;
  }
public static void main(String[] args) {
  complex c1 = new complex(3,4);
  complex c2 = new complex(2,5);
  int realsum = c1.real+c2.real;
  int imgsum = c1.img+c2.img;
System.out.println("First complex number is:"+c1.real+"+"+c1.img+"i");
System.out.println("Second complex number is:"+c2.real+"+"+c2.img+"i");
System.out.println("Sum of complex numbers:"+realsum+"+"+imgsum+"i");
}
}
