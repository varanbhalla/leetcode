/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    const hashSet = new Set();
    nums.map((num, index) => {
        if (hashSet.has(num)) {
            hashSet.delete(num);
        } else {
            hashSet.add(num);
        }
    })
    for (let onlyLeftElement of hashSet) {
        return onlyLeftElement;
    }
    return -1;
};