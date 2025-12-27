


import java.util.HashMap;
import javax.swing.*;


public class MianConverter {
    HashMap<String, Double> map = new HashMap<>();

    public MianConverter() {
        // set values using hashmap
        // currency rates in us Dollar

        map.put("United States USD", 1.00);
        map.put("Pakistan PKR",  282.50);
        map.put("United Kingdom GBP",1.73);
        map.put("India INR", 83.30);
        map.put("China CNY",  7.25);
        map.put("Japan JPY", 152.80);
        map.put("Australia  AUD", 1.53);
        map.put("Canada CAD ", 1.36);
        map.put("Saudi Arabia SAR", 3.75);
        map.put("Turkey TRY", 34.50);
        map.put("Russia RUB", 92.30);
        map.put("South Korea KRW", 1350.20);
        map.put("Malaysia MYR", 4.70);
        map.put("Bangladesh BDT", 117.80);
        map.put("Nepal NPR", 133.00);
        map.put("Singapore SGD", 1.35);
        map.put("South Africa ZAR", 18.90);
        map.put("United Arab Emirates AED", 3.67);
        map.put("Switzerland CHF", 0.91);
        map.put("Egypt EGP", 48.60);
        map.put("Indonesia IDR", 15600.00);
        map.put("Brazil BRL", 5.61);
        map.put("Qatar QAR", 3.64);
        map.put("Kuwait KWD", 0.31);
        map.put("Oman OMR", 0.38);
        map.put("Bahrain BHD", 0.38);
        map.put("Vietnam VND", 24600.00);
        map.put("Thailand THB", 36.20);
        map.put("Norway NOK", 10.90);
        map.put("Sweden SEK", 9.60);
        map.put("Denmark DKK", 6.95);
        map.put("Philippines PHP", 56.20);
        map.put("Iran IRR", 42000.00);
        map.put("Iraq IQD", 1310.00);
        map.put("Afghanistan AFN", 71.00);
        map.put("Sri Lanka LKR", 303.50);
        map.put("Myanmar MMK", 2100.00);
        map.put("New Zealand NZD", 1.62);
        map.put("Hong Kong HKD", 7.83);
        map.put("Mexico MXN", 17.20);
        map.put("Argentina ARS", 876.00);
        map.put("Nigeria NGN", 1570.00);
        map.put("Kenya KES", 131.00);
        map.put("Ghana GHS", 15.20);
        map.put("Morocco MAD", 9.94);
        map.put("Israel ILS", 3.73);
        map.put("Jordan JOD", 0.71);
        map.put("Lebanon LBP", 89500.00);

    }

    public double finalConverter(String fromCurrency, String toCurrency, double amount) {

        fromCurrency = fromCurrency.trim();
        toCurrency = toCurrency.trim();

        if (!map.containsKey(fromCurrency) || !map.containsKey(toCurrency)||fromCurrency.equals(toCurrency) ){
            JOptionPane.showMessageDialog( null," Dear user you might be made mistake to enter currencies \n " +
                    " Please check and enter again ");
            System.out.println("\" Dear user you might be made mistake to enter currencies");
            return -1;
        }




        double fromRate = map.get(fromCurrency);
        double toRate = map.get(toCurrency);

          /* double r= amount*(toRate/fromRate);
          Math.round(r); */

        return Math.round( amount * (toRate / fromRate));


    }


//            public static void main(String[] args) {
//MianConverter my=new MianConverter();
//           // my.finalConverter( JOD",200);
//                Scanner input=new Scanner(System.in);
//                String fromCurrency= input.nextLine();
//            String toCurrency= input.nextLine();
//            double amount= input.nextDouble();
//                double re= my.finalConverter(fromCurrency,toCurrency,amount);
//                if(re!=-1){
//                    System.out.println(" ok"+re);
//                }
//                else {
//                    System.out.println(" not pk");
//                }


}
