/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let result = 0;
    nums.forEach((num, index) => {
        result = result ^ num;
    })
    return result;
};