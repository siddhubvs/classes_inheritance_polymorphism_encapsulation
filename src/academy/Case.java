package academy;

public class Case {

        private String model;
        private String manufacturer;
        private String powerSupply;
        private Dimensions dimensions;

        public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
            this.model = model;
            this.manufacturer = manufacturer;
            this.powerSupply = powerSupply;
            this.dimensions = dimensions;}

            public void pressPowerButton()
        {
                System.out.println("Power button pressed");
            }

            public String getmodel()
            {
                return model;
            }

            public String getmanufacturer() {

                return manufacturer;
            }

            public String getpowerSupply() {
                return powerSupply;
            }

            public Dimensions getdimensions() {
                return dimensions;
            }


}

