public enum EProduct {
    
    Juice ("Сок"),
    Milk ("Молоко"),
    Water ("Вода"),
    Fish ("Рыба"),
    Meat ("Мясо"),
    Cheese ("Сыр"),
    Apple ("Яблоко"),
    Banana ("Банан"),
    Chocolate ("Шоколад");

    private String title;

    EProduct(String string) {
        this.title = string;
    }

    public String getTitle() {
       return title;
   }
}
