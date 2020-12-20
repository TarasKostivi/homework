package homeWork8.Phones;

public enum Phones {

    LG("LG G3", 1200){
        @Override
        void getPhone(){
            System.out.println("Made in Ukraine");
        }
    },
    IPHONE("IPhone 6", 5500){
        @Override
        void getPhone(){
            System.out.println("Made in China");
        }
    },
    HUAWEI("Huawei", 2300){
        @Override
        void getPhone(){
            System.out.println("Made in Poland");
        }
    },
    SAMSUNG("Samsung", 4500){
        @Override
        void getPhone(){
            System.out.println("Made in USA");
        }
    };

    private String title;
    private int price;

    Phones(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    abstract void getPhone();

    public static Phones fromString(String phonesString){
        for (Phones phones : values()){
            if (phones.name().equalsIgnoreCase(phonesString)){
                return phones;
            }
        }
        return Phones.IPHONE;
    }
}

//Зробити свій Enum , в main методі вивести всі значення цього enum та їх порядкові номери.
//Додати у свій enum змінну, конструктори, метод з реалізацією, абстрактний метод. В main()
// методі викликати ці методи.