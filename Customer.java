
public class Customer {
        private String size;

		public String getSize() {
			return size;
		}

		public void setSize(String size) {
			this.size = size;
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
}
