public class OshoFreePromoEngine {


    public static void main (String[] args){

}

    public static double calculatePercentDiscount(int cartTotal , String promoCode){
        double mainPrice = 0;
        String promo = promoCode.toUpperCase();

            if (cartTotal > -1) {
            if(cartTotal < 5000){
                mainPrice = cartTotal;
    }

            else if (cartTotal >= 5000 && cartTotal <= 14999 && promo.equals("STARTER10")){
                       double discount = cartTotal * 0.1;
                            mainPrice = cartTotal - discount;
    }

            else if (cartTotal >= 15000 && cartTotal <= 29999 && promo.equals("BIGBOY20")){
                       double discount = cartTotal * 0.2;
                            mainPrice = cartTotal - discount;

    }

            else if (cartTotal >= 30000 && promo.equals("OSHOFREE35")){
                       double discount = cartTotal * 0.35;
                            mainPrice = cartTotal - discount;
   }

             else{

                            mainPrice = cartTotal;
                  }


                }
                    
                return mainPrice;
    }

}






