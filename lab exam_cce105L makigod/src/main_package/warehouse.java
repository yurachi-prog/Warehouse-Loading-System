package main_package;

class warehouse {
	private String code;
	private String name;
	private int quantity;
	
		public warehouse (String code, String name, int quqantity) {
			this.code = code;
			this.name = name;
			this.quantity = quantity;
			
		}
			@Override
				public String toString() {
				return code + "|" + name + "|" + quantity;
			}
}
