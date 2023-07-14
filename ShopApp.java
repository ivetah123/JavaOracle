public class ShopApp {                                                                                                                                        
	                                                                                                                                                          
        public static void main(String[] args) {                                                                                                              
        		double total = 0;                                                                                                                             
        		int average = 0;  
        		int counter = 0;
        		                                                                                                                                              
//                double tax = 0.2; 
                                                                                                                                                              
                                                                                                                                                              
//                                                                                                                                                            
                /** Clothing item1 = new Clothing();                                                                                                          
                Clothing item2 = new Clothing();                                                                                                              
                                                                                                                                                              
                item1.description = "Blue Jacket";                                                                                                            
                item1.price = 20.9;                                                                                                                           
                item1.size = "M";                                                                                                                             
                                                                                                                                                              
                item2.description = "Orange T-Shirt";                                                                                                         
                item2.price = 10.5;                                                                                                                           
                item2.size = "XL"; */                                                                                                                         
                                                                                                                                                              
                //System.out.println(item1.description + ",\n" + item1.price + ",\n" + item1.size);                                                           
                //System.out.println(item2.description + ",\n" + item2.price + ",\n" + item2.size);                                                           
                                                                                                                                                              
//              total = (1+tax)*(2*item2.price + item1.price);                                                                                                
//                System.out.println("Total of twoo shirts and one jacket plus tax is: " + total);                                                            
                                                                                                                                                              
                                                                                                                                                              
                                                                                                                                                              
                                                                                                                                                              
                /**Customer Pinky = new Customer();                                                                                                           
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
                } */                                                                                                                                          
                                                                                                                                                              
                //System.out.println("size is: " + Pinky.size);   
        		
        		System.out.println("min price is " + Clothing.MIN_PRICE);
                                                                                                                                                              
                Clothing cloth1 = new Clothing("veste",34.5, 3);                                                                                                             
                Clothing cloth2 = new Clothing("shawl", 21, 6);                                                                                                             
                Clothing cloth3 = new Clothing("gloves",55, 9);                                                                                                             
                Clothing cloth4 = new Clothing("cap",44, 12);                                                                                                             
                Clothing cloth5 = new Clothing("pullover", 12, 2);                                                                                                             
                                                                                                                                                              
                Clothing[] cloths = new Clothing[5];                                                                                                          
                cloths[0] = cloth1;                                                                                                                           
                cloths[1] = cloth2;                                                                                                                           
                cloths[2] = cloth3;                                                                                                                           
                cloths[3] = cloth4;                                                                                                                           
                cloths[4] = cloth5;                                                                                                                           
                                                                                                                                                              
                /**cloths[0].setDescription("jacket");                                                                                                           
                cloths[1].setDescription("shirt");                                                                                                            
                cloths[2].setDescription("trousers");                                                                                                         
                cloths[3].setDescription("shoes");                                                                                                            
                cloths[4].setDescription("skirt");                                                                                                            
                                                                                                                                                              
                cloths[0].setPrice(2.5);                                                                                                                      
                cloths[1].setPrice(3.5);                                                                                                                      
                cloths[2].setPrice(14.5);                                                                                                                     
                cloths[3].setPrice(15.5);                                                                                                                     
                cloths[4].setPrice(16.5);                                                                                                                     
                                                                                                                                                              
                cloths[0].setSize(2);                                                                                                                       
                cloths[1].setSize(3);                                                                                                                       
                cloths[2].setSize(6);                                                                                                                       
                cloths[3].setSize(9);                                                                                                                      
                cloths[4].setSize(12);  */                                                                                                                   
                                         
                
                Customer cust1 = new Customer("Pinky", 3);
                System.out.println("Customer 1 is " + cust1.getName() + ", size is " + cust1.getSize());
                cust1.addItems(cloths); 
                System.out.println("*********************************************************************************************************************************");
                
                /**for (Clothing cloth : cloths) {                                                                                                               
                        //if ((cloth.size.equals("XXL")) || (cloth.size.equals("XL")) || (cloth.size == "L") || (cloth.size == "M") || (cloth.size == "S") ) {
                    System.out.println("Clothe is " + cloth.getDescription() + ", price is " + cloth.getPrice() + ", size is " + cloth.getSize());            
//                	total += cloth.getPrice();                                                                                                                
//                              total *= (1+tax);                                                                                                             
                        //}                                                                                                                                   
                        //if (total > 15) break;                                                                                                              
                }            */
                
                for (Clothing item : cust1.getItems()) {
                	System.out.println("Item is " + item.getDescription() + ", size is " + item.getSize() + ", price is " + item.getPrice());
                	average += item.getPrice();
                	System.out.println(average);
                	if (item.getSize().equals("F")) {
                			
                			counter++;
                		}
                	System.out.println(counter);
                }
                System.out.println("*********************************************************************************************************************************");
 //               try {
//                	if (counter != 0)
                	average /= counter;
/*                } catch (ArithmeticException e) {
                	System.out.println("You cannot divide by zero, you bad boy!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                }*/
                                                                                                                                                              
                System.out.println(cust1.getTotalClothingCost());    
                System.out.println("Average is " + average);
//                System.out.println(2/0);
                                                                                                                                                              
//              System.out.println("cloth1 description is " + cloth1.description);                                                                            
//              System.out.println("cloths[1].description is " + cloths[1].description);                                                                      
                                                                                                                                                              
        }                                                                                                                                                     
}                                                                                                                                                             