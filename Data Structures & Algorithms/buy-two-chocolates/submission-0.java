class Solution {
    public int buyChoco(int[] prices, int money) {
        int minPrice =Integer.MAX_VALUE;
        int secondminPrice = Integer.MAX_VALUE;
        for(int price :prices){
            if(price<minPrice){ 
            secondminPrice = minPrice;
            minPrice = price;
        }else{
            secondminPrice=Math.min(secondminPrice,price);
        }
        }
        if(secondminPrice+minPrice>money){
            return money;
        }
        return money -(minPrice+secondminPrice);
    }
}