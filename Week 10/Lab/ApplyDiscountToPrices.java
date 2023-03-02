class ApplyDiscountToPrices {
    public static String discountPrices(String sentence, int discount) {
        String[] words = sentence.split("\\s+");
        for(int i=0; i<words.length; i++)
        {
            if(words[i].charAt(0) == '$')
            {
                words[i] = getDiscountPrice(words[i], discount);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<words.length; i++)
        {
            ans.append(words[i]);
            ans.append(" ");
        }
        return ans.toString().trim();
    }

    public static String getDiscountPrice(String price, int discount)
    {
        try{
            Long currPrice = Long.parseLong(price.substring(1));
            double discountPrice = (double)currPrice - ((double)discount * (double)currPrice)/100;
            return price = "$" + String.valueOf(String.format("%.2f",discountPrice));
        }
        catch(Exception e)
        {
            return price;
        }

    }
    
    public static void main(String args[])
    {
        String sentence = "there are $1 $2 and 5$ candies in the shop";
        int discount = 50;
        System.out.println(discountPrices(sentence, discount));
}
