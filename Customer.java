
public class Customer {

		public Customer(String name, int size) {
			super();
			this.name = name;
			setSize(size);
		}

		private String name;
        private String size;
        private Clothing[] items = new Clothing[5];
        private double total = 0;

		public String getSize() {
			return size;
		}

		public void setSize(String size) {
			this.size = size;
		}
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public void setSize(int size) {
			
            switch (size) {
                    case 1:
                    case 2:
                    case 3:
                            this.size = "S";
                            break;

                    case 6:
                            this.size = "M";
                            break;

                    case 9:
                            this.size = "L";
                            break;

                    case 12:
                            this.size = "XL";
                            break;

                    default:
                            this.size = "unknown";
            }
		}
//*********************************************************************		
		public void addItems(Clothing[] items) {
			this.items = items;	
		}
		
		public Clothing[] getItems() {
			return items;
		}
		
		public String getTotalClothingCost() {
			for (Clothing item : items)
				total +=  item.getPrice();
			return ("Total is " + total);
		}
}
