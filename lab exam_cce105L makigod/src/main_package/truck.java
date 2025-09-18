package main_package;

	class truck {
		private String plate;
		private String driver;

			public truck (String plate, String driver) {
				this.plate = plate;
				this.driver = driver;
				
				
			}
				@Override
					public String toString() {
					return plate + "|" + driver;
				}
	}
