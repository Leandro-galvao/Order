public class Order{
    boolean isFilled;
    double billAmount;
    String shipping;
    String cuponCode;

    public Order(boolean filled, double cost, String shippingMethod, String cupom){
        if(cost > 24){
            System.out.println("Valor alto");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
        cuponCode = cupom;
    }

    // fornece feedback
    public void ship(){
        if(isFilled){
            System.out.println("enviando");
            System.out.println("Enviando por: " + calculateShipping());
        } else {
            System.out.println("Não esta pronto");
        }
    }

    public double calculateShipping(){
        double shippingCost = 50;
        switch(shipping){
            case "Regular":
            shippingCost = 0;
            break;
            case "Express":
            shippingCost = 1.75;
            break;
        }
        return shippingCost;
    }

    public static void main(String[] args) {
        Order book = new Order(true, 9.99, "Express", "Não possui");
        Order chemi = new Order(false, 72.5, "Regular", "Possui");
        System.out.println("Detalhes do pedido book: ");
        book.ship();
        System.out.println("Detalhes do pedido chami: ");
        chemi.ship();
    }
}