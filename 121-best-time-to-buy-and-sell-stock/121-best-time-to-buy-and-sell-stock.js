/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
     let maxProfitValue = 0;
        let minPrice = Number.MAX_SAFE_INTEGER;
        
       prices.map((price, index) => {
             if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfitValue = Math.max(maxProfitValue, price - minPrice);
            }
        })
        return maxProfitValue;
};