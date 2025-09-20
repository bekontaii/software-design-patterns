public class Cars {
    private String name;
    private String color;
    private int year;
    private int price;
    private String model;
    private Cars(String name, String color, int year, int price, String model) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
        this.model = model;
    }
        public static class  CarsBuilder{
            private  String name;
            private  String color;
            private  int year;
            private  int price;
            private  String model;

            public CarsBuilder(){

            }
            public CarsBuilder setName(String name) {
                this.name = name;
                return this;
            }
            public CarsBuilder setColor(String color) {
                this.color = color;
                return this;
            }
            public CarsBuilder setYear(int year) {
                this.year = year;
                return this;
            }
            public CarsBuilder setPrice(int price) {
                this.price = price;
                return this;
            }
            public CarsBuilder setModel(String model) {
                this.model = model;
                return this;
            }
            public Cars build(){
                return new Cars(this.name, this.color, this.year, this.price, this.model);

            }

        }
    @Override
    public String toString() {
        return "Car: " + name + " | Model: " + model +
                " | Color: " + color + " | Year: " + year +
                " | Price: " + price;
    }
    }
