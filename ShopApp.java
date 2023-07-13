public class ShopApp {
        public static void main(String[] args) {

                double tax = 0.2;
                double total;                

                Clothing item1 = new Clothing();
                Clothing item2 = new Clothing();

                item1.description = "Blue Jacket";
                item1.price = 20.9;
                item1.size = "M";

                item2.description = "Orange T-Shirt";
                item2.price = 10.5;
                item2.size = "XL";

                //System.out.println(item1.description + ",\n" + item1.price + ",\n" + item1.size);
                //System.out.println(item2.description + ",\n" + item2.price + ",\n" + item2.size);

//              total = (1+tax)*(2*item2.price + item1.price);
//                System.out.println("Total of twoo shirts and one jacket plus tax is: " + total);

                total = 0;


                Customer Pinky = new Customer();
                Pinky.size = "XL";

                int measurement = 2;
                switch (measurement) {
                        case 1:
                        case 2:
                        case 3:
                                Pinky.size = "S";
                                break;

                        case 6:
                                Pinky.size = "M";
                                break;

                        case 9:
                                Pinky.size = "L";
                                break;

                        case 12:
                                Pinky.size = "XL";
                                break;

                        default:
                                Pinky.size = "unknown";
                }

                //System.out.println("size is: " + Pinky.size);        
                
                Clothing cloth1 = new Clothing();
                Clothing cloth2 = new Clothing();
                Clothing cloth3 = new Clothing();
                Clothing cloth4 = new Clothing();
                Clothing cloth5 = new Clothing();

                Clothing[] cloths = new Clothing[5];
                cloths[0] = cloth1;
                cloths[1] = cloth2;
                cloths[2] = cloth3;
                cloths[3] = cloth4;
                cloths[4] = cloth5;

                cloths[0].description = "new jacket";
                cloths[1].description = "new shirt";

                cloths[0].price = 2.5;
                cloths[1].price = 3.5;
                cloths[2].price = 4.5;
                cloths[3].price = 5.5;
                cloths[4].price = 6.5;

                cloths[0].size = "S";
                cloths[1].size = "M";
                cloths[2].size = "L";
                cloths[3].size = "XL";
                cloths[4].size = "XXL";

                for (Clothing cloth : cloths) {
                        if ((cloth.size.equals("XXL")) || (cloth.size.equals("XL")) || (cloth.size == "L") || (cloth.size == "M") || (cloth.size == "S") ) {
                                total += cloth.price;
//                              total *= (1+tax);
                        }
                        if (total > 15) break;
                }

                System.out.println("Total is " + total);

//              System.out.println("cloth1 description is " + cloth1.description);              
//              System.out.println("cloths[1].description is " + cloths[1].description);

        }
}